package com.example.aplicacion.tusa.adaptadores;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aplicacion.tusa.R;
import com.example.aplicacion.tusa.actvitys.MundoActivity;
import com.example.aplicacion.tusa.beans.Menu;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdaptadorMain  extends RecyclerView.Adapter<AdaptadorMain.MyViewHolder>{
    private ArrayList<Menu> listaMenu = new ArrayList<>();
    public AdaptadorMain(ArrayList<Menu> listaMenu){
        this.listaMenu = listaMenu;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textovista;
        private ImageView imagenVista;



        public MyViewHolder(View v) {
            super(v);
            textovista = v.findViewById(R.id.title_menu);
            imagenVista = v.findViewById(R.id.img_menu);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(),"CAMBIANDO:"+getAdapterPosition(),Toast.LENGTH_LONG).show();
                    Intent intent = null;
                    try {

                        intent = new Intent(v.getContext(), Class.forName(listaMenu.get(getAdapterPosition()).getRuta()));
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    v.getContext().startActivity(intent);

                }
            });
        }
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vista_menu,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imagenVista.setImageResource(this.listaMenu.get(position).getImagen());
        holder.textovista.setText(this.listaMenu.get(position).getNombre());
    }

    @Override
    public int getItemCount() {

        return listaMenu.size();
    }


}
