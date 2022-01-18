package com.fawacom.fordevelopers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings; // << incluir esta biblioteca
import android.webkit.WebView; // << incluir esta biblioteca

public class MainActivity extends AppCompatActivity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); // << Essa linha tira o titlo do APP.
        setContentView(R.layout.activity_main);


        // Configurando o WevView
        myWebView = (WebView) findViewById(R.id.webview);

        // Incluíndo o link do site o qual quer que seja exibido no APP
        myWebView.loadUrl("https://dev.fawacom.com.br/");

        // Habilitando o JavaScript
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}