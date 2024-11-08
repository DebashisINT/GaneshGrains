package com.breezefieldganeshgrains.features.login.api

import android.content.Context
import android.net.Uri
import com.breezefieldganeshgrains.app.FileUtils
import com.breezefieldganeshgrains.app.Pref
import com.breezefieldganeshgrains.base.BaseResponse
import com.breezefieldganeshgrains.features.login.model.GetConcurrentUserResponse
import com.breezefieldganeshgrains.features.login.model.LoginImageInput
import com.breezefieldganeshgrains.features.login.model.LoginResponse
import com.breezefieldganeshgrains.features.login.model.NewSettingsResponseModel
import com.breezefieldganeshgrains.features.login.model.mettingListModel.MeetingListResponseModel
import com.breezefieldganeshgrains.features.login.presentation.LoginActivity
import com.fasterxml.jackson.databind.ObjectMapper
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Pratishruti on 23-11-2017.
 */
class LoginRepository(val apiService: LoginApi) {
    fun login(username: String, password: String, latitude: String, longitude: String, login_time: String, imei: String, version: String, location: String,
              device_token: String): Observable<LoginResponse> {
        return apiService.getLoginResponse(username, password, latitude, longitude, login_time, imei, version, location, device_token)
    }

    fun getConcurrentUserDtls(username: String): Observable<GetConcurrentUserResponse> {
        return apiService.getConcurrentUserDtlsApi(username)
    }

    fun insertConcurrentUserDtls(username: String,imei:String,dateTime:String): Observable<BaseResponse> {
        return apiService.insertConcurrentUserDtlsApi(username,imei,dateTime)
    }

    fun deleteConcurrentUserDtls(username: String): Observable<BaseResponse> {
        return apiService.deleteConcurrentUserDtlsApi(username)
    }

    fun getMeetingList(): Observable<MeetingListResponseModel> {
        return apiService.getMeetingList(Pref.session_token!!, Pref.user_id!!)
    }

    fun getNewSettings(username: String, password: String): Observable<NewSettingsResponseModel> {
        return apiService.getNewSettings(username, password)
    }

    fun loginWithImage(image: String, context: Context, userName: String, password: String): Observable<BaseResponse> {
        var profile_img_data: MultipartBody.Part? = null

        val profile_img_file = File(image) //FileUtils.getFile(context, Uri.parse(image))
        if (profile_img_file != null && profile_img_file.exists()) {
            val profileImgBody = RequestBody.create(MediaType.parse("multipart/form-data"), profile_img_file)
            profile_img_data = MultipartBody.Part.createFormData("image", profile_img_file.name, profileImgBody)
        } else {
            var mFile: File? = null
            mFile = (context as LoginActivity).getShopDummyImageFile()
            val profileImgBody = RequestBody.create(MediaType.parse("multipart/form-data"), mFile)
            profile_img_data = MultipartBody.Part.createFormData("image", mFile.name, profileImgBody)
        }

        val loginImg = LoginImageInput()
        loginImg.user_name = userName
        loginImg.password = password

        //var shopObject: RequestBody? = null
        var jsonInString = ""
        try {
            jsonInString = ObjectMapper().writeValueAsString(loginImg)
            //  shopObject = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), jsonInString)
        } catch (e: Throwable) {
            e.printStackTrace()
        }
        return apiService.loginWithImage(jsonInString, profile_img_data)
        // return apiService.getAddShopWithoutImage(jsonInString)
    }
}