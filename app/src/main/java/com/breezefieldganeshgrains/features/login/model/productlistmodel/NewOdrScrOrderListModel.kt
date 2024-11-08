package com.breezefieldganeshgrains.features.login.model.productlistmodel

import com.breezefieldganeshgrains.app.domain.NewOrderScrOrderEntity
import com.breezefieldganeshgrains.app.domain.ProductListEntity

class NewOdrScrOrderListModel {
    var status:String? = null
    var message:String? = null
    var user_id:String? = null
    var order_list: ArrayList<NewOrderScrOrderEntity>? = null
}