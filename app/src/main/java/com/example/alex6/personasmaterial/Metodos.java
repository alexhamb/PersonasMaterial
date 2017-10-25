package com.example.alex6.personasmaterial;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by alex6 on 24/10/2017.
 */

public class Metodos {
    public static int fotoAleatoria(ArrayList<Integer> fotos) {
        int fotoSeleccionada;
        Random r = new Random();
        fotoSeleccionada = r.nextInt(fotos.size());
        return fotos.get(fotoSeleccionada);
    }

    public static boolean validar_aux(TextView t, String mensaje) {
        if (t.getText().toString().isEmpty()) {
            t.requestFocus();
            t.setError(mensaje);

        }
    return false;
    }
}
