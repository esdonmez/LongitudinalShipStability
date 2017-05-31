package com.esdonmez.esd.longitudinalshipstability;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;

public class LongitudinalStabilityActivity extends AppCompatActivity {

    RelativeLayout introductionButton, lcgButton, lcbButton, lcfButton, actualButton, changeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longitudinal_stability);

        introductionButton = (RelativeLayout) findViewById(R.id.introductionButton);
        lcgButton = (RelativeLayout) findViewById(R.id.lcgButton);
        lcbButton = (RelativeLayout) findViewById(R.id.lcbButton);
        lcfButton = (RelativeLayout) findViewById(R.id.lcfButton);
        actualButton = (RelativeLayout) findViewById(R.id.actualButton);
        changeButton = (RelativeLayout) findViewById(R.id.changeButton);

        introductionButton.setOnClickListener(buttonListener);
        lcgButton.setOnClickListener(buttonListener);
        lcbButton.setOnClickListener(buttonListener);
        lcfButton.setOnClickListener(buttonListener);
        actualButton.setOnClickListener(buttonListener);
        changeButton.setOnClickListener(buttonListener);
    }

    private View.OnClickListener buttonListener = new View.OnClickListener() {
        public void onClick(View v) {
            if (v.getId() == R.id.introductionButton) {
                Intent i = new Intent(LongitudinalStabilityActivity.this, LongitudinalIntroductionActivity.class);
                startActivity(i);
            }
            else if (v.getId() == R.id.lcgButton) {
                Intent i = new Intent(LongitudinalStabilityActivity.this, LCGActivity.class);
                startActivity(i);
            }
            else if (v.getId() == R.id.lcbButton) {
                Intent i = new Intent(LongitudinalStabilityActivity.this, LCBActivity.class);
                startActivity(i);
            }
            else if (v.getId() == R.id.lcfButton) {
                Intent i = new Intent(LongitudinalStabilityActivity.this, LCFActivity.class);
                startActivity(i);
            }
            else if (v.getId() == R.id.actualButton) {
                Intent i = new Intent(LongitudinalStabilityActivity.this, TrimActivity.class);
                startActivity(i);
            }
            else if (v.getId() == R.id.changeButton) {
                Intent i = new Intent(LongitudinalStabilityActivity.this, TrimChangeActivity.class);
                startActivity(i);
            }
        }
    };
}

