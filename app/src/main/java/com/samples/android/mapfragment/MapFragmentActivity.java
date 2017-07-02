package com.samples.android.mapfragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

public class MapFragmentActivity extends AppCompatActivity {

    static final LatLng HAMBURG = new LatLng(53.558, 9.927);
    static final LatLng KIEL = new LatLng(53.551, 9.993);
    private GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_my);
        //map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();

    }
}
