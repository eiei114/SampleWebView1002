package com.example.samplewebview1002

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //WebViewインスタンス生成
        val myWebView = WebView(this)
        //レイアウトに先ほどのインスタンスを設定ｌ
        setContentView(myWebView)
        //AndroidAppが先ほどの表示をアプリ内でするように設定
        myWebView.webViewClient = WebViewClient()
        myWebView.settings.javaScriptEnabled = true

        myWebView.loadUrl("https://example.com/")
    }
}
