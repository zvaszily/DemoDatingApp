package hu.nye.demodatingapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import hu.nye.demodatingapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imagesView = findViewById<ImageView>(R.id.person_image)
        imagesView.setImageResource(R.drawable.gandalf)
    }
}