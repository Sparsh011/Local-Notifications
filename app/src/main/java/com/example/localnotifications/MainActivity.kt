package com.example.localnotifications

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val service = CounterNotificationService(applicationContext)
        val showNotification = findViewById<Button>(R.id.btn_show)
        showNotification.setOnClickListener{
            service.showNotification(Counter.value)
        }
    }
}