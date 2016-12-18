package com.software.fire.expandingrecyclerviewtutorial.models;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

/**
 * Created by Brad on 12/18/2016.
 */

public class Genre extends ExpandableGroup {
    public Genre(String title, List items) {
        super(title, items);
    }
}
