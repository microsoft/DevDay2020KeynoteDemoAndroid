package com.microsoft.device.display.sample.groupchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void replyNewActivityClick(View view) {
        CheckBox checkBox_FLAG_ACTIVITY_LAUNCH_ADJACENT = findViewById(R.id.checkBoxFLAG_ACTIVITY_LAUNCH_ADJACENT);


        //Intent intent = new Intent(this, EmptySampleActivity.class);
        Intent intent = new Intent(this, ReplyActivity.class);
        if (checkBox_FLAG_ACTIVITY_LAUNCH_ADJACENT.isChecked()) {
            intent.addFlags(Intent.FLAG_ACTIVITY_LAUNCH_ADJACENT);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        }

        startActivity(intent);
    }
}
