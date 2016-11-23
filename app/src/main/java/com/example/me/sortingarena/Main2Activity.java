package com.example.me.sortingarena;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebView;

import com.example.me.sortingarena.R;

/**
 * Created by Me on 11/23/2016.
 */

public class Main2Activity extends AppCompatActivity {
    String newString;
    private static final String TAG = "MyActivity";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String newString = intent.getExtras().getString("STRING_I_NEED");

        Log.d(TAG, newString );
        WebView view;
        view= (WebView) findViewById(R.id.webview);

        view.getSettings().setJavaScriptEnabled(true);

        if(newString.contentEquals("BUBBLE"))
        {
            Log.d(TAG, " bubble ");
            view.loadUrl("file:///android_asset/part_1.html");
        }
        else if(newString.contentEquals("SELECTION"))
        {
            view.loadUrl("file:///android_asset/part_1.html");
        }
        else if(newString.contentEquals("MERGE"))
        {
            view.loadUrl("file:///android_asset/part_1.html");
        }
        else if(newString.contentEquals("QUICK"))
        {
            view.loadUrl("file:///android_asset/part_1.html");
        }
        else if(newString.contentEquals("INSERTION"))
        {
            view.loadUrl("file:///android_asset/part_1.html");
        }
        view.setBackgroundColor(Color.TRANSPARENT);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.num1:
                // User chose the "Settings" item, show the app settings UI...
            {
                Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                //String message = "BUBBLE";
                //intent.putExtra("STRING_I_NEED", message);
                startActivity(intent);
            }
            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);
        }
    }


}
