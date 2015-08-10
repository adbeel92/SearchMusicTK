package pe.heberqc.android.searchmusic.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import pe.heberqc.android.searchmusic.R;
import pe.heberqc.android.searchmusic.models.Album;
import pe.heberqc.android.searchmusic.models.Song;

public class SongAdapter extends ArrayAdapter<Song>{

    Activity context;
    List<Song> songs;

    static class ViewHolder {
        public ImageView image;
        public TextView tv_1;
        public TextView tv_2;
        public TextView tv_3;
        public TextView tv_4;
    }

    public SongAdapter(Activity context, List<Song> songs) {
        super(context, R.layout.item, songs);
        this.songs = songs;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;
        if (rowView == null) {
            LayoutInflater inflater = context.getLayoutInflater();
            rowView = inflater.inflate(R.layout.item, null);
            ViewHolder viewHolder = new ViewHolder();
            viewHolder.image = (ImageView) rowView.findViewById(R.id.image);
            viewHolder.tv_1 = (TextView) rowView.findViewById(R.id.tv1);
            viewHolder.tv_2 = (TextView) rowView.findViewById(R.id.tv2);
            viewHolder.tv_3 = (TextView) rowView.findViewById(R.id.tv3);
            viewHolder.tv_4 = (TextView) rowView.findViewById(R.id.tv4);
            rowView.setTag(viewHolder);
        }
        ViewHolder holder = (ViewHolder) rowView.getTag();
        Song song = songs.get(position);
        holder.tv_1.setText(song.getTrackName());
        holder.tv_2.setText(song.getCollectionName());
        holder.tv_3.setText(song.getArtistName());
        holder.tv_4.setText(song.getPrimaryGenreName());
        Picasso.with(context).load(song.getArtworkUrl100())
                .placeholder(R.drawable.ic_cd).into(holder.image);
        return rowView;
    }

    public List<Song> getSongs() {
        return songs;
    }
}
