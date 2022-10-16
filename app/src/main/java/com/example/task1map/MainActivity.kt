package com.example.task1map

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btnSad : Button
    lateinit var btnHappy : Button
    lateinit var btnMad : Button
    lateinit var btnResetMood : Button
    lateinit var btnResetAll :Button
    lateinit var etNameInput : EditText
    lateinit var tvYourName : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSad = findViewById(R.id.btn_sad)
        btnHappy = findViewById(R.id.btn_happy)
        btnMad = findViewById(R.id.btn_mad)
        etNameInput = findViewById(R.id.et_nameInput)
        tvYourName = findViewById(R.id.tv_yourName)
        btnResetMood = findViewById(R.id.btn_resetMood)
        btnResetAll = findViewById(R.id.btn_resetAll)

        var name = etNameInput.text

        btnSad.setOnClickListener {
            if (etNameInput.text.isEmpty()) {
                Toast.makeText(
                    this,
                    "Please input your Name",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
            Toast.makeText(
                this,
                "Halo $name, you are Sad today",
                Toast.LENGTH_LONG
            ).show()
            btnSad.isEnabled = false
            btnHappy.isEnabled = false
            btnMad.isEnabled = false
        }
        btnHappy.setOnClickListener {
            if (etNameInput.text.isEmpty()) {
                Toast.makeText(
                    this,
                    "Please input your Name",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
            Toast.makeText(
                this,
                "Halo $name, you are Happy today",
                Toast.LENGTH_LONG
            ).show()
            btnSad.isEnabled = false
            btnHappy.isEnabled = false
            btnMad.isEnabled = false
        }
        btnMad.setOnClickListener {
            if (etNameInput.text.isEmpty()) {
                Toast.makeText(
                    this,
                    "Please input your Name",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }
            Toast.makeText(
                this,
                "Halo $name, you are Mad today",
                Toast.LENGTH_LONG
            ).show()
            btnSad.isEnabled = false
            btnHappy.isEnabled = false
            btnMad.isEnabled = false
        }
        btnResetMood.setOnClickListener{
            btnSad.isEnabled = true
            btnHappy.isEnabled = true
            btnMad.isEnabled = true
        }
        btnResetAll.setOnClickListener{
            etNameInput.text = null
            btnSad.isEnabled = true
            btnHappy.isEnabled = true
            btnMad.isEnabled = true
        }
    }
}