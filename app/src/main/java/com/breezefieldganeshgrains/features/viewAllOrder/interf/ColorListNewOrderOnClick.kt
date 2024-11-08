package com.breezefieldganeshgrains.features.viewAllOrder.interf

import com.breezefieldganeshgrains.app.domain.NewOrderColorEntity
import com.breezefieldganeshgrains.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}