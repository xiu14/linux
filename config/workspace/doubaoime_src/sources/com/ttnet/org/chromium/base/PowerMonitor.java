package com.ttnet.org.chromium.base;

import J.N;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.base.i;

/* loaded from: classes2.dex */
public class PowerMonitor implements i.c {
    private static PowerMonitor b;

    /* renamed from: c, reason: collision with root package name */
    private static i f8554c = new i();

    /* renamed from: d, reason: collision with root package name */
    private static AppStateReceiver f8555d;

    /* renamed from: e, reason: collision with root package name */
    private static String f8556e;

    /* renamed from: f, reason: collision with root package name */
    private static String f8557f;

    /* renamed from: g, reason: collision with root package name */
    private static String f8558g;
    private static String h;
    private static String i;
    private static long j;
    private static long k;
    private static boolean l;
    private boolean a;

    public static class AppStateReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            long currentTimeMillis = System.currentTimeMillis();
            String action = intent.getAction();
            if (action.equals(PowerMonitor.f8556e) || action.equals(PowerMonitor.f8558g)) {
                long j = currentTimeMillis - PowerMonitor.j;
                long unused = PowerMonitor.j = currentTimeMillis;
                if (j > com.heytap.mcssdk.constant.a.q) {
                    N.MyS7kauI();
                    return;
                }
                return;
            }
            if (action.equals(PowerMonitor.f8557f) || action.equals(PowerMonitor.h)) {
                long j2 = currentTimeMillis - PowerMonitor.k;
                long unused2 = PowerMonitor.k = currentTimeMillis;
                if (j2 > com.heytap.mcssdk.constant.a.q) {
                    N.MBffe1lF();
                }
            }
        }
    }

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            PowerMonitor.i(intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED"));
        }
    }

    private PowerMonitor() {
    }

    @CalledByNative
    private static int getCurrentThermalStatus() {
        if (Build.VERSION.SDK_INT < 29) {
            return -1;
        }
        if (b == null) {
            j();
        }
        PowerManager powerManager = (PowerManager) c.b().getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        return powerManager.getCurrentThermalStatus();
    }

    @CalledByNative
    private static int getRemainingBatteryCapacity() {
        if (b == null) {
            j();
        }
        return ((BatteryManager) c.b().getSystemService("batterymanager")).getIntProperty(1);
    }

    static void i(boolean z) {
        b.a = z;
        N.MxETr4iO();
    }

    @CalledByNative
    private static boolean isBatteryPower() {
        if (b == null) {
            j();
        }
        return b.a;
    }

    public static void j() {
        if (b != null) {
            return;
        }
        Context b2 = c.b();
        b = new PowerMonitor();
        Intent d2 = c.d(b2, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (d2 != null) {
            b.a = d2.getIntExtra("plugged", 0) == 0;
            N.MxETr4iO();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        c.d(b2, new a(), intentFilter);
        i = b2.getPackageName();
        f8557f = e.a.a.a.a.J(new StringBuilder(), i, ".cronet.APP_BACKGROUND");
        f8556e = e.a.a.a.a.J(new StringBuilder(), i, ".cronet.APP_FOREGROUND");
        h = e.a.a.a.a.J(new StringBuilder(), i, ".wschannel.APP_BACKGROUND");
        f8558g = e.a.a.a.a.J(new StringBuilder(), i, ".wschannel.APP_FOREGROUND");
        if (f.c(b2) || l) {
            if (b2 instanceof Application) {
                f8554c.d(b);
                ((Application) b2).registerActivityLifecycleCallbacks(f8554c);
                return;
            }
            return;
        }
        f8555d = new AppStateReceiver();
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction(f8557f);
        intentFilter2.addAction(f8556e);
        intentFilter2.addAction(h);
        intentFilter2.addAction(f8558g);
        c.d(b2, f8555d, intentFilter2);
    }

    public static void m(boolean z) {
        l = z;
    }

    public void k() {
        Context b2 = c.b();
        if (f.c(b2)) {
            Intent intent = new Intent();
            intent.setAction(f8557f);
            if (!TextUtils.isEmpty(i)) {
                intent.setPackage(i);
            }
            try {
                b2.sendBroadcast(intent);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        N.MBffe1lF();
    }

    public void l() {
        Context b2 = c.b();
        if (f.c(b2)) {
            Intent intent = new Intent();
            intent.setAction(f8556e);
            if (!TextUtils.isEmpty(i)) {
                intent.setPackage(i);
            }
            try {
                b2.sendBroadcast(intent);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        N.MyS7kauI();
    }
}
