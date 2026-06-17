package e.b.o.a.b.d;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.PowerManager;
import android.os.SystemClock;
import e.b.o.a.b.b;

/* loaded from: classes2.dex */
public class a extends b {

    /* renamed from: c, reason: collision with root package name */
    private PowerManager f9710c;

    /* renamed from: d, reason: collision with root package name */
    private BatteryManager f9711d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9712e;

    /* renamed from: f, reason: collision with root package name */
    private int f9713f;

    /* renamed from: g, reason: collision with root package name */
    private int f9714g;
    private float h;
    private long i;

    public a(Context context, e.b.o.a.a.b bVar) {
        super(context, bVar);
        this.f9712e = false;
        this.f9713f = -1;
        this.f9714g = 0;
        this.h = 0.0f;
        this.i = 0L;
        this.f9710c = (PowerManager) context.getSystemService("power");
        this.f9711d = (BatteryManager) this.a.getSystemService("batterymanager");
    }

    private synchronized void e() {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.i;
        if (j == 0 || elapsedRealtime - j >= com.heytap.mcssdk.constant.a.r) {
            this.i = elapsedRealtime;
            Intent registerReceiver = this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver == null) {
                return;
            }
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.f9713f = intExtra;
            if (intExtra != 2) {
                if (intExtra == 5) {
                    BatteryManager batteryManager = this.f9711d;
                    if (batteryManager != null ? batteryManager.isCharging() : false) {
                    }
                }
                z = false;
                this.f9712e = z;
                this.f9714g = registerReceiver.getIntExtra("level", 0);
                this.h = registerReceiver.getIntExtra("temperature", 0) / 10.0f;
            }
            z = true;
            this.f9712e = z;
            this.f9714g = registerReceiver.getIntExtra("level", 0);
            this.h = registerReceiver.getIntExtra("temperature", 0) / 10.0f;
        }
    }

    public int a() {
        e();
        return this.f9714g;
    }

    public float b() {
        e();
        return this.h;
    }

    public boolean c() {
        e();
        return this.f9712e;
    }

    public int d() {
        PowerManager powerManager = this.f9710c;
        if (powerManager != null) {
            return powerManager.isPowerSaveMode() ? 1 : 0;
        }
        return -1;
    }
}
