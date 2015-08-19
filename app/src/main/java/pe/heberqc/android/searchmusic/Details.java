package pe.heberqc.android.searchmusic;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Details extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = new Bundle();
        Fragment fragment;
        if (getIntent().getExtras().get(MainActivity.SEARCH).equals(MainActivity.Search.ALBUM.cod)) {
            arguments.putSerializable(MainActivity.Search.ALBUM.title, getIntent().getExtras().getSerializable(MainActivity.Search.ALBUM.title));
            fragment = DetailsAlbumFragment.newInstance(arguments);
        } else {
            arguments.putSerializable(MainActivity.Search.SONG.title, getIntent().getExtras().getSerializable(MainActivity.Search.SONG.title));
            fragment = DetailsSongFragment.newInstance(arguments);
        }
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(android.R.id.content, fragment);
        ft.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_details, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
