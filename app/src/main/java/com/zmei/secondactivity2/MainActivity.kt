package com.zmei.secondactivity2

import Constant.constants
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract.Constants
import com.zmei.secondactivity2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

    bindingClass.button1.setOnClickListener {

    var  account = bindingClass.ed1.text.toString()
    when (account){

        constants.admin-> {
            var parol = bindingClass.ed2.text.toString()
            if (constants.admin_parol == parol)
            {

                
            }
            else bindingClass.textView1.text = "Wrong password"}

        else -> {bindingClass.textView1.text = "Wrong password"}
    }

    }
    }
}