package com.example.deyvis.exam02.Vistas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.afollestad.materialdialogs.MaterialDialog;
import com.example.deyvis.exam02.DTO.Producto1;
import com.example.deyvis.exam02.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.rengwuxian.materialedittext.MaterialEditText;

import mehdi.sakout.fancybuttons.FancyButton;

public class Producto extends AppCompatActivity   {
    private MaterialEditText namePro,precio1,stok1;
    private FancyButton regis;
    private MaterialDialog dialog;

   DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);
        mDatabase= FirebaseDatabase.getInstance().getReference();

        namePro=(MaterialEditText)findViewById(R.id.product);
        precio1=(MaterialEditText)findViewById(R.id.precio);
        stok1=(MaterialEditText)findViewById(R.id.stock);
        regis=(FancyButton)findViewById(R.id.btn_registrar);


        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nom= namePro.getText().toString();
                String prec= precio1.getText().toString();
                String sto=stok1.getText().toString();
                String id=mDatabase.push().getKey();
                Producto1 producto= new Producto1(nom,prec,sto);
                mDatabase.child("producto").child(id).setValue(producto);

                Toast.makeText(getApplicationContext(),"Registrado Correctamente",Toast.LENGTH_LONG).show();
            }
        });

        namePro.setText("");
        precio1.setText("");
        stok1.setText("");
    }




    }


