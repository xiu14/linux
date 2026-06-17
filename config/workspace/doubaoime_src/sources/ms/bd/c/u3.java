package ms.bd.c;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class u3 implements SensorEventListener {

    /* renamed from: f, reason: collision with root package name */
    public static volatile u3 f10461f;
    public final SensorManager a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f10462c = 0;

    /* renamed from: d, reason: collision with root package name */
    public float[] f10463d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f10464e = new ArrayList();

    static {
        new DecimalFormat((String) y2.a(16777217, 0, 0L, "51e8de", new byte[]{116, 125, 70}));
        f10461f = null;
    }

    public u3(Context context) {
        this.a = null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            this.a = (SensorManager) applicationContext.getSystemService((String) y2.a(16777217, 0, 0L, "ea9272", new byte[]{103, 102, 68, 85, 7, 55}));
        }
    }

    public static u3 a(Context context) {
        if (f10461f == null) {
            synchronized (u3.class) {
                if (f10461f == null) {
                    f10461f = new u3(context);
                }
            }
        }
        return f10461f;
    }

    public final JSONArray b() {
        JSONArray jSONArray;
        BigDecimal bigDecimal;
        if (n.a() != 1) {
            return null;
        }
        synchronized (this) {
            try {
                SensorManager sensorManager = this.a;
                if (sensorManager != null && (this.b != 0 || this.a.registerListener(this, sensorManager.getDefaultSensor(1), 3))) {
                    this.b++;
                }
            } catch (Exception unused) {
            }
        }
        try {
            try {
                synchronized (this) {
                    int i = 0;
                    while (this.f10462c == 0 && i < 10) {
                        i++;
                        wait(1000L);
                    }
                }
                jSONArray = new JSONArray();
                jSONArray.put(new BigDecimal(this.f10463d[0]).setScale(2, 4));
                jSONArray.put(new BigDecimal(this.f10463d[1]).setScale(2, 4));
                bigDecimal = new BigDecimal(this.f10463d[2]);
            } catch (Exception unused2) {
                jSONArray = new JSONArray();
                jSONArray.put(new BigDecimal(this.f10463d[0]).setScale(2, 4));
                jSONArray.put(new BigDecimal(this.f10463d[1]).setScale(2, 4));
                bigDecimal = new BigDecimal(this.f10463d[2]);
            }
            jSONArray.put(bigDecimal.setScale(2, 4));
            c();
            this.f10462c = 0;
            return jSONArray;
        } catch (Throwable th) {
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(new BigDecimal(this.f10463d[0]).setScale(2, 4));
            jSONArray2.put(new BigDecimal(this.f10463d[1]).setScale(2, 4));
            jSONArray2.put(new BigDecimal(this.f10463d[2]).setScale(2, 4));
            c();
            this.f10462c = 0;
            throw th;
        }
    }

    public final synchronized void c() {
        try {
            SensorManager sensorManager = this.a;
            if (sensorManager != null) {
                int i = this.b - 1;
                this.b = i;
                if (i == 0) {
                    sensorManager.unregisterListener(this);
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.f10463d = sensorEvent.values;
        this.f10462c = 1;
    }
}
