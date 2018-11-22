package com.example.sarth.smartmirrorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class GuestActivity extends AppCompatActivity {

    private final static String TAG = "Logcat";

    private Button button_request;
    private Button button_search;
    private TextView text_request;
    private TextView text_search;
    private ImageButton button_upload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);

        button_request= findViewById(R.id.GuestRequestButton);
        button_search = findViewById(R.id.GuestSearchButton);

        text_request= findViewById(R.id.GuestRequestContentView);
        text_search= findViewById(R.id.GuestSearchContentView);

        text_request.setText("You have" + "pending posters.");
        text_search.setText("Your have" + "posters.");

        //layout to be confirmed
        /*
        button_request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GuestToRequest = new Intent(GuestActivity.this, RequestsActivity.class);
                Log.i(TAG,"Moving to Request page");
                startActivity(GuestToRequest);
            }
        });

        button_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent GuestToFilter = new Intent(GuestActivity.this,FilterActivity.class);
                Log.i(TAG,"Moving to Search page");
                startActivity(GuestToFilter);
            }
        });
        */

        button_upload = findViewById(R.id.GuestUploadButton);
        button_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent GuestToUpload = new Intent(GuestActivity.this,UploadActivity.class);
                Log.i(TAG,"Moving to upload page");
                startActivity(GuestToUpload);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (id == R.id.logout){
            Intent Logout = new Intent(GuestActivity.this,MainActivity.class);
            Log.i(TAG,"Moving to Login page");
            Toast.makeText(this, "Logout Successful", Toast.LENGTH_SHORT).show();
            startActivity(Logout);
        }

        return super.onOptionsItemSelected(item);
    }
}