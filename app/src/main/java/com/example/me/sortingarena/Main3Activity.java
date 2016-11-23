package com.example.me.sortingarena;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

public class Main3Activity extends AppCompatActivity {
    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        WebView view2;
        view2= (WebView) findViewById(R.id.webview2);
        view2.getSettings().setLoadWithOverviewMode(true);
        view2.getSettings().setUseWideViewPort(true);
        view2.getSettings().setJavaScriptEnabled(true);
        view2.loadUrl("https://visualgo.net/sorting");
        view2.setBackgroundColor(Color.TRANSPARENT);

    }
}
