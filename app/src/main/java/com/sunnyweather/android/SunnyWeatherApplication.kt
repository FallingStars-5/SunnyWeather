package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

//在项目的任何位置调用SunnyWeatherApplication.context来获取Context对象
class SunnyWeatherApplication: Application() {
    companion object {

        const val TOKEN = "54ojHGNU8L7rTfwe" //令牌值

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context  //延迟初始化
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}