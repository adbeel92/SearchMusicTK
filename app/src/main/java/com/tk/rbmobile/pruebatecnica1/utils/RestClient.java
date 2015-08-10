package com.tk.rbmobile.pruebatecnica1.utils;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.bind.DateTypeAdapter;

import java.util.Date;

import retrofit.RestAdapter;
import retrofit.client.UrlConnectionClient;
import retrofit.converter.GsonConverter;

public class RestClient {
    private PruebaTecnicaServices webservices;

    public RestClient(){
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .registerTypeAdapter(Date.class, new DateTypeAdapter())
                .create();

        UrlConnectionClient urlClient = new UrlConnectionClient();

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(Constants.BASE_URL)
                .setClient(urlClient)
                .setConverter(new GsonConverter(gson))
                .build();

        webservices = restAdapter.create(PruebaTecnicaServices.class);
    }

    public PruebaTecnicaServices getWebservices(){
        return webservices;
    }
}