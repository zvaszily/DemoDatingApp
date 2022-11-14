package hu.nye.demodatingapp.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout

class PersonDetailIntroductionView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : RelativeLayout(context, attrs, defStyleAttr) {

    val binding = hu.nye.demodatingapp.databinding.ViewPersonDetailsIntroductionBinding.inflate(
        LayoutInflater.from(context), this, true)

}