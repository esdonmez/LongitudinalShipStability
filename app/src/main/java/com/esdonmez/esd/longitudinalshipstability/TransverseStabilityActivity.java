package com.esdonmez.esd.longitudinalshipstability;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;

public class TransverseStabilityActivity extends AppCompatActivity {

    RelativeLayout introductionButton, buoyancyBotton, gravityButton, kgButton, heightButton, armButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transverse_stability);

        introductionButton = (RelativeLayout) findViewById(R.id.introductionButton);
        buoyancyBotton = (RelativeLayout) findViewById(R.id.buoyancyButton);
        gravityButton = (RelativeLayout) findViewById(R.id.gravityButton);
        kgButton = (RelativeLayout) findViewById(R.id.kgButton);
        heightButton = (RelativeLayout) findViewById(R.id.heightButton);
        armButton = (RelativeLayout) findViewById(R.id.armButton);

        introductionButton.setOnClickListener(buttonListener);
        buoyancyBotton.setOnClickListener(buttonListener);
        gravityButton.setOnClickListener(buttonListener);
        kgButton.setOnClickListener(buttonListener);
        heightButton.setOnClickListener(buttonListener);
        armButton.setOnClickListener(buttonListener);
    }

    private View.OnClickListener buttonListener = new View.OnClickListener() {
        public void onClick(View v) {
            if (v.getId() == R.id.introductionButton) {
                Intent i = new Intent(TransverseStabilityActivity.this, TransverseStabilityIntroductionActivity.class);
                startActivity(i);
            }
            else if (v.getId() == R.id.buoyancyButton) {
                Intent i = new Intent(TransverseStabilityActivity.this, CenterOfBuoyancyActivity.class);
                startActivity(i);
            }
            else if (v.getId() == R.id.gravityButton) {
                Intent i = new Intent(TransverseStabilityActivity.this, CenterOfGravityActivity.class);
                startActivity(i);
            }
            else if (v.getId() == R.id.kgButton) {
                Intent i = new Intent(TransverseStabilityActivity.this, KGKBActivity.class);
                startActivity(i);
            }
            else if (v.getId() == R.id.heightButton) {
                Intent i = new Intent(TransverseStabilityActivity.this, MetacentreMetacentricHeightActivity.class);
                startActivity(i);
            }
            else if (v.getId() == R.id.armButton) {
                Intent i = new Intent(TransverseStabilityActivity.this, RightingArmActivity.class);
                startActivity(i);
            }
        }
    };
}
