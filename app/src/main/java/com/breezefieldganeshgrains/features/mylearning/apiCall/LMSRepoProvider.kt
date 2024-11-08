package com.breezefieldganeshgrains.features.mylearning.apiCall

import com.breezefieldganeshgrains.features.login.api.opportunity.OpportunityListApi
import com.breezefieldganeshgrains.features.login.api.opportunity.OpportunityListRepo

object LMSRepoProvider {
    fun getTopicList(): LMSRepo {
        return LMSRepo(LMSApi.create())
    }
}