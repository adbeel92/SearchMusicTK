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

public class ResultAdapter extends ArrayAdapter<Album>{

    Activity context;
    List<Album> albums;

    static class ViewHolder {
        public ImageView image;
        public TextView tv_1;
        public TextView tv_2;
        public TextView tv_3;
        public TextView tv_4;
    }

    public ResultAdapter(Activity context, List<Album> albums) {
        super(context, R.layout.item, albums);
        this.albums = albums;
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
        Album album = albums.get(position);
        holder.tv_1.setText(album.getCollectionName());
        holder.tv_2.setText(album.getArtistName());
        holder.tv_3.setText("");
        holder.tv_3.setVisibility(View.GONE);
        holder.tv_4.setText(album.getPrimaryGenreName());
        Picasso.with(context).load(album.getArtworkUrl100())
                .placeholder(R.drawable.ic_cd).into(holder.image);
        return rowView;
    }

    public List<Album> getAlbums() {
        return albums;
    }
}
