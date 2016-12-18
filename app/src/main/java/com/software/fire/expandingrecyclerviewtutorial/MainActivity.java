package com.software.fire.expandingrecyclerviewtutorial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.software.fire.expandingrecyclerviewtutorial.adapters.GenreAdapter;
import com.software.fire.expandingrecyclerviewtutorial.models.Artist;
import com.software.fire.expandingrecyclerviewtutorial.models.Genre;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //variables
    private RecyclerView mRecyclerView;
    private GenreAdapter mAdapter;
    private List<Genre> genres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        getGenres();
        mAdapter = new GenreAdapter(genres);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        mRecyclerView.setAdapter(mAdapter);
    }

    public void getGenres() {
        genres = new ArrayList<>(6);
        for (int i = 0; i < 6; i++) {
            List<Artist> artists = new ArrayList<>(3);
            artists.add(new Artist("Paramore"));
            artists.add(new Artist("Flyleaf"));
            artists.add(new Artist("The Script"));
            genres.add(new Genre("Rock_ " + i, artists));
        }
    }
}
