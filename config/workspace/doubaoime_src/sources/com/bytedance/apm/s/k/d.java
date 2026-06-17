package com.bytedance.apm.s.k;

import android.app.PendingIntent;
import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends c<com.bytedance.apm.s.k.m.a> implements com.bytedance.apm.s.i.b {

    /* renamed from: f, reason: collision with root package name */
    private int[] f3501f;

    /* renamed from: g, reason: collision with root package name */
    private int f3502g;
    private List<Long> h;
    private int i;
    private final Object j;
    private final List<Long> k;

    public d() {
        super(NotificationCompat.CATEGORY_ALARM);
        this.h = new ArrayList();
        this.j = new Object();
        this.k = new ArrayList();
    }

    private void j(Object[] objArr) {
        int hashCode = (objArr[0] == null || !(objArr[0] instanceof PendingIntent)) ? -1 : objArr[0].hashCode();
        com.bytedance.apm.s.k.m.a aVar = (com.bytedance.apm.s.k.m.a) this.f3500e.get(Integer.valueOf(hashCode));
        if (aVar == null || aVar.f3517f <= 0) {
            return;
        }
        aVar.b = System.currentTimeMillis();
        this.f3500e.put(Integer.valueOf(hashCode), aVar);
    }

    private void k(Object[] objArr) {
        com.bytedance.apm.s.k.m.a aVar = new com.bytedance.apm.s.k.m.a();
        int i = -1;
        boolean z = false;
        int i2 = 0;
        for (Object obj : objArr) {
            if ((obj instanceof Integer) && !z) {
                aVar.f3516e = ((Integer) obj).intValue();
                z = true;
            } else if (obj instanceof Long) {
                if (i2 == 0) {
                    long longValue = ((Long) obj).longValue();
                    aVar.a = longValue;
                    int i3 = aVar.f3516e;
                    if (i3 != 1 && i3 != 0) {
                        longValue = (System.currentTimeMillis() + longValue) - SystemClock.elapsedRealtime();
                    }
                    aVar.a = longValue;
                } else if (i2 == 2) {
                    aVar.f3517f = ((Long) obj).longValue();
                }
                i2++;
            } else if (obj instanceof PendingIntent) {
                aVar.f3518g = "";
                i = ((PendingIntent) obj).hashCode();
            }
        }
        if (i != -1) {
            aVar.b = aVar.f3517f == 0 ? aVar.a : -1L;
            if (com.bytedance.apm.s.a.B().E()) {
                aVar.f3519c = Thread.currentThread().getName();
                aVar.f3520d = Thread.currentThread().getStackTrace();
            }
            this.f3500e.put(Integer.valueOf(i), aVar);
        }
    }

    @Override // com.bytedance.apm.s.k.l
    public void b(boolean z) {
        this.f3498c = false;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.j) {
            this.h.add(Long.valueOf(currentTimeMillis));
        }
    }

    @Override // com.bytedance.apm.s.i.b
    public String c() {
        return "android.app.IAlarmManager";
    }

    @Override // com.bytedance.apm.s.k.l
    public void d(boolean z, boolean z2) {
        this.f3499d = z;
    }

    @Override // com.bytedance.apm.s.k.l
    public void e(com.bytedance.apm.s.j.b bVar, com.bytedance.apm.w.a aVar) {
        if (h().equals(aVar.f3611d)) {
            if (aVar.h()) {
                bVar.i(aVar.a());
            } else {
                bVar.s(aVar.a());
            }
        }
    }

    @Override // com.bytedance.apm.s.k.l
    public void f(boolean z) {
        this.f3498c = true;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.j) {
            this.h.add(Long.valueOf(currentTimeMillis));
        }
    }

    @Override // com.bytedance.apm.s.k.c
    protected void g(com.bytedance.apm.s.k.m.a aVar, long j, long j2) {
        int i;
        com.bytedance.apm.s.k.m.a aVar2 = aVar;
        long j3 = aVar2.f3517f;
        boolean z = true;
        if (j3 <= 0) {
            long j4 = aVar2.a;
            if (j > j4 || j4 > j2) {
                return;
            } else {
                i = 1;
            }
        } else {
            long j5 = aVar2.a;
            if (j5 < j) {
                j5 = (j + j3) - ((j - j5) % j3);
            }
            long j6 = aVar2.b;
            if (j6 <= j2 && j6 > 0) {
                j2 = j6;
            }
            long j7 = j2 - j5;
            if (j7 <= 0) {
                return;
            } else {
                i = ((int) (j7 / j3)) + 1;
            }
        }
        int i2 = aVar2.f3516e;
        if (i2 != 2 && i2 != 0) {
            z = false;
        }
        if (!z) {
            this.f3502g += i;
            return;
        }
        int[] iArr = this.f3501f;
        int i3 = this.i % 2;
        iArr[i3] = iArr[i3] + i;
    }

    @Override // com.bytedance.apm.s.k.c
    protected void i(long j, long j2, boolean z) {
        this.f3502g = 0;
        this.f3501f = new int[2];
        this.k.add(Long.valueOf(j));
        synchronized (this.j) {
            this.k.addAll(this.h);
            this.h.clear();
        }
        this.k.add(Long.valueOf(j2));
        this.i = 1;
        while (this.i < this.k.size()) {
            super.i(this.k.get(this.i - 1).longValue(), this.k.get(this.i).longValue(), z);
            this.i++;
        }
        int[] iArr = this.f3501f;
        if (iArr[0] + iArr[1] != 0) {
            int size = this.k.size();
            long currentTimeMillis = System.currentTimeMillis();
            if (!(this.f3498c && size % 2 == 0) && (this.f3498c || size % 2 != 1)) {
                com.bytedance.apm.s.j.a.g().i(new com.bytedance.apm.w.a(true, currentTimeMillis, h(), this.f3499d, iArr[0], null));
                com.bytedance.apm.s.j.a.g().i(new com.bytedance.apm.w.a(false, currentTimeMillis, h(), this.f3499d, iArr[1], null));
            } else {
                com.bytedance.apm.s.j.a.g().i(new com.bytedance.apm.w.a(false, currentTimeMillis, h(), this.f3499d, iArr[0], null));
                com.bytedance.apm.s.j.a.g().i(new com.bytedance.apm.w.a(true, currentTimeMillis, h(), this.f3499d, iArr[1], null));
            }
        }
        this.k.clear();
        long currentTimeMillis2 = System.currentTimeMillis();
        int[] iArr2 = this.f3501f;
        double d2 = ((iArr2[0] + iArr2[1]) / (currentTimeMillis2 - this.b)) * 60000.0d * 10.0d;
        double d3 = (this.f3502g / (currentTimeMillis2 - this.b)) * 60000.0d * 10.0d;
        int i = d2 >= ((double) com.bytedance.apm.s.h.a.h()) ? 49 : 0;
        if (d3 >= com.bytedance.apm.s.h.a.a()) {
            i |= 50;
        }
        if (i == 0) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("issue_type", i).put("wake_up_count", d2).put("normal_count", d3);
            ConcurrentHashMap<Integer, T> concurrentHashMap = this.f3500e;
            if (concurrentHashMap != 0 && concurrentHashMap.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = this.f3500e.values().iterator();
                while (it2.hasNext()) {
                    jSONArray.put(((com.bytedance.apm.s.k.m.a) it2.next()).b());
                }
                jSONObject.put("detail", jSONArray);
            }
            com.bytedance.android.input.k.b.a.R0(jSONObject, "battery_trace");
            com.bytedance.apm.data.pipeline.a.k().d(new com.bytedance.apm.v.d.c("battery_trace", jSONObject));
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.apm.s.i.b
    public void invoke(Object obj, Method method, Object[] objArr) {
        try {
            String name = method.getName();
            if ("set".equals(name)) {
                k(objArr);
            } else if ("remove".equals(name)) {
                j(objArr);
            }
        } catch (Exception unused) {
        }
    }
}
