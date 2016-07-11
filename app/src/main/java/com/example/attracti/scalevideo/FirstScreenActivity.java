package com.example.attracti.scalevideo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Iryna on 7/11/16.
 * <p>
 * In this class user enters RTSP URL
 */


public class FirstScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_screen);

        Button mButton = (Button) findViewById(R.id.button);
        final EditText mEdit = (EditText) findViewById(R.id.edittext);

        mButton.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        if (mEdit.getText().toString() != null) {
                            Intent nextScreen = new Intent(getApplicationContext(), MainActivity.class);
                            nextScreen.putExtra("rtsp", mEdit.getText().toString());
                            startActivity(nextScreen);
                        } else {
                            Toast.makeText(getApplicationContext(), "Please enter RTSP URL", Toast.LENGTH_LONG).show();
                        }
                    }
                });

    }
}
