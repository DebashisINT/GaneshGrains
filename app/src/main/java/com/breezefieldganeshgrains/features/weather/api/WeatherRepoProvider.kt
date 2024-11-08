package com.breezefieldganeshgrains.features.weather.api

import com.breezefieldganeshgrains.features.task.api.TaskApi
import com.breezefieldganeshgrains.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}