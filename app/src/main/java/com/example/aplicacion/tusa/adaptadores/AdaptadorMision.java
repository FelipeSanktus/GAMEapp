package com.example.aplicacion.tusa.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aplicacion.tusa.R;
import com.example.aplicacion.tusa.beans.Mision;
import com.example.aplicacion.tusa.beans.enumm.Dificultad;
import com.example.aplicacion.tusa.beans.enumm.Tipo;

import java.util.ArrayList;

public class AdaptadorMision extends RecyclerView.Adapter<AdaptadorMision.MyViewHolder> {

    private ArrayList<Mision> misiones;

    public AdaptadorMision(ArrayList<Mision> misiones) {
        this.misiones = misiones;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView titulo;
        TextView descripcion;
        TextView etapas;
        ImageView imagenMision;
        ImageView imagenRecompensa;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.txt_titulo);
            descripcion = itemView.findViewById(R.id.txt_descripcion);
            etapas = itemView.findViewById(R.id.txt_etapas);
            imagenMision = itemView.findViewById(R.id.img_mision);
            imagenRecompensa = itemView.findViewById(R.id.img_recompensa);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vista_mision,parent,false);
        return new AdaptadorMision.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.titulo.setText(this.misiones.get(position).getTitulo());
        holder.descripcion.setText(this.misiones.get(position).getDescripcion());
        holder.etapas.setText(this.misiones.get(position).getEtapas().size()+"");
        holder.descripcion.setText(this.misiones.get(position).getDescripcion());
        holder.imagenMision.setImageResource(this.misiones.get(position).getImagenMision());
        holder.imagenRecompensa.setImageResource(this.misiones.get(position).getImagenRecompensa());

    }

    @Override
    public int getItemCount() {
        return misiones.size();
    }


}
