package com.example.contraintlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        lateinit var firstname: EditText
        lateinit var lastname: EditText
        lateinit var school: EditText
        lateinit var graduation: EditText
        lateinit var major: EditText
        lateinit var activity: EditText
        lateinit var degre: EditText
findViewById<TextView>(R.id.textView).apply {
    text = firstname.toString() + lastname.toString()+ " graduated in " + graduation.toString()+ " with a " + degre.toString() + " with a concentration in " +
            major.toString() + " From " + school.toString() + ". Their favorite activites are " + activity.toString()
}

    }
}