package com.example.dasha_000.cookie;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main4Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }
    public void back2 (View view){
        finish();
    }

    public void mail2 (View view){
        Intent mailIntent = new Intent(Intent.ACTION_SENDTO);

        mailIntent.setType("text/html");
        mailIntent.setData(Uri.parse("mailto:"));
        String[] e = new String[] {"dasha.k.levchenko@gmail.com"};
        mailIntent.putExtra(Intent.EXTRA_EMAIL, e);
        mailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
        mailIntent.putExtra(Intent.EXTRA_TEXT, "Message Text");
        if (mailIntent.resolveActivity(getPackageManager()) != null)
        {startActivity(mailIntent);}
    }
}
