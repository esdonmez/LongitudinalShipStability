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

    RelativeLayout loaButton, lcgButton, lcbButton, lcfButton, actualButton, changeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loaButton = (RelativeLayout) findViewById(R.id.loaButton);
        lcgButton = (RelativeLayout) findViewById(R.id.lcgButton);
        lcbButton = (RelativeLayout) findViewById(R.id.lcbButton);
        lcfButton = (RelativeLayout) findViewById(R.id.lcfButton);
        actualButton = (RelativeLayout) findViewById(R.id.actualButton);
        changeButton = (RelativeLayout) findViewById(R.id.changeButton);

        loaButton.setOnClickListener(buttonListener);
        lcgButton.setOnClickListener(buttonListener);
        lcbButton.setOnClickListener(buttonListener);
        lcfButton.setOnClickListener(buttonListener);
        actualButton.setOnClickListener(buttonListener);
        changeButton.setOnClickListener(buttonListener);
    }

    private View.OnClickListener buttonListener = new View.OnClickListener() {
        public void onClick(View v) {
            if (v.getId() == R.id.loaButton) {
                Intent i = new Intent(MainActivity.this, LOAActivity.class);
                startActivity(i);
            }
            else if (v.getId() == R.id.lcgButton) {
                Intent i = new Intent(MainActivity.this, LCGActivity.class);
                startActivity(i);
            }
            else if (v.getId() == R.id.lcbButton) {
                Intent i = new Intent(MainActivity.this, LCBActivity.class);
                startActivity(i);
            }
            else if (v.getId() == R.id.lcfButton) {
                Intent i = new Intent(MainActivity.this, LCFActivity.class);
                startActivity(i);
            }
            else if (v.getId() == R.id.actualButton) {
                Intent i = new Intent(MainActivity.this, TrimActivity.class);
                startActivity(i);
            }
            else if (v.getId() == R.id.changeButton) {
                Intent i = new Intent(MainActivity.this, TrimChangeActivity.class);
                startActivity(i);
            }
        }
    };
}
