package com.example.notesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.room.Room
import com.adc.notesapp.R
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.UUID

class CreateNotesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_notes)


        val noteTitle = findViewById<EditText>(R.id.txtTitle)
        val noteContents = findViewById<EditText>(R.id.txtContents)
        val btnCreateNote = findViewById<Button>(R.id.btnSubmit)


        btnCreateNote.setOnClickListener() {
            //TODO: Retrieve Note Database, Add Note, Apply Changes, Navigate to MainActivity
        }
    }
}
