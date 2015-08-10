package com.tk.rbmobile.pruebatecnica1.utils;

import retrofit.RetrofitError;

/**
 * Created by LelouchHarryu on 16/07/2015.
 */
public class ErrorMessage {

    private RetrofitError errorRetrofit;

    public ErrorMessage(RetrofitError error){
        this.errorRetrofit = error;
    }

    public String showError(){
        String error_message = "ERROR";
        if (errorRetrofit.getResponse() != null) {
            RestError errorClient = (RestError) errorRetrofit.getBodyAs(RestError.class);
            error_message = errorClient.getError();
        }
        else{
            if (errorRetrofit.getKind().equals(RetrofitError.Kind.NETWORK)){
                error_message = "Problem with internet connection";
            }
        }
        return error_message;
    }

}
