package com.breezefieldganeshgrains.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldganeshgrains.features.stockCompetetorStock.api.AddCompStockApi
import com.breezefieldganeshgrains.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}