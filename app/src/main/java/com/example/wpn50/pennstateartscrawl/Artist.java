package com.example.wpn50.pennstateartscrawl;

public class Artist {

    //initialize the attributes of an artist displayed/performing at Arts Crawl
    private String mArtistName;
    private String mArtistGenre;
    private String mArtistDescript;
    private String mArtistStartTime;
    private String mArtistCity;
    private String mArtistRoom;
    private String mArtistBuilding;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    //build the constructor to get the values of the artist if there is no image provided
    public Artist(String artistName, String artistGenre, String artistDescript, String artistStartTime, String artistCity, String artistRoom, String artistBuilding){
        //set the artist name and other values to be that of which passed by the activity
        mArtistName = artistName;
        mArtistGenre = artistGenre;
        mArtistDescript = artistDescript;
        mArtistStartTime = artistStartTime;
        mArtistCity = artistCity;
        mArtistRoom = artistRoom;
        mArtistBuilding = artistBuilding;
    }

    //build the constructor to get the values of the artist attributes if it has an image
    public Artist(String artistName, String artistGenre, String artistDescript, String artistStartTime, String artistCity, String artistRoom, String artistBuilding, int imageResourceId){
        //set the artist name and other values to be that of which passed by the activity
        mArtistName = artistName;
        mArtistGenre = artistGenre;
        mArtistDescript = artistDescript;
        mArtistStartTime = artistStartTime;
        mArtistCity = artistCity;
        mArtistRoom = artistRoom;
        mArtistBuilding = artistBuilding;
        mImageResourceId = imageResourceId;
    }

    //create method to return the artist name from the activity
    public String getArtistName(){return mArtistName;}

    //create method to return the artist genre (music or artistic expression) from the activity
    public String getArtistGenre(){return mArtistGenre;}

    //create method to return the artist greater description (bio) from the activity
    public String getArtistDescript(){return mArtistDescript;}

    //create method to return the artist's start time from the activity
    public String getArtistStartTime(){return mArtistStartTime;}

    //create method to return the artist's hometown from the activity
    public String getArtistCity(){return mArtistCity;}

    //create method to return the room at the festival the artist will be performing or displayed in from the activity
    public String getArtistRoom(){return mArtistRoom;}

    //create method to return the building at the festival the artist will be performing or displayed in from the activity
    public String getArtistBuilding(){return mArtistBuilding;}

    //create method to return the image for the activity
    public int getImageResourceId(){return mImageResourceId;}

    //set what happens if there is no image provided
    public boolean hasImage() {return mImageResourceId != NO_IMAGE_PROVIDED;}
}
