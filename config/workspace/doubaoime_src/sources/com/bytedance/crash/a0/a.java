package com.bytedance.crash.a0;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.crash.C0652g;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private static boolean j = true;
    private static int k = 1;
    private static long l = -1;
    private static boolean m;
    private static boolean n;
    private static boolean o;
    private static final String[] p = {"last_create_activity", "last_start_activity", "last_resume_activity", "last_pause_activity", "last_stop_activity", "last_destroy_activity"};
    private static final String[] q = {"onCreate", "onStart", "onResume", "onPause", "onStop", "onDestroy"};
    private static volatile a r;
    private String a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private int f4549c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Integer, c> f4550d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final List<c> f4551e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final d[] f4552f = new d[6];

    /* renamed from: g, reason: collision with root package name */
    private final LinkedList<e> f4553g = new LinkedList<>();
    private final ArrayList<WeakReference<Activity>> h = new ArrayList<>();
    private com.bytedance.crash.V.a i;

    /* renamed from: com.bytedance.crash.a0.a$a, reason: collision with other inner class name */
    static class C0206a implements Comparator<Map.Entry<Integer, c>> {
        C0206a() {
        }

        @Override // java.util.Comparator
        public int compare(Map.Entry<Integer, c> entry, Map.Entry<Integer, c> entry2) {
            long j = entry.getValue().f4556e - entry2.getValue().f4556e;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }
    }

    class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            boolean unused = a.n = bundle != null;
            a.c(a.this, 0, activity);
            boolean unused2 = a.m = true;
            a.this.h.add(new WeakReference(activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
            a.c(a.this, 5, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
            a aVar = a.this;
            aVar.a = aVar.i == null ? activity.getClass().getName() : a.this.i.a(activity);
            a.n(a.this);
            if (a.this.f4549c == 0) {
                a.this.b = false;
                boolean unused = a.m = false;
            } else if (a.this.f4549c < 0) {
                a.this.f4549c = 0;
                a.this.b = false;
                boolean unused2 = a.m = false;
            }
            a.c(a.this, 3, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
            a.c(a.this, 2, activity);
            String name = a.this.i == null ? activity.getClass().getName() : a.this.i.a(activity);
            long currentTimeMillis = System.currentTimeMillis();
            a.m(a.this);
            if (a.this.b) {
                return;
            }
            a.this.b = true;
            if (a.j) {
                boolean unused = a.j = false;
                int unused2 = a.k = 1;
                long unused3 = a.l = currentTimeMillis;
            }
            if (name.equals(a.this.a)) {
                if (a.m && !a.n) {
                    int unused4 = a.k = 4;
                    long unused5 = a.l = currentTimeMillis;
                } else {
                    if (a.m) {
                        return;
                    }
                    int unused6 = a.k = 3;
                    long unused7 = a.l = currentTimeMillis;
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
            a.c(a.this, 1, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
            a.c(a.this, 4, activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {
        String a;
        int b;

        /* renamed from: c, reason: collision with root package name */
        int f4554c;

        /* renamed from: d, reason: collision with root package name */
        long f4555d;

        /* renamed from: e, reason: collision with root package name */
        long f4556e;

        public c(String str, long j, int i) {
            this.a = str;
            this.b = i;
            this.f4556e = j;
        }
    }

    static class d {
        c a;
        long b;

        d() {
        }
    }

    public static class e {
        c a;
        long b;

        /* renamed from: c, reason: collision with root package name */
        int f4557c;

        static String a(e eVar) {
            long j = eVar.b;
            c cVar = eVar.a;
            return c(j, cVar.a, cVar.b, eVar.f4557c);
        }

        static String b(String str) {
            String[] split = str.split(" ");
            if (split.length == 4) {
                try {
                    long parseLong = Long.parseLong(split[0]);
                    String str2 = split[1];
                    int parseInt = Integer.parseInt(split[2]);
                    int parseInt2 = Integer.parseInt(split[3]);
                    if (parseInt2 >= 0 && parseInt2 < a.q.length) {
                        return c(parseLong, str2, parseInt, parseInt2);
                    }
                } catch (Exception unused) {
                }
            }
            return null;
        }

        private static String c(long j, String str, int i, int i2) {
            return com.bytedance.crash.util.a.c(j) + " : " + str + '.' + a.q[i2] + '@' + Long.toHexString(i);
        }
    }

    private a() {
        Application d2 = C0652g.d();
        if (d2 != null) {
            d2.registerActivityLifecycleCallbacks(new b());
        }
    }

    public static boolean A() {
        boolean z;
        if (z().f4550d.isEmpty()) {
            Context g2 = C0652g.g();
            if (g2 != null) {
                g2.getPackageName();
                try {
                } catch (Throwable unused) {
                }
            }
            return true;
        }
        a z2 = z();
        Objects.requireNonNull(z2);
        ArrayList arrayList = new ArrayList(z2.f4550d.entrySet());
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                z = false;
                break;
            }
            if (((c) ((Map.Entry) arrayList.get(i)).getValue()).f4554c < 3) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        a z3 = z();
        Objects.requireNonNull(z3);
        ArrayList arrayList2 = new ArrayList(z3.f4550d.entrySet());
        long j2 = 0;
        int i2 = 0;
        long j3 = 0;
        while (true) {
            if (i2 >= arrayList2.size()) {
                j2 = j3;
                break;
            }
            c cVar = (c) ((Map.Entry) arrayList2.get(i2)).getValue();
            if (cVar.f4554c < 3) {
                break;
            }
            long j4 = cVar.f4555d;
            if (j3 < j4) {
                j3 = j4;
            }
            i2++;
        }
        return currentTimeMillis - j2 > 2000;
    }

    public static void B(@NonNull JSONObject jSONObject, File file) {
        try {
            jSONObject.put("is_background", new File(file, "background").exists());
        } catch (Throwable unused) {
        }
        String h = e.a.a.a.a.h(file, "activity_trace.json");
        if (h != null) {
            try {
                com.bytedance.android.input.k.b.a.j(jSONObject, new JSONObject(h));
            } catch (Throwable unused2) {
            }
        }
        try {
            JSONArray jSONArray = new JSONArray();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(file, "activity_track.inf")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    com.bytedance.android.input.k.b.a.b(jSONObject, "activity_track", jSONArray);
                    return;
                } else {
                    String b2 = e.b(readLine);
                    if (b2 != null) {
                        jSONArray.put(b2);
                    }
                }
            }
        } catch (IOException unused3) {
        }
    }

    public static void C(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (int i = 0; i < 6; i++) {
                if (z().f4552f[i] != null && z().f4552f[i].a != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("name", z().f4552f[i].a.a);
                    jSONObject3.put(CrashHianalyticsData.TIME, z().f4552f[i].b);
                    jSONObject2.put(p[i], jSONObject3);
                }
            }
            ArrayList arrayList = new ArrayList(z().f4550d.entrySet());
            Collections.sort(arrayList, new C0206a());
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("name", ((c) entry.getValue()).a);
                jSONObject4.put(CrashHianalyticsData.TIME, ((c) entry.getValue()).f4556e);
                jSONArray.put(jSONObject4);
            }
            jSONObject2.put("alive_activities", jSONArray);
            Object jSONArray2 = new JSONArray();
            int size = z().f4551e.size();
            while (true) {
                size--;
                if (size < 0) {
                    jSONObject2.put("finish_activities", jSONArray2);
                    jSONObject.put("activity_trace", jSONObject2);
                    return;
                } else {
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("name", z().f4551e.get(size).a);
                    jSONObject5.put(CrashHianalyticsData.TIME, z().f4551e.get(size).f4555d);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void D(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it2 = new ArrayList(z().f4553g).iterator();
            while (it2.hasNext()) {
                jSONArray.put(e.a((e) it2.next()));
            }
            com.bytedance.android.input.k.b.a.b(jSONObject, "activity_track", jSONArray);
        } catch (Exception unused) {
        }
    }

    public static void E() {
        o = true;
    }

    public static void F(com.bytedance.crash.V.a aVar) {
        z().i = aVar;
    }

    public static void G() {
        z();
    }

    static void c(a aVar, int i, Activity activity) {
        Objects.requireNonNull(aVar);
        long currentTimeMillis = System.currentTimeMillis();
        int hashCode = activity.hashCode();
        c cVar = aVar.f4550d.get(Integer.valueOf(hashCode));
        if (cVar == null) {
            long j2 = i == 0 ? currentTimeMillis : 0L;
            com.bytedance.crash.V.a aVar2 = aVar.i;
            String a = aVar2 != null ? aVar2.a(activity) : null;
            if (TextUtils.isEmpty(a)) {
                a = activity.getClass().getName();
            }
            cVar = new c(a, j2, hashCode);
            aVar.f4550d.put(Integer.valueOf(hashCode), cVar);
        }
        cVar.f4554c = i;
        cVar.f4555d = currentTimeMillis;
        if (f.c().e()) {
            com.bytedance.crash.runtime.b.d(new com.bytedance.crash.a0.c(aVar, cVar.a, i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "onDestroy" : "onStop" : "onPause" : "onResume" : "onStart" : "onCreate", activity.hashCode(), cVar.f4556e));
        }
        e poll = aVar.f4553g.size() >= 50 ? aVar.f4553g.poll() : null;
        if (poll == null) {
            poll = new e();
        }
        aVar.f4553g.add(poll);
        poll.a = cVar;
        long j3 = cVar.f4555d;
        poll.b = j3;
        poll.f4557c = cVar.f4554c;
        d[] dVarArr = aVar.f4552f;
        if (dVarArr[i] == null) {
            dVarArr[i] = new d();
        }
        dVarArr[i].a = cVar;
        dVarArr[i].b = j3;
        if (i == 5) {
            aVar.f4550d.remove(Integer.valueOf(cVar.b));
            if (aVar.f4551e.size() == 20) {
                aVar.f4551e.remove(19);
            }
            aVar.f4551e.add(cVar);
        }
    }

    static /* synthetic */ int m(a aVar) {
        int i = aVar.f4549c;
        aVar.f4549c = i + 1;
        return i;
    }

    static /* synthetic */ int n(a aVar) {
        int i = aVar.f4549c;
        aVar.f4549c = i - 1;
        return i;
    }

    public static void u(File file) {
        if (A()) {
            com.bytedance.android.input.k.b.a.o(file, "background");
        }
        a z = z();
        Objects.requireNonNull(z);
        com.bytedance.crash.dumper.j.f fVar = new com.bytedance.crash.dumper.j.f(file.getAbsolutePath() + "/activity_trace.json");
        fVar.a('{');
        fVar.i("activity_trace");
        fVar.a('{');
        for (int i = 0; i < 6; i++) {
            d[] dVarArr = z.f4552f;
            if (dVarArr[i] != null && dVarArr[i].a != null) {
                fVar.i(p[i]);
                fVar.a('{');
                fVar.i("name");
                fVar.j(z.f4552f[i].a.a);
                fVar.a(',');
                fVar.i(CrashHianalyticsData.TIME);
                fVar.c(z.f4552f[i].b);
                fVar.a('}');
                fVar.a(',');
            }
        }
        fVar.i("alive_activities");
        fVar.a('[');
        ArrayList arrayList = new ArrayList(z.f4550d.entrySet());
        Collections.sort(arrayList, new com.bytedance.crash.a0.b(z));
        Iterator it2 = arrayList.iterator();
        boolean z2 = true;
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (z2) {
                z2 = false;
            } else {
                fVar.a(',');
            }
            fVar.a('{');
            fVar.i("name");
            fVar.j(((c) entry.getValue()).a);
            fVar.a(',');
            fVar.i(CrashHianalyticsData.TIME);
            fVar.c(((c) entry.getValue()).f4556e);
            fVar.a('}');
        }
        fVar.a(']');
        fVar.a(',');
        fVar.i("finish_activities");
        fVar.a('[');
        for (int size = z.f4551e.size() - 1; size >= 0; size--) {
            fVar.a('{');
            fVar.i("name");
            fVar.j(z.f4551e.get(size).a);
            fVar.a(',');
            fVar.i(CrashHianalyticsData.TIME);
            fVar.c(z.f4551e.get(size).f4555d);
            fVar.a('}');
            if (size != 0) {
                fVar.a(',');
            }
        }
        fVar.a(']');
        fVar.a('}');
        fVar.a('}');
        fVar.h();
        Objects.requireNonNull(z());
        StringBuilder sb = new StringBuilder();
        Iterator<e> it3 = z().f4553g.iterator();
        while (it3.hasNext()) {
            e next = it3.next();
            sb.append(next.b);
            sb.append(' ');
            sb.append(next.a.a);
            sb.append(' ');
            sb.append(next.a.b);
            sb.append(' ');
            sb.append(next.f4557c);
            sb.append('\n');
        }
        if (sb.length() == 0) {
            return;
        }
        try {
            com.bytedance.crash.util.a.x(new File(file, "activity_track.inf"), sb.toString(), false);
        } catch (Exception unused) {
        }
    }

    public static ArrayList<WeakReference<Activity>> v() {
        return z().h;
    }

    @Nullable
    public static String w(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("activity_trace");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject(p[2])) == null) {
            return null;
        }
        return optJSONObject.optString("name");
    }

    public static int x() {
        int i = k;
        return i == 1 ? o ? 2 : 1 : i;
    }

    public static long y() {
        return l;
    }

    private static a z() {
        if (r == null) {
            synchronized (a.class) {
                if (r == null) {
                    r = new a();
                }
            }
        }
        return r;
    }
}
