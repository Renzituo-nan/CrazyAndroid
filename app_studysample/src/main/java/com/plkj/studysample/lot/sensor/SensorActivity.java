package com.plkj.studysample.lot.sensor;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import com.plkj.studysample.R;

/**
 * 传感器的应用
 */
public class SensorActivity extends AppCompatActivity implements SensorEventListener {

    private TextView tvSensor;
    private SensorManager mSensorManager;
    private float[] gravity = new float[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motion_sensor);
        tvSensor = findViewById(R.id.tvSensor);

        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
    switch (event.sensor.getType()){
        case Sensor.TYPE_ACCELEROMETER:
//           float x= event.values[0];//X轴上的加速度
//            float y= event.values[1];//Y轴上的加速度
//            float z= event.values[2];//Z轴上的加速度
            /**
             * 加速度受到重力加速度的影响，需要进行一定的调整
             */
            final float alpha = (float) 0.8;
            gravity[0] = alpha * gravity[0] + (1 - alpha) * event.values[0];
            gravity[1] = alpha * gravity[1] + (1 - alpha) * event.values[1];
            gravity[2] = alpha * gravity[2] + (1 - alpha) * event.values[2];

            String accelerometer = "加速度\n" + "X:" + (event.values[0] - gravity[0])
                    +"\n"+ "Y:" + (event.values[1] - gravity[1])+"\n"+ "Z:" + (event.values[2] - gravity[2]);
            tvSensor.setText(accelerometer);
            break;
        case Sensor.TYPE_GRAVITY:
            gravity[0] = event.values[0];
            gravity[1] = event.values[1];
            gravity[2] = event.values[2];
            break;
        default:
            break;
    }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    @Override
    protected void onResume() {
        super.onResume();
        //注册传感器
        mSensorManager.registerListener(this,
                mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
                SensorManager.SENSOR_DELAY_GAME);//加速度传感器
        mSensorManager.registerListener(this,
                mSensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY),
                SensorManager.SENSOR_DELAY_FASTEST);//重力传感器
    }

    @Override
    protected void onPause() {
        super.onPause();
        //注销传感器
        mSensorManager.unregisterListener(this);
    }
}
