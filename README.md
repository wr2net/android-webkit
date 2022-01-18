# Utilizando o Android WebKit

Este é um exemplo de como implementar o uso do Android Webkit para empacotar um SDK do seu site/sistema web que poderá ser publicado na Google Play Store.

## Onde devo olhar?
Veja o arquivo `MainActivity` em `java/com.fawacom.fordevelopers/MainActivity`

## Como saber se meu site é compatível com dispositivos móveis?
Acesse o link [Mobile Friendly](https://search.google.com/test/mobile-friendly) e insira o link do seu site para realizar o teste.

## Como usar?

1. Android Studio + SDK
2. Empty Activity
3. Incluir informações solicitadas
4. Implementação no MainActivity.java: 
```
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
```
5. Gerando build: 
    - Menu Build
    - Generate Signed Bundle/APK...
    - APK
    - Create new
        - Incluir as informações solicitadas
    - Ok
    - Next
    - Definir local do APK e o Tipo (debug ou release)
    - Finish
   

## Você pode gerar os icones para seu APP [aqui](http://assetstudio.androidpro.com.br/icons-launcher.html#foreground.type=image&foreground.space.trim=1&foreground.space.pad=0.15&foreColor=rgba(96%2C%20125%2C%20139%2C%200)&backColor=rgb(255%2C%20255%2C%20255)&crop=0&backgroundShape=square&effects=shadow&name=ic_launcher)