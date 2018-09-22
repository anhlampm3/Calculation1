package com.nqt.quocthanh.calculation1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculation1 extends AppCompatActivity implements View.OnClickListener {

    private EditText edtNumber;
    private TextView tvResult;

    private Button btnNumber1;
    private Button btnNumber2;
    private Button btnNumber3;
    private Button btnNumber4;
    private Button btnNumber5;
    private Button btnNumber6;
    private Button btnNumber7;
    private Button btnNumber8;
    private Button btnNumber9;
    private Button btnNumber0;

    private Button btnCong;
    private Button btnTru;
    private Button btnNhan;
    private Button btnChia;

    private Button btnPoint;
    private Button btnResult;
    private Button btnClear;
    private Button btnClearAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation1);
        initWidget();
        setEventClickView();
    }
    public void initWidget() {

        edtNumber = (EditText) findViewById(R.id.edt_input);
        tvResult = (TextView) findViewById(R.id.tv_result);

        btnNumber1 = (Button) findViewById(R.id.btnNumber1);
        btnNumber2 = (Button) findViewById(R.id.btnNumber2);
        btnNumber3 = (Button) findViewById(R.id.btnNumber3);
        btnNumber4 = (Button) findViewById(R.id.btnNumber4);
        btnNumber5 = (Button) findViewById(R.id.btnNumber5);
        btnNumber6 = (Button) findViewById(R.id.btnNumber6);
        btnNumber7 = (Button) findViewById(R.id.btnNumber7);
        btnNumber8 = (Button) findViewById(R.id.btnNumber8);
        btnNumber9 = (Button) findViewById(R.id.btnNumber9);
        btnNumber0 = (Button) findViewById(R.id.btnNumber0);

        btnCong = (Button) findViewById(R.id.btnCong);
        btnTru = (Button) findViewById(R.id.btnTru);
        btnNhan = (Button) findViewById(R.id.btnNhan);
        btnChia = (Button) findViewById(R.id.btnChia);

        btnPoint = (Button) findViewById(R.id.btnPoint);
        btnResult = (Button) findViewById(R.id.btnResult);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnClearAll = (Button) findViewById(R.id.btnClearAll);
    }
    public void setEventClickView() {
        btnNumber1.setOnClickListener(this);
        btnNumber2.setOnClickListener(this);
        btnNumber3.setOnClickListener(this);
        btnNumber4.setOnClickListener(this);
        btnNumber5.setOnClickListener(this);
        btnNumber6.setOnClickListener(this);
        btnNumber7.setOnClickListener(this);
        btnNumber8.setOnClickListener(this);
        btnNumber9.setOnClickListener(this);
        btnNumber0.setOnClickListener(this);

        btnCong.setOnClickListener(this);
        btnTru.setOnClickListener(this);
        btnNhan.setOnClickListener(this);
        btnChia.setOnClickListener(this);

        btnPoint.setOnClickListener(this);
        btnResult.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnClearAll.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnNumber0:
                //TO DO
                edtNumber.append("0");
                break;
            case R.id.btnNumber1:
                //TO DO
                edtNumber.append("1");
                break;
            case R.id.btnNumber2:
                //TO DO
                edtNumber.append("2");
                break;
            case R.id.btnNumber3:
                //TO DO
                edtNumber.append("3");
                break;
            case R.id.btnNumber4:
                //TO DO
                edtNumber.append("4");
                break;
            case R.id.btnNumber5:
                //TO DO
                edtNumber.append("5");
                break;
            case R.id.btnNumber6:
                //TO DO
                edtNumber.append("6");
                break;
            case R.id.btnNumber7:
                //TO DO
                edtNumber.append("7");
                break;
            case R.id.btnNumber8:
                //TO DO
                edtNumber.append("8");
                break;
            case R.id.btnNumber9:
                //TO DO
                edtNumber.append("9");
                break;
            case R.id.btnCong:
                //TO DO
                edtNumber.append("+");
                break;
            case R.id.btnTru:
                //TO DO
                edtNumber.append("-");
                break;
            case R.id.btnNhan:
                //TO DO
                edtNumber.append("*");
                break;
            case R.id.btnChia:
                //TO DO
                edtNumber.append("/");
                break;
            case R.id.btnPoint:
                //TO DO
                edtNumber.append(".");
                break;
            case R.id.btnResult:
                //To do
                int numberA = Integer.parseInt(String.valueOf(edtNumber.getText()));
                break;
            case R.id.btnClear:
                //TO DO
                String numberAfterRemove = deleteNumber(edtNumber.getText().toString());
                edtNumber.setText(numberAfterRemove);
                break;
            case R.id.btnClearAll:
                //TO DO
                edtNumber.setText("");
                break;

        }
    }
    public String deleteNumber(String number) {
        int length = number.length();
        String tem = number.substring(0,length-1);
        return tem;
    }






}
