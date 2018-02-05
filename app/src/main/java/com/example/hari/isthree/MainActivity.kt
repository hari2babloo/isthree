package com.example.hari.isthree

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager

class MainActivity : AppCompatActivity() {

    internal var SPLASH_TIME_OUT = 2000

    override fun onCreate(savedInstanceState: Bundle?) {


        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main)
        Handler().postDelayed(
                {
                    startActivity(Intent(this, Firstpage::class.java))
                    finish()
                }, SPLASH_TIME_OUT.toLong())
    }
    }

