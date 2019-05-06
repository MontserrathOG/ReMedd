package com.example.montse.remedd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.montse.remedd.Dialogs.EligeUsuario;

public class Login extends AppCompatActivity {

    private Button registrar;
    private Button iniciar_sesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        registrar = findViewById(R.id.botonRegistra);
        iniciar_sesion = findViewById(R.id.btnOk);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                muestraDialog0();
            }
        });
        iniciar_sesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ReMed.class));
            }
        });
    }

    public void muestraDialog0(){
        EligeUsuario eligeUsuario = new EligeUsuario();
        eligeUsuario.show(getSupportFragmentManager(),"EligeUsuario");
    }
}
