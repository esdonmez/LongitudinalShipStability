package com.esdonmez.esd.longitudinalshipstability;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.RelativeLayout;

public class LCFActivity extends AppCompatActivity {

    RelativeLayout textLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lcf);

        textLayout = (RelativeLayout) findViewById(R.id.textLayout);

        GradientDrawable layout =  new GradientDrawable();
        layout.setCornerRadius(25);
        layout.setColor(Color.parseColor("#c1af2532"));

        textLayout.setBackground(layout);
    }
}
