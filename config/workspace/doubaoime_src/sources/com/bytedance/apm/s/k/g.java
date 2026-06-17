package com.bytedance.apm.s.k;

import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g extends a<com.bytedance.apm.s.k.m.c> implements com.bytedance.apm.s.i.b {
    private List<String> k;

    public g() {
        super("location");
        this.k = new ArrayList();
    }

    private void q(Object[] objArr) {
        com.bytedance.apm.s.k.m.c cVar;
        if (objArr[0] != null) {
            int hashCode = objArr[0].hashCode();
            String valueOf = String.valueOf(hashCode);
            if (this.k.contains(valueOf)) {
                n();
                this.k.remove(valueOf);
            }
            if (!com.bytedance.apm.s.a.B().E() || (cVar = (com.bytedance.apm.s.k.m.c) this.f3500e.get(Integer.valueOf(hashCode))) == null) {
                return;
            }
            cVar.b = System.currentTimeMillis();
            this.f3500e.put(Integer.valueOf(hashCode), cVar);
        }
    }

    private void r(int i, String str) {
        String valueOf = String.valueOf(i);
        if (!this.k.contains(valueOf)) {
            k();
            this.k.add(valueOf);
        }
        if (com.bytedance.apm.s.a.B().E()) {
            com.bytedance.apm.s.k.m.c cVar = (com.bytedance.apm.s.k.m.c) this.f3500e.get(Integer.valueOf(i));
            if (cVar == null) {
                cVar = new com.bytedance.apm.s.k.m.c();
                cVar.f3521e = str;
            }
            cVar.a = System.currentTimeMillis();
            cVar.b = -1L;
            cVar.f3520d = Thread.currentThread().getStackTrace();
            cVar.f3519c = Thread.currentThread().getName();
            this.f3500e.put(Integer.valueOf(i), cVar);
        }
    }

    @Override // com.bytedance.apm.s.i.b
    public String c() {
        return "android.location.ILocationManager";
    }

    @Override // com.bytedance.apm.s.k.l
    public void e(com.bytedance.apm.s.j.b bVar, com.bytedance.apm.w.a aVar) {
        if (h().equals(aVar.f3611d)) {
            if (aVar.i()) {
                bVar.n(aVar.a());
            } else {
                bVar.d(aVar.a());
            }
        }
    }

    @Override // com.bytedance.apm.s.i.b
    public void invoke(Object obj, Method method, Object[] objArr) {
        try {
            String name = method.getName();
            if (TextUtils.equals(name, "requestLocationUpdates")) {
                if (objArr[0] != null && objArr[1] != null) {
                    r(objArr[1].hashCode(), objArr[0].toString());
                }
            } else if (TextUtils.equals(name, "registerLocationListener")) {
                if (objArr[1] != null && objArr[2] != null) {
                    r(objArr[2].hashCode(), objArr[1].toString());
                }
            } else if (TextUtils.equals(name, "removeUpdates") || TextUtils.equals(name, "unregisterLocationListener")) {
                q(objArr);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.apm.s.k.a
    void o(double d2, double d3) {
        int i = d2 >= ((double) com.bytedance.apm.s.h.a.e()) ? 33 : 0;
        if (d3 >= com.bytedance.apm.s.h.a.d()) {
            i |= 34;
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
                    jSONArray.put(((com.bytedance.apm.s.k.m.c) it2.next()).b());
                }
                jSONObject.put("detail", jSONArray);
            }
            com.bytedance.android.input.k.b.a.R0(jSONObject, "battery_trace");
            com.bytedance.apm.data.pipeline.a.k().d(new com.bytedance.apm.v.d.c("battery_trace", jSONObject));
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.apm.s.k.a
    protected void p(com.bytedance.apm.s.k.m.c cVar, long j) {
        com.bytedance.apm.s.k.m.c cVar2 = cVar;
        if (j < com.bytedance.apm.s.h.a.b()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("issue_type", 32).put("single_hold_time", j);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(cVar2.b());
            jSONObject.put("detail", jSONArray);
            com.bytedance.android.input.k.b.a.R0(jSONObject, "battery_trace");
            com.bytedance.apm.data.pipeline.a.k().d(new com.bytedance.apm.v.d.c("battery_trace", jSONObject));
        } catch (Throwable unused) {
        }
    }
}
