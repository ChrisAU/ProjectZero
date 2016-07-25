package com.tigerspike.chrisnevin.projectzero;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        // Do something in response to button click
        CharSequence text = "";

        switch (view.getId()) {
            case R.id.btnCapstone:
                text = "This button will launch my capstone app";
                break;
            case R.id.btnBuildItBigger:
                text = "This button will launch my build it bigger app";
                break;
            case R.id.btnGoUbiquitous:
                text = "This button will launch my go ubiquitous app";
                break;
            case R.id.btnMakeYourAppMaterial:
                text = "This button will launch my make your app material app";
                break;
            case R.id.btnPopularMovies:
                text = "This button will launch my popular movies app";
                break;
            case R.id.btnStockHawk:
                text = "This button will launch my stock hawk app";
                break;
        }
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
