package pe.heberqc.android.searchmusic.service;

import pe.heberqc.android.searchmusic.models.SearchAlbum;
import pe.heberqc.android.searchmusic.models.SearchSong;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

public interface SearchService {

    @GET("/search?entity=album&attribute=albumTerm")
    void getByAlbum(@Query("term") String text, Callback<SearchAlbum> response);

    @GET("/search?entity=song&attribute=songTerm")
    void getBySong(@Query("term") String text, Callback<SearchSong> response);

}