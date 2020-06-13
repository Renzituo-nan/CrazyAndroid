package com.plkj.studysample;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.plkj.studysample.socket.SocketActivity;

import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

import androidx.appcompat.app.AppCompatActivity;

@Route(path = "/studySample/main")
public class StudySampleMainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_study);
        View btnSocket = findViewById(R.id.btnSocket);

        btnSocket.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSocket:
                startActivity(new Intent(StudySampleMainActivity.this, SocketActivity.class));
                break;
            default:
                break;
        }
    }
}
