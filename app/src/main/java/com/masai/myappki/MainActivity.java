package com.masai.myappki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mbtnOne;
    private Button mbtnTwo;
    private Button mbtnthree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mbtnOne= findViewById(R.id.btnOne);
        mbtnTwo= findViewById(R.id.btnTwo);
        mbtnthree= findViewById(R.id.btnThree);

        mbtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Button one clicked", Toast.LENGTH_SHORT).show();
            }
        });
        mbtnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Button two clicke",Toast.LENGTH_SHORT).show();
            }
        });
        mbtnthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Button three clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}