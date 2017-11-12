package com.openlab.amazonia;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Bryam Soto on 12/11/2017.
 */

public class TicketAdapter extends RecyclerView.Adapter<TicketAdapter.AreaProtegidaVH> {

    private Activity activity;
    private ArrayList<Ticket> tickets;

    public TicketAdapter(Activity activity, ArrayList<Ticket> tickets) {
        this.activity = activity;
        this.tickets = tickets;
    }

    @Override
    public AreaProtegidaVH onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AreaProtegidaVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_ticket, parent, false));
    }

    @Override
    public void onBindViewHolder(AreaProtegidaVH holder, int position) {
        Ticket ticket = tickets.get(position);
        holder.tvNombre.setText(ticket.getAreaProtegida());
        holder.tvPrecio.setText(ticket.getPrecio());
        holder.tvFecha.setText(ticket.getFechaExpiracion());

    }

    @Override
    public int getItemCount() {
        return tickets.size();
    }

    public class AreaProtegidaVH extends RecyclerView.ViewHolder {

        TextView tvNombre, tvPrecio, tvFecha;

        public AreaProtegidaVH(View itemView) {
            super(itemView);

            tvNombre = itemView.findViewById(R.id.tv_nombre);
            tvPrecio = itemView.findViewById(R.id.tv_precio);
            tvFecha = itemView.findViewById(R.id.tv_fecha);

        }
    }
}
