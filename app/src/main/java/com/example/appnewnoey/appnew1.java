package com.example.appnewnoey;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class appnew1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appnew1);
        Intent b = getIntent();
        int score = b.getIntExtra("asf",0);
        Button ch2 = findViewById(R.id.CH2);

        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText num = findViewById(R.id.ETN);
                String a= num.getText().toString();
                if (a.length()==0) {
                Toast toast = Toast.makeText(appnew1.this,"กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก",Toast.LENGTH_LONG);
                toast.show ( );
                }
                //////////////////////////////////
                else if (a.equals("1111111111111") || a.equals("2222222222222")) {
                AlertDialog.Builder di = new AlertDialog.Builder(appnew1.this);
                di.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                di.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");
                di.show();
                }
                //////////////////////////////////
                else {
                    AlertDialog.Builder di = new AlertDialog.Builder(appnew1.this);
                    di.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                    di.setMessage("คุณไม่มีสิทธิเลือกตั้ง");
                    di.show();
                }



            }
        });









    }
}