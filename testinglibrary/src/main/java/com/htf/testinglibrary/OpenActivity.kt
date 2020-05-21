package com.htf.testinglibrary

import android.content.Context
import android.content.Intent

class OpenActivity {

    companion object{
        fun ShubhTest(context: Context){
            val i = Intent(context,TestActivity::class.java)
            context.startActivity(i)
        }
    }

}