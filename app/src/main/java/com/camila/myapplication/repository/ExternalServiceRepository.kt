package com.camila.myapplication.repository

import com.camila.myapplication.network.ExternalService
import javax.inject.Inject

interface ExternalServiceInterface{
    fun doSomething()
}

class ExternalServiceRepository @Inject constructor(private val externalService: ExternalService) : ExternalServiceInterface  {

    override fun doSomething() {
        println("do something method called")
    }
}