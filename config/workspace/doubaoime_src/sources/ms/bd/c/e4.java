package ms.bd.c;

import android.hardware.Sensor;
import android.hardware.SensorManager;

/* loaded from: classes2.dex */
public abstract class e4 {
    public static String a;
    public static final String b = (String) y2.a(16777217, 0, 0, "4d57c7", new byte[]{100, 99, 75, 83, 72, 57, 118});

    public static String a() {
        String str = a;
        if (str != null) {
            return str;
        }
        SensorManager sensorManager = (SensorManager) m2.b.a.getSystemService((String) y2.a(16777217, 0, 0L, "8c13dc", new byte[]{58, 100, 76, 84, 84, 102}));
        if (sensorManager != null) {
            StringBuilder sb = new StringBuilder();
            Sensor defaultSensor = sensorManager.getDefaultSensor(1);
            if (defaultSensor != null) {
                sb.append(1);
                sb.append((String) y2.a(16777217, 0, 0L, "787709", new byte[]{25}));
                sb.append(defaultSensor.getName());
                sb.append((String) y2.a(16777217, 0, 0L, "a49e83", new byte[]{79}));
                sb.append(defaultSensor.getVendor());
                sb.append((String) y2.a(16777217, 0, 0L, "021aba", new byte[]{61}));
            }
            Sensor defaultSensor2 = sensorManager.getDefaultSensor(5);
            if (defaultSensor2 != null) {
                sb.append(5);
                sb.append((String) y2.a(16777217, 0, 0L, "cba521", new byte[]{77}));
                sb.append(defaultSensor2.getName());
                sb.append((String) y2.a(16777217, 0, 0L, "a8bf1e", new byte[]{79}));
                sb.append(defaultSensor2.getVendor());
                sb.append((String) y2.a(16777217, 0, 0L, "649095", new byte[]{59}));
            }
            Sensor defaultSensor3 = sensorManager.getDefaultSensor(9);
            if (defaultSensor3 != null) {
                sb.append(9);
                sb.append((String) y2.a(16777217, 0, 0L, "09179a", new byte[]{30}));
                sb.append(defaultSensor3.getName());
                sb.append((String) y2.a(16777217, 0, 0L, "9e5a35", new byte[]{23}));
                sb.append(defaultSensor3.getVendor());
            }
            a = sb.toString();
        }
        if (a == null) {
            a = b;
        }
        return a;
    }
}
