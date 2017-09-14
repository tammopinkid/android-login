package com.egco428.ex051

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    var user: String = ""
    var pass: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras

        if(!bundle.isEmpty){
            user = bundle.getString("key_username")
            pass = bundle.getString("key_password")

            var dataHashMap = hashMapOf<String,String>("Username" to user, "Password" to pass)

            if(dataHashMap["Username"].toString().equals("tammopinkid") && dataHashMap["Password"].toString().equals("mfx24479")){
                showUsername.setText(user)
                showPassword.setText(pass)
            }
            else this.finish()
        }
    }
}
