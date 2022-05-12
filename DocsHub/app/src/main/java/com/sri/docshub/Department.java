package com.sri.docshub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Department extends AppCompatActivity {
    Button aero,agri,auto,bio,chem,civil,cse,ece,eee,eie,it,mech,mtron,textil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);
        aero=findViewById(R.id.btn1);
        agri=findViewById(R.id.btn2);
        auto=findViewById(R.id.btn3);
        bio=findViewById(R.id.btn4);
        chem=findViewById(R.id.btn5);
        civil=findViewById(R.id.btn6);
        cse=findViewById(R.id.btn7);
        ece=findViewById(R.id.btn8);
        eee=findViewById(R.id.btn9);
        eie=findViewById(R.id.btn10);
        it=findViewById(R.id.btn11);
        mech=findViewById(R.id.btn12);
        mtron=findViewById(R.id.btn13);
        textil=findViewById(R.id.btn14);

        aero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Semester.class));
                finish();
            }
        });

        agri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Semester.class));
                finish();
            }
        });

        auto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Semester.class));
                finish();
            }
        });

        bio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Semester.class));
                finish();
            }
        });

        chem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Semester.class));
                finish();
            }
        });

        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Semester.class));
                finish();
            }
        });

        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Semester.class));
                finish();
            }
        });

        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Semester.class));
                finish();
            }
        });

        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Semester.class));
                finish();
            }
        });

        eie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Semester.class));
                finish();
            }
        });

        it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Semester.class));
                finish();
            }
        });

        mech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Semester.class));
                finish();
            }
        });

        mtron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Semester.class));
                finish();
            }
        });

        textil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Semester.class));
                finish();
            }
        });
    }
}