package com.plkj.crazydemo.socket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.plkj.crazydemo.R;

public class SocketActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "SocketActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socket);

        View btnSocket = findViewById(R.id.btnSocketDemo);

        btnSocket.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnSocketDemo:
                new ClientDemo().toConnectSocketServerDemo();
                break;
            default:
                break;
        }
    }

}
