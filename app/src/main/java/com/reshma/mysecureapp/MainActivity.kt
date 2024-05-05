package com.reshma.mysecureapp

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.reshma.mysecureapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var activityMainBinding:ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding?.root)
        initViews()
    }

    private fun initViews() {
        activityMainBinding?.tvBaseurl?.setText(MyKeys.getBaseUrl())
    }
}
