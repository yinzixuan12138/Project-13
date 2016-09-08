package com.example.yinzixuan.project_13;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle icicle) {

        super.onCreate(icicle);

        int mCurrentOrientation = getResources().getConfiguration().orientation;

        if ( mCurrentOrientation == Configuration.ORIENTATION_PORTRAIT ) {

            // If current screen is portrait

            Log.i("info", "portrait"); // 竖屏

            setContentView(R.layout.layout_port);

        } else if ( mCurrentOrientation == Configuration.ORIENTATION_LANDSCAPE ) {

            //If current screen is landscape

            Log.i("info", "landscape"); // 横屏

            setContentView(R.layout.layout_land);

        }


    }
}
