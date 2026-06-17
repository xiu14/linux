package com.bytedance.apm.s.k;

import android.app.usage.NetworkStatsManager;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public class i extends b {

    /* renamed from: e, reason: collision with root package name */
    private long[] f3510e;

    /* renamed from: f, reason: collision with root package name */
    private Method f3511f;

    /* renamed from: g, reason: collision with root package name */
    private Object f3512g;
    private boolean h;

    public i() {
        super("traffic_all_interface");
        this.h = false;
    }

    @RequiresApi(api = 23)
    private long[] i() throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        if (this.f3511f == null) {
            NetworkStatsManager networkStatsManager = (NetworkStatsManager) com.bytedance.apm.g.h().getSystemService("netstats");
            Field declaredField = networkStatsManager.getClass().getDeclaredField("mService");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(networkStatsManager);
            this.f3512g = obj;
            Method[] declaredMethods = obj.getClass().getDeclaredMethods();
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method = declaredMethods[i];
                if (TextUtils.equals("getDataLayerSnapshotForUid", method.getName())) {
                    this.f3511f = method;
                    method.setAccessible(true);
                    break;
                }
                i++;
            }
        }
        Object invoke = this.f3511f.invoke(this.f3512g, Integer.valueOf(Process.myUid()));
        Field declaredField2 = invoke.getClass().getDeclaredField("rxBytes");
        declaredField2.setAccessible(true);
        long[] jArr = (long[]) declaredField2.get(invoke);
        Field declaredField3 = invoke.getClass().getDeclaredField("txBytes");
        declaredField3.setAccessible(true);
        long[] jArr2 = (long[]) declaredField3.get(invoke);
        Field declaredField4 = invoke.getClass().getDeclaredField("rxPackets");
        declaredField4.setAccessible(true);
        long[] jArr3 = (long[]) declaredField4.get(invoke);
        Field declaredField5 = invoke.getClass().getDeclaredField("txPackets");
        declaredField5.setAccessible(true);
        return new long[]{k(jArr) + k(jArr2), k(jArr3) + k((long[]) declaredField5.get(invoke))};
    }

    private void j(boolean z, long j, String str, String str2) {
        if (j >= 0) {
            com.bytedance.apm.s.j.a.g().i(new com.bytedance.apm.w.a(z, System.currentTimeMillis(), "traffic_all_interface", this.b, j, null, str));
            return;
        }
        if (com.bytedance.apm.g.B()) {
            com.bytedance.apm.y.d.d("<monitor><battery>", e.a.a.a.a.n("BatteryTrafficAllInterface value error: ", j));
        }
        com.bytedance.apm.y.a.b("APM-Battery", "BatteryTrafficAllInterface value error: " + j);
    }

    private long k(long[] jArr) {
        long j = 0;
        if (jArr != null && jArr.length != 0) {
            for (long j2 : jArr) {
                j += j2;
            }
        }
        return j;
    }

    @Override // com.bytedance.apm.s.k.b
    protected void c(boolean z, boolean z2) {
        if (g()) {
            try {
                long[] i = i();
                if (this.f3510e != null && z2) {
                    Objects.requireNonNull(com.bytedance.apm.s.a.B());
                    j(z, i[0] - this.f3510e[0], "source_bytes", null);
                    j(z, i[1] - this.f3510e[1], "source_packets", null);
                }
                this.f3510e = i;
            } catch (Throwable th) {
                if (com.bytedance.apm.g.B()) {
                    StringBuilder M = e.a.a.a.a.M("handleTrafficMonitor error: ");
                    M.append(th.getCause());
                    com.bytedance.apm.y.d.d("<monitor><battery>", M.toString());
                }
                if (this.h) {
                    return;
                }
                com.bytedance.services.apm.api.a.e(th, "BatteryTrafficAllInterface");
                this.h = true;
            }
        }
    }

    @Override // com.bytedance.apm.s.k.l
    public void e(com.bytedance.apm.s.j.b bVar, com.bytedance.apm.w.a aVar) {
        if (aVar.i()) {
            if (TextUtils.equals(aVar.e(), "source_bytes")) {
                bVar.k(aVar.a());
                return;
            } else {
                if (TextUtils.equals(aVar.e(), "source_packets")) {
                    bVar.o(aVar.a());
                    return;
                }
                return;
            }
        }
        if (TextUtils.equals(aVar.e(), "source_bytes")) {
            bVar.a(aVar.a());
        } else if (TextUtils.equals(aVar.e(), "source_packets")) {
            bVar.e(aVar.a());
        }
    }
}
