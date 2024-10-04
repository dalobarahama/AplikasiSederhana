package com.example.pengalatdite.aplikasisederhana

import android.app.Application
import dagger.Component

@Component(modules = [ActivitiesModule::class])
interface AppComponent {
    fun inject(application: Application)
}