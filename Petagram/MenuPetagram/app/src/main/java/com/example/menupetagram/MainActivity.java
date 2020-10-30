package com.example.menupetagram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.mAbout:
                Intent intent= new Intent (this, activityAbout.class);
                startActivity(intent);
                break;
            case R.id.mSetting:
                Intent i= new Intent (this, ActivitySettings.class);
                startActivity(i);
                break;
            case R.id.mContacto:
                Intent c= new Intent (this, ActivityContacto.class);
                startActivity(c);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}