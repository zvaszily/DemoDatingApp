package hu.nye.demodatingapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import hu.nye.demodatingapp.model.PersonModel

class PersonDetailViewModel: ViewModel() {
    private lateinit var person: MutableLiveData<PersonModel>

    fun getUser(): MutableLiveData<PersonModel> {
        if(!::person.isInitialized) {
            person = MutableLiveData()
            person.value = PersonModel.Gandalf()
        }
        return person
    }
}