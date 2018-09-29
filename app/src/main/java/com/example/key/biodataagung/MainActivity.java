package com.example.key.biodataagung;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void tlpn (View v){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:085803389074"));
        startActivity(intent);
    }
    public void almt (View v){
        Uri uri = Uri.parse("geo:0,0?q=-7.036541,110.489448");
        Intent it = new Intent(android.content.Intent.ACTION_VIEW,uri);
        startActivity(it);
    }
    public void email (View v){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"agungrachmad2@gmail.com"});
        try {
            startActivity(Intent.createChooser(intent, "Ingin mengirim email?"));
        } catch (android.content.ActivityNotFoundException ex){
            startActivity(Intent.createChooser(intent, "Gagal Mengirim Email"));
        }
    }
}
