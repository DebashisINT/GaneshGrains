package com.breezefieldganeshgrains.features.nearbyuserlist.api

import com.breezefieldganeshgrains.app.Pref
import com.breezefieldganeshgrains.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldganeshgrains.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldganeshgrains.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}