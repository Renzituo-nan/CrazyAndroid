package com.plkj.studysample.socket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.plkj.studysample.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.Socket;

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
