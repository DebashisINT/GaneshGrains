package com.breezefieldganeshgrains.features.viewAllOrder.interf

import com.breezefieldganeshgrains.app.domain.NewOrderGenderEntity
import com.breezefieldganeshgrains.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}