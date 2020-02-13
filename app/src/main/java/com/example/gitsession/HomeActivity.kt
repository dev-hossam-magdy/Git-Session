package com.example.gitsession

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var h = Handler()
        h.postDelayed({},2000)
    }
}
