package com.example.montse.remedd.Dialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

import com.example.montse.remedd.RegistroMedico;
import com.example.montse.remedd.RegistroPaciente;

public class EligeUsuario extends DialogFragment {

    public EligeUsuario() {
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return createRadioListDialog();
    }

    /**
     * Crea un diálogo con una lista de radios
     *
     * @return Diálogo
     */
    public AlertDialog createRadioListDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        final CharSequence[] items = new CharSequence[2];

        items[0] = "Paciente";
        items[1] = "Médico";

        builder.setTitle("Tipo de usuario")
                .setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which){
                            case 0:
                                startActivity(new Intent(getContext(), RegistroPaciente.class));
                                break;
                            case 1:
                                startActivity(new Intent(getContext(), RegistroMedico.class));
                                break;
                        }
                    }
                });

        return builder.create();
    }

}
