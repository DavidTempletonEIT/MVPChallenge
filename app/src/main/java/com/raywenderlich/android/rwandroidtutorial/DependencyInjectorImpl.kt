package com.raywenderlich.android.rwandroidtutorial

import com.raywenderlich.android.rwandroidtutorial.weather.WeatherRepository
class DependencyInjectorImpl : DependencyInjector {
    override fun weatherRepository(): WeatherRepository {
        return WeatherRepositoryImpl()
    }
}