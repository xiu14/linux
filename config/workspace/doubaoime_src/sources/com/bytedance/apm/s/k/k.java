package com.bytedance.apm.s.k;

import android.os.IBinder;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class k extends a<com.bytedance.apm.s.k.m.d> implements com.bytedance.apm.s.i.b {
    public k() {
        super("power");
    }

    private void q(Object[] objArr) {
        com.bytedance.apm.s.k.m.d dVar;
        k();
        if (!com.bytedance.apm.s.a.B().E() || objArr.length > 7 || objArr.length < 4 || objArr[0] == null || !(objArr[0] instanceof IBinder)) {
            return;
        }
        int hashCode = objArr[0].hashCode();
        if (this.f3500e.containsKey(Integer.valueOf(hashCode))) {
            dVar = (com.bytedance.apm.s.k.m.d) this.f3500e.get(Integer.valueOf(hashCode));
            if (dVar == null) {
                return;
            }
        } else {
            dVar = new com.bytedance.apm.s.k.m.d();
            if (objArr[1] == null || !(objArr[1] instanceof Integer)) {
                return;
            }
            dVar.f3522e = ((Integer) objArr[1]).intValue();
            if (objArr[2] == null || !(objArr[2] instanceof String)) {
                return;
            }
            dVar.f3523f = (String) objArr[2];
            dVar.b = -1L;
        }
        dVar.f3520d = Thread.currentThread().getStackTrace();
        dVar.f3519c = Thread.currentThread().getName();
        dVar.a = System.currentTimeMillis();
        this.f3500e.put(Integer.valueOf(hashCode), dVar);
    }

    private void r(Object[] objArr) {
        n();
        if (com.bytedance.apm.s.a.B().E() && objArr.length == 2 && objArr[0] != null && (objArr[0] instanceof IBinder)) {
            int hashCode = objArr[0].hashCode();
            com.bytedance.apm.s.k.m.d dVar = (com.bytedance.apm.s.k.m.d) this.f3500e.get(Integer.valueOf(hashCode));
            if (dVar != null) {
                dVar.b = System.currentTimeMillis();
                this.f3500e.put(Integer.valueOf(hashCode), dVar);
            }
        }
    }

    @Override // com.bytedance.apm.s.i.b
    public String c() {
        return "android.os.IPowerManager";
    }

    @Override // com.bytedance.apm.s.k.l
    public void e(com.bytedance.apm.s.j.b bVar, com.bytedance.apm.w.a aVar) {
        if (h().equals(aVar.f3611d)) {
            if (aVar.i()) {
                bVar.r(aVar.a());
            } else {
                bVar.h(aVar.a());
            }
        }
    }

    @Override // com.bytedance.apm.s.i.b
    public synchronized void invoke(Object obj, Method method, Object[] objArr) {
        try {
            String name = method.getName();
            if ("acquireWakeLock".equals(name)) {
                q(objArr);
            } else if ("releaseWakeLock".equals(name)) {
                r(objArr);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.apm.s.k.a
    protected void o(double d2, double d3) {
        int i = d2 >= ((double) com.bytedance.apm.s.h.a.g()) ? 17 : 0;
        if (d3 >= com.bytedance.apm.s.h.a.f()) {
            i |= 18;
        }
        if (i == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("issue_type", i).put("total_hold_time", d2).put("total_acquire_count", d3);
            ConcurrentHashMap<Integer, T> concurrentHashMap = this.f3500e;
            if (concurrentHashMap != 0 && concurrentHashMap.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = this.f3500e.values().iterator();
                while (it2.hasNext()) {
                    jSONArray.put(((com.bytedance.apm.s.k.m.d) it2.next()).b());
                }
                jSONObject.put("detail", jSONArray);
            }
            com.bytedance.android.input.k.b.a.R0(jSONObject, "battery_trace");
            com.bytedance.apm.data.pipeline.a.k().d(new com.bytedance.apm.v.d.c("battery_trace", jSONObject));
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.apm.s.k.a
    protected void p(com.bytedance.apm.s.k.m.d dVar, long j) {
        com.bytedance.apm.s.k.m.d dVar2 = dVar;
        if (j < com.bytedance.apm.s.h.a.c()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_type", "battery_trace");
            jSONObject.put("issue_type", 16).put("single_hold_time", j).put("wake_lock_info", dVar2.toString());
            com.bytedance.android.input.k.b.a.R0(jSONObject, "battery_trace");
            com.bytedance.apm.data.pipeline.a.k().d(new com.bytedance.apm.v.d.c("battery_trace", jSONObject));
        } catch (JSONException unused) {
        }
    }
}
