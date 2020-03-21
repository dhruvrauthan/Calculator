package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mButton0, mButton1, mButton2, mButton3, mButton4, mButton5,
            mButton6, mButton7, mButton8, mButton9, mButtonDecimalPoint, mButtonAdd,
            mButtonSubtract, mButtonMultiply, mButtonDivide, mButtonEquals, mButtonClear;

    private EditText mNumbersEditText;

    private boolean add, subtract, multiply, divide;

    private float mVal1, mVal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton0 = findViewById(R.id.number_0);
        mButton1 = findViewById(R.id.number_1);
        mButton2 = findViewById(R.id.number_2);
        mButton3 = findViewById(R.id.number_3);
        mButton4 = findViewById(R.id.number_4);
        mButton5 = findViewById(R.id.number_5);
        mButton6 = findViewById(R.id.number_6);
        mButton7 = findViewById(R.id.number_7);
        mButton8 = findViewById(R.id.number_8);
        mButton9 = findViewById(R.id.number_9);
        mButtonAdd = findViewById(R.id.action_add);
        mButtonSubtract = findViewById(R.id.action_subtract);
        mButtonMultiply = findViewById(R.id.action_multiply);
        mButtonDivide = findViewById(R.id.action_divide);
        mButtonDecimalPoint = findViewById(R.id.action_decimal_point);
        mButtonEquals = findViewById(R.id.action_equals);
        mButtonClear = findViewById(R.id.action_clear);
        mNumbersEditText = findViewById(R.id.numbers_edittext);

        mButton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNumbersEditText.append("0");
            }
        });

        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNumbersEditText.append("1");
            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNumbersEditText.append("2");
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNumbersEditText.append("3");
            }
        });

        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNumbersEditText.append("4");
            }
        });

        mButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNumbersEditText.append("5");
            }
        });

        mButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNumbersEditText.append("6");
            }
        });

        mButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNumbersEditText.append("7");
            }
        });

        mButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNumbersEditText.append("8");
            }
        });

        mButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNumbersEditText.append("9");
            }
        });

        mButtonDecimalPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNumbersEditText.append(".");
            }
        });

        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVal1 = Float.parseFloat(mNumbersEditText.getText() + "");
                mNumbersEditText.setText(null);
                add = true;
            }
        });

        mButtonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVal1 = Float.parseFloat(mNumbersEditText.getText() + "");
                mNumbersEditText.setText(null);
                subtract = true;
            }
        });

        mButtonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVal1 = Float.parseFloat(mNumbersEditText.getText() + "");
                mNumbersEditText.setText(null);
                multiply = true;
            }
        });

        mButtonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVal1 = Float.parseFloat(mNumbersEditText.getText() + "");
                mNumbersEditText.setText(null);
                divide = true;
            }
        });

        mButtonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (add == true) {

                    mVal2 = Float.parseFloat(mNumbersEditText.getText() + "");
                    mNumbersEditText.setText(mVal1 + mVal2 + "");

                } else if (subtract == true) {

                    mVal2 = Float.parseFloat(mNumbersEditText.getText() + "");
                    mNumbersEditText.setText(mVal1 - mVal2 + "");

                } else if (multiply == true) {

                    mVal2 = Float.parseFloat(mNumbersEditText.getText() + "");
                    mNumbersEditText.setText(mVal1 * mVal2 + "");

                } else if (divide == true) {

                    mVal2 = Float.parseFloat(mNumbersEditText.getText() + "");
                    mNumbersEditText.setText(mVal1 / mVal2 + "");

                }
            }
        });

    }
}
