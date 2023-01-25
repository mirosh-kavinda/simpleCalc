package com.example.calculatorsimple;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context contest =getApplicationContext();
        int duration= Toast.LENGTH_SHORT;


        //create objects
        EditText fntxt,sntxt;
        Button clearbtn ,multiplybtn ,reducebtn ,addbtn,dividbtn;
        TextView anstxt;

        //asign values to objects
        fntxt=(EditText) findViewById(R.id.fn);
        sntxt= (EditText) findViewById(R.id.sn);
        anstxt= findViewById(R.id.ans);
        multiplybtn=(Button) findViewById(R.id.mult);
        reducebtn= (Button) findViewById(R.id.sub);
        addbtn= (Button) findViewById(R.id.add);
        dividbtn= (Button) findViewById(R.id.div);
        clearbtn= (Button) findViewById(R.id.clear);


        ////click event
        multiplybtn.setOnClickListener(view -> {
            if(fntxt.getText().toString().equals("")){
                Toast toast= Toast.makeText(contest,"Please Enter first Number ?",duration);
                toast.show();
            }else if(sntxt.getText().toString().equals("")){
                Toast toast= Toast.makeText(contest,"Please Enter Second Number ?",duration);
                toast.show();
            }else{
                double answer=Float.parseFloat(fntxt.getText().toString().trim())*Float.parseFloat(sntxt.getText().toString().trim());
                anstxt.setText(answer+"");
            }

        });
        addbtn.setOnClickListener(view -> {
            if(fntxt.getText().toString().equals("")){
                Toast toast= Toast.makeText(contest,"Please Enter first Number ?",duration);
                toast.show();
            }else if(sntxt.getText().toString().equals("")){
                Toast toast= Toast.makeText(contest,"Please Enter Second Number ?",duration);
                toast.show();
            }else {
                double answer = Float.parseFloat(fntxt.getText().toString().trim()) + Float.parseFloat(sntxt.getText().toString().trim());
                anstxt.setText(answer + "");
            }
        });
        reducebtn.setOnClickListener(view -> {
            if(fntxt.getText().toString().equals("")){
                Toast toast= Toast.makeText(contest,"Please Enter first Number ?",duration);
                toast.show();
            }else if(sntxt.getText().toString().equals("")){
                Toast toast= Toast.makeText(contest,"Please Enter Second Number ?",duration);
                toast.show();
            }else {
                if(fntxt.getText().toString().equals("0")||(sntxt.getText().toString().equals("0"))){
                    Toast toast= Toast.makeText(contest,"Zero submition error",duration);
                    toast.show();
                }else{
                    double answer = Float.parseFloat(fntxt.getText().toString().trim()) - Float.parseFloat(sntxt.getText().toString().trim());
                    anstxt.setText(answer + "");
                }

            }
        });
        dividbtn.setOnClickListener(view -> {
            if(fntxt.getText().toString().equals("")){
                Toast toast= Toast.makeText(contest,"Please Enter first Number ?",duration);
                toast.show();
            }else if(sntxt.getText().toString().equals("")){
                Toast toast= Toast.makeText(contest,"Please Enter Second Number ?",duration);
                toast.show();
            }else {
                if(fntxt.getText().toString().equals("0")||(sntxt.getText().toString().equals("0"))){
                    Toast toast= Toast.makeText(contest,"Zero Divition error",duration);
                    toast.show();
                }else{
                    double answer = Float.parseFloat(fntxt.getText().toString().trim()) / Float.parseFloat(sntxt.getText().toString().trim());
                    anstxt.setText(answer + "");
                }

            }
        });

        clearbtn.setOnClickListener(view -> {
            Toast toast= Toast.makeText(contest,"Cleared the Result, Try to Enter Again !",duration);
            toast.show();
            sntxt.setText("");
            fntxt.setText("");
            anstxt.setText("");
        });
    }
    }
