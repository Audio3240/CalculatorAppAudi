package com.example.calculatorapp;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private String numInput = "";
    private double lastNum;
    private int op = 1;
    public String calculate(double numOne, double numTwo, int op){
        String ans = "";
        if(op==0){
            ans += Double.toString(numOne);
        } else if(op==1){
             ans += Double.toString(numOne+numTwo);
        } else if(op==2){
            ans += Double.toString(numOne-numTwo);
        } else if(op==3){
            ans += Double.toString(numOne*numTwo);
        } else if(op==4){
            ans += Double.toString(numOne/numTwo);
        }
        return ans;
    }
    public void opSelected(View v){
        TextView input = findViewById(R.id.textView);

        if(v.getId()==R.id.bChange){
            input.setText(calculate(toDouble(input), -1, 3));
        }

        if(v.getId()==R.id.bAdd){
            op=1;
            Log.i("Trairat", "+ Clicked");
            lastNum = toDouble(input);
            numInput = "";
            input.setText(numInput);
        }
        if(v.getId()==R.id.bSub){
            op=2;
            Log.i("Trairat", "- Clicked");
            lastNum = toDouble(input);
            numInput = "";
            input.setText(numInput);
        }
        if(v.getId()==R.id.bX){
            op=3;
            Log.i("Trairat", "* Clicked");
            lastNum = toDouble(input);
            numInput = "";
            input.setText(numInput);
        }
        if(v.getId()==R.id.bDiv){
            op=4;
            Log.i("Trairat", "/ Clicked");
            lastNum = toDouble(input);
            numInput = "";
            input.setText(numInput);
        }
        if(v.getId()==R.id.bEqual){
            String out = calculate(lastNum,Double.parseDouble(numInput),op);
            input.setText(out);
            lastNum = toDouble(input);
            Log.i("Trairat", "= Clicked");
        }

    }

    //from  www.java2s.com
    public static double toDouble(TextView tv) {
        try {
            return Double.valueOf(tv.getText().toString());
        } catch (NumberFormatException e) {
            return 0.0;
        }
    }
    public void numSelected(View v){
        TextView input = findViewById(R.id.textView);
        if(v.getId()==R.id.b0){
            numInput += "0";
            Log.i("Trairat", "0 Clicked");
        }
        if(v.getId()==R.id.b1){
            numInput += "1";
            Log.i("Trairat", "1 Clicked");
        }
        if(v.getId()==R.id.b2){
            numInput += "2";
            Log.i("Trairat", "2 Clicked");
        }
        if(v.getId()==R.id.b3){
            numInput += "3";
            Log.i("Trairat", "3 Clicked");
        }
        if(v.getId()==R.id.b4){
            numInput += "4";
            Log.i("Trairat", "4 Clicked");
        }
        if(v.getId()==R.id.b5){
            numInput += "5";
            Log.i("Trairat", "5 Clicked");
        }
        if(v.getId()==R.id.b6){
            numInput += "6";
            Log.i("Trairat", "6 Clicked");
        }
        if(v.getId()==R.id.b7){
            numInput += "7";
            Log.i("Trairat", "7 Clicked");
        }
        if(v.getId()==R.id.b8){
            numInput += "8";
            Log.i("Trairat", "8 Clicked");
        }
        if(v.getId()==R.id.b9){
            numInput += "9";
            Log.i("Trairat", "9 Clicked");
        }
        if(v.getId()==R.id.bDot){
            numInput += ".";
            Log.i("Trairat", "dot Clicked");
        }
        if(v.getId()==R.id.bClear){
            numInput ="";
            Log.i("Trairat", "Clear Clicked");
        }
        input.setText(numInput);
    }


}