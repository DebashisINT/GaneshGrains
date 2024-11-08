package com.breezefieldganeshgrains.features.photoReg.present

import com.breezefieldganeshgrains.app.domain.ProspectEntity
import com.breezefieldganeshgrains.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}