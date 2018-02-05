package com.example.hari.isthree

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import kotlinx.android.synthetic.main.firstpage.*

class Firstpage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.firstpage)


        signin.setOnClickListener {


            val  intent = Intent(this,DashPage::class.java)
            startActivity(intent)
        }
    }
}
