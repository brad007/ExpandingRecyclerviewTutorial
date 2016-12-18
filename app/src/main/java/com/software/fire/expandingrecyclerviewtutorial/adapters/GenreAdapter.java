package com.software.fire.expandingrecyclerviewtutorial.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.software.fire.expandingrecyclerviewtutorial.R;
import com.software.fire.expandingrecyclerviewtutorial.models.Artist;
import com.software.fire.expandingrecyclerviewtutorial.viewholders.ArtistViewHolder;
import com.software.fire.expandingrecyclerviewtutorial.viewholders.GenreViewHolder;
import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by Brad on 12/18/2016.
 */

public class GenreAdapter extends ExpandableRecyclerViewAdapter<GenreViewHolder, ArtistViewHolder> {

    public GenreAdapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }

    @Override
    public GenreViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_genre, parent, false);
        return new GenreViewHolder(view);
    }

    @Override
    public ArtistViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_artist, parent, false);
        return new ArtistViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(ArtistViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        Artist artist = (Artist) group.getItems().get(childIndex);

        holder.setArtistName(artist.getName());
    }

    @Override
    public void onBindGroupViewHolder(GenreViewHolder holder, int flatPosition, ExpandableGroup group) {
        holder.setGenreName(group.getTitle());
    }
}
