package com.pdammobile.Model;

public class ConfigInfoMasalah {
    String status;
    InfoMasalah minfoMasalah;
    String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InfoMasalah getInfoMasalah() {
        return minfoMasalah;
    }

    public void setInfoMasalah(InfoMasalah InfoMasalah) {
        this.minfoMasalah = InfoMasalah;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
