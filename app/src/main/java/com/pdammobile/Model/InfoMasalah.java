package com.pdammobile.Model;

public class InfoMasalah {
    private int no_info;
    private String wilayah;
    private String hari;
    private String tanggal;
    private String estimasi;
    private String kerusakan;
    private String alternatif;
    private String penanganan;

    public InfoMasalah(int no_info, String wilayah, String hari, String tanggal, String estimasi, String kerusakan, String alternatif, String penanganan) {
        this.no_info = no_info;
        this.wilayah = wilayah;
        this.hari = hari;
        this.tanggal = tanggal;
        this.estimasi = estimasi;
        this.kerusakan = kerusakan;
        this.alternatif = alternatif;
        this.penanganan = penanganan;
    }

    public int getNo_info() {
        return no_info;
    }

    public void setNo_info(int no_info) {
        this.no_info = no_info;
    }

    public String getWilayah() {
        return wilayah;
    }

    public void setWilayah(String wilayah) {
        this.wilayah = wilayah;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getEstimasi() {
        return estimasi;
    }

    public void setEstimasi(String estimasi) {
        this.estimasi = estimasi;
    }

    public String getKerusakan() {
        return kerusakan;
    }

    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
    }

    public String getAlternatif() {
        return alternatif;
    }

    public void setAlternatif(String alternatif) {
        this.alternatif = alternatif;
    }

    public String getPenanganan() {
        return penanganan;
    }

    public void setPenanganan(String penanganan) {
        this.penanganan = penanganan;
    }
}
