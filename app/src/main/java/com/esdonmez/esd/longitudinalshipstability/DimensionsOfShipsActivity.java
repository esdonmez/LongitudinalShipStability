package com.esdonmez.esd.longitudinalshipstability;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;

public class DimensionsOfShipsActivity extends AppCompatActivity {

    RelativeLayout breadthButton, depthButton, draughtButton, loaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dimensions_of_ships);

        breadthButton = (RelativeLayout) findViewById(R.id.breadthButton);
        depthButton = (RelativeLayout) findViewById(R.id.depthButton);
        draughtButton = (RelativeLayout) findViewById(R.id.draughtButton);
        loaButton = (RelativeLayout) findViewById(R.id.loaButton);

        breadthButton.setOnClickListener(buttonListener);
        depthButton.setOnClickListener(buttonListener);
        draughtButton.setOnClickListener(buttonListener);
        loaButton.setOnClickListener(buttonListener);
    }

    private View.OnClickListener buttonListener = new View.OnClickListener() {
        public void onClick(View v) {
            if (v.getId() == R.id.breadthButton) {
                Intent i = new Intent(DimensionsOfShipsActivity.this, BreadthActivity.class);
                startActivity(i);
            }
            else if (v.getId() == R.id.depthButton) {
                Intent i = new Intent(DimensionsOfShipsActivity.this, DepthActivity.class);
                startActivity(i);
            }
            else if (v.getId() == R.id.draughtButton) {
                Intent i = new Intent(DimensionsOfShipsActivity.this, DraughtActivity.class);
                startActivity(i);
            }
            else if (v.getId() == R.id.loaButton) {
                Intent i = new Intent(DimensionsOfShipsActivity.this, LOAActivity.class);
                startActivity(i);
            }
        }
    };
}
