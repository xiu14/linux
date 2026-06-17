package com.bytedance.crash.R;

import android.os.Process;
import android.text.TextUtils;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.general.RomInfo;
import com.bytedance.crash.upload.CrashUploader;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    private static ConcurrentHashMap<com.bytedance.crash.monitor.h, ConcurrentLinkedQueue<h>> f4497d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<com.bytedance.crash.monitor.h, ConcurrentLinkedQueue<h>> f4498e = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private static CopyOnWriteArrayList<g> f4499f = new CopyOnWriteArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private static AtomicInteger f4500g = new AtomicInteger(0);
    private static AtomicInteger h = new AtomicInteger(0);
    private static volatile boolean i = false;
    private f a;
    private ConcurrentLinkedQueue<h> b;

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentLinkedQueue<h> f4501c;

    private static class a implements Runnable {
        private static a b = new a();
        private volatile boolean a;

        private a() {
        }

        static void a(a aVar) {
            if (aVar.a) {
                return;
            }
            aVar.a = true;
            boolean unused = g.i = true;
            com.bytedance.crash.runtime.b.h(aVar);
            com.bytedance.crash.runtime.b.f(aVar, 30000L);
        }

        public static a b() {
            return b;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONArray jSONArray = new JSONArray();
                int myPid = Process.myPid();
                long currentTimeMillis = System.currentTimeMillis();
                int i = 0;
                boolean z = false;
                String str = "0";
                for (com.bytedance.crash.monitor.h hVar : g.f4497d.keySet()) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) g.f4497d.get(hVar);
                    if (concurrentLinkedQueue != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        while (true) {
                            if (concurrentLinkedQueue.isEmpty()) {
                                break;
                            }
                            jSONArray2.put(((h) concurrentLinkedQueue.poll()).b());
                            g.f4500g.decrementAndGet();
                            i++;
                            if (i > 100) {
                                z = true;
                                break;
                            }
                        }
                        if (jSONArray2.length() != 0) {
                            JSONObject jSONObject = new JSONObject();
                            str = hVar.f("0");
                            jSONObject.put(RemoteMessageConst.DATA, jSONArray2);
                            JSONObject e2 = Header.b(hVar, currentTimeMillis, CrashType.ENSURE, myPid).e();
                            e2.put("from", "npth");
                            jSONObject.put("header", e2);
                            jSONArray.put(jSONObject);
                            if (z) {
                                break;
                            }
                        }
                    }
                }
                if (!com.bytedance.android.input.k.b.a.b0(jSONArray)) {
                    String g2 = com.bytedance.crash.N.g.g();
                    HashMap hashMap = new HashMap();
                    hashMap.put("device_id", str);
                    hashMap.put(RomInfo.KEY_OS_TYPE, "Android");
                    hashMap.put("sdk_version", "4.2.1-rc.8-oime");
                    hashMap.put("from", "npth");
                    String c2 = CrashUploader.c(g2, hashMap);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("list", jSONArray);
                    CrashUploader.q(c2, jSONObject2);
                }
            } catch (Throwable th) {
                com.bytedance.android.input.k.b.a.P0(th);
            }
            if (g.f4500g.get() <= 0 && g.h.get() <= 0) {
                boolean unused = g.i = false;
            } else {
                com.bytedance.crash.runtime.b.f(this, 30000L);
                boolean unused2 = g.i = true;
            }
        }
    }

    public g(com.bytedance.crash.monitor.h hVar) {
        ConcurrentLinkedQueue<h> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        this.b = concurrentLinkedQueue;
        f4497d.put(hVar, concurrentLinkedQueue);
        this.f4501c = new ConcurrentLinkedQueue<>();
        f4498e.put(hVar, this.b);
        f4499f.add(this);
        a.a(a.b());
    }

    public void e(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.a != null || h.get() <= 100) {
            f fVar = this.a;
            if (fVar == null || fVar.a(str)) {
                h hVar = new h(Thread.currentThread().getName(), System.currentTimeMillis(), str, i2, jSONObject, jSONObject2);
                if (this.a == null) {
                    this.f4501c.add(hVar);
                    h.addAndGet(1);
                } else {
                    this.b.add(hVar);
                    f4500g.addAndGet(1);
                }
                if (i) {
                    return;
                }
                a.a(a.b());
            }
        }
    }

    public void f(f fVar) {
        if (fVar == null) {
            return;
        }
        while (!this.f4501c.isEmpty()) {
            h poll = this.f4501c.poll();
            h.decrementAndGet();
            if (fVar.a(poll.a())) {
                this.b.add(poll);
                f4500g.addAndGet(1);
            }
        }
        if (!i) {
            a.a(a.b());
        }
        this.a = fVar;
    }
}
