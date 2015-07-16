package com.tk.rbmobile.pruebatecnica1.utils;

import com.google.gson.annotations.SerializedName;
import com.squareup.okhttp.Response;

import org.xml.sax.ErrorHandler;

import retrofit.RetrofitError;


/**
 * Created by rubymobile on 5/5/15.
 */
public class RestError {

    @SerializedName("error")
    private String error;

    public String getError() {
        return error;
    }

}