package com.bytedance.common.b;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* loaded from: classes.dex */
public interface a {
    Sensor a(SensorManager sensorManager, int i);

    boolean b(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i);

    void c(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor);
}
