package com.htf.testinglibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        btn.setOnClickListener {
            Toast.makeText(this@TestActivity,"This is the toast",Toast.LENGTH_SHORT).show()
        }
    }
}
