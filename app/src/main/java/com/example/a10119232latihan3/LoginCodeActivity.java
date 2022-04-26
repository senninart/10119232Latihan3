package com.example.a10119232latihan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

/*23 April 2022
Muhammad Faisal Obara
10119232
IF 6*/

public class LoginCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_code);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnMasuk)
    void masuk(View view) {
        Intent intent = new Intent(this, BiodataActivity.class);
        startActivity(intent);
    }
}