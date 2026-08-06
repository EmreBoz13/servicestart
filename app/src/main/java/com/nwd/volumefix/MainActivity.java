package com.nwd.volumefix;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.content.ComponentName;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle b) {
        super.onCreate(b);

        Button button = new Button(this);
        button.setText("SES BARINI AÇ");

        button.setOnClickListener(v -> {
            try {
                Intent i = new Intent();
                i.setComponent(new ComponentName(
                    "com.android.launcher",
                    "com.launcher.FloatBar"
                ));

                startService(i);

                Toast.makeText(
                    this,
                    "Ses barı komutu gönderildi",
                    Toast.LENGTH_SHORT
                ).show();

            } catch (Exception e) {
                Toast.makeText(
                    this,
                    e.toString(),
                    Toast.LENGTH_LONG
                ).show();
            }
        });

        setContentView(button);
    }
}
