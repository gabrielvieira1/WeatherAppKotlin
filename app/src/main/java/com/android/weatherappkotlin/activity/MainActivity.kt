package com.android.weatherappkotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.weatherappkotlin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}