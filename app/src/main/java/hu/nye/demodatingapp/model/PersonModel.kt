package hu.nye.demodatingapp.model

import hu.nye.demodatingapp.R

data class PersonModel(
    val avatar: Int,
    val name: String,
    val rating: Int,
    val job: String,
    val formattedAge: String,
    val image: Int,
    val introduction: String,
    val galleryImages: Array<Int>) {

    companion object {
        fun Gandalf(): PersonModel {
            return PersonModel(
                R.drawable.user_avatar,
                "Gyula",
                4,
                "Informatikus",
                "27 éves",
                R.drawable.gandalf,
                "Arra gondoltam, hogy valami jó olaszos kaja ki tudja hozni az emberek valódi énjét.\n\nSzóval... bedobhatnánk egy pizzát valamikor, szerintem az egészen király lenne.\n\nCiao!",
                arrayOf(R.drawable.gandalf, R.drawable.gandalf1, R.drawable.gandalf2, R.drawable.gandalf3)
            )
        }
    }
}