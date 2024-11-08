package com.breezefieldganeshgrains.features.document.api

import com.breezefieldganeshgrains.features.dymanicSection.api.DynamicApi
import com.breezefieldganeshgrains.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}