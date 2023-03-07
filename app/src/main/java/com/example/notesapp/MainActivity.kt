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
import com.adc.notesapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO: Check if user has been created and navigate user as needed

        val btnCreateNote = findViewById<Button>(R.id.btnCreate)
        val lblGreeting = findViewById<TextView>(R.id.lblGreeting)
        val noteRecycler = findViewById<RecyclerView>(R.id.notesRecycler)

        //TODO: Pull in notes from NotesDatabase
        val notesList = listOf<Note>()

        val manager = NoteListAdapter(notesList)
        noteRecycler.layoutManager = LinearLayoutManager(this)
        noteRecycler.adapter = manager
        //lblNotes.setText(notes)
        btnCreateNote.setOnClickListener() {
            //TODO: Navigate to CreateNotesView
        }
    }

}