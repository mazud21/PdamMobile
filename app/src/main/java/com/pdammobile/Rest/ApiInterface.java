package com.pdammobile.Rest;

import com.pdammobile.Model.ConfigInfoMasalah;
import com.pdammobile.Model.GetInfoMasalah;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface ApiInterface {
    @GET("masalah_android")
    Call<GetInfoMasalah> getInfoMasalah();

    @FormUrlEncoded
    @POST("info_masalah")
    Call<ConfigInfoMasalah> postMasalah(@Field("nama") String nama,
                                        @Field("nomor") String snomor);

    @FormUrlEncoded
    @PUT("info_masalah")
    Call<ConfigInfoMasalah> putMasalah(@Field("id") String id,
                                       @Field("nama") String nama,
                                       @Field("nomor") String nomor);

    @FormUrlEncoded
    @HTTP(method = "DELETE", path = "info_masalah", hasBody = true)
    Call<ConfigInfoMasalah> deleteInfoMasalah(@Field("id") String id);
}
