package com.software.fire.expandingrecyclerviewtutorial.viewholders;

import android.view.View;
import android.widget.TextView;

import com.software.fire.expandingrecyclerviewtutorial.R;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

/**
 * Created by Brad on 12/18/2016.
 */

public class ArtistViewHolder extends ChildViewHolder {

    private TextView artistName;

    public ArtistViewHolder(View itemView) {
        super(itemView);
        artistName = (TextView)itemView.findViewById(R.id.list_item_artist_name);
    }

    public void setArtistName(String name){
        artistName.setText(name);
    }
}
