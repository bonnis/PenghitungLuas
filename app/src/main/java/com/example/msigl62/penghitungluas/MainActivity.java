package com.example.msigl62.penghitungluas;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText inputLebar;
    public EditText inputPanjang;
    public TextView res;
    public Button tombol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputLebar = (EditText) findViewById(R.id.inputLebar);
        inputPanjang = (EditText)findViewById(R.id.inputPanjang);
        res = (TextView)findViewById(R.id.hasil);
        tombol = (Button)findViewById(R.id.button);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double l,p,ress;
                l = Double.valueOf(inputLebar.getText().toString());
                p = Double.valueOf(inputPanjang.getText().toString());
                ress = l*p;
                res.setText("Hasil : " + ress);
            }
        });

    }
}
