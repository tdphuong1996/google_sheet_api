package com.pedrocarrillo.spreadsheetandroid

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.pedrocarrillo.spreadsheetandroid.ui.create.CreateSpreadsheetActivity
import com.pedrocarrillo.spreadsheetandroid.ui.read.ReadSpreadsheetActivity

class MainActivity : AppCompatActivity() {

    lateinit var btnReadSpreadsheet : TextView
    lateinit var btnCreateSpreadsheet : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnReadSpreadsheet = findViewById(R.id.btn_read_spreadsheet)
        btnCreateSpreadsheet = findViewById(R.id.btn_create_spreadsheet)
        btnReadSpreadsheet.setOnClickListener {
            val readSpreadsheetIntent = Intent(this, ReadSpreadsheetActivity::class.java)
            startActivity(readSpreadsheetIntent)
        }
        btnCreateSpreadsheet.setOnClickListener {
            val createSpreadsheetIntent = Intent(this, CreateSpreadsheetActivity::class.java)
            startActivity(createSpreadsheetIntent)
        }
    }

}
