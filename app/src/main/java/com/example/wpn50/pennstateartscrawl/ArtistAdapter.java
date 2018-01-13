package com.example.wpn50.pennstateartscrawl;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.String;
import java.util.ArrayList;

/**
 * Created by wpn50 on 1/1/2018.
 */

public class ArtistAdapter extends ArrayAdapter<Artist> {

    private static final String LOG_TAG = ArtistAdapter.class.getSimpleName();

    //create public constructor for the artist adapter so that all artists will be listed in the lineup
    public ArtistAdapter(Activity context, ArrayList<Artist> artists){
        //make super class
        super(context,0, artists);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listArtistView = convertView;
        if (listArtistView == null) {
            listArtistView = LayoutInflater.from(getContext()).inflate(R.layout.list_artist, parent, false);
        }

        //get the artist located at this position in the array
        Artist currentArtist = getItem(position);

        //find artistName textView object
        TextView artistNameTextView = (TextView) listArtistView.findViewById(R.id.artistName);

        //set the artist's name in text view
        artistNameTextView.setText(currentArtist.getArtistName());

        //find artistGenre textView object
        TextView artistGenreTextView = (TextView) listArtistView.findViewById(R.id.artistGenre);

        //set the artist's genre in text view
        artistGenreTextView.setText(currentArtist.getArtistGenre());

        //find artistTime textView object
        TextView artistTimeTextView = (TextView) listArtistView.findViewById(R.id.artistTime);

        //set the artist's start time in text view
        artistTimeTextView.setText(currentArtist.getArtistStartTime());

        //find artistBuilding textView object
        TextView artistBuildingTextView = (TextView) listArtistView.findViewById(R.id.artistBuilding);

        //set the artist's building they will be in in text view
        artistBuildingTextView.setText(currentArtist.getArtistBuilding());

        //find artistRoom textView object
        TextView artistRoomTextView = (TextView) listArtistView.findViewById(R.id.artistRoom);

        //set the artist's room they will be in in text view
        artistRoomTextView.setText(currentArtist.getArtistRoom());

        //find image obj
        ImageView defaultImageView = (ImageView) listArtistView.findViewById(R.id.artistIcon);

        //check if there is an image and set the view's visibility
        if(currentArtist.hasImage()){
            //set image of word in ImageView
            defaultImageView.setImageResource(currentArtist.getImageResourceId());

            defaultImageView.setVisibility(View.VISIBLE);
        }else {
            defaultImageView.setVisibility(View.GONE);
        }

        //return the layout
        return listArtistView;
    }

}
