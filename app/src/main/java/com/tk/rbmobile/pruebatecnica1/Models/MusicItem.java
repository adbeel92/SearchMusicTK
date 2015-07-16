package com.tk.rbmobile.pruebatecnica1.Models;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

/**
 * Created by LelouchHarryu on 16/07/2015.
 */

// Example of search
public class MusicItem {

    @SerializedName("trackId")
    String trackId;
    String artistName;
    String collectionName;
    String trackName;
    String artworkUrl100;
    String trackPrice;

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getArtworkUrl100() {
        return artworkUrl100;
    }

    public void setArtworkUrl100(String artworkUrl100) {
        this.artworkUrl100 = artworkUrl100;
    }

    public String getTrackPrice() {
        return trackPrice;
    }

    public void setTrackPrice(String trackPrice) {
        this.trackPrice = trackPrice;
    }


    public MusicItem(){
    }


    public static class Builder {
        String mTrackId;
        String mArtistName;
        String mCollectionName;
        String mTrackName;
        String mArtworkUrl100;
        String mTrackPrice;


        public Builder(String id) {
            mTrackId = id;
        }

        public Builder artistName(String artistName) {
            mArtistName = artistName;
            return this;
        }

        public Builder collectionName(String collectionName) {
            mCollectionName = collectionName;
            return this;
        }

        public Builder trackName(String trackName) {
            mTrackName = trackName;
            return this;
        }

        public Builder artworkUrl100(String artworkUrl100) {
            mArtworkUrl100 = artworkUrl100;
            return this;
        }

        public Builder trackPrice(String trackPrice) {
            mTrackPrice = trackPrice;
            return this;
        }



        public MusicItem build() {

            MusicItem musicItem = new MusicItem();
            musicItem.setTrackId(mTrackId);
            musicItem.setArtistName(mArtistName);
            musicItem.setCollectionName(mCollectionName);
            musicItem.setTrackName(mTrackName);
            musicItem.setArtworkUrl100(mArtworkUrl100);
            musicItem.setTrackPrice(mTrackPrice);
            return musicItem;
        }

    }

    public static MusicItem parseMusicItem(JsonObject responseObject){

        Builder roleBuilder;
        roleBuilder = new Builder(responseObject.get("trackId").getAsString())
                .artistName(responseObject.get("artistName").getAsString());


        if(responseObject.has("collectionName")){
            roleBuilder.collectionName(responseObject.get("collectionName").getAsString());
        }
        if(responseObject.has("trackName")){
            roleBuilder.trackName(responseObject.get("trackName").getAsString());
        }
        if(responseObject.has("artworkUrl100")){
            roleBuilder.artworkUrl100(responseObject.get("artworkUrl100").getAsString());
        }
        if(responseObject.has("trackPrice")){
            roleBuilder.trackPrice(responseObject.get("trackPrice").getAsString());
        }


        return roleBuilder.build();
    }

}
