package com.breezefieldganeshgrains.features.orderhistory.activitiesapi

import com.breezefieldganeshgrains.app.Pref
import com.breezefieldganeshgrains.base.BaseResponse
import com.breezefieldganeshgrains.features.orderhistory.model.FetchLocationRequest
import com.breezefieldganeshgrains.features.orderhistory.model.FetchLocationResponse
import com.breezefieldganeshgrains.features.orderhistory.model.SubmitLocationInputModel
import com.breezefieldganeshgrains.features.orderhistory.model.UnknownReponseModel
import io.reactivex.Observable

/**
 * Created by Pratishruti on 30-11-2017.
 */
class LocationFetchRepository(val apiService: LocationFetchApi){
    fun fetchLocationUpdate(location: FetchLocationRequest): Observable<FetchLocationResponse> {
        return apiService.getLocationUpdates(location)
    }

    fun fetchLocationUpdate(date: String): Observable<FetchLocationResponse> {
        return apiService.getLocationUpdates(Pref.session_token!!, Pref.user_id!!, date)
    }

    fun fetchUnknownLocation(): Observable<UnknownReponseModel> {
        return apiService.getUnknownLocation(Pref.session_token!!, Pref.user_id!!)
    }

    fun submitLoc(loc: SubmitLocationInputModel): Observable<BaseResponse> {
        return apiService.submitLocation(loc)
    }
}