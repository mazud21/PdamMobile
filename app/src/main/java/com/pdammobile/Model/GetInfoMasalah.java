package com.pdammobile.Model;

import java.util.List;

public class GetInfoMasalah {
    String status;
    String result;
    String message;
    List<InfoMasalah> listDataInfoMasalah;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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
