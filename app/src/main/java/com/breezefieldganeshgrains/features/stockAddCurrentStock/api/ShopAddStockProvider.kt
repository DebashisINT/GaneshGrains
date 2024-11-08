package com.breezefieldganeshgrains.features.stockAddCurrentStock.api

import com.breezefieldganeshgrains.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldganeshgrains.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}