package com.javaex.ex06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button btnToAct01;
    private Button btnToAct02;
    private Button btnToAct03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("javaStudy", "onCreate: 액티비티2");

        btnToAct01 = (Button) findViewById(R.id.btnToAct01);
        btnToAct02 = (Button) findViewById(R.id.btnToAct02);
        btnToAct03 = (Button) findViewById(R.id.btnToAct03);

        btnToAct01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("javaStudy", "onClick: btnToAct01");

                Intent intent = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(intent);

            }
        });

        btnToAct02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("javaStudy", "onClick: btnToAct02");

                //intent에 현재 자바 파일과 이동할 자바 파일을 파라미터로 하여 객체 생성
                Intent intent = new Intent(MainActivity2.this, MainActivity2.class);
                //startActivity 메소드를 통해 구현
                startActivity(intent);
            }
        });

        btnToAct03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("javaStudy", "onClick: btnToAct03");

                //intent에 현재 자바 파일과 이동할 자바 파일을 파라미터로 하여 객체 생성
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                //startActivity 메소드를 통해 구현
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("javaStudy", "onStart: 액티비티2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("javaStudy", "onResume: 액티비티2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("javaStudy", "onPause: 액티비티2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("javaStudy", "onDestroy: 액티비티2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("javaStudy", "onRestart: 액티비티2");
    }

}