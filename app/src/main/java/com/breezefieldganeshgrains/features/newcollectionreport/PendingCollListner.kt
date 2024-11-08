package com.breezefieldganeshgrains.features.newcollectionreport

import com.breezefieldganeshgrains.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}