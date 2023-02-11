package com.example.functionalapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class SedondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sedond)
        val webButton = findViewById<Button>(R.id.webView)
        val callButton = findViewById<Button>(R.id.call)
        val appCardView = findViewById<CardView>(R.id.android)
        val webCardView = findViewById<CardView>(R.id.Web)
        val iosCardView = findViewById<CardView>(R.id.ios)
        val mlCardView  = findViewById<CardView>(R.id.ml)
        val blockCardView = findViewById<CardView>(R.id.block)
        val aiCardView =  findViewById<CardView>(R.id.ai)


        webButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedin.com/in/saumya1singh/")
            startActivity(intent)
        }

        callButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("1234567890")
            startActivity(intent)

        }

        appCardView.setOnClickListener {

            intent = Intent(applicationContext, android::class.java)
            startActivity(intent)
        }
        webCardView.setOnClickListener {

            intent = Intent(applicationContext, web::class.java)
            startActivity(intent)
        }

       iosCardView.setOnClickListener {
           intent = Intent(applicationContext, ios::class.java)
           startActivity(intent)
       }
        mlCardView.setOnClickListener {
            intent = Intent(applicationContext, android::class.java)
            startActivity(intent)
        }

        blockCardView.setOnClickListener {
            intent = Intent(applicationContext, block::class.java)
            startActivity(intent)
        }
        aiCardView.setOnClickListener {
            intent = Intent(applicationContext, ai::class.java)
            startActivity(intent)
        }

    }
}