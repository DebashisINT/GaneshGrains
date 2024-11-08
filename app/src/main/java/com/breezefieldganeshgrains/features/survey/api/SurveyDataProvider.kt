package com.breezefieldganeshgrains.features.survey.api

import com.breezefieldganeshgrains.features.photoReg.api.GetUserListPhotoRegApi
import com.breezefieldganeshgrains.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}