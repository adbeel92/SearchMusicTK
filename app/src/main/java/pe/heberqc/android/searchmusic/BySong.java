package pe.heberqc.android.searchmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import pe.heberqc.android.searchmusic.adapters.SongAdapter;
import pe.heberqc.android.searchmusic.models.SearchSong;
import pe.heberqc.android.searchmusic.service.SearchService;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class BySong extends Fragment implements AdapterView.OnItemClickListener,
        View.OnClickListener {

    EditText editText;
    Button button;
    ProgressBar progressBar;
    ListView listView;
    SongAdapter songAdapter;

    public BySong() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_by_song, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        editText = (EditText) getActivity().findViewById(R.id.stexto);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    buscar(v.getText());
                    editText.onEditorAction(EditorInfo.IME_ACTION_DONE);
                    return true;
                }
                return false;
            }
        });
        button = (Button) getActivity().findViewById(R.id.sbtn_search);
        progressBar = (ProgressBar) getActivity().findViewById(R.id.sprogress);
        listView = (ListView) getActivity().findViewById(R.id.slist);
        listView.setAdapter(songAdapter);
        listView.setOnItemClickListener(this);
        button.setOnClickListener(this);
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.sbtn_search:
                buscar(editText.getText());
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(getActivity(),Details.class);
        intent.putExtra(MainActivity.ALBUM, songAdapter.getSongs().get(position));
        startActivity(intent);
    }

    public void buscar(CharSequence texto) {
        progressBar.setVisibility(View.VISIBLE);
        final RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint(MainActivity.API).build();
        SearchService songService = restAdapter.create(SearchService.class);
        songService.getBySong(String.valueOf(texto), new Callback<SearchSong>() {

            @Override
            public void success(SearchSong searchSong, Response response) {
                progressBar.setVisibility(View.GONE);
                songAdapter = new SongAdapter(getActivity(), searchSong.getResults());
                listView.setAdapter(songAdapter);
            }

            @Override
            public void failure(RetrofitError retrofitError) {
                progressBar.setVisibility(View.VISIBLE);
                Log.e(getResources().getString(R.string.songs), retrofitError.getMessage());
            }
        });
    }
}
