package com.example.topsateams

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //created array to hold up 5 soccer teams


    val teams = arrayOf<String>("Mam Sundowns FC" ,"Bidwest Wits","Orlando Pirates","Kaizer Chiefs"
                               , "Cape Town City FC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // get the teams text view
        val TeamsTxt = findViewById<TextView>(R.id.teamsDisplayTxt)
        var teamsDisplayTxt = ""
        var count = 0

        //calling logArrValues function
        logArrValues(teams)
        logArrValues
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}