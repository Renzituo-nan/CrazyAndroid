package com.plkj.crazydemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.plkj.crazydemo.R;
import com.plkj.crazydemo.socket.SocketActivity;

import androidx.appcompat.app.AppCompatActivity;

@Route(path = "/CrazyDemo/MainActivity")
public class DemoMainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_demo);
        View btnSocket = findViewById(R.id.btnSocket);
        btnSocket.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSocket:
                startActivity(new Intent(DemoMainActivity.this, SocketActivity.class));
                break;
            default:
                break;
        }
    }
}
