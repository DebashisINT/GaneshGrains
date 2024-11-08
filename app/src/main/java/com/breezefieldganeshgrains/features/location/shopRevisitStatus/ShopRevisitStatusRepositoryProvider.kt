package com.breezefieldganeshgrains.features.location.shopRevisitStatus

import com.breezefieldganeshgrains.features.location.shopdurationapi.ShopDurationApi
import com.breezefieldganeshgrains.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}