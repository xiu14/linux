package e.j.b;

import android.content.Context;
import android.content.IntentFilter;
import android.os.BatteryManager;

/* loaded from: classes2.dex */
public class b {
    private static BatteryManager a;

    static {
        new IntentFilter("android.intent.action.BATTERY_CHANGED");
    }

    public static float a(Context context) {
        if (context == null) {
            return -1.0f;
        }
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = (BatteryManager) context.getSystemService("batterymanager");
                }
            }
        }
        BatteryManager batteryManager = a;
        if (batteryManager == null) {
            return -1.0f;
        }
        float longProperty = batteryManager.getLongProperty(2);
        if (longProperty < -1.0E7f || longProperty > 1.0E7f) {
            return -1.0f;
        }
        if (!c.c() && !c.b()) {
            return (!c.a() || longProperty > 10000.0f) ? longProperty / 1000.0f : longProperty;
        }
        if (longProperty < -10000.0f) {
            longProperty /= 1000.0f;
        }
        return -longProperty;
    }
}
