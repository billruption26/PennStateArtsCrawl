package com.example.wpn50.pennstateartscrawl;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link VisArts103Fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link VisArts103Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VisArts103Fragment extends Fragment {
    private static final String TAG = MainActivity.class.getSimpleName();
    private RelativeLayout mLayout;
    private int eventIndex;

    public VisArts103Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.calendar, container, false);

        mLayout = (RelativeLayout) rootView.findViewById(R.id.left_event_column);
        eventIndex = mLayout.getChildCount();
        displayDailyEvents();

        return rootView;
    }

    private void displayDailyEvents() {

        /*create own events, startTimeId should be written equivalent of the time the act begins written
        in word format and height representing the amount of time for the performance.  15 minutes = 20
         */
        final ArrayList<Event> events = new ArrayList<Event>();
        events.add(new Event(R.id.eight_fifteen, 40, "The Exclusive Document"));


        for (int i = 0; i < events.size(); i++){
            Event event = events.get(i);
            createEventView(event.getStartTimeId(), event.getHeight(), event.getMessage());
        }
    }

    private void createEventView(int startTimeId, int height, String message){
        TextView mEventView = new TextView(this.getActivity());
        RelativeLayout.LayoutParams lParam = new RelativeLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        lParam.addRule(RelativeLayout.ALIGN_TOP, startTimeId);
        lParam.leftMargin = 24;
        mEventView.setLayoutParams(lParam);
        mEventView.setPadding(24, 0, 24, 0);
        Log.d(TAG, "Height now " + height);
        mEventView.setHeight(height * 2);
        mEventView.setGravity(0x11);
        mEventView.setTextColor(Color.parseColor("#ffffff"));
        mEventView.setText(message);
        mEventView.setBackgroundColor(Color.parseColor("#3F51B5"));
        mLayout.addView(mEventView, eventIndex - 1);
    }
}
