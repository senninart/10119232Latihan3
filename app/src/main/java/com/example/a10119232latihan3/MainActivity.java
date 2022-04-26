package com.example.a10119232latihan3;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.a10119232latihan3.SayHaiActivity.ID_EXTRA_MSG_EXIT;

/*23 April 2022
Muhammad Faisal Obara
10119232
IF 6*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        if (getIntent().getBooleanExtra(ID_EXTRA_MSG_EXIT, false)) {
            finish();
        }
    }

    @OnClick(R.id.btnMulai)
    void mulai(View view) {
        Intent intent = new Intent(this, LoginCodeActivity.class);
        startActivity(intent);
    }
}