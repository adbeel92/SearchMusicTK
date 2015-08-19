package pe.heberqc.android.searchmusic;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import pe.heberqc.android.searchmusic.models.Song;

public class DetailsSongFragment extends Fragment {

    Song song;

    ImageView artworkUrl30;
    ImageView artworkUrl60;
    ImageView artworkUrl100;
    TextView wrapperType;
    TextView kind;
    TextView artistId;
    TextView collectionId;
    TextView trackId;
    TextView artistName;
    TextView collectionName;
    TextView trackName;
    TextView collectionCensoredName;
    TextView trackCensoredName;
    TextView artistViewUrl;
    TextView collectionViewUrl;
    TextView trackViewUrl;
    TextView previewUrl;
    TextView collectionPrice;
    TextView trackPrice;
    TextView releaseDate;
    TextView collectionExplicitness;
    TextView trackExplicitness;
    TextView discCount;
    TextView discNumber;
    TextView trackCount;
    TextView trackNumber;
    TextView trackTimeMillis;
    TextView country;
    TextView currency;
    TextView primaryGenreName;
    TextView radioStationUrl;
    TextView isStreamable;

    public DetailsSongFragment() {
    }

    public static DetailsSongFragment newInstance(Bundle arguments){
        DetailsSongFragment f = new DetailsSongFragment();
        if(arguments != null){
            f.setArguments(arguments);
        }
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_song_details, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            song = (Song) bundle.getSerializable(MainActivity.Search.SONG.title);
            fillDetails();
        }
    }

    private void fillDetails() {
        artworkUrl30 = (ImageView) getActivity().findViewById(R.id.artworkUrl30);
        artworkUrl60 = (ImageView) getActivity().findViewById(R.id.artworkUrl60);
        artworkUrl100 = (ImageView) getActivity().findViewById(R.id.artworkUrl100);
        wrapperType = (TextView) getActivity().findViewById(R.id.wrapperType);
        kind = (TextView) getActivity().findViewById(R.id.kind);
        artistId = (TextView) getActivity().findViewById(R.id.artistId);
        collectionId = (TextView) getActivity().findViewById(R.id.collectionId);
        trackId = (TextView) getActivity().findViewById(R.id.trackId);
        artistName = (TextView) getActivity().findViewById(R.id.artistName);
        collectionName = (TextView) getActivity().findViewById(R.id.collectionName);
        trackName = (TextView) getActivity().findViewById(R.id.trackName);
        collectionCensoredName = (TextView) getActivity().findViewById(R.id.collectionCensoredName);
        trackCensoredName = (TextView) getActivity().findViewById(R.id.trackCensoredName);
        artistViewUrl = (TextView) getActivity().findViewById(R.id.artistViewUrl);
        collectionViewUrl = (TextView) getActivity().findViewById(R.id.collectionViewUrl);
        trackViewUrl = (TextView) getActivity().findViewById(R.id.trackViewUrl);
        previewUrl = (TextView) getActivity().findViewById(R.id.previewUrl);
        collectionPrice = (TextView) getActivity().findViewById(R.id.collectionPrice);
        trackPrice = (TextView) getActivity().findViewById(R.id.trackPrice);
        releaseDate = (TextView) getActivity().findViewById(R.id.releaseDate);
        collectionExplicitness = (TextView) getActivity().findViewById(R.id.collectionExplicitness);
        trackExplicitness = (TextView) getActivity().findViewById(R.id.trackExplicitness);
        discCount = (TextView) getActivity().findViewById(R.id.discCount);
        discNumber = (TextView) getActivity().findViewById(R.id.discNumber);
        trackCount = (TextView) getActivity().findViewById(R.id.trackCount);
        trackNumber = (TextView) getActivity().findViewById(R.id.trackNumber);
        trackTimeMillis = (TextView) getActivity().findViewById(R.id.trackTimeMillis);
        country = (TextView) getActivity().findViewById(R.id.country);
        currency = (TextView) getActivity().findViewById(R.id.currency);
        primaryGenreName = (TextView) getActivity().findViewById(R.id.primaryGenreName);
        radioStationUrl = (TextView) getActivity().findViewById(R.id.radioStationUrl);
        isStreamable = (TextView) getActivity().findViewById(R.id.isStreamable);

        Picasso.with(getActivity()).load(song.getArtworkUrl30())
                .placeholder(R.drawable.ic_cd).into(artworkUrl30);
        Picasso.with(getActivity()).load(song.getArtworkUrl60())
                .placeholder(R.drawable.ic_cd).into(artworkUrl60);
        Picasso.with(getActivity()).load(song.getArtworkUrl100())
                .placeholder(R.drawable.ic_cd).into(artworkUrl100);
        wrapperType.setText(song.getWrapperType());
        kind.setText(song.getKind());
        country.setText(song.getCountry());
        currency.setText(song.getCurrency());
        primaryGenreName.setText(song.getPrimaryGenreName());
        radioStationUrl.setText(song.getRadioStationUrl());
        artistName.setText(song.getArtistName());
        collectionName.setText(song.getCollectionName());
        trackName.setText(song.getTrackName());
        collectionCensoredName.setText(song.getCollectionCensoredName());
        trackCensoredName.setText(song.getTrackCensoredName());
        artistViewUrl.setText(song.getArtistViewUrl());
        collectionViewUrl.setText(song.getCollectionViewUrl());
        trackViewUrl.setText(song.getTrackViewUrl());
        previewUrl.setText(song.getPreviewUrl());
        collectionExplicitness.setText(song.getCollectionExplicitness());
        trackExplicitness.setText(song.getTrackExplicitness());
        collectionPrice.setText(String.valueOf(song.getCollectionPrice()));
        trackPrice.setText(String.valueOf(song.getTrackPrice()));
        releaseDate.setText(String.valueOf(song.getReleaseDate()));
        discCount.setText(String.valueOf(song.getDiscCount()));
        discNumber.setText(String.valueOf(song.getDiscNumber()));
        trackCount.setText(String.valueOf(song.getTrackCount()));
        trackNumber.setText(String.valueOf(song.getTrackNumber()));
        trackTimeMillis.setText(String.valueOf(song.getTrackTimeMillis()));
        artistId.setText(String.valueOf(song.getArtistId()));
        collectionId.setText(String.valueOf(song.getCollectionId()));
        trackId.setText(String.valueOf(song.getTrackId()));
        isStreamable.setText(String.valueOf(song.getIsStreamable()));
    }
}
