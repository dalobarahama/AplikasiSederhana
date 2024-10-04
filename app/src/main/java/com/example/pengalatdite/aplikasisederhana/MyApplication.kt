package com.example.pengalatdite.aplikasisederhana

import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MyApplication : Application(), HasAndroidInjector {

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> {
        return activityInjector
    }

    override fun onCreate() {
        super.onCreate()

        val appComponent = DaggerAppComponent.create()
        appComponent.inject(this)
    }
}