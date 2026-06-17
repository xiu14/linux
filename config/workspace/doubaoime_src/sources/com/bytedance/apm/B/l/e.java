package com.bytedance.apm.B.l;

import androidx.core.location.LocationRequestCompat;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class e {
    public Map<String, k> a;
    public Map<String, k> b;

    /* renamed from: c, reason: collision with root package name */
    public int f3272c = Math.min(3, 25);

    /* renamed from: d, reason: collision with root package name */
    private int f3273d = 0;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {
        private static final e a = new e();
    }

    public synchronized void a(long j, String str, String str2) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        if (this.b.containsKey(str)) {
            k kVar = this.b.get(str);
            kVar.f3286d++;
            kVar.f3287e = System.currentTimeMillis();
            int i = kVar.f3286d;
            if (i > this.f3273d) {
                this.f3273d = i;
            }
        } else {
            Map<String, k> map = this.a;
            if (map != null) {
                boolean containsKey = map.containsKey(str);
                long j2 = LocationRequestCompat.PASSIVE_INTERVAL;
                String str3 = null;
                if (containsKey) {
                    k kVar2 = this.a.get(str);
                    int i2 = kVar2.f3286d;
                    kVar2.f3286d = i2 + 1;
                    kVar2.f3287e = System.currentTimeMillis();
                    if (i2 > this.f3272c) {
                        this.a.remove(str);
                        if (this.b.size() >= 20) {
                            long currentTimeMillis = 0 + ((System.currentTimeMillis() - 0) / 2);
                            for (Map.Entry<String, k> entry : this.b.entrySet()) {
                                if (entry.getValue().f3287e < currentTimeMillis && entry.getValue().f3286d < j2) {
                                    long j3 = entry.getValue().f3286d;
                                    str3 = entry.getValue().a;
                                    j2 = j3;
                                }
                            }
                            if (str3 != null) {
                                this.b.remove(str3);
                            }
                        }
                        this.b.put(str, kVar2);
                    }
                } else {
                    if (this.a.size() >= 50) {
                        for (Map.Entry<String, k> entry2 : this.a.entrySet()) {
                            if (entry2.getValue().f3287e < j2) {
                                j2 = entry2.getValue().f3287e;
                                str3 = entry2.getValue().a;
                            }
                        }
                        if (str3 != null) {
                            this.a.remove(str3);
                        }
                    }
                    this.a.put(str, new k(str, j, str2));
                }
            } else {
                HashMap hashMap = new HashMap();
                this.a = hashMap;
                hashMap.put(str, new k(str, j, str2));
            }
        }
    }

    public void b() {
        this.f3273d = 0;
        Map<String, k> map = this.a;
        if (map != null) {
            map.clear();
            this.a = null;
        }
        Map<String, k> map2 = this.b;
        if (map2 != null) {
            map2.clear();
            this.b = null;
        }
    }

    public int c() {
        return this.f3273d;
    }
}
