package com.breezefieldganeshgrains.features.login.model.opportunitymodel

import com.breezefieldganeshgrains.app.domain.OpportunityStatusEntity
import com.breezefieldganeshgrains.app.domain.ProductListEntity
import com.breezefieldganeshgrains.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}