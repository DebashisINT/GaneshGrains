package com.breezefieldganeshgrains.features.viewAllOrder.model

import com.breezefieldganeshgrains.app.domain.NewOrderColorEntity
import com.breezefieldganeshgrains.app.domain.NewOrderGenderEntity
import com.breezefieldganeshgrains.app.domain.NewOrderProductEntity
import com.breezefieldganeshgrains.app.domain.NewOrderSizeEntity
import com.breezefieldganeshgrains.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

