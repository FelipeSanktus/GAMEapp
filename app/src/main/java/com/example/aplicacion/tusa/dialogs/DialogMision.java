package com.example.aplicacion.tusa.dialogs;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aplicacion.tusa.R;
import com.example.aplicacion.tusa.beans.Mision;

public class DialogMision {

    private Activity activity;
    private AlertDialog.Builder builder;
    private AlertDialog alertDialog;

    public DialogMision(Activity activity){
        this.activity = activity;

    }
    public void build(Mision m){
        builder = new AlertDialog.Builder(activity);
        ViewGroup viewGroup = activity.findViewById(android.R.id.content);
        View dialogView = LayoutInflater.from(activity.getApplicationContext()).inflate(R.layout.dialog_mision, viewGroup, false);

        TextView titulo;
        TextView descripcion;
        ImageView img;

        titulo = dialogView.findViewById(R.id.lblTitulo);
        descripcion = dialogView.findViewById(R.id.lblDescripcion);
        //img = dialogView.findViewById(R.id.img);

        titulo.setText(m.getTitulo());
        descripcion.setText(m.getDescripcion());
        //img.setImageResource(m.getImagenRecompensa());

        builder.setView(dialogView);
        alertDialog = builder.create();
    }

    public void show(){
        alertDialog.show();
    }
}
