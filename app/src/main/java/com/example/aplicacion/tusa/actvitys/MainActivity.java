package com.example.aplicacion.tusa.actvitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.MemoryFile;

import com.example.aplicacion.tusa.R;
import com.example.aplicacion.tusa.adaptadores.AdaptadorMain;
import com.example.aplicacion.tusa.beans.Menu;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Menu> listaMenu = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_menu);
        Menu m = new Menu("Mundo",R.mipmap.facil,MundoActivity.class.getName());
        Menu m2 = new Menu("Mundo2",R.mipmap.facil,"com.example.aplicacion.tusa.activitys.MundoActivity");
        listaMenu.add(m);
        listaMenu.add(m2);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        mAdapter = new AdaptadorMain(listaMenu);
        recyclerView.setAdapter(mAdapter);

    }
}
