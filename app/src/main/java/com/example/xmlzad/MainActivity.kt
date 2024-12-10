package com.example.xmlzad

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val cancelButton: Button = findViewById(R.id.buttonCancel)

        val nameEditText: EditText = findViewById(R.id.editTextName)
        val emailEditText: EditText = findViewById(R.id.editTextEmail)
        val messageEditText: EditText = findViewById(R.id.editTextMessage)


        cancelButton.setOnClickListener {
            nameEditText.text.clear()
            emailEditText.text.clear()
            messageEditText.text.clear()
        }
    }
}