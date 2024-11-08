package com.breezefieldganeshgrains.features.lead.api

import com.breezefieldganeshgrains.features.NewQuotation.api.GetQuotListRegRepository
import com.breezefieldganeshgrains.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}