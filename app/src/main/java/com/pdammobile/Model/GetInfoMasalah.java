package com.pdammobile.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetInfoMasalah {
    @SerializedName("ststus")
    String status;
    @SerializedName("message")
    String message;
    @SerializedName("result")
    List<InfoMasalah> listDataInfoMasalah;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<InfoMasalah> getListDataInfoMasalah() {
        return listDataInfoMasalah;
    }

    public void setListDataInfoMasalah(List<InfoMasalah> listDataInfoMasalah) {
        this.listDataInfoMasalah = listDataInfoMasalah;
    }
}
