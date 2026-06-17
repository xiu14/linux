package com.ss.android.d.e;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a implements SensorEventListener {
    private final Context a;

    public a(Context context) {
        l.f(context, "context");
        this.a = context;
        Object systemService = context.getSystemService("sensor");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService;
        sensorManager.registerListener(this, sensorManager.getDefaultSensor(1), 3);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        Sensor sensor;
        if ((sensorEvent == null || (sensor = sensorEvent.sensor) == null || sensor.getType() != 1) ? false : true) {
            float[] fArr = sensorEvent.values;
            float f2 = fArr[0];
            float f3 = fArr[1];
            float f4 = fArr[2];
            if (((float) Math.sqrt((f4 * f4) + (f3 * f3) + (f2 * f2))) > 15.0f) {
                com.ss.android.d.d.a a = com.ss.android.d.a.a.a();
                if (a != null ? a.f(this.a) : false) {
                    Log.d("AnyDoorShakeProxy", "shaking, switch on");
                    com.ss.android.d.d.a a2 = com.ss.android.d.a.a.a();
                    if (a2 == null) {
                        return;
                    }
                    a2.d(this.a, true);
                }
            }
        }
    }
}
