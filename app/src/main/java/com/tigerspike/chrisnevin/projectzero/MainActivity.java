package com.tigerspike.chrisnevin.projectzero;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private CharSequence viewName(View view) {
        switch (view.getId()) {
            case R.id.btnCapstone:
                return "capstone";
            case R.id.btnBuildItBigger:
                return "build it bigger";
            case R.id.btnGoUbiquitous:
                return "go ubiquiotous";
            case R.id.btnMakeYourAppMaterial:
                return "app material";
            case R.id.btnPopularMovies:
                return "popular movies";
            case R.id.btnStockHawk:
                return "stock hawk";
            default:
                return null;
        }
    }

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        // Do something in response to button click
        CharSequence appName = viewName(view);
        if (appName == null) {
            return;
        }

        Context context = getApplicationContext();
        CharSequence text = String.format(getResources().getString(R.string.button_toast_message), appName);
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
