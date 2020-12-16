package com.app.imaginto.di

import com.app.imaginto.screen.login.LoginActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiClientModule::class, AppModule::class ])
interface AppComponent {
    fun inject(loginActivity: LoginActivity?)
}