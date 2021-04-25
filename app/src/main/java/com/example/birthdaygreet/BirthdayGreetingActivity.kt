package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.example.birthdaygreet.databinding.ActivityMainBinding
import java.lang.Exception



class BirthdayGreetingActivity : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA="name_extra"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)
//        binding= ActivityMainBinding.inflate(layoutInflater)
//        val view= binding.root
//        setContentView(view)
        val name=intent.getStringExtra(NAME_EXTRA)
        findViewById<TextView>(R.id.birthdayGreeting).setText("Happy Birthday\n $name!")







    }
}