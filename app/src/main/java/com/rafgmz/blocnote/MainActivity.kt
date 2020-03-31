package com.rafgmz.blocnote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addButtonTouched(Button:View) {
        val userInput = userField.text
        val existingText = fullTextView.text
        fullTextView.text = "$existingText\n$userInput"
        userField.text = null
    }
}
