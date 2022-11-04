package com.example.menghitungberatbadanideal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText edbb, edtinggi, edimt, edket;
    Button bthitung;
    Double vbb, vtinggi, vimt;
    String vket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edbb = (EditText) findViewById(R.id.edbb);
        edtinggi = (EditText) findViewById(R.id.edtinggi);
        edimt = (EditText) findViewById(R.id.edimt);
        edket = (EditText) findViewById(R.id.edket);
        bthitung = (Button) findViewById(R.id.bthitung);
    }

    public void hitung(View view) {
        vbb = Double.parseDouble(edbb.getText().toString());
        vtinggi = Double.parseDouble(edtinggi.getText().toString());

        vimt = vbb / ((vtinggi/100)*(vtinggi/100));

        if (vimt < 18){
            vket = "Berat Badan Kurang/Kurus";
        }
        else if (vimt >= 18 && vimt <25){
            vket = "Berat Badan Ideal/Normal";
        }
        else if (vimt >= 25 && vimt <27){
            vket = "Berat Badan Berlebihan/Kegemukan";
        }
        else {
            vket = "Obesitas";
        }
        edimt.setText(""+vimt);
        edket.setText(""+vket);
    }
}