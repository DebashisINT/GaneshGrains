package com.breezefieldganeshgrains.features.location.api

import com.breezefieldganeshgrains.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldganeshgrains.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}