package com.example.notesapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.room.Room

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCreateNote = findViewById<Button>(R.id.btnCreate)
        val lblGreeting = findViewById<TextView>(R.id.lblGreeting)
        val noteRecycler = findViewById<RecyclerView>(R.id.notesRecycler)

        //lblNotes.setText(notes)
        btnCreateNote.setOnClickListener() {
        }
    }

}