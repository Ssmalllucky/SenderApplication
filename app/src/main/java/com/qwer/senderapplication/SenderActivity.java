package com.qwer.senderapplication;

import android.app.UiModeManager;
import android.content.Intent;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.view.TextureView;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SenderActivity extends AppCompatActivity implements Switch.OnCheckedChangeListener {

    private Switch mSwSender;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aty_sender);

        mSwSender = findViewById(R.id.sw_sender);
        mSwSender.setOnCheckedChangeListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Intent intent = new Intent("demo.action.RECEIVED_SWITCH_VALUE");
        intent.setPackage("com.qwer.receiverapplication");
        intent.putExtra("key_switch_status", isChecked ? 1 : 0);
        sendBroadcast(intent);

    }
}
