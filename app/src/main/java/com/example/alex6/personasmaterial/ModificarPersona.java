package com.example.alex6.personasmaterial;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

public class ModificarPersona extends AppCompatActivity {
private ImageView fotoModificar;
    private EditText txtNombreModificar;
    private EditText txtApellidoModificar;
    private EditText txtCedulaModificar;
    private Intent i;
    private Bundle b;
    private StorageReference storageReference;
    private Uri uri;

    public ModificarPersona() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_persona);

        fotoModificar = (ImageView)findViewById(R.id.fotoModificar);
        txtCedulaModificar = (EditText) findViewById(R.id.txtCedulaModificar);
        txtNombreModificar = (EditText) findViewById(R.id.txtNombreModificar);
        txtApellidoModificar = (EditText) findViewById(R.id.txtApellidoModificar);
        storageReference = FirebaseStorage.getInstance().getReference();


        i = getIntent();
        b = i.getBundleExtra("datos");

        txtCedulaModificar.setText(b.getString("cedula"));
        txtNombreModificar.setText(b.getString("nombre"));
        txtApellidoModificar.setText(b.getString("apellido"));

        storageReference.child(b.getString("foto")).getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.with(ModificarPersona.this).load(uri).into(fotoModificar);
            }
        });

    }
}
