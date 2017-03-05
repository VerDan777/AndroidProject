package com.example.veres.androidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.start;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Intent intent;
    TextView textView;
    Button button;
    Button btTime;
    Button btDate;
    EditText editText;
    EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        editText=(EditText) findViewById(R.id.editText) ;
        password=(EditText) findViewById(R.id.passwordText);
        btTime=(Button) findViewById(R.id.buttonTime);
        btDate=(Button) findViewById(R.id.buttonDate);
        button.setOnClickListener(this);
        btTime.setOnClickListener(this);
        btDate.setOnClickListener(this);
//
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.button:
                intent = new Intent(this, Main2Activity.class);
                startActivity(intent);
                break;
            case R.id.buttonTime:
                intent= new Intent(this,Main3Activity.class);
                startActivity(intent);
                break;
            case R.id.buttonDate:
                intent= new Intent(this,Main3Activity.class);
                startActivity(intent);
                break;
            case R.id.editText:
                intent= new Intent(this,Main2Activity.class);
                intent.putExtra("name",editText.getText().toString());
                startActivity(intent);
                break;
            case R.id.passwordText:
                Intent intent= new Intent();
                startActivity(intent);
                break;
        }




    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    public boolean OnCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}



