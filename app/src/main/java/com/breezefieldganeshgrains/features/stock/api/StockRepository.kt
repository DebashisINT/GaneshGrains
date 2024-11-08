package com.breezefieldganeshgrains.features.stock.api

import com.breezefieldganeshgrains.app.Pref
import com.breezefieldganeshgrains.base.BaseResponse
import com.breezefieldganeshgrains.features.stock.model.AddStockInputParamsModel
import com.breezefieldganeshgrains.features.stock.model.NewStockListResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 17-09-2019.
 */
class StockRepository(val apiService: StockApi) {

    fun addStock(addStock: AddStockInputParamsModel): Observable<BaseResponse> {
        return apiService.addStock(addStock)
    }

    fun getStockList(): Observable<NewStockListResponseModel> {
        return apiService.getStockList(Pref.session_token!!, Pref.user_id!!)
    }
}