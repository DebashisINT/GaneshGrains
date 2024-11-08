package com.breezefieldganeshgrains.features.viewAllOrder.interf

import com.breezefieldganeshgrains.app.domain.NewOrderGenderEntity
import com.breezefieldganeshgrains.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}