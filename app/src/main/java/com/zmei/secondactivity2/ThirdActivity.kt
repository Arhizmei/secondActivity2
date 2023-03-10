package com.zmei.secondactivity2

import Constant.constants
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.zmei.secondactivity2.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView3.text = intent.getStringExtra("key3")


    }
    fun exit (view: View){

        intent.putExtra("key3", binding.editTextTextPersonName.text.toString())
        intent.putExtra("key4", "Return ${constants.user} !!!!!!!!")
        setResult(RESULT_OK, intent)
        finish()


    }
}