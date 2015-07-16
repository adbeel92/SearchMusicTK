package com.tk.rbmobile.pruebatecnica1.utils;

import com.google.gson.JsonObject;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Header;

/**
 * Created by LelouchHarryu on 16/07/2015.
 */
public interface PruebaTecnicaServices {

    @GET(Constants.SEARCH_HAPPY_SONG)
    void getSongs( Callback<JsonObject> callback);

}
