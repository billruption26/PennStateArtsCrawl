# PennStateArtsCrawl

This is an application I attempted to develop in 2011 for an event at Penn State called Arts Crawl. I was a member of the club hosting it, SOMA, and since smartphones were starting to become prevalent at the time I thought it would be a fun thing to attempt as I had very rudimentary coding skills.  I never got it working in time for the event but was recently going through my old external hard drive and found the code. Since I have somewhat of a better idea as to what I am doing now (I'm a PM by trade so still not the greatest app) I decided it would be a fun project to at least get it working.  I am putting it on here so that any other college clubs who wish to have an android app for their events can utilize it as a template.

Running

Install application on PC in preferred location
If gradle is giving a build error, perform the steps below:
In Android Studio, go to 'Open' and select project from preferred location to open, once opened and structure is in place, go to Gradle Scripts > build.gradle (Module: app) > insert the line below into the 'dependencies' section -
compile 'com.android.support:design:26.1.0'

Activities

MainActivity
Simple central page which shows the menu options and the background image, suggested to update for more interesting functionality.

AboutActivity
Gives a description of the event, has space for an imageview at the top and a textview for the description.  Can change both to reflect the adopted event.

LineupActivity
A list of the artists/bands that will be on display/performing at the event. Artists are inserted into the list with an arraylist, this is pulled from the Artist.java and ArtistAdapter.java files with the Artist class being created in the former and the lattter providing the methods to create the arraylist.

ArtistProfileActivity
Takes the attributes of the artist selected from the arraylist and passes them into a profile page for the artist using the intent in LineupActivity.  May want to consider putting the facebook/soundcloud page at the bottom or an audio option for the bands.  Would need to include any attributes added in the arraylist which involves editing the Artist.java and ArtistAdapter.java files to include the attribute and the LineupActivity to contain the content for it.

ScheduleActivity
Displays fragments that each have the day schedule for each room involved in the event.  Events are created from the Event.java class which sets the attributes for the events to be displayed as a textview in the calendar.  This is then adapted onto the calendar within the fragment.  See comments in the code for details on how to set the timeframe the event covers and it's start time. ScheduleAdapter 
class sets the ability to cycle through the fragments.

MapsActivity
Shows a google map with the buildings included in the event w/ a marker.  Can adjust the markers and starting location through the functions in the activity.
