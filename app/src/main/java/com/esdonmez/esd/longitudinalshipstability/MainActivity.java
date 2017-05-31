package com.esdonmez.esd.longitudinalshipstability;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout dimensionButton, longitudinalButton, transverseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dimensionButton = (RelativeLayout) findViewById(R.id.dimensionButton);
        longitudinalButton = (RelativeLayout) findViewById(R.id.longitudinalButton);
        transverseButton = (RelativeLayout) findViewById(R.id.transverseButton);

        dimensionButton.setOnClickListener(buttonListener);
        longitudinalButton.setOnClickListener(buttonListener);
        transverseButton.setOnClickListener(buttonListener);
    }

    private View.OnClickListener buttonListener = new View.OnClickListener() {
        public void onClick(View v) {
            if (v.getId() == R.id.dimensionButton) {
                Intent i = new Intent(MainActivity.this, DimensionsOfShipsActivity.class);
                startActivity(i);
            }
            else if (v.getId() == R.id.longitudinalButton) {
                Intent i = new Intent(MainActivity.this, LongitudinalStabilityActivity.class);
                startActivity(i);
            }
            else if (v.getId() == R.id.transverseButton) {
                Intent i = new Intent(MainActivity.this, TransverseStabilityActivity.class);
                startActivity(i);
            }
        }
    };
}
