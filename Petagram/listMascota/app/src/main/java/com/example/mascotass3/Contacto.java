package com.example.mascotass3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Contacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_opciones,menu);
        return true;
    }

    public boolean onOptionItemSelecter (MenuItem item){
        switch (item.getItemId()){
            case R.id.mAcerca:
                Intent a = new Intent(this, Acerca.class);
                startActivity(a);
                break;
            case R.id.mContacto:
                Intent c = new Intent(this, Contacto.class);
                startActivity(c);
                break;
        }
        return super.onOptionsItemSelected(item);
    }



}

