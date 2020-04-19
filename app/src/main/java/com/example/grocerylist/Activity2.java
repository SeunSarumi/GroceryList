package com.example.grocerylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent shareintent = new Intent();
                shareintent.setAction(Intent.ACTION_SEND);
                shareintent.putExtra(Intent.EXTRA_TEXT,"Grocery list here");
                shareintent.setType("text/plain");
                startActivity(shareintent);


            }
        });


        Intent intent = getIntent();
        String text1 = intent.getStringExtra(MainActivity.EXTRA_TEXT1);
        String text2 = intent.getStringExtra(MainActivity.EXTRA_TEXT2);
        String text3 = intent.getStringExtra(MainActivity.EXTRA_TEXT3);
        String text4 = intent.getStringExtra(MainActivity.EXTRA_TEXT4);


        TextView textView1 = (TextView) findViewById(R.id.textview1);
        TextView textView2 = (TextView) findViewById(R.id.textview2);
        TextView textView3 = (TextView) findViewById(R.id.textview3);
        TextView textView4 = (TextView) findViewById(R.id.textview4);


        textView1.setText(text1);
        textView2.setText(text2);
        textView3.setText(text3);
        textView4.setText(text4);
    }
}
