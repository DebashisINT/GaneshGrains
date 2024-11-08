package com.breezefieldganeshgrains.features.lead.api

import com.breezefieldganeshgrains.base.BaseResponse
import com.breezefieldganeshgrains.features.NewQuotation.model.AddQuotRequestData
import com.breezefieldganeshgrains.features.lead.model.*
import com.breezefieldganeshgrains.features.taskManagement.AddTaskReq
import com.breezefieldganeshgrains.features.taskManagement.EditTaskReq
import com.breezefieldganeshgrains.features.taskManagement.TaskViewRes
import com.breezefieldganeshgrains.features.taskManagement.model.TaskListReq
import io.reactivex.Observable

class GetLeadListRegRepository(val apiService : GetLeadListApi) {
    fun CustomerList(list: CustomerListReq): Observable<CustomerLeadResponse> {
        return apiService.getCustomerList(list)
    }

    fun submitActivity(list: AddActivityReq): Observable<BaseResponse> {
        return apiService.submitActivityListAPI(list)
    }

    fun editActivity(obj: EditActivityReq): Observable<BaseResponse> {
        return apiService.editActivityAPI(obj)
    }


    fun getActivityList(crm_id: String): Observable<ActivityViewRes> {
        return apiService.viewActivityList(crm_id)
    }

    fun TaskList(list: TaskListReq): Observable<TaskResponse> {
        return apiService.getTaskList(list)
    }

    fun submitTask(list: AddTaskReq): Observable<BaseResponse> {
        return apiService.submitTaskListAPI(list)
    }

    fun getTaskList(task_id: String): Observable<TaskViewRes> {
        return apiService.viewTaskList(task_id)
    }

    fun editTask(obj: EditTaskReq): Observable<BaseResponse> {
        return apiService.editTaskAPI(obj)
    }

}