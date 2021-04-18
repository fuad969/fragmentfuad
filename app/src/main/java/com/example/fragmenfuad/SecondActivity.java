package com.example.fragmenfuad;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Log.v("CREATING", "SECOND ACTIVITY");

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            finish();
            return;
        }
        if (savedInstanceState == null) {
            SecondFragment details = new SecondFragment();
            getFragmentManager().beginTransaction().add(android.R.id.content, details).commit();
        }
    }
}
