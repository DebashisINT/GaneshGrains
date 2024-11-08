package com.breezefieldganeshgrains.features.activities.api

import com.breezefieldganeshgrains.features.member.api.TeamApi
import com.breezefieldganeshgrains.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}