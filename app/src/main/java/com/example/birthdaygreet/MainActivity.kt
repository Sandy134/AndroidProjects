package com.example.birthdaygreet

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.birthdaygreet.databinding.ActivityMainBinding
import org.w3c.dom.Text

private lateinit var binding : ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        binding= ActivityMainBinding.inflate(layoutInflater)
//        val view= binding.root
//        setContentView(view)
//        val button:Button=findViewById(R.id.createBirthdayGreeting)

    }


    fun createBirthdayCard(view: View)  {


        val name=findViewById<EditText>(R.id.nameInput).editableText.toString()
//        Toast.makeText(this,"name is $name",Toast.LENGTH_LONG).show()
        val intent= Intent(this,BirthdayGreetingActivity::class.java)
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA,name)
        startActivity(intent)



    }

//    override fun onPause() {
//        super.onPause()
//    }
//
//    override fun onResume() {
//        super.onResume()
//    }
//
//    override fun onStart() {
//        super.onStart()
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//    }




}