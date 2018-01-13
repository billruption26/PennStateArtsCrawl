package com.example.wpn50.pennstateartscrawl;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //add markers on the buildings that the festival will be held in, coordinates retrieved manually from google maps
        LatLng palm = new LatLng(40.800394, -77.865560);
        mMap.addMarker(new MarkerOptions().position(palm).title("Palmer Museum of Art"));

        LatLng stuk = new LatLng(40.801007, -77.866507);
        mMap.addMarker(new MarkerOptions().position(stuk).title("Stukeman Family Building"));

        LatLng zol = new LatLng(40.800790, -77.865382);
        mMap.addMarker(new MarkerOptions().position(zol).title("Zoller Gallery"));
        //have camera start over the Zoller Gallery
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(zol, 18.0f));

        LatLng bor = new LatLng(40.801532, -77.864719);
        mMap.addMarker(new MarkerOptions().position(bor).title("Borland Building"));
    }
}
