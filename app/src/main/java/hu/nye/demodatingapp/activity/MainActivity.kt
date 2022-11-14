package hu.nye.demodatingapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hu.nye.demodatingapp.R
import hu.nye.demodatingapp.model.PersonModel
import hu.nye.demodatingapp.view.PersonDetailGalleryView
import hu.nye.demodatingapp.view.PersonDetailHeaderView
import hu.nye.demodatingapp.view.PersonDetailIntroductionView

class MainActivity : AppCompatActivity() {

    lateinit var headerView: PersonDetailHeaderView

    lateinit var gallery: PersonDetailGalleryView

    lateinit var introductionView: PersonDetailIntroductionView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = PersonModel.Gandalf()

        headerView = findViewById(R.id.person_detail_header)
        headerView.bind(model)

        gallery = findViewById(R.id.gallery)
        gallery.bind(model)

        introductionView = findViewById(R.id.person_detail_introduction)
        introductionView.bind(model)

        //val toolbar = findViewById<Toolbar>(R.id.toolbar)
        //setSupportActionBar(toolbar)
    }
}