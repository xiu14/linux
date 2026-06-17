package com.bytedance.apm.agent.v2.instrumentation;

import android.os.SystemClock;
import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.Map;

@Keep
/* loaded from: classes.dex */
public class BatteryAgent {
    private static final Map<String, a> sExecutedRecord = new HashMap();
    private static ThreadLocal<HashMap<String, b>> sExecutingRecord = new ThreadLocal<>();
    private static boolean hasHook = false;

    public static class a {
        private int a = 0;
        private int b = 0;

        public void b(b bVar) {
            this.a += bVar.f3337d;
            this.b = (int) ((bVar.b - bVar.a) + this.b);
        }

        public int c() {
            return this.b;
        }

        public int d() {
            return this.a;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("MethodExecutedValue{exeCount=");
            M.append(this.a);
            M.append(", cpuCost=");
            return e.a.a.a.a.C(M, this.b, '}');
        }
    }

    public static class b {
        private long a = 0;
        private long b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f3336c = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f3337d = 0;

        public void d() {
            if (this.f3337d == 0) {
                this.a = SystemClock.currentThreadTimeMillis();
            }
            this.f3336c++;
            this.f3337d++;
        }

        public boolean e() {
            int i = this.f3336c - 1;
            this.f3336c = i;
            if (i != 0) {
                return false;
            }
            this.b = SystemClock.currentThreadTimeMillis();
            return true;
        }
    }

    @Keep
    public static void e(String str) {
        b bVar;
        HashMap<String, b> hashMap = sExecutingRecord.get();
        if (hashMap == null || (bVar = hashMap.get(str)) == null || !bVar.e()) {
            return;
        }
        hashMap.remove(str);
        Map<String, a> map = sExecutedRecord;
        synchronized (map) {
            a aVar = map.get(str);
            if (aVar == null) {
                aVar = new a();
                map.put(str, aVar);
            }
            aVar.b(bVar);
        }
    }

    public static Map<String, a> filterResultAndClear(long j) {
        HashMap hashMap = new HashMap();
        Map<String, a> map = sExecutedRecord;
        if (map.isEmpty()) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry<String, a> entry : map.entrySet()) {
                if (entry.getValue().b > j) {
                    hashMap.put(entry.getKey(), entry.getValue());
                }
            }
            sExecutedRecord.clear();
        }
        return hashMap;
    }

    public static boolean hasHook() {
        return hasHook;
    }

    @Keep
    public static void s(String str) {
        hasHook = true;
        HashMap<String, b> hashMap = sExecutingRecord.get();
        if (hashMap == null) {
            hashMap = new HashMap<>();
            sExecutingRecord.set(hashMap);
        }
        b bVar = hashMap.get(str);
        if (bVar == null) {
            bVar = new b();
            hashMap.put(str, bVar);
        }
        bVar.d();
    }
}
