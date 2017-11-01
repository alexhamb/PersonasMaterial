package com.example.alex6.personasmaterial;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

/**
 * Created by alex6 on 17/10/2017.
 */

public class Datos {

    private static DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();

    private static String bd = "Personas";
    private static ArrayList<Persona> personas = new ArrayList<>();

    public static void guardarPersona (Persona p){

        databaseReference.child(bd).child(p.getId()).setValue(p);

    }
    public static ArrayList<Persona> obtenerPersonas(){
        return personas;
    }

    public static void setPersonas(ArrayList<Persona>per){
        personas=per;
    }

    public static String getId(){
        return databaseReference.push().getKey();
    }
}
