package com.example.export

import android.content.Context
import com.blankj.utilcode.util.ApiUtils

abstract class UserApi : ApiUtils.BaseApi() {
    abstract fun startLoginActivity(context: Context)
}