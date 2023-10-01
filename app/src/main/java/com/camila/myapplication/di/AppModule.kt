package com.camila.myapplication.di

import com.camila.myapplication.network.ExternalService
import com.camila.myapplication.repository.ExternalServiceRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit

@Module
@InstallIn(ActivityComponent::class)
object AppModule {
    @Provides
    fun providesExternalService(
    ): ExternalService {
        return Retrofit.Builder()
            .baseUrl("http:api.github.com")
            .build()
            .create(ExternalService::class.java)
    }

    @Provides
    fun providesExternalServiceRepository(
        externalService: ExternalService
    ): ExternalServiceRepository {
        return ExternalServiceRepository(externalService)
    }
}