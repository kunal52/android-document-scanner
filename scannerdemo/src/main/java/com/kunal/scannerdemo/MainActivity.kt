package com.kunal.scannerdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.kuama.documentscanner.presentation.ScannerActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myIntent = Intent(this@MainActivity, ScannerActivity::class.java)
        this@MainActivity.startActivity(myIntent)
    }
}