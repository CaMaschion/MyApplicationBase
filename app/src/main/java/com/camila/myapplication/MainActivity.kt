package com.camila.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.camila.myapplication.repository.ExternalServiceRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject lateinit var repo :ExternalServiceRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        repo.doSomething()
    }
}