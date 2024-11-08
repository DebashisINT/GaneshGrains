package com.breezefieldganeshgrains.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezefieldganeshgrains.app.FileUtils
import com.breezefieldganeshgrains.base.BaseResponse
import com.breezefieldganeshgrains.features.NewQuotation.model.*
import com.breezefieldganeshgrains.features.addshop.model.AddShopRequestData
import com.breezefieldganeshgrains.features.addshop.model.AddShopResponse
import com.breezefieldganeshgrains.features.damageProduct.model.DamageProductResponseModel
import com.breezefieldganeshgrains.features.damageProduct.model.delBreakageReq
import com.breezefieldganeshgrains.features.damageProduct.model.viewAllBreakageReq
import com.breezefieldganeshgrains.features.login.model.userconfig.UserConfigResponseModel
import com.breezefieldganeshgrains.features.myjobs.model.WIPImageSubmit
import com.breezefieldganeshgrains.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}