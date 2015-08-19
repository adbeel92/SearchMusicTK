package pe.heberqc.android.searchmusic;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import pe.heberqc.android.searchmusic.models.Album;

public class DetailsAlbumFragment extends Fragment {

    Album album;

    public TextView wrapperType;
    public TextView collectionType;
    public TextView artistId;
    public TextView collectionId;
    public TextView amgArtistId;
    public TextView artistName;
    public TextView collectionName;
    public TextView collectionCensoredName;
    public TextView artistViewUrl;
    public TextView collectionViewUrl;
    public ImageView artworkUrl60;
    public ImageView artworkUrl100;
    public TextView collectionPrice;
    public TextView collectionExplicitness;
    public TextView contentAdvisoryRating;
    public TextView trackCount;
    public TextView copyright;
    public TextView country;
    public TextView currency;
    public TextView releaseDate;
    public TextView primaryGenreName;

    public DetailsAlbumFragment() {
    }

    public static DetailsAlbumFragment newInstance(Bundle arguments){
        DetailsAlbumFragment f = new DetailsAlbumFragment();
        if(arguments != null){
            f.setArguments(arguments);
        }
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_album_details, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            album = (Album) bundle.getSerializable(MainActivity.Search.ALBUM.title);
            fillDetails();
        }
    }

    void fillDetails() {
        artworkUrl60 = (ImageView) getActivity().findViewById(R.id.artworkUrl60);
        artworkUrl100 = (ImageView) getActivity().findViewById(R.id.artworkUrl100);
        wrapperType = (TextView) getActivity().findViewById(R.id.wrapperType);
        collectionType = (TextView) getActivity().findViewById(R.id.collectionType);
        artistId = (TextView) getActivity().findViewById(R.id.artistId);
        collectionId = (TextView) getActivity().findViewById(R.id.collectionId);
        amgArtistId = (TextView) getActivity().findViewById(R.id.amgArtistId);
        artistName = (TextView) getActivity().findViewById(R.id.artistName);
        collectionName = (TextView) getActivity().findViewById(R.id.collectionName);
        collectionCensoredName = (TextView) getActivity().findViewById(R.id.collectionCensoredName);
        artistViewUrl = (TextView) getActivity().findViewById(R.id.artistViewUrl);
        collectionViewUrl = (TextView) getActivity().findViewById(R.id.collectionViewUrl);
        collectionPrice = (TextView) getActivity().findViewById(R.id.collectionPrice);
        collectionExplicitness = (TextView) getActivity().findViewById(R.id.collectionExplicitness);
        contentAdvisoryRating = (TextView) getActivity().findViewById(R.id.contentAdvisoryRating);
        trackCount = (TextView) getActivity().findViewById(R.id.trackCount);
        copyright = (TextView) getActivity().findViewById(R.id.copyright);
        country = (TextView) getActivity().findViewById(R.id.country);
        currency = (TextView) getActivity().findViewById(R.id.currency);
        releaseDate = (TextView) getActivity().findViewById(R.id.releaseDate);
        primaryGenreName = (TextView) getActivity().findViewById(R.id.primaryGenreName);

        Picasso.with(getActivity()).load(album.getArtworkUrl100())
                .placeholder(R.drawable.ic_cd).into(artworkUrl100);
        Picasso.with(getActivity()).load(album.getArtworkUrl60())
                .placeholder(R.drawable.ic_cd).into(artworkUrl60);
        wrapperType.setText(album.getWrapperType());
        collectionType.setText(album.getCollectionType());
        artistId.setText(String.valueOf(album.getArtistId()));
        collectionId.setText(String.valueOf(album.getCollectionId()));
        amgArtistId.setText(String.valueOf(album.getAmgArtistId()));
        artistName.setText(album.getArtistName());
        collectionName.setText(album.getCollectionName());
        collectionCensoredName.setText(album.getCollectionCensoredName());
        artistViewUrl.setText(album.getArtistViewUrl());
        collectionViewUrl.setText(album.getCollectionViewUrl());
        collectionPrice.setText(String.valueOf(album.getCollectionPrice()));
        collectionExplicitness.setText(album.getCollectionExplicitness());
        contentAdvisoryRating.setText(album.getContentAdvisoryRating());
        trackCount.setText(String.valueOf(album.getTrackCount()));
        copyright.setText(album.getCopyright());
        country.setText(album.getCountry());
        currency.setText(album.getCurrency());
        releaseDate.setText(album.getReleaseDate());
        primaryGenreName.setText(album.getPrimaryGenreName());
    }
}
