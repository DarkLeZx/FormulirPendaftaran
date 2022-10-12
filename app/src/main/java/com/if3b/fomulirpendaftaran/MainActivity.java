package com.if3b.fomulirpendaftaran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private EditText etNPM, etNama;
    private Button btnDaftar;
    private RadioGroup rgJK;
    private int selectID;
    private Spinner spProdi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNPM = findViewById(R.id.et_NPM);
        etNama = findViewById(R.id.et_Nama);
        rgJK = findViewById(R.id.rg_JK);
        selectID = findViewById(R.id.select_ID);
        btnDaftar = findViewById(R.id.btn_Daftar);
        spProdi = findViewById(R.id.sp_Prodi)
    }
}