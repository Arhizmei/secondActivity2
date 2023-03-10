package com.zmei.secondactivity2

import Constant.constants
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract.Constants
import android.view.View
import com.zmei.secondactivity2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bindingClass: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)


    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 100 && resultCode == RESULT_OK && data != null) {
            bindingClass.textView1.text = data.getStringExtra("zzz")

        } else bindingClass.textView1.text = " Ошибка"


    if (requestCode == 100 && resultCode == RESULT_OK && data != null) {
        bindingClass.textView11.visibility = View.VISIBLE
        bindingClass.textView11.text = data.getStringExtra("yyy")
    }

        if (requestCode == 103 && resultCode == RESULT_OK && data != null){
        bindingClass.textView11.visibility = View.VISIBLE
            bindingClass.textView11.text = data.getStringExtra("key3")
        }

        if (requestCode == 103 && resultCode == RESULT_OK && data != null){
            bindingClass.textView1.text = data.getStringExtra("key4")
        }

    }

        fun onClick (view: View) {
            var account = bindingClass.ed1.text.toString()
            when (account) {

                constants.admin -> {
                    var parol = bindingClass.ed2.text.toString()
                    if (constants.admin_parol == parol) {
                        val i = Intent(this, SecondActivity::class.java)
                        i.putExtra("key", " Welcome ${constants.admin}")
                        startActivityForResult(i, 100)

                    } else bindingClass.textView1.text = "Wrong password"
                }

                constants.user -> {

                    var parol = bindingClass.ed2.text.toString()
                    if (constants.user_parol == parol) {
                        val i = Intent(this, ThirdActivity::class.java)
                        i.putExtra("key3", "Welcome ${constants.user}")
                        startActivityForResult(i, 103)
                    } else bindingClass.textView1.text = "Wrong password"
                }

                else -> {
                    bindingClass.textView1.text = "Wrong name"
                }
            }

            bindingClass.ed1.text.clear()
            bindingClass.ed2.text.clear()

        }


}