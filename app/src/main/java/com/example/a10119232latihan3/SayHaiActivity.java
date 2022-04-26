package com.example.a10119232latihan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*23 April 2022
Muhammad Faisal Obara
10119232
IF 6*/

public class SayHaiActivity extends AppCompatActivity {

    @BindView(R.id.textBeres)
    TextView textNama;

    public static final String ID_EXTRA_MSG_EXIT = "com.example.a10119232latihan3";

    private String nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_say_hai);
        ButterKnife.bind(this);
        bindExtra();
    }

    private void bindExtra(){
        Intent intent = getIntent();
        nama = intent.getStringExtra(BiodataActivity.ID_EXTRA_MSG);
        textNama.setText("Beres! Sekarang "+ nama+" udah bisa ngecek penggunaan HP "+ nama+" tiap hari buat bantu "+ nama+" ngatur waktu :)");
    }

    @OnClick(R.id.btnOke)
    public void oke(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra(ID_EXTRA_MSG_EXIT, true);
        startActivity(intent);
    }
}