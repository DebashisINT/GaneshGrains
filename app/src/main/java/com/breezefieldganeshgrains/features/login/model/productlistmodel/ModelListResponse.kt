package com.breezefieldganeshgrains.features.login.model.productlistmodel

import com.breezefieldganeshgrains.app.domain.ModelEntity
import com.breezefieldganeshgrains.app.domain.ProductListEntity
import com.breezefieldganeshgrains.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}