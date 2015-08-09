package pe.heberqc.android.searchmusic.models;

import pe.heberqc.android.searchmusic.service.SearchService;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class PruebaSearch {
    public static void main(String[] args) {
        String API = "https://itunes.apple.com";
        String texto = "The song remains the same";
        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(API).build();
        SearchService songService = restAdapter.create(SearchService.class);
        songService.getBySong(texto, new Callback<SearchSong>() {

            @Override
            public void success(SearchSong searchSong, Response response) {
                System.out.println("RESULTADO: ");
                System.out.println(searchSong.getResultCount());
                for (int i = 0; i < searchSong.getResults().size(); i++) {
                    System.out.println(searchSong.getResults().get(i).getCollectionName());
                }
            }

            @Override
            public void failure(RetrofitError retrofitError) {
                System.out.println("ERROR: ");
                System.out.println(retrofitError.getMessage());
            }
        });
        SearchService albumService = restAdapter.create(SearchService.class);
        albumService.getByAlbum(texto, new Callback<SearchAlbum>() {

            @Override
            public void success(SearchAlbum searchAlbum, Response response) {
                System.out.println("RESULTADO: ");
                System.out.println(searchAlbum.getResultCount());
                for (int i = 0; i < searchAlbum.getResults().size(); i++) {
                    System.out.println(searchAlbum.getResults().get(i).getCollectionName());
                }
            }

            @Override
            public void failure(RetrofitError retrofitError) {
                System.out.println("ERROR: ");
                System.out.println(retrofitError.getMessage());
            }
        });
    }
}
