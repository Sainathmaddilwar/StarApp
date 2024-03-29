package com.example.starapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.ListView);
        final ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("clear");
        arrayList.add("hazy");
        arrayList.add("rainy");
        arrayList.add("sunny");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
              Intent intent=new Intent(getApplicationContext(),SecondActivity.class);
              intent.putExtra("name",arrayList.get(position));
              startActivity(intent);

            }
        });

    }
}
