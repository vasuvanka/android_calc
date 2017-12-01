package com.myapp.vasuvanka.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1,num2;
    private TextView result;
    float a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        result = (TextView) findViewById(R.id.result);
    }
    private void getNumbers(){
        a = Float.parseFloat(num1.getText().toString());
        b = Float.parseFloat(num2.getText().toString());
    }
    public  void performOp(View v) {
        getNumbers();
        switch (v.getId()) {
            case (R.id.multi):
                result.setText(String.valueOf(a*b));
                break;
            case (R.id.subtract):
                result.setText(String.valueOf(a-b));
                break;
            case (R.id.sum):
                result.setText(String.valueOf(a+b));
                break;
            default:
                result.setText("invalid operation");
        }
    }
}
