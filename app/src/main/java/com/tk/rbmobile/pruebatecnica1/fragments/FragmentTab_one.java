package com.tk.rbmobile.pruebatecnica1.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.tk.rbmobile.pruebatecnica1.Adapters.MusicItemsAdapter;
import com.tk.rbmobile.pruebatecnica1.Models.MusicItem;
import com.tk.rbmobile.pruebatecnica1.R;
import com.tk.rbmobile.pruebatecnica1.utils.ErrorMessage;
import com.tk.rbmobile.pruebatecnica1.utils.RestClient;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by tektonlabs on 15/07/15.
 */
public class FragmentTab_one extends Fragment {

    private RestClient client = new RestClient();
    List<MusicItem> listMusicItems;
    ListView lv_music_items;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view;
        view = inflater.inflate(R.layout.fragment_one, container, false);
        lv_music_items = (ListView)view.findViewById(R.id.lv_music_items);

        getSongs();
        return view;
    }


    private void getSongs() {

        client.getWebservices().getSongs(new Callback<JsonObject>() {
            @Override
            public void success(JsonObject responseObjectList, Response response) {
                if (response.getStatus() == 200) {
                    success_request(responseObjectList);
                }
            }

            @Override
            public void failure(RetrofitError error) {
                ErrorMessage errorMessage = new ErrorMessage(error);
                Toast.makeText(getActivity(), errorMessage.showError(), Toast.LENGTH_LONG).show();
            }
        });
    }


    private void success_request(JsonObject responseObjectList){

        listMusicItems=new ArrayList<>();
        JsonArray jsonArray_songs = responseObjectList.get("results").getAsJsonArray();

        for(JsonElement responseObject : jsonArray_songs){
            JsonObject jsonObject_song = responseObject.getAsJsonObject();
            MusicItem item= MusicItem.parseMusicItem(jsonObject_song);
            listMusicItems.add(item);
        }

        if(listMusicItems.size() > 0){
            initAdapter(listMusicItems);
        }

    }


    public void initAdapter(final List<MusicItem> listMusicItems) {

        MusicItemsAdapter objAdapter = new MusicItemsAdapter(this.getActivity(), R.layout.music_list_cell, listMusicItems);

        lv_music_items.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


            }
        });


        lv_music_items.setAdapter(objAdapter);

    }


}
