package com.example.newproject1006

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewmodel  : ViewModel() {

    val namelifedata = MutableLiveData<String>() = Webservcie.getPhotos()

}