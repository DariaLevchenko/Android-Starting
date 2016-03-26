package com.example.dasha_000.cookie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cookieStar (View view){
        Intent intent = new Intent (this, Main2Activity.class);
        startActivity(intent);
    }
    public void chocolateChits (View view){
        Intent intent = new Intent (this, Main3Activity.class);
        startActivity(intent);}

    public void whiteCookie (View view){
        Intent intent = new Intent (this, Main4Activity.class);
        startActivity(intent);}

    public void newYearCookie (View view){
        Intent intent = new Intent (this, Main5Activity.class);
        startActivity(intent);}

    public void brownCookie (View view){
        Intent intent = new Intent (this, Main6Activity.class);
        startActivity(intent);}
}
