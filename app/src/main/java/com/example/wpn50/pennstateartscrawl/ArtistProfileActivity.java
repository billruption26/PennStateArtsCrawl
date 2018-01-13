package com.example.wpn50.pennstateartscrawl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ArtistProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_profile);

        //create a variable for the Name of the profile
        TextView profileName = (TextView) findViewById(R.id.profName);

        //create a variable for the image of the profile
        ImageView profileImage = (ImageView) findViewById(R.id.profPic);

        //create a variable for the description of the profile
        TextView profileDescript = (TextView) findViewById(R.id.profDescript);

        //create a variable for the genre of the profile
        TextView profileGenre = (TextView) findViewById(R.id.profGenre);

        //create a variable for the hometown of the profile
        TextView profileCity = (TextView) findViewById(R.id.profCity);

        //create a variable for the building of the profile
        TextView profileBuilding = (TextView) findViewById(R.id.profBuild);

        //create a variable for the room of the profile
        TextView profileRoom = (TextView) findViewById(R.id.profRoom);

        //create a variable for the start time of the profile
        TextView profileTime = (TextView) findViewById(R.id.profStartTime);

        //get the name from the prior activity
        String nameVal = getIntent().getExtras().getString("Title");

        //get the genre from the prior activity
        String genVal = getIntent().getExtras().getString("Genre");

        //get the hometown from the prior activity
        String cityVal = getIntent().getExtras().getString("City");

        //get the building from the prior activity
        String buildVal = getIntent().getExtras().getString("Building");

        //get the room from the prior activity
        String roomVal = getIntent().getExtras().getString("Room");

        //get the time from the prior activity
        String timeVal = getIntent().getExtras().getString("Time");

        //get the image from the prior activity
        int imgVal = getIntent().getExtras().getInt("Image");

        //get the description from the prior activity
        String descVal = getIntent().getExtras().getString("Description");

        //change the title of the profile
        profileName.setText(nameVal);

        //Place the image at the top of the profile
        profileImage.setImageResource(imgVal);

        //change the description to what is passed
        profileDescript.setText(descVal);

        //change the genre to what is passed
        profileGenre.setText(genVal);

        //change the hometown to what is passed
        profileCity.setText(cityVal);

        //change the building to what is passed
        profileBuilding.setText(buildVal);

        //change the room to what is passed
        profileRoom.setText(roomVal);

        //change the time to what is passed
        profileTime.setText(timeVal);
    }
}
