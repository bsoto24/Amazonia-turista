package com.openlab.amazonia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;

import com.toptoche.searchablespinnerlibrary.SearchableSpinner;

import java.util.ArrayList;

public class AreaProtegidaActivity extends AppCompatActivity {

    private RecyclerView rvAreasProtegidas;
    private SearchableSpinner spnAreasProtegidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_protegida);

        showToolbar("Costa", true);

        spnAreasProtegidas = findViewById(R.id.spn_area_protegida);
        rvAreasProtegidas = findViewById(R.id.rv_areas_protegidas);
        rvAreasProtegidas.setLayoutManager(new LinearLayoutManager(this));
        rvAreasProtegidas.setAdapter(new AreaProtegidaAdapter(this, getData()));

        ArrayList<String> areasProtegidas = new ArrayList<>();
        areasProtegidas.add("Parque Nacional");
        areasProtegidas.add("Santuario Nacional");
        areasProtegidas.add("Santuario Histórico");
        areasProtegidas.add("Reserva Nacional");
        areasProtegidas.add("Refugio de Vida Silvestre");
        areasProtegidas.add("Bosque de Protección");
        areasProtegidas.add("Reserva Paisajística");
        areasProtegidas.add("Reserva Comunal");
        areasProtegidas.add("Coto de Caza");
        areasProtegidas.add("Zona Reservada");

        spnAreasProtegidas.setTitle("Selecciona un área");
        spnAreasProtegidas.setPositiveButton("OK");

        ArrayAdapter<String> deporteAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, areasProtegidas);
        deporteAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnAreasProtegidas.setAdapter(deporteAdapter);

    }

    private ArrayList<AreaProtegida> getData() {
        ArrayList<AreaProtegida> data = new ArrayList<>();
        data.add(new AreaProtegida("Pacaya Samiria", "Parque Nacional", "Loreto", R.drawable.img_1));
        data.add(new AreaProtegida("Manu", "Parque Nacional", "Madre de Dios", R.drawable.img_3));
        return data;
    }

    public void showToolbar(String title, boolean upButton) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
