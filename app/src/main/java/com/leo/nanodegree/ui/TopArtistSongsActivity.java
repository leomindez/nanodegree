package com.leo.nanodegree.ui;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.leo.nanodegree.R;
import com.leo.nanodegree.fragments.TopArtistSongsFragment;

public class TopArtistSongsActivity extends SpotifyBaseActivity {

    @Override
    int contentViewId() {
        return R.layout.activity_top_artist_songs;
    }

    @Override
    boolean activeBackButton() {
        return true;
    }

    @Override
    void onCreateActivity(@Nullable Bundle savedInstanceState) {

        if (getIntent().getExtras() != null) {
            TopArtistSongsFragment topArtistSongsFragment = (TopArtistSongsFragment) getSupportFragmentManager().findFragmentById(R.id.top_artist_songs_fragment);
            topArtistSongsFragment.showArtistTopTrack(getIntent().getExtras().getString("artist_id"));
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}