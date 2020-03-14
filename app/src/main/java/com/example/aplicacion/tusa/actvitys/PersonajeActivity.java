package com.example.aplicacion.tusa.actvitys;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aplicacion.tusa.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PersonajeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter pAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;
                    switch (item.getItemId()){
                        case R.id.nav_equipo:
                            selectedFragment = new EquipoFragment();
                            break;
                        case R.id.nav_estadisticas:
                            selectedFragment = new EstadisticasFragment();
                            break;
                        case R.id.nav_habilidades:
                            selectedFragment = new HabilidadesFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personaje);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new EquipoFragment()).commit();
    }
}
