package com.example.parksehun.androidtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.textservice.SpellCheckerInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt = (EditText)findViewById(R.id.editText);
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!edt.getText().toString().isEmpty())
                    StartService(edt);
                else
                    Toast.makeText(MainActivity.this, "시간을 입력해주세요",Toast.LENGTH_LONG).show();
            }
        });
    }

    public void StartService(EditText v){
        Long sleepseconds = Long.parseLong(v.getText().toString());
        Intent intent = new Intent(MainActivity.this, serviceTest.class);
        intent.putExtra("seconds",sleepseconds);
        startService(intent);
    }
}
