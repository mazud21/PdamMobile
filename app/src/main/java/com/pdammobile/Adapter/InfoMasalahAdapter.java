package com.pdammobile.Adapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pdammobile.Model.InfoMasalah;
import com.pdammobile.R;

import java.util.List;

public class InfoMasalahAdapter extends RecyclerView.Adapter<InfoMasalahAdapter.MyViewHolder> {
    List<InfoMasalah> mInfoMasalahList;

    public InfoMasalahAdapter(List <InfoMasalah> InfoMasalahList) {
        mInfoMasalahList = InfoMasalahList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_info_masalah, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(mView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.txtWilayah.setText(mInfoMasalahList.get(position).getWilayah());
        holder.txtHari.setText(mInfoMasalahList.get(position).getHari());
        holder.txtTanggal.setText(mInfoMasalahList.get(position).getTanggal());
        holder.txtEstimasi.setText(mInfoMasalahList.get(position).getEstimasi());
        holder.txtKerusakan.setText(mInfoMasalahList.get(position).getKerusakan());
        holder.txtAlternatif.setText(mInfoMasalahList.get(position).getAlternatif());
        holder.txtPenanganan.setText(mInfoMasalahList.get(position).getPenanganan());

    }

    @Override
    public int getItemCount() {
        return mInfoMasalahList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txtWilayah, txtHari, txtTanggal, txtEstimasi, txtKerusakan, txtAlternatif, txtPenanganan;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            txtWilayah = (TextView) itemView.findViewById(R.id.txtWilayah);
            txtHari = (TextView) itemView.findViewById(R.id.txtHari);
            txtTanggal = (TextView) itemView.findViewById(R.id.txtTanggal);
            txtEstimasi = (TextView) itemView.findViewById(R.id.txtEstimasi);
            txtKerusakan = (TextView) itemView.findViewById(R.id.txtKerusakan);
            txtAlternatif = (TextView) itemView.findViewById(R.id.txtAlternatif);
            txtPenanganan = (TextView) itemView.findViewById(R.id.txtPenanganan);
        }
    }
}
