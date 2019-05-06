package com.example.montse.remedd;

import android.app.DatePickerDialog;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import com.example.montse.remedd.Dialogs.FechaDialog;

public class RegistroPaciente extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private Button fecha;
    private EditText fecha_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_paciente);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Registro paciente");

        fecha_1 = findViewById(R.id.txtFechaNac);
        fecha = findViewById(R.id.btnFecha);
        fecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                muestraDialog3();
            }
        });

    }

    public void muestraDialog3(){
        FechaDialog fechaDialog = new FechaDialog();
        fechaDialog.show(getSupportFragmentManager(),"FechaDialog");
    }

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        String fecha = dayOfMonth+"/"+monthOfYear+"/"+year;
        fecha_1.setText(fecha);

    }
}
