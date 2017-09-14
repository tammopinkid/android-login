package com.egco428.ex051

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitBtn.setOnClickListener {
            var intent = Intent(this,Main2Activity::class.java)

            intent.putExtra("key_username",username.text.toString())
            intent.putExtra("key_password",password.text.toString())

            startActivity(intent)
        }

        cancleBtn.setOnClickListener {
            username.setText("")
            password.setText("")
        }
    }
}
