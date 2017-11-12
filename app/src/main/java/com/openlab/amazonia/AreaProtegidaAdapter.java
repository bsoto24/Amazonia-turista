package com.openlab.amazonia;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Bryam Soto on 12/11/2017.
 */

public class AreaProtegidaAdapter extends RecyclerView.Adapter<AreaProtegidaAdapter.AreaProtegidaVH> {

    private Activity activity;
    private ArrayList<AreaProtegida> areaProtegidas;

    public AreaProtegidaAdapter(Activity activity, ArrayList<AreaProtegida> areaProtegidas) {
        this.activity = activity;
        this.areaProtegidas = areaProtegidas;
    }

    @Override
    public AreaProtegidaVH onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AreaProtegidaVH(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_area_protegida, parent, false));
    }

    @Override
    public void onBindViewHolder(AreaProtegidaVH holder, int position) {
        AreaProtegida areaProtegida = areaProtegidas.get(position);
        holder.tvNombre.setText(areaProtegida.getNombre());
        holder.tvTipo.setText(areaProtegida.getTipo());
        holder.tvUbicacion.setText(areaProtegida.getUbicacion());
        holder.imgArea.setImageResource(areaProtegida.getImagen());
    }

    @Override
    public int getItemCount() {
        return areaProtegidas.size();
    }

    public class AreaProtegidaVH extends RecyclerView.ViewHolder {

        TextView tvNombre, tvTipo, tvUbicacion;
        ImageView imgArea;

        public AreaProtegidaVH(View itemView) {
            super(itemView);

            tvNombre = itemView.findViewById(R.id.tv_nombre);
            tvTipo = itemView.findViewById(R.id.tv_tipo_area);
            tvUbicacion = itemView.findViewById(R.id.tv_ubicacion);
            imgArea = itemView.findViewById(R.id.img_area);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(activity, AreaProtegidaDetalleActivity.class);
                    activity.startActivity(intent);
                }
            });
        }
    }
}
