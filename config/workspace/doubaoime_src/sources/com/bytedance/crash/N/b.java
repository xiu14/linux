package com.bytedance.crash.N;

import android.os.FileObserver;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.upload.CrashUploader;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements Runnable {
    private static final ConcurrentHashMap<com.bytedance.crash.monitor.h, b> k = new ConcurrentHashMap<>();
    private File a;
    private JSONObject b;

    /* renamed from: d, reason: collision with root package name */
    private final com.bytedance.crash.monitor.h f4446d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4448f;
    private d j;

    /* renamed from: c, reason: collision with root package name */
    private long f4445c = 1200;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f4447e = false;

    /* renamed from: g, reason: collision with root package name */
    private long f4449g = -1;
    private long i = com.heytap.mcssdk.constant.a.f6886d;
    private List<com.bytedance.crash.N.c> h = new CopyOnWriteArrayList();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f();
        }
    }

    /* renamed from: com.bytedance.crash.N.b$b, reason: collision with other inner class name */
    class RunnableC0196b implements Runnable {
        RunnableC0196b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.f();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.g();
        }
    }

    private class d extends FileObserver {
        private final File a;

        public d(File file) {
            super(file.getAbsolutePath(), 264);
            this.a = file;
        }

        public void a() {
            if (!this.a.exists()) {
                try {
                    this.a.createNewFile();
                } catch (IOException unused) {
                    return;
                }
            }
            startWatching();
        }

        @Override // android.os.FileObserver
        public void onEvent(int i, String str) {
            if ((i & 8) != 0) {
                b.this.k();
            }
        }
    }

    public b(@NonNull com.bytedance.crash.monitor.h hVar) {
        this.f4446d = hVar;
        k.put(hVar, this);
    }

    private File b() {
        File file = this.a;
        if (file != null) {
            return file;
        }
        File file2 = new File(C0652g.k(), "configs");
        if (!file2.exists()) {
            com.bytedance.android.input.k.b.a.m(file2);
        }
        File file3 = new File(file2, this.f4446d.b() + ".config");
        this.a = file3;
        return file3;
    }

    private void e(JSONObject jSONObject) {
        this.f4448f = true;
        List<com.bytedance.crash.N.c> list = this.h;
        if (list != null) {
            Iterator<com.bytedance.crash.N.c> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().a(jSONObject);
                } catch (Throwable th) {
                    com.bytedance.android.input.k.b.a.E("ConfigManager", "notifyListenerRefresh", th);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        JSONObject optJSONObject;
        try {
            String e2 = CrashUploader.e(g.c(), this.f4446d);
            if (h.f()) {
                com.bytedance.android.input.k.b.a.X("ConfigManager", "queryFromNet:" + e2);
            }
            byte[] f2 = CrashUploader.f(e2);
            if (f2 != null && f2.length > 0 && (optJSONObject = new JSONObject(new String(f2)).optJSONObject("ret")) != null) {
                return i(optJSONObject);
            }
        } catch (Throwable th) {
            com.bytedance.crash.Q.b.e("NPTH_CATCH_NEW", th);
        }
        return false;
    }

    private void j(JSONObject jSONObject) {
        if (com.bytedance.android.input.k.b.a.f0(jSONObject)) {
            return;
        }
        this.b = jSONObject;
        JSONObject optJSONObject = jSONObject.optJSONObject("general");
        JSONObject optJSONObject2 = optJSONObject != null ? optJSONObject.optJSONObject("slardar_api_settings") : null;
        if (optJSONObject2 != null) {
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("fetch_setting");
            if (optJSONObject3 != null) {
                this.f4445c = optJSONObject3.optLong("fetch_setting_interval", 1200L);
            }
            if (this.f4445c < 600) {
                this.f4445c = 600L;
            }
            if (h.f()) {
                StringBuilder M = e.a.a.a.a.M("updateCurrentConfig:");
                M.append(this.f4445c);
                com.bytedance.android.input.k.b.a.X("ConfigManager", M.toString());
            }
        }
    }

    public synchronized void c() {
        if (this.f4447e) {
            return;
        }
        this.f4447e = true;
        com.bytedance.android.input.k.b.a.X("ConfigManager", "init：" + this.f4446d.b());
        com.bytedance.crash.runtime.b.d(this);
    }

    protected void d() {
        k();
        if (!com.bytedance.crash.util.a.k()) {
            d dVar = new d(b());
            this.j = dVar;
            dVar.a();
        } else {
            long currentTimeMillis = System.currentTimeMillis() - this.f4449g;
            long j = this.f4445c * 1000;
            if (currentTimeMillis > j || currentTimeMillis < 0) {
                f();
            } else {
                com.bytedance.crash.runtime.b.f(new a(), j - currentTimeMillis);
            }
        }
    }

    protected void f() {
        long min;
        if (!com.bytedance.crash.util.d.b()) {
            com.bytedance.crash.runtime.b.f(new RunnableC0196b(), 300000L);
            return;
        }
        if (g()) {
            min = this.f4445c;
        } else {
            min = Math.min(this.i * 2, 600L);
            this.i = min;
        }
        if (h.f()) {
            com.bytedance.android.input.k.b.a.X("ConfigManager", "queryConfigFromRemote:" + min);
        }
        com.bytedance.crash.runtime.b.f(new c(), min * 1000);
    }

    public void h(com.bytedance.crash.N.c cVar) {
        if (this.h == null) {
            this.h = new CopyOnWriteArrayList();
        }
        if (!this.h.contains(cVar)) {
            this.h.add(cVar);
        }
        if (this.f4448f) {
            cVar.a(this.b);
        }
    }

    protected boolean i(JSONObject jSONObject) {
        try {
            if (h.f()) {
                com.bytedance.android.input.k.b.a.X("ConfigManager", "saveConfig :" + jSONObject);
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f4449g = currentTimeMillis;
            jSONObject.put("monitor_configure_refresh_time", currentTimeMillis);
            com.bytedance.crash.util.a.y(b(), jSONObject, false);
            j(jSONObject);
            e(jSONObject);
            return true;
        } catch (Exception e2) {
            com.bytedance.android.input.k.b.a.E("ConfigManager", "saveConfig", e2);
            return false;
        }
    }

    protected void k() {
        String str;
        File b = b();
        try {
            str = com.bytedance.crash.util.a.p(b);
        } catch (Exception unused) {
            if (b != null) {
                b.delete();
            }
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f4449g = jSONObject.optLong("monitor_configure_refresh_time");
            if (h.f()) {
                com.bytedance.android.input.k.b.a.X("ConfigManager", "updateFromLocal:" + this.f4446d.b() + " " + this.f4449g);
            }
            j(jSONObject);
            e(jSONObject);
        } catch (Exception e2) {
            com.bytedance.android.input.k.b.a.E("ConfigManager", "updateFromLocal", e2);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!TextUtils.isEmpty(this.f4446d.b()) && !TextUtils.isEmpty(this.f4446d.f(""))) {
            com.bytedance.crash.runtime.b.h(this);
            d();
            return;
        }
        com.bytedance.android.input.k.b.a.X("ConfigManager", "app id isEmpty：");
        if (this.f4446d instanceof com.bytedance.crash.monitor.a) {
            com.bytedance.crash.runtime.b.f(this, 200L);
        } else {
            com.bytedance.crash.runtime.b.f(this, 500L);
        }
    }
}
