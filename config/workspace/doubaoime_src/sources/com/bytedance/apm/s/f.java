package com.bytedance.apm.s;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.crash.dumper.Scraps;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f extends com.bytedance.apm.B.a {

    /* renamed from: g, reason: collision with root package name */
    private BroadcastReceiver f3477g;
    private IntentFilter h;
    private boolean i;
    private boolean k;
    private long m;
    private boolean j = false;
    private int l = 60;

    class a extends BroadcastReceiver {

        /* renamed from: com.bytedance.apm.s.f$a$a, reason: collision with other inner class name */
        class RunnableC0122a implements Runnable {
            final /* synthetic */ float a;
            final /* synthetic */ float b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f3478c;

            RunnableC0122a(float f2, float f3, String str) {
                this.a = f2;
                this.b = f3;
                this.f3478c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("battery_temperature", this.a);
                    jSONObject.put("remaining_energy", this.b);
                    if (f.this.j) {
                        Objects.requireNonNull(f.this);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("scene", TextUtils.isEmpty(this.f3478c) ? "background" : this.f3478c);
                        com.bytedance.apm.v.d.d dVar = new com.bytedance.apm.v.d.d("temperature", "", jSONObject, jSONObject2, null);
                        com.bytedance.android.input.k.b.a.Q0(dVar, false);
                        com.bytedance.apm.data.pipeline.a.k().d(dVar);
                    }
                    if (f.this.k) {
                        com.bytedance.apm.y.a.b("APM-BatteryLocal", jSONObject.toString());
                    }
                } catch (Exception unused) {
                }
            }
        }

        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - f.this.m > ((long) (f.this.l * 1000))) {
                if (f.this.j || f.this.k) {
                    f.this.m = elapsedRealtime;
                    com.bytedance.apm.F.b.e().h(new RunnableC0122a(intent.getIntExtra("temperature", 0) / 10.0f, (intent.getIntExtra("level", 0) * 100.0f) / intent.getIntExtra("scale", 100), ActivityLifeObserver.getInstance().getTopActivityClassName()));
                }
            }
        }
    }

    private static final class b {
        private static final f a = new f();
    }

    public f() {
        this.f3229e = Scraps.BATTERY;
    }

    public static f q() {
        return b.a;
    }

    private void s() {
        if (this.i) {
            return;
        }
        try {
            com.bytedance.apm.g.h().registerReceiver(this.f3477g, this.h);
            this.i = true;
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.apm.B.a
    protected void b(JSONObject jSONObject) {
        this.j = jSONObject.optInt("temperature_enable_upload", 0) == 1;
        this.l = jSONObject.optInt("temperature_upload_interval", 60);
        if (this.j || this.k) {
            return;
        }
        ActivityLifeObserver.getInstance().unregister(this);
        if (this.i) {
            try {
                com.bytedance.apm.g.h().unregisterReceiver(this.f3477g);
                this.i = false;
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.apm.B.a
    protected boolean e() {
        return false;
    }

    @Override // com.bytedance.apm.B.a
    protected void f() {
        this.f3477g = new a();
        this.h = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        s();
    }

    @Override // com.bytedance.apm.B.a
    protected long k() {
        return 0L;
    }

    @Override // com.bytedance.apm.B.a, com.bytedance.services.apm.api.d
    public void onBackground(Activity activity) {
        super.onBackground(activity);
        if (this.i) {
            try {
                com.bytedance.apm.g.h().unregisterReceiver(this.f3477g);
                this.i = false;
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.apm.B.a, com.bytedance.services.apm.api.d
    public void onFront(Activity activity) {
        super.onFront(activity);
        s();
    }

    public void r(boolean z) {
        this.k = z;
        c();
    }
}
