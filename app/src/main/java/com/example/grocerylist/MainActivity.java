package com.example.grocerylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public static final String EXTRA_TEXT1 = "com.example.application.Grocerylist.EXTRA_TEXT1";
    public static final String EXTRA_TEXT2 = "com.example.application.Grocerylist.EXTRA_TEXT2";
    public static final String EXTRA_TEXT3 = "com.example.application.Grocerylist.EXTRA_TEXT3";
    public static final String EXTRA_TEXT4 = "com.example.application.Grocerylist.EXTRA_TEXT4";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    }


    public void openActivity2(){
        EditText editText1 = (EditText) findViewById(R.id.edittext1);
        String text1 = editText1.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.edittext2);
        String text2 = editText1.getText().toString();

        EditText editText3 = (EditText) findViewById(R.id.edittext3);
        String text3 = editText1.getText().toString();

        EditText editText4 = (EditText) findViewById(R.id.edittext4);
        String text4 = editText1.getText().toString();


        Intent intent = new Intent(this,Activity2.class);
        intent.putExtra(EXTRA_TEXT1,text1);
        intent.putExtra(EXTRA_TEXT2,text2);
        intent.putExtra(EXTRA_TEXT3,text3);
        intent.putExtra(EXTRA_TEXT4,text4);
        startActivity(intent);



    }
}
