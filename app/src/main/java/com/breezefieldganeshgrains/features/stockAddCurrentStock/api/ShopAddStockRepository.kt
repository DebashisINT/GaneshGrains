package com.breezefieldganeshgrains.features.stockAddCurrentStock.api

import com.breezefieldganeshgrains.base.BaseResponse
import com.breezefieldganeshgrains.features.location.model.ShopRevisitStatusRequest
import com.breezefieldganeshgrains.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldganeshgrains.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefieldganeshgrains.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefieldganeshgrains.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}