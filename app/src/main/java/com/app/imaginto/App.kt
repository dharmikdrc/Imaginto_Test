package com.app.imaginto

import android.app.Application
import com.app.imaginto.di.ApiClientModule
import com.app.imaginto.di.AppComponent
import com.app.imaginto.di.AppModule
import com.app.imaginto.di.DaggerAppComponent

class App: Application() {

    private var mApiComponent: AppComponent? = null

    override fun onCreate() {
        super.onCreate()
        mApiComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .apiClientModule(ApiClientModule())
            .build()
    }

    fun getComponent(): AppComponent? {
        return mApiComponent
    }
}