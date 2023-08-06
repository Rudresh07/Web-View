package com.example.dbmsprojectapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.dbmsprojectapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding?.root

        setContentView(view)

        val webViewVariable = binding?.website
        webViewSetup(webViewVariable)

    }

    private fun webViewSetup(webViewVariable: WebView?) {

        webViewVariable?.webViewClient = WebViewClient()
        webViewVariable?.apply {

            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled = true

            loadUrl("https://roadmap.sh/roadmaps")
        }

    }
}