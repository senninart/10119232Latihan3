package com.example.a10119232latihan3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*23 April 2022
Muhammad Faisal Obara
10119232
IF 6*/

public class BiodataActivity extends AppCompatActivity {

    @BindView(R.id.input_nama)
    EditText nama;

    final Context context = this;

    public static final String ID_EXTRA_MSG = "com.example.a10119232latihan3.MESSAGE";

    private String namaBiodata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnSelanjutnya)
    void selanjutnya(View view) {

        namaBiodata = nama.getText().toString();

        Intent intent = new Intent(this, SayHaiActivity.class);
        intent.putExtra(ID_EXTRA_MSG, namaBiodata);
        startActivity(intent);
    }
}