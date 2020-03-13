package com.example.aplicacion.tusa.actvitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.aplicacion.tusa.R;
import com.example.aplicacion.tusa.adaptadores.AdaptadorMain;
import com.example.aplicacion.tusa.adaptadores.AdaptadorMision;
import com.example.aplicacion.tusa.beans.Menu;
import com.example.aplicacion.tusa.beans.Mision;
import com.example.aplicacion.tusa.beans.enumm.Dificultad;
import com.example.aplicacion.tusa.beans.enumm.Tipo;

import java.util.ArrayList;

public class MisionActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Mision> misiones = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mision);

        recyclerView = findViewById(R.id.recycler_mision);
        Mision m1 = new Mision("mision 1","esta es la descripcion de la mision 1", Dificultad.FACIL, Tipo.CAZA,
                new ArrayList<String>(),R.mipmap.pergamino,R.mipmap.facil);
        Mision m2 = new Mision("mision 2","esta es la descripcion de la mision 2", Dificultad.FACIL, Tipo.CAZA,
                new ArrayList<String>(),R.mipmap.pergamino,R.mipmap.facil);
        Mision m3 = new Mision("mision 3","esta es la descripcion de la mision 3", Dificultad.FACIL, Tipo.CAZA,
                new ArrayList<String>(),R.mipmap.pergamino,R.mipmap.facil);
        Mision m4 = new Mision("mision 4","esta es la descripcion de la mision 4", Dificultad.FACIL, Tipo.CAZA,
                new ArrayList<String>(),R.mipmap.pergamino,R.mipmap.facil);
        misiones.add(m1);
        misiones.add(m2);
        misiones.add(m3);
        misiones.add(m4);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        mAdapter = new AdaptadorMision(misiones,this);
        recyclerView.setAdapter(mAdapter);
    }
}
