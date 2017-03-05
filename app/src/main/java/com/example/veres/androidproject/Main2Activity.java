package com.example.veres.androidproject;

import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import  java.util.Date;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    Button but;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            SimpleDateFormat date= new SimpleDateFormat("dd. mm,yyyy");
        String time = date.format(new Date(System.currentTimeMillis()));
            textView=(TextView) findViewById(R.id.textView);
            Intent  intent= getIntent();
            String name =intent.getStringExtra("name");
            textView.setText(name);

        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button:
                Intent intent= new Intent(this,Main3Activity.class);
                startActivity(intent);
                break;
        }
    }
}
