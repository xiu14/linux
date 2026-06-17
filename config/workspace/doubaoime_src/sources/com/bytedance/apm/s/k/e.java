package com.bytedance.apm.s.k;

import android.os.BatteryManager;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* loaded from: classes.dex */
public class e extends b {

    /* renamed from: e, reason: collision with root package name */
    private final BatteryManager f3503e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f3504f;

    /* renamed from: g, reason: collision with root package name */
    private int f3505g;

    @RequiresApi(api = 21)
    public e() {
        super("battery_consume");
        this.f3504f = false;
        this.f3505g = -1;
        this.f3503e = (BatteryManager) com.bytedance.apm.g.h().getSystemService("batterymanager");
    }

    @Override // com.bytedance.apm.s.k.b
    protected void c(boolean z, boolean z2) {
        boolean z3;
        int intProperty;
        if (g()) {
            if (z) {
                try {
                    if (!this.b) {
                        z3 = false;
                        intProperty = this.f3503e.getIntProperty(1);
                        if (!z3 && z2 && this.f3504f) {
                            long abs = Math.abs(intProperty - this.f3505g);
                            Objects.requireNonNull(com.bytedance.apm.s.a.B());
                            h(true, abs, null);
                        }
                        this.f3505g = intProperty;
                        this.f3504f = true;
                    }
                } catch (Throwable th) {
                    if (com.bytedance.apm.g.B()) {
                        StringBuilder M = e.a.a.a.a.M("BatteryConsumeStatsImpl error: ");
                        M.append(th.getCause());
                        com.bytedance.apm.y.d.d("<monitor><battery>", M.toString());
                    }
                    com.bytedance.services.apm.api.a.b("BatteryConsumeStatsImpl");
                    return;
                }
            }
            z3 = true;
            intProperty = this.f3503e.getIntProperty(1);
            if (!z3) {
                long abs2 = Math.abs(intProperty - this.f3505g);
                Objects.requireNonNull(com.bytedance.apm.s.a.B());
                h(true, abs2, null);
            }
            this.f3505g = intProperty;
            this.f3504f = true;
        }
    }

    @Override // com.bytedance.apm.s.k.l
    public void e(com.bytedance.apm.s.j.b bVar, com.bytedance.apm.w.a aVar) {
        bVar.j(aVar.a() / 1000);
    }
}
