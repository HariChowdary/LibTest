package com.lib.libsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lib.mylibrary.MyLib

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lib=MyLib()
        lib.printTest()
    }
}