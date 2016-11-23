package com.example.me.sortingarena;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.webkit.WebView;

import com.example.me.sortingarena.Main2Activity;


import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //WebView view;
        //view= (WebView) findViewById(R.id.webView1);
        //view.getSettings().setJavaScriptEnabled(true);
        //view.loadUrl("file:///android_asset/part_1.html");
      //  view.setBackgroundColor(Color.TRANSPARENT);
        //setContentView(view);
    }
    public void functionb (View v)
    {
            Intent intent=new Intent(MainActivity.this,Main2Activity.class);
            String message = "BUBBLE";
            intent.putExtra("STRING_I_NEED", message);

            startActivity(intent);
    }
    public void functions (View v)
    {
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        String message = "SELECTION";
        intent.putExtra("STRING_I_NEED", message);
        startActivity(intent);
    }
    public void functioni (View v)
    {
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        String message = "INSERTION";
        intent.putExtra("STRING_I_NEED", message);
        startActivity(intent);
    }
    public void functionq (View v)
    {
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        String message = "QUICK";
        intent.putExtra("STRING_I_NEED", message);
        startActivity(intent);
    }
    public void functionm (View v)
    {
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        String message = "MERGE";
        intent.putExtra("STRING_I_NEED", message);
        startActivity(intent);
    }

}
