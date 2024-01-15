package com.example.linearlogin;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView myTextView;
    EditText nama, alamat;
    RadioGroup myRadioGroup;
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTextView = findViewById(R.id.textCetak);
        nama = findViewById(R.id.ETnama);
        alamat = findViewById(R.id.ETalamat);
        myRadioGroup = findViewById(R.id.pilih_jk);
        myButton = findViewById(R.id.submitButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                int id_pilihan = myRadioGroup.getCheckedRadioButtonId();
                RadioButton pilih = findViewById(id_pilihan);

                Intent intent = new Intent(MainActivity.this, Hasil.class);

                intent.putExtra("nama", nama.getText().toString());
                intent.putExtra("alamat", alamat.getText().toString());
                intent.putExtra("jenisKelamin", pilih.getText().toString());

                startActivity(intent);
            }
        });
    }
}
