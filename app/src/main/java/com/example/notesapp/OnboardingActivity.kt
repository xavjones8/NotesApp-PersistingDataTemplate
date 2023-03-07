package com.example.notesapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class OnboardingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val txtFirstName = findViewById<EditText>(R.id.txtFirstName)
        val txtLastName = findViewById<EditText>(R.id.txtLastName)
        val txtEmail = findViewById<EditText>(R.id.txtEmail)
        val txtPassword = findViewById<EditText>(R.id.txtPassword)
        val btnSubmit = findViewById<Button>(R.id.btnCreateUser)



        btnSubmit.setOnClickListener() {

        }



    }
}