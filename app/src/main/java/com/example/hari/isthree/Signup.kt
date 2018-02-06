package com.example.hari.isthree

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.signup.*

class Signup : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        signup.setOnClickListener {


            val intt = Intent(this,Firstpage::class.java)
            startActivity(intt)
        }
    }
}
