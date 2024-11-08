package com.breezefieldganeshgrains.features.orderList.model

import com.breezefieldganeshgrains.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}