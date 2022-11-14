package hu.nye.demodatingapp.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import hu.nye.demodatingapp.R
import hu.nye.demodatingapp.adapter.GalleryAdapter
import hu.nye.demodatingapp.model.PersonModel


class PersonDetailGalleryView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private val mViewPager: ViewPager

    private lateinit var mAdapter: PagerAdapter

    init {
        LayoutInflater.from(context).inflate(R.layout.view_person_details_gallery, this, true)
        mViewPager = findViewById(R.id.pager)
    }

    fun bind(model: PersonModel) {
        mAdapter = GalleryAdapter(model.galleryImages, context)
        mViewPager.adapter = mAdapter
    }
}