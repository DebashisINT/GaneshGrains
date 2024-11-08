package com.breezefieldganeshgrains.features.stock.model

import com.breezefieldganeshgrains.base.BaseResponse


/**
 * Created by Saikat on 17-09-2019.
 */
class NewStockListResponseModel : BaseResponse() {
    var stock_list: ArrayList<StockListDataModel>? = null
}