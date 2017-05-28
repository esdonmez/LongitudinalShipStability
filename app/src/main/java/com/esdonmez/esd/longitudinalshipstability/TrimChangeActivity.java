package com.esdonmez.esd.longitudinalshipstability;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class TrimChangeActivity extends AppCompatActivity {

    RelativeLayout textLayout;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trim_change);

        textLayout = (RelativeLayout) findViewById(R.id.textLayout);

        GradientDrawable layout =  new GradientDrawable();
        layout.setCornerRadius(25);
        layout.setColor(Color.parseColor("#c1af2532"));

        textLayout.setBackground(layout);

        text = (TextView) findViewById(R.id.change_string);
        text.setText("Trim Change=  (w x d)/ MTC \n" +
                "w: weight of load\n" +
                "d: Distance between LCF and load of midG\n" +
                "MTC: Refers to the value of a moment that has " +
                "made a centimeter trim change to a ship. This " +
                "information can be found in stability books using " +
                "MMM draft value.\n");
        text.setMovementMethod(new ScrollingMovementMethod());
    }
}
