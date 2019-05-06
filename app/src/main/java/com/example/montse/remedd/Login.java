package com.example.montse.remedd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.montse.remedd.Dialogs.EligeUsuario;

public class Login extends AppCompatActivity {

    private Button registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        registrar = findViewById(R.id.botonRegistra);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                muestraDialog0();
            }
        });
    }

    public void muestraDialog0(){
        EligeUsuario eligeUsuario = new EligeUsuario();
        eligeUsuario.show(getSupportFragmentManager(),"EligeUsuario");
    }
}
