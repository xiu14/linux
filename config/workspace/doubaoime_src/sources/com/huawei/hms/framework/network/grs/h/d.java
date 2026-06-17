package com.huawei.hms.framework.network.grs.h;

import android.os.SystemClock;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class d {
    private static final Map<String, a> a = new ConcurrentHashMap(16);

    public static class a {
        private final long a;
        private final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public boolean a() {
            return SystemClock.elapsedRealtime() - this.b <= this.a;
        }
    }

    public static a a(String str) {
        StringBuilder M = e.a.a.a.a.M("map size of get is before: ");
        Map<String, a> map = a;
        M.append(map.size());
        Logger.v("RequestUtil", M.toString());
        a aVar = map.get(str);
        StringBuilder M2 = e.a.a.a.a.M("map size of get is after: ");
        M2.append(map.size());
        Logger.v("RequestUtil", M2.toString());
        return aVar;
    }

    public static void a(String str, a aVar) {
        StringBuilder M = e.a.a.a.a.M("map size of put is before: ");
        Map<String, a> map = a;
        M.append(map.size());
        Logger.v("RequestUtil", M.toString());
        map.put(str, aVar);
        Logger.v("RequestUtil", "map size of put is after: " + map.size());
    }
}
