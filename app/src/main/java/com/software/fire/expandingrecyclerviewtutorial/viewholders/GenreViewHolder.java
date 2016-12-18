package com.software.fire.expandingrecyclerviewtutorial.viewholders;

import android.view.View;
import android.widget.TextView;

import com.software.fire.expandingrecyclerviewtutorial.R;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

/**
 * Created by Brad on 12/18/2016.
 */

public class GenreViewHolder extends GroupViewHolder {

    private TextView genreTitle;

    public GenreViewHolder(View itemView) {
        super(itemView);
        genreTitle = (TextView)itemView.findViewById(R.id.list_item_genre_name);
    }

    public void setGenreName(String name){
        genreTitle.setText(name);
    }
}
