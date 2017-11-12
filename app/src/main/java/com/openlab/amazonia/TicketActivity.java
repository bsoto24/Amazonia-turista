package com.openlab.amazonia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;

import com.toptoche.searchablespinnerlibrary.SearchableSpinner;

import java.util.ArrayList;

public class TicketActivity extends AppCompatActivity {

    private RecyclerView rvTickets;
    private SearchableSpinner spnAreasProtegidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);
        showToolbar("Mis Tickets", true);

        spnAreasProtegidas = findViewById(R.id.spn_area_protegida);
        rvTickets = findViewById(R.id.rv_tickets);
        rvTickets.setLayoutManager(new LinearLayoutManager(this));
        rvTickets.setAdapter(new TicketAdapter(this, getData()));

        ArrayList<String> areasProtegidas = new ArrayList<>();

        areasProtegidas.add("Pacaya Samiria");
        areasProtegidas.add("Manu");

        spnAreasProtegidas.setTitle("Selecciona un área");
        spnAreasProtegidas.setPositiveButton("OK");

        ArrayAdapter<String> deporteAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, areasProtegidas);
        deporteAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnAreasProtegidas.setAdapter(deporteAdapter);
    }

    private ArrayList<Ticket> getData() {
        ArrayList<Ticket> data = new ArrayList<>();
        data.add(new Ticket("Pacaya Samiria", "S/ 10.00", "21/12/17"));
        data.add(new Ticket("Manu", "S/ 10.00", "25/12/17"));
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