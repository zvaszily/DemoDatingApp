package hu.nye.demodatingapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.Toolbar
import hu.nye.demodatingapp.R
import hu.nye.demodatingapp.model.PersonModel
import hu.nye.demodatingapp.view.PersonDetailHeaderView
import hu.nye.demodatingapp.view.PersonDetailIntroductionView

class MainActivity : AppCompatActivity() {

    lateinit var headerView: PersonDetailHeaderView

    lateinit var imageView: ImageView

    lateinit var introductionView: PersonDetailIntroductionView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = PersonModel.Gandalf()

        headerView = findViewById(R.id.person_detail_header)
        headerView.bind(model)

        imageView = findViewById(R.id.person_image)
        imageView.setImageResource(model.image)

        introductionView = findViewById(R.id.person_detail_introduction)
        introductionView.bind(model)

        //val toolbar = findViewById<Toolbar>(R.id.toolbar)
        //setSupportActionBar(toolbar)
    }
}