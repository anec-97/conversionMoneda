package com.example.conversionmoneda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner sp1,sp2;
    EditText ed1;
    Button b1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.txtamount);
        sp1 = findViewById(R.id.spfrom);
        sp2 = findViewById(R.id.spTo);
        b1 = findViewById(R.id.btn1);


        String[] from = {"Pesos Mexicanos"};
        ArrayAdapter ad = new ArrayAdapter<String>( this,R.layout.support_simple_spinner_dropdown_item, from);
        sp1.setAdapter(ad);

        String[] to = {"Libra esterlina","Pesos Chilenos","Yenes","Dollars"};
        ArrayAdapter ad1 = new ArrayAdapter<String>( this,R.layout.support_simple_spinner_dropdown_item, to);
        sp2.setAdapter(ad1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Double tot;
                Double amount = Double.parseDouble(ed1.getText().toString());
                if (sp1.getSelectedItem().toString() == "Pesos Mexicanos" && sp2.getSelectedItem().toString()=="Dollars")
                {
                    tot = amount * .047;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if (sp1.getSelectedItem().toString() == "Pesos Mexicanos" && sp2.getSelectedItem().toString()=="Yenes")
                {
                    tot = amount * 5.32;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if (sp1.getSelectedItem().toString() == "Pesos Mexicanos" && sp2.getSelectedItem().toString()=="Pesos Chilenos")
                {
                    tot = amount * 38.83;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                if (sp1.getSelectedItem().toString() == "Pesos Mexicanos" && sp2.getSelectedItem().toString()=="Libra esterlina")
                {
                    tot = amount * 0.035;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}