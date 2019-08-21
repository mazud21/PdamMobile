package com.pdammobile.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.pdammobile.Adapter.InfoMasalahAdapter;
import com.pdammobile.Model.GetInfoMasalah;
import com.pdammobile.Model.InfoMasalah;
import com.pdammobile.R;
import com.pdammobile.Rest.ApiClient;
import com.pdammobile.Rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InfoMasalahUI extends AppCompatActivity {

    ApiInterface mApiInterface;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public static InfoMasalahUI im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_masalah_ui);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycleview);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        im = this;
        refresh();

    }

    public void refresh(){
        Call<GetInfoMasalah> infoMasalahCall = mApiInterface.getInfoMasalah();
        infoMasalahCall.enqueue(new Callback<GetInfoMasalah>() {
            @Override
            public void onResponse(Call<GetInfoMasalah> call, Response<GetInfoMasalah>
                    response) {
                List<InfoMasalah> InfoMasalahList = response.body().getListDataInfoMasalah();
                Log.d("Retrofit Get", "Jumlah data Kontak: " +
                        String.valueOf(InfoMasalahList.size()));
                mAdapter = new InfoMasalahAdapter(InfoMasalahList);
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<GetInfoMasalah> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });
    }
}
