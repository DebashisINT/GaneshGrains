package com.breezefieldganeshgrains.features.weather.api

import com.breezefieldganeshgrains.base.BaseResponse
import com.breezefieldganeshgrains.features.task.api.TaskApi
import com.breezefieldganeshgrains.features.task.model.AddTaskInputModel
import com.breezefieldganeshgrains.features.weather.model.ForeCastAPIResponse
import com.breezefieldganeshgrains.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}