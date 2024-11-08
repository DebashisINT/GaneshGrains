package com.breezefieldganeshgrains.features.viewAllOrder.interf

import com.breezefieldganeshgrains.app.domain.NewOrderProductEntity
import com.breezefieldganeshgrains.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}