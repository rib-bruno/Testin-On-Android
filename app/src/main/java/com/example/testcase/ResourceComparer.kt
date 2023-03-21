package com.example.testcase

import android.content.Context

class ResourceCompare {

    fun isEqual(context: Context, resId: Int, string: String) : Boolean {
        //verificar se é igual a string que passamos como parâmetro
        return context.getString(resId) == string
    }

}