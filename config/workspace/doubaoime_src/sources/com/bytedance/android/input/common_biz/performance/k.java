package com.bytedance.android.input.common_biz.performance;

import android.content.SharedPreferences;
import android.os.Build;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.data_storage.api.ImeKv;
import com.bytedance.android.input.basic.data_storage.api.KvRepoStrategy;
import com.bytedance.android.input.common_biz.performance.api.PerformanceConfig;
import com.bytedance.android.service.manager.pull.PullConfiguration;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.prolificinteractive.materialcalendarview.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.h;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class k {

    private static final class a {
        private final String a;
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        private final String f2263c;

        /* renamed from: d, reason: collision with root package name */
        private final String f2264d;

        /* renamed from: e, reason: collision with root package name */
        private final int f2265e;

        /* renamed from: f, reason: collision with root package name */
        private final Map<String, Object> f2266f;

        public a(String str, String str2, String str3, String str4, int i, Map<String, ? extends Object> map) {
            kotlin.s.c.l.f(str, "stage");
            kotlin.s.c.l.f(str2, "key");
            kotlin.s.c.l.f(str3, "processName");
            kotlin.s.c.l.f(str4, "threadName");
            kotlin.s.c.l.f(map, "extras");
            this.a = str;
            this.b = str2;
            this.f2263c = str3;
            this.f2264d = str4;
            this.f2265e = i;
            this.f2266f = map;
        }

        public final Map<String, Object> a() {
            return this.f2266f;
        }

        public final String b() {
            return this.b;
        }

        public final String c() {
            return this.f2263c;
        }

        public final int d() {
            return this.f2265e;
        }

        public final String e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.s.c.l.a(this.a, aVar.a) && kotlin.s.c.l.a(this.b, aVar.b) && kotlin.s.c.l.a(this.f2263c, aVar.f2263c) && kotlin.s.c.l.a(this.f2264d, aVar.f2264d) && this.f2265e == aVar.f2265e && kotlin.s.c.l.a(this.f2266f, aVar.f2266f);
        }

        public final String f() {
            return this.f2264d;
        }

        public int hashCode() {
            return this.f2266f.hashCode() + e.a.a.a.a.I(this.f2265e, e.a.a.a.a.p0(this.f2264d, e.a.a.a.a.p0(this.f2263c, e.a.a.a.a.p0(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("Snapshot(stage=");
            M.append(this.a);
            M.append(", key=");
            M.append(this.b);
            M.append(", processName=");
            M.append(this.f2263c);
            M.append(", threadName=");
            M.append(this.f2264d);
            M.append(", sharedPreferencesSize=");
            M.append(this.f2265e);
            M.append(", extras=");
            M.append(this.f2266f);
            M.append(')');
            return M.toString();
        }
    }

    static final class b extends m implements kotlin.s.b.l<Map.Entry<String, Object>, CharSequence> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public CharSequence invoke(Map.Entry<String, Object> entry) {
            Map.Entry<String, Object> entry2 = entry;
            kotlin.s.c.l.f(entry2, "it");
            return entry2.getKey() + '=' + entry2.getValue();
        }
    }

    public static void a(Collection collection, String str, String str2, SharedPreferences sharedPreferences, Object obj) {
        Object J2;
        Object J3;
        kotlin.s.c.l.f(collection, "$monitorKeys");
        kotlin.s.c.l.f(str, "$stage");
        try {
            if (sharedPreferences != null) {
                try {
                    J2 = sharedPreferences.getAll();
                } catch (Throwable th) {
                    J2 = r.J(th);
                }
            } else {
                J2 = null;
            }
            if (J2 == null) {
                J2 = kotlin.collections.g.o();
            } else {
                kotlin.s.c.l.e(J2, "sharedPreferences?.all ?: emptyMap()");
            }
            Object o = kotlin.collections.g.o();
            if (J2 instanceof h.a) {
                J2 = o;
            }
            Map map = (Map) J2;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                boolean containsKey = map.containsKey(str3);
                linkedHashMap.put(str3, "contains=" + containsKey + ",value=" + (kotlin.s.c.l.a(str3, str2) ? obj : containsKey ? map.get(str3) : "missing"));
            }
            kotlin.g[] gVarArr = {new kotlin.g("criticalKeys", linkedHashMap)};
            kotlin.s.c.l.f(gVarArr, "pairs");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.g.H(1));
            kotlin.s.c.l.f(gVarArr, "<this>");
            kotlin.s.c.l.f(linkedHashMap2, "destination");
            kotlin.collections.g.Q(linkedHashMap2, gVarArr);
            try {
                IAppGlobals.a.getContext();
                J3 = d.a.b.a.d();
            } catch (Throwable th2) {
                J3 = r.J(th2);
            }
            if (J3 instanceof h.a) {
                J3 = "";
            }
            String name = Thread.currentThread().getName();
            kotlin.s.c.l.e(name, "currentThread().name");
            c(new a(str, str2, (String) J3, name, map.size(), linkedHashMap2));
        } catch (Throwable th3) {
            IAppGlobals.a.J("SPMonitorLog", th3);
        }
    }

    public static final void b(final String str, final SharedPreferences sharedPreferences, final Collection<String> collection, final String str2, final Object obj) {
        kotlin.s.c.l.f(str, "stage");
        kotlin.s.c.l.f(collection, "monitorKeys");
        if (PerformanceConfig.INSTANCE.isSpMonitorEnabled()) {
            com.bytedance.android.input.basic.d.a.a(new Runnable() { // from class: com.bytedance.android.input.common_biz.performance.g
                @Override // java.lang.Runnable
                public final void run() {
                    k.a(collection, str, str2, sharedPreferences, obj);
                }
            });
        }
    }

    private static final void c(a aVar) {
        Object obj = aVar.a().get("criticalKeys");
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null || map.size() == 0) {
            return;
        }
        long longValue = ((Number) ImeKv.a.c(KvRepoStrategy.DEFAULT_MULTI_PROCESS, "privacy_popup_first_show_time", -1L)).longValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("monitor_stage", aVar.e());
        linkedHashMap.put("monitor_key", aVar.b());
        linkedHashMap.put("process_name", aVar.c());
        linkedHashMap.put(CrashHianalyticsData.THREAD_NAME, aVar.f());
        linkedHashMap.put("is_main_thread", Boolean.valueOf(kotlin.s.c.l.a(aVar.f(), PullConfiguration.PROCESS_NAME_MAIN)));
        linkedHashMap.put("sp_size", Integer.valueOf(aVar.d()));
        linkedHashMap.put("kv_load_show_time", Long.valueOf(longValue));
        String str = Build.MODEL;
        kotlin.s.c.l.e(str, "MODEL");
        linkedHashMap.put("ime_device_type", str);
        String str2 = Build.BRAND;
        kotlin.s.c.l.e(str2, "BRAND");
        linkedHashMap.put("ime_device_brand", str2);
        PerformanceConfig.INSTANCE.trace("ime_sp_state_monitor", linkedHashMap);
        String C = kotlin.collections.g.C(linkedHashMap.entrySet(), " ", null, null, 0, null, b.a, 30, null);
        IAppGlobals.a.x("SPMonitorLog", "maybeUploadAnomaly:" + C);
    }
}
