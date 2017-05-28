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

public class TrimActivity extends AppCompatActivity {

    RelativeLayout textLayout;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trim);

        textLayout = (RelativeLayout) findViewById(R.id.textLayout);

        GradientDrawable layout =  new GradientDrawable();
        layout.setCornerRadius(25);
        layout.setColor(Color.parseColor("#c1af2532"));

        textLayout.setBackground(layout);

        text = (TextView) findViewById(R.id.trim_string);
        text.setText("Appearent Trim = |da-df|\n" +
                "CORRECTION:\n" +
                "     Aft Correction= Appearent Trim x (la/LBD )\n" +
                "dA = da + Aft Correction\n" +
                "     Fore Correction= Appearent Trim x (lb/LBD)\n" +
                "dF = df  -  Fore Correction\n" +
                "\n" +
                "TRIM:\n" +
                "Actual Trim = |dA-dF|  by stern or fore;\n" +
                "if dA>dF trim is by stern\n" +
                "if dA<dF trim is by fore");
        text.setMovementMethod(new ScrollingMovementMethod());
    }
}
