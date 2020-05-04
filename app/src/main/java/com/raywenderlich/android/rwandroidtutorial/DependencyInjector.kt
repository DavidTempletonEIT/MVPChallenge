package com.raywenderlich.android.rwandroidtutorial

import com.raywenderlich.android.rwandroidtutorial.weather.WeatherRepository


interface DependencyInjector {
    fun weatherRepository() : WeatherRepository
}