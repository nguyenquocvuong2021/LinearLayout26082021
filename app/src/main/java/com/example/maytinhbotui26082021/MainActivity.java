package com.example.maytinhbotui26082021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //1: khai báo

    EditText  mEdtSoThu1,mEdtSoThu2;
    TextView mTvKetQua;
    Button mBtnCong,mBtnTru,mBtnNhan,mBtnChia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //2: Ánh xạ
    mEdtSoThu1 = findViewById(R.id.edittextSoThu1);
    mEdtSoThu2 = findViewById(R.id.edittextSoThu2);
    mTvKetQua = findViewById(R.id.textViewKetqua);
    mBtnCong = findViewById(R.id.buttonCong);
    mBtnTru = findViewById(R.id.buttonTru);
    mBtnNhan = findViewById(R.id.buttonNhan);
    mBtnChia = findViewById(R.id.buttonChia);






    }
}