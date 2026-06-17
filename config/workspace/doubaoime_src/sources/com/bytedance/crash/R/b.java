package com.bytedance.crash.R;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.general.HardwareInfo;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.monitor.l;
import com.bytedance.crash.upload.CrashUploader;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private static b f4475e = new b();

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f4476f = 0;
    private com.bytedance.crash.R.a a;
    private final LinkedList<C0200b> b = new LinkedList<>();

    /* renamed from: c, reason: collision with root package name */
    private LinkedList<C0200b> f4477c = new LinkedList<>();

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentHashMap<String, Integer> f4478d = new ConcurrentHashMap<>();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.e();
        }
    }

    /* renamed from: com.bytedance.crash.R.b$b, reason: collision with other inner class name */
    private static class C0200b {
        private String a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private Throwable f4479c;

        /* renamed from: d, reason: collision with root package name */
        private String f4480d;

        /* renamed from: e, reason: collision with root package name */
        private Map<String, String> f4481e;

        /* renamed from: f, reason: collision with root package name */
        private long f4482f = System.currentTimeMillis();

        /* renamed from: g, reason: collision with root package name */
        private Map<String, String> f4483g;

        public C0200b(String str, Throwable th, String str2, String str3, Map<String, String> map, Map<String, String> map2) {
            this.a = str;
            this.f4479c = th;
            this.f4480d = str2;
            this.f4481e = map;
            this.b = str3;
            this.f4483g = map2;
        }

        JSONObject c(Header header) {
            JSONObject jSONObject = new JSONObject();
            String a = com.bytedance.crash.util.g.a(this.f4479c);
            try {
                jSONObject.put("event_type", "biz_exception");
                jSONObject.put("crash_time", this.f4482f);
                jSONObject.put("biz_exception_type", this.a);
                jSONObject.put("app_start_time", C0652g.b());
                jSONObject.put("timestamp", this.f4482f);
                jSONObject.put("crash_md5", com.bytedance.android.input.k.b.a.N(a));
                jSONObject.put("message", this.f4480d);
                jSONObject.put("crash_thread_name", this.b);
                jSONObject.put("process_name", com.bytedance.crash.util.a.e());
                jSONObject.put("exception_type", 1);
                jSONObject.put("process_name", com.bytedance.crash.util.a.i());
                jSONObject.put("app_start_time", C0652g.b());
                jSONObject.put("pid", Process.myPid());
                StackTraceElement stackTraceElement = this.f4479c.getStackTrace()[0];
                jSONObject.put("class_ref", stackTraceElement.getClassName());
                jSONObject.put("method", stackTraceElement.getMethodName());
                jSONObject.put("line_num", stackTraceElement.getLineNumber());
                jSONObject.put("stack", a);
                com.bytedance.crash.a0.a.C(jSONObject);
                com.bytedance.crash.a0.a.D(jSONObject);
                jSONObject.put("is_background", com.bytedance.crash.a0.a.A());
                com.bytedance.android.input.k.b.a.w0(jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject.put("filters", jSONObject2);
                for (Map.Entry<String, String> entry : this.f4481e.entrySet()) {
                    if (entry.getKey() != null && entry.getValue() != null) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                }
                com.bytedance.android.input.k.b.a.y0(jSONObject2, "is_64_runtime", NativeBridge.E() ? "true" : "false");
                String optString = header.e().optString(HardwareInfo.KEY_HW_CPU_ABI);
                if (!TextUtils.isEmpty(optString)) {
                    boolean contains = optString.contains("64");
                    com.bytedance.android.input.k.b.a.y0(jSONObject2, "is_x86_devices", Boolean.valueOf(optString.contains("86")));
                    com.bytedance.android.input.k.b.a.y0(jSONObject2, "is_64_devices", Boolean.valueOf(contains));
                }
                JSONObject optJSONObject = jSONObject.optJSONObject(MonitorConstants.CUSTOM);
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                    jSONObject.put(MonitorConstants.CUSTOM, optJSONObject);
                }
                Map<String, String> map = this.f4483g;
                if (map != null) {
                    for (Map.Entry<String, String> entry2 : map.entrySet()) {
                        if (entry2.getKey() != null && entry2.getValue() != null) {
                            optJSONObject.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                }
                if (l.e() != null) {
                    for (Map.Entry entry3 : ((HashMap) l.e().j().s(CrashType.ENSURE)).entrySet()) {
                        optJSONObject.put((String) entry3.getKey(), entry3.getValue());
                    }
                }
            } catch (Exception e2) {
                int i = b.f4476f;
                Log.e("NPTH", "BizExceptionManager", e2);
            }
            return jSONObject;
        }
    }

    public static b a() {
        return f4475e;
    }

    private void b() {
        if (!this.a.a()) {
            synchronized (this.b) {
                this.b.clear();
            }
            synchronized (this.f4477c) {
                this.f4477c.clear();
            }
            return;
        }
        ArrayList arrayList = null;
        synchronized (this.b) {
            if (this.b.size() > 0) {
                arrayList = new ArrayList();
                Iterator<C0200b> it2 = this.b.iterator();
                while (it2.hasNext()) {
                    C0200b next = it2.next();
                    if (this.a.b(next.a)) {
                        if (com.bytedance.crash.N.h.d()) {
                            com.bytedance.android.input.k.b.a.q("BizExceptionManager", next.a + " message:" + next.f4480d + " is sample");
                        }
                        arrayList.add(next);
                    } else if (com.bytedance.crash.N.h.d()) {
                        com.bytedance.android.input.k.b.a.q("BizExceptionManager", next.a + " message:" + next.f4480d + " is not sample");
                    }
                }
                this.b.clear();
            }
        }
        if (arrayList != null) {
            synchronized (this.f4477c) {
                this.f4477c.addAll(arrayList);
            }
        }
        if (com.bytedance.crash.N.h.d()) {
            StringBuilder M = e.a.a.a.a.M("report exception size:");
            M.append(this.f4477c.size());
            com.bytedance.android.input.k.b.a.q("BizExceptionManager", M.toString());
        }
    }

    public void c(String str, Throwable th, String str2, Map<String, String> map, Map<String, String> map2, boolean z) {
        if (!z) {
            Integer num = this.f4478d.get(str);
            if (num == null) {
                this.f4478d.put(str, 1);
            } else if (num.intValue() > 10) {
                return;
            } else {
                this.f4478d.put(str, Integer.valueOf(num.intValue() + 1));
            }
        }
        com.bytedance.crash.R.a aVar = this.a;
        if (aVar == null) {
            synchronized (this.b) {
                if (this.b.size() >= 90) {
                    this.b.removeFirst();
                }
                this.b.add(new C0200b(str, th, str2, Thread.currentThread().getName(), map, map2));
            }
            if (com.bytedance.crash.N.h.d()) {
                com.bytedance.android.input.k.b.a.q("BizExceptionManager", "config is not fetch:logType:" + str + " message:" + str2);
                return;
            }
            return;
        }
        if (!aVar.a()) {
            if (com.bytedance.crash.N.h.d()) {
                com.bytedance.android.input.k.b.a.q("BizExceptionManager", "enable_upload is not enable:" + str + " message:" + str2);
                return;
            }
            return;
        }
        if (!this.a.b(str)) {
            if (com.bytedance.crash.N.h.d()) {
                com.bytedance.android.input.k.b.a.q("BizExceptionManager", str + " message:" + str2 + " is not sample");
                return;
            }
            return;
        }
        if (com.bytedance.crash.N.h.d()) {
            com.bytedance.android.input.k.b.a.q("BizExceptionManager", str + " message:" + str2 + " is sample");
        }
        b();
        synchronized (this.f4477c) {
            this.f4477c.add(new C0200b(str, th, str2, Thread.currentThread().getName(), map, map2));
        }
        synchronized (this.f4477c) {
            if (this.f4477c.size() >= 30) {
                com.bytedance.crash.runtime.b.d(new a());
            }
        }
    }

    public void d(com.bytedance.crash.R.a aVar) {
        if (com.bytedance.crash.N.h.d()) {
            com.bytedance.android.input.k.b.a.X("BizExceptionManager", "setConfig:" + aVar);
        }
        System.currentTimeMillis();
        f4475e.a = aVar;
        if (this.a.a()) {
            com.bytedance.crash.runtime.b.h(this);
            com.bytedance.crash.runtime.b.f(this, 30000L);
            b();
            e();
            return;
        }
        synchronized (this.b) {
            this.b.clear();
        }
        synchronized (this.f4477c) {
            this.f4477c.clear();
        }
        com.bytedance.crash.runtime.b.h(this);
    }

    public void e() {
        if (com.bytedance.crash.N.h.d()) {
            com.bytedance.android.input.k.b.a.q("BizExceptionManager", "upload");
        }
        synchronized (this.f4477c) {
            if (this.f4477c.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (!this.f4477c.isEmpty() && i <= 30) {
                i++;
                arrayList.add(this.f4477c.remove(0));
            }
            if (arrayList.size() == 0) {
                return;
            }
            Header b = Header.b(l.e(), System.currentTimeMillis(), CrashType.ENSURE, Process.myPid());
            try {
                HashSet hashSet = com.bytedance.crash.N.h.d() ? new HashSet() : null;
                JSONArray jSONArray = new JSONArray();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C0200b c0200b = (C0200b) it2.next();
                    JSONObject c2 = c0200b.c(b);
                    if (hashSet != null) {
                        hashSet.add(c0200b.a);
                    }
                    jSONArray.put(c2);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(RemoteMessageConst.DATA, jSONArray);
                JSONObject e2 = b.e();
                jSONObject.put("header", e2);
                if (com.bytedance.crash.N.h.d()) {
                    com.bytedance.android.input.k.b.a.q("BizExceptionManager", "start upload:" + hashSet);
                }
                String d2 = CrashUploader.d(com.bytedance.crash.N.g.e(), e2);
                boolean q = CrashUploader.q(d2, jSONObject);
                if (com.bytedance.crash.N.h.d()) {
                    com.bytedance.android.input.k.b.a.q("BizExceptionManager", "end upload:" + d2 + " " + q);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        b();
        e();
        com.bytedance.crash.runtime.b.f(this, 30000L);
    }
}
