package com.tk.rbmobile.pruebatecnica1.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.tk.rbmobile.pruebatecnica1.Models.MusicItem;
import com.tk.rbmobile.pruebatecnica1.R;
import java.util.List;

/**
 * Created by LelouchHarryu on 16/07/2015.
 */
public class MusicItemsAdapter extends ArrayAdapter<MusicItem> {

    private Activity activity;
    private List<MusicItem> items;
    private MusicItem music;
    private int row;

    public MusicItemsAdapter(Activity act, int resource, List<MusicItem> arrayList) {
        super(act, resource, arrayList);
        this.activity = act;
        this.row = resource;
        this.items = arrayList;

    }

    @Override
    public View getView(final int position, final View convertView, final ViewGroup parent) {

        View view = convertView;
        ViewHolder holder;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(row, null);
            holder = new ViewHolder();
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        if ((items == null) || ((position + 1) > items.size())) {
            return view;
        }

        music = items.get(position);

        holder.tv_artist_name = (TextView) view.findViewById(R.id.tv_name);
        holder.iv_song_image = (ImageView) view.findViewById(R.id.iv_song_image);


        if (holder.tv_artist_name != null && null != music.getArtistName()) {
            holder.tv_artist_name.setText(music.getArtistName());
        }


        Picasso.with(view.getContext())
                .load(music.getArtworkUrl100())
                .error(R.drawable.error)
                .tag(view.getContext())
                .into(holder.iv_song_image);



        return view;
    }

    public class ViewHolder {

        public TextView tv_artist_name;
        public ImageView iv_song_image;
    }


}