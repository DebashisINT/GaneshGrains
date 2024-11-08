package com.breezefieldganeshgrains.features.viewAllOrder.orderOptimized

import com.breezefieldganeshgrains.app.domain.ProductOnlineRateTempEntity
import com.breezefieldganeshgrains.base.BaseResponse
import com.breezefieldganeshgrains.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}