package com.breezefieldganeshgrains.features.viewAllOrder.interf

import com.breezefieldganeshgrains.app.domain.NewOrderGenderEntity
import com.breezefieldganeshgrains.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}