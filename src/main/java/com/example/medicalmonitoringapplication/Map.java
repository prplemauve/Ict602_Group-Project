package com.example.medicalmonitoringapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.medicalmonitoringapplication.databinding.ActivityMapBinding;

import java.util.Vector;

public class Map extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapBinding binding;

    MarkerOptions marker;
    LatLng centerLocation;

    Vector<MarkerOptions> markerOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        centerLocation = new LatLng(3.0,101);

        markerOptions = new Vector<>();

        markerOptions.add(new MarkerOptions().title("Hospital Shah Alam")
                .position(new LatLng(3.0713,101.4900))
                .snippet("Hours: Open 24 hours\n" +
                        "Emergency department: Open 24 hours\n" +
                        "Phone: 03-5526 3000")
        );

        markerOptions.add(new MarkerOptions().title("Hospital UMRA, Shah Alam")
                .position(new LatLng(3.0828,101.5399))
                .snippet("Hours: Open 24 hours\n" +
                        "Phone: 03-5518 4319")
        );

        markerOptions.add(new MarkerOptions().title("Columbia Asia Extended Care Hospital, Shah Alam")
                .position(new LatLng(3.0472,101.5047))
                .snippet("Hours: Open 24 hours\n" +
                        "Phone: 03-5541 7833")
        );

        markerOptions.add(new MarkerOptions().title("KPJ Selangor Specialist Hospital")
                .position(new LatLng(3.0574,101.5403))
                .snippet("Hours: Open 24 hours\n" +
                        "Phone: 03-5543 1111")
        );

        markerOptions.add(new MarkerOptions().title("Assunta Hospital, Shah Alam")
                .position(new LatLng(3.0934,101.6453))
                .snippet("Hours: Open 24 hours\n" +
                        "Emergency department: Open 24 hours" +
                        "Phone: 03-2615 5555")
        );

        markerOptions.add(new MarkerOptions().title("Columbia Asia Hospital, Puchong")
                .position(new LatLng(3.0240,101.6205))
                .snippet("Hours: Open 24 hours\n" +
                        "Phone: 03-8064 8688")
        );

        markerOptions.add(new MarkerOptions().title("Sunway Medical Centre, Subang Jaya")
                .position(new LatLng(3.0658,101.6089))
                .snippet("Hours: Open 24 hours\n" +
                        "Phone: 03-7491 9191")
        );

        markerOptions.add(new MarkerOptions().title("Hospital Pantai Klang")
                .position(new LatLng(3.0181,101.4154))
                .snippet("Hours: Open 24 hours\n" +
                        "Phone: 03-3258 5500")
        );

        markerOptions.add(new MarkerOptions().title("QHC Medical Centre, Subang Jaya")
                .position(new LatLng(3.0181,101.4154))
                .snippet("Phone: 03-8024 5760")
        );

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

        // Add a marker in Sydney and move the camera
        //LatLng sydney = new LatLng(-34, 151);
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));

        for (MarkerOptions mark : markerOptions) {
            mMap.addMarker(mark);
        }

        enableMyLocation();

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(centerLocation,8));
    }

    private void enableMyLocation(){
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){
            if (mMap != null){
                mMap.setMyLocationEnabled(true);
            }
        }else {
            String perms [] = {"android.permission.ACCESS_FINE_LOCATION"};
            ActivityCompat.requestPermissions(this,perms,200);
        }
    }
}