package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            //paste code you want to test here
        int weekend = 9;
        int weekday = 5;
        int optimalHours = 7*8;
        int actualHours = weekday;
        actualHours = actualHours + weekend*2;
        int solution = optimalHours - actualHours;
        display(solution);

//        display1("This is box 1");
//        display2("This is box 2");
//        display3("This is box 3");

    }

    /*
        display methods that allow text to appear on the screen. will be covered in lesson 3
     */

    public void display(String text){
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(text);
    }
    public void display(int text){
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(text+"");
    }
    public void display1(String text){
        display(text);
    }
    public void display2(String text){
        TextView t = (TextView) findViewById(R.id.display_text_view_2);
        t.setText(text);
    }
    public void display3(String text){
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(text);
    }



}//main ends
