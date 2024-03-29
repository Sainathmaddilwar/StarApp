package com.example.starapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {



    public static int getImageId(Context context, String imageName)
    {
        return context.getResources().getIdentifier("drawable/" + imageName, null, context.getPackageName());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ImageView imageView=(ImageView) findViewById(R.id.imageView);
        Intent intent=getIntent();
        Toast.makeText(this,intent.getStringExtra("name"),Toast.LENGTH_SHORT).show();
        String weather=intent.getStringExtra("name");
        imageView.setImageResource(getImageId(this,weather));
    }
}
