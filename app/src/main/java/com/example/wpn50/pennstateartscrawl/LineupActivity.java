package com.example.wpn50.pennstateartscrawl;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by wpn50 on 1/1/2018.
 */

public class LineupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.artist_list);

        //create an array list of all of the acts/artists/displays during the festival
        final ArrayList<Artist> artists = new ArrayList<Artist>();

        //Set the artist's as the values of the array
        artists.add(new Artist("The Exclusive Document", "Yacht Rock","The Exclusive Document "+
                "were a group of silent film actors who, following the runaway success of The Jazz Singer in 1927, "+
                "found themselves out of work. Luckily, the Cold War kicked off soon enough and brought them jobs as "+
                "Soviet spies. One fateful day, while collecting precious government documents from the filthy capitalist "+
                "dogs, they stumbled upon a punk rock show that changed their lives. Quickly defecting in order to pursue "+
                "this new calling, the members of the Exclusive Document now inhabit State College, Pennsylvania. They play a "
                +"wide variety of indie rock and pop, while still occasionally working to destroy the American economy, one failed "+
                "bank at a time.", "5:45PM", "State College, PA", "RM 321", "Zoller Gallery", R.drawable.exdoc));
        artists.add(new Artist("SFO Student Films", "Experimental Film","Involves members in the film community at "+
                "Penn State, providing opportunities for event-planning, networking, and gaining an appreciation for "+
                "film as art.", "5:45PM", "State College, PA", "Auditorium", "Palmer Museum of Art", R.drawable.sfo));

        //create adapter to insert artist's into list
        ArtistAdapter adapter = new ArtistAdapter(this, artists);

        //get the list view this should be inserted into
        ListView listView = (ListView) findViewById(R.id.list);

        //set the adapter in the layout
        listView.setAdapter(adapter);

        //create click listener for opening the artist's profile page
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
                //create intent for opening the artist's profile when clicked
                Intent itemIntent = new Intent(LineupActivity.this, ArtistProfileActivity.class);

                //create variable to store the artist that was selected
                Artist artist = artists.get(i);

                //create variable to store the artist name
                String artName = artist.getArtistName();

                //create variable to store the artist genre
                String artGenre = artist.getArtistGenre();

                //create variable to store the artist hometown
                String artCity = artist.getArtistCity();

                //create variable to store the artist building
                String artBuild = artist.getArtistBuilding();

                //create variable to store the artist room
                String artRoom = artist.getArtistRoom();

                //create variable to store the artist start time
                String artTime = artist.getArtistStartTime();

                //create variable to store the artist description
                String artDescript = artist.getArtistDescript();

                //create variable to store the artist image
                int artImage = artist.getImageResourceId();

                //add artName as a variable to the intent to open ArtistProfileActivity
                itemIntent.putExtra("Title", artName);

                //check if the artist has an image and pass to the profile if it does
                if(artist.hasImage()) {
                    itemIntent.putExtra("Image", artImage);
                }

                //add artGenre as a variable to the intent to open ArtistProfileActivity
                itemIntent.putExtra("Genre", artGenre);

                //add artCity as a variable to the intent to open ArtistProfileActivity
                itemIntent.putExtra("City", artCity);

                //add artBuild as a variable to the intent to open ArtistProfileActivity
                itemIntent.putExtra("Building", artBuild);

                //add artRoom as a variable to the intent to open ArtistProfileActivity
                itemIntent.putExtra("Room", artRoom);

                //add artTime as a variable to the intent to open ArtistProfileActivity
                itemIntent.putExtra("Time", artTime);

                //add artDescript as a variable to the intent to open ArtistProfileActivity
                itemIntent.putExtra("Description", artDescript);

                //open the ArtistProfileActivity activity
                startActivity(itemIntent);
            }
        });

    }
}
