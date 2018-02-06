package com.example.hari.isthree

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import kotlinx.android.synthetic.main.dash_page.*

class DashPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dash_page)


        pickup.setOnClickListener {

            val  inte = Intent(this,com.example.hari.isthree.pickup::class.java)
            startActivity(inte)


        }

        wallet.setOnClickListener {

            val  inte = Intent(this,com.example.hari.isthree.Wallet::class.java)
            startActivity(inte)

        }
    }
}
