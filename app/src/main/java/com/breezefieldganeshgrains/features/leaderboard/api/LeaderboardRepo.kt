package com.breezefieldganeshgrains.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldganeshgrains.app.FileUtils
import com.breezefieldganeshgrains.app.Pref
import com.breezefieldganeshgrains.base.BaseResponse
import com.breezefieldganeshgrains.features.addshop.model.AddLogReqData
import com.breezefieldganeshgrains.features.addshop.model.AddShopRequestData
import com.breezefieldganeshgrains.features.addshop.model.AddShopResponse
import com.breezefieldganeshgrains.features.addshop.model.LogFileResponse
import com.breezefieldganeshgrains.features.addshop.model.UpdateAddrReq
import com.breezefieldganeshgrains.features.contacts.CallHisDtls
import com.breezefieldganeshgrains.features.contacts.CompanyReqData
import com.breezefieldganeshgrains.features.contacts.ContactMasterRes
import com.breezefieldganeshgrains.features.contacts.SourceMasterRes
import com.breezefieldganeshgrains.features.contacts.StageMasterRes
import com.breezefieldganeshgrains.features.contacts.StatusMasterRes
import com.breezefieldganeshgrains.features.contacts.TypeMasterRes
import com.breezefieldganeshgrains.features.dashboard.presentation.DashboardActivity
import com.breezefieldganeshgrains.features.login.model.WhatsappApiData
import com.breezefieldganeshgrains.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}