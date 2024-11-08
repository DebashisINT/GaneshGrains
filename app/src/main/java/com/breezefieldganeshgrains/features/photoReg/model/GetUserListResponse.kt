package com.breezefieldganeshgrains.features.photoReg.model

import com.breezefieldganeshgrains.features.stockAddCurrentStock.model.CurrentStockGetDataDtls

class GetUserListResponse {
    var status:String ? = null
    var message:String ? = null
    var user_list :ArrayList<UserListResponseModel>? = null
}