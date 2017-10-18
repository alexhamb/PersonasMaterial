package com.example.alex6.personasmaterial;

import java.util.ArrayList;

/**
 * Created by alex6 on 17/10/2017.
 */

public class Datos {
    private static ArrayList<Persona> personas = new ArrayList<>();

    public static void guardarPersona (Persona p){
        personas.add(p);

    }
    public static ArrayList<Persona> obtenerPersonas(){
        return personas;
    }
}
