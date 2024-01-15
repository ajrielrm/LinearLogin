package com.example.linearlogin;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Hasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        // Retrieve data from the Intent
        String nama = getIntent().getStringExtra("nama");
        String alamat = getIntent().getStringExtra("alamat");
        String jenisKelamin = getIntent().getStringExtra("jenisKelamin");

        // Display the data in TextViews with specific ids
        TextView namaTextView = findViewById(R.id.Nama);
        TextView alamatTextView = findViewById(R.id.Alamat);
        TextView genderTextView = findViewById(R.id.Gender);


        namaTextView.setText("Nama: " + nama);
        alamatTextView.setText("Alamat: " + alamat);
        genderTextView.setText(" Jenis Kelamin: " + jenisKelamin);

    }
}
