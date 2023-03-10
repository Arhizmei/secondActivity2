package com.zmei.secondactivity2

import Constant.constants
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.zmei.secondactivity2.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val message = intent.getStringExtra("key")
        binding.textView2.text = message

        binding.button2.setOnClickListener {
            intent.putExtra("zzz", "Возвращайтесь ${constants.admin} !!!")
            intent.putExtra("yyy", binding.ed3.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }
    }
}