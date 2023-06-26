package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView txtQ;
    EditText e_txtA;
    Button sub;
    String ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtQ=findViewById(R.id.textView2);
        e_txtA=findViewById(R.id.editTextText);
        sub=findViewById(R.id.button);
        customdatatypes d[]=new customdatatypes[3];
        d[0]=new customdatatypes("What is the capital of Sri Lanka?","colombo");
        d[1]=new customdatatypes("What is the capital of India?","delhi");
        d[2]=new customdatatypes("What is the capital of Pakistan?","islamabad");
        Random rn=new Random();
        int num=rn.nextInt(3-0)+0;
        txtQ.setText(d[num].quiz_Q);
        ans=d[num].quiz_A;
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e_txtA.getText().toString().toLowerCase().equals(ans)){
                    int num=rn.nextInt(3-0)+0;
                    txtQ.setText(d[num].quiz_Q);
                    ans=d[num].quiz_A;
                    Toast.makeText(MainActivity.this,"Correct!",Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Wrong!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}