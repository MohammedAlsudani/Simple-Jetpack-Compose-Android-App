package com.scanner.app.base

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.OnBackPressedCallback


abstract class BaseComposeActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
        onBackPressedDispatcher.addCallback(this /* lifecycle owner */, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // Back is pressed... Finishing the activity
                finish()
            }
        })
    }

    abstract fun initView()
}