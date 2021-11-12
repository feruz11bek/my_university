package com.example.samdu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView samdu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        samdu=(WebView)findViewById(R.id.samdu);
        samdu.setWebViewClient(new WebViewClient());
        samdu.loadUrl("https://www.samdu.uz");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.haqida:{
                Intent intent=new Intent(MainActivity.this,HaqidaActivity.class);
                startActivity(intent);
                return  true;
            }
        }
        return super.onOptionsItemSelected(item);
    }

}