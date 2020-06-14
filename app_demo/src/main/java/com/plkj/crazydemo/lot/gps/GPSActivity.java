package com.plkj.crazydemo.lot.gps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.plkj.crazydemo.R;

import java.util.List;

public class GPSActivity extends AppCompatActivity {
    ListView mProviders;
    LocationManager mLocationManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g_p_s);
        mProviders = (ListView)findViewById(R.id.providers);

        //  首先应获取LocationManager对象
        mLocationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);

        // 获取所有的LocationProvder的名称
        List<String> providerNames = mLocationManager.getAllProviders();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, providerNames);

        mProviders.setAdapter(adapter);
    }
}
