package com.breezefieldganeshgrains.features.photoReg.adapter

import com.breezefieldganeshgrains.features.photoReg.model.UserListResponseModel

interface PhotoAttendanceListner {
    fun getUserInfoOnLick(obj: UserListResponseModel)
    fun getUserInfoAttendReportOnLick(obj: UserListResponseModel)
}