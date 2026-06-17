package com.bytedance.crash.resource;

import android.os.Build;
import android.os.Looper;
import android.os.Process;
import androidx.annotation.NonNull;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.N.g;
import com.bytedance.crash.R.e;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.monitor.l;
import com.bytedance.crash.upload.CrashUploader;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.vivo.push.PushClient;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class b {
    protected File a;
    protected String b;

    /* renamed from: c, reason: collision with root package name */
    protected String f4659c;

    /* renamed from: d, reason: collision with root package name */
    protected File f4660d;

    /* renamed from: e, reason: collision with root package name */
    protected com.bytedance.crash.resource.i.a f4661e;

    /* renamed from: f, reason: collision with root package name */
    protected boolean f4662f = false;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f4663g = false;

    public static abstract class a {
        protected com.bytedance.crash.monitor.a a;
        protected File b;

        /* renamed from: c, reason: collision with root package name */
        protected String f4664c;

        /* renamed from: com.bytedance.crash.resource.b$a$a, reason: collision with other inner class name */
        class RunnableC0211a implements Runnable {
            final /* synthetic */ e a;
            final /* synthetic */ File b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C0212b f4665c;

            RunnableC0211a(e eVar, File file, C0212b c0212b) {
                this.a = eVar;
                this.b = file;
                this.f4665c = c0212b;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.g(this.a, this.b, this.f4665c);
            }
        }

        protected a(com.bytedance.crash.monitor.a aVar, @NonNull File file) {
            this.a = aVar;
            this.b = file;
            this.f4664c = file.getAbsolutePath() + "/" + com.bytedance.crash.crash.c.b();
        }

        protected static String b(String str) {
            StringBuilder sb = new StringBuilder();
            try {
                if (str.length() < 16) {
                    sb.append(str);
                } else {
                    sb.append(str.charAt(6));
                    sb.append(str.charAt(7));
                    sb.append(str.charAt(4));
                    sb.append(str.charAt(5));
                    sb.append(str.charAt(2));
                    sb.append(str.charAt(3));
                    sb.append(str.charAt(0));
                    sb.append(str.charAt(1));
                    sb.append(str.charAt(10));
                    sb.append(str.charAt(11));
                    sb.append(str.charAt(8));
                    sb.append(str.charAt(9));
                    sb.append(str.charAt(14));
                    sb.append(str.charAt(15));
                    sb.append(str.charAt(12));
                    sb.append(str.charAt(13));
                    if (str.length() >= 32) {
                        sb.append((CharSequence) str, 16, 32);
                        sb.append('0');
                    }
                }
            } catch (Throwable unused) {
            }
            return sb.toString().toUpperCase();
        }

        protected static int c(JSONArray jSONArray, int i, String str) {
            while (i < jSONArray.length()) {
                String optString = jSONArray.optString(i, null);
                if (optString != null && optString.startsWith(str)) {
                    return i;
                }
                i++;
            }
            return -1;
        }

        protected static String d(String str, String str2) {
            if (str == null) {
                return "other";
            }
            if (str2 == null || str2.length() == 0) {
                str2 = "B";
            }
            if (str2.equals("GB")) {
                return "1GB+";
            }
            if (!str2.equals("MB")) {
                return "0~1MB";
            }
            try {
                int parseInt = Integer.parseInt(str.substring(0, str.indexOf(46)));
                return parseInt < 200 ? "0~200MB" : parseInt < 500 ? "200~500MB" : parseInt < 800 ? "500~800MB" : "800~1024MB(1G)";
            } catch (Throwable unused) {
                return "other";
            }
        }

        protected static String e(String str) {
            long longValue = Long.decode(str.substring(0, str.indexOf("MB"))).longValue();
            return (longValue < 1 || longValue > 100) ? (longValue <= 100 || longValue > 250) ? (longValue <= 250 || longValue > 350) ? (longValue <= 350 || longValue > 450) ? (longValue <= 450 || longValue > 550) ? (longValue <= 550 || longValue > 650) ? (longValue <= 650 || longValue > 750) ? (longValue <= 750 || longValue > 850) ? (longValue <= 850 || longValue > 950) ? (longValue <= 950 || longValue > 1050) ? (longValue <= 1050 || longValue > 1250) ? (longValue <= 1250 || longValue > 1450) ? (longValue <= 1450 || longValue > 1650) ? (longValue <= 1650 || longValue > 1850) ? (longValue <= 1850 || longValue > 2050) ? ">2.3G" : "1850MB~2050MB" : "1650MB~1850MB" : "1450MB~1650MB" : "1250MB~1450MB" : "1050MB~1250MB" : "950MB~1050MB" : "850MB~950MB" : "750MB~850MB" : "650MB~750MB" : "550MB~650MB" : "450MB~550MB" : "350MB~450MB" : "250MB~350MB" : "100MB~250MB" : "1MB~100MB";
        }

        private void f(File file, Map<String, String> map, C0212b c0212b) {
            com.bytedance.crash.monitor.a aVar = this.a;
            if (aVar != null) {
                aVar.g();
                if (c0212b.f4669e == 0) {
                    c0212b.f4669e = Process.myPid();
                }
                e eVar = new e(c0212b.a, c0212b.b, c0212b.f4668d, map, c0212b.f4667c, PushClient.DEFAULT_REQUEST_ID, "native_exception", (int) c0212b.f4669e);
                if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    g(eVar, file, c0212b);
                } else {
                    com.bytedance.crash.runtime.b.d(new RunnableC0211a(eVar, file, c0212b));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(e eVar, File file, C0212b c0212b) {
            try {
                JSONObject e2 = Header.b(this.a, System.currentTimeMillis(), CrashType.NATIVE_CUSTOMIZE, (int) c0212b.f4669e).e();
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(eVar.g(this.a));
                jSONObject.put(RemoteMessageConst.DATA, jSONArray);
                jSONObject.put("crash_lib_uuid", c0212b.f4671g);
                jSONObject.put("header", e2);
                if (CrashUploader.r(CrashUploader.d(g.i(), e2), jSONObject.toString(), file)) {
                    com.bytedance.android.input.k.b.a.p("ResourceMonitorUploader: upload success");
                    com.bytedance.crash.util.a.b(file);
                }
            } catch (Exception unused) {
            }
        }

        protected void h(Map<String, String> map, C0212b c0212b) {
            if (map == null || c0212b == null) {
                return;
            }
            map.putAll(c0212b.h);
        }

        protected abstract boolean i(File file, C0212b c0212b);

        public void j() {
            File[] listFiles = this.b.listFiles();
            if (listFiles == null) {
                return;
            }
            int length = listFiles.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                File file = listFiles[i2];
                if (!this.f4664c.equals(file.getAbsolutePath()) && !file.isFile()) {
                    String[] list = file.list();
                    if (!(list == null || list.length == 0)) {
                        int i3 = i + 1;
                        if (i >= 10) {
                            i = i3;
                        } else {
                            C0212b c0212b = new C0212b();
                            HashMap hashMap = new HashMap();
                            try {
                                if (i(file, c0212b)) {
                                    h(hashMap, c0212b);
                                    NativeBridge.K(file.getAbsolutePath());
                                    f(file, hashMap, c0212b);
                                } else {
                                    com.bytedance.crash.util.a.b(file);
                                }
                            } finally {
                                try {
                                    com.bytedance.crash.util.a.b(file);
                                    i = i3;
                                } finally {
                                }
                            }
                            com.bytedance.crash.util.a.b(file);
                            i = i3;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.crash.resource.b$b, reason: collision with other inner class name */
    public static class C0212b {
        public String a = "";
        public String b = null;

        /* renamed from: c, reason: collision with root package name */
        public String f4667c = null;

        /* renamed from: d, reason: collision with root package name */
        public String f4668d = null;

        /* renamed from: e, reason: collision with root package name */
        public long f4669e = 0;

        /* renamed from: f, reason: collision with root package name */
        public long f4670f = 0;

        /* renamed from: g, reason: collision with root package name */
        public JSONArray f4671g = new JSONArray();
        public Map<String, String> h = new HashMap();

        C0212b() {
        }
    }

    private void d(c cVar) {
        try {
            String str = this.f4659c;
            if (cVar.f4674e == null) {
                int i = cVar.f4675f;
                cVar.f4674e = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "unknown" : "ref_monitor.config" : "tls_monitor.config" : "vmm.config" : "fd_track.config" : "heap_track.config" : "xasan.config";
            }
            File file = new File(str, cVar.f4674e);
            this.f4660d = file;
            if (!file.exists()) {
                this.f4660d.createNewFile();
            }
            com.bytedance.android.input.k.b.a.D("ResourceMonitorAdapter: ", "write Config");
            com.bytedance.crash.util.a.x(this.f4660d, cVar.toString(), false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    protected void a() {
    }

    protected boolean b() {
        return true;
    }

    protected void c(c cVar) {
        boolean z;
        File b;
        if (cVar == null) {
            return;
        }
        synchronized (this) {
            if (!this.f4663g) {
                this.f4663g = true;
                int i = Build.VERSION.SDK_INT;
                if (i >= cVar.a && i <= cVar.b) {
                    this.f4659c = C0652g.f();
                    if (cVar.f4676g == null) {
                        switch (cVar.f4675f) {
                            case 0:
                                b = com.bytedance.crash.resource.i.b.b();
                                break;
                            case 1:
                                b = com.bytedance.crash.resource.i.b.c();
                                break;
                            case 2:
                                b = com.bytedance.crash.resource.i.b.a();
                                break;
                            case 3:
                                b = com.bytedance.crash.resource.i.b.g();
                                break;
                            case 4:
                                b = com.bytedance.crash.resource.i.b.f();
                                break;
                            case 5:
                                b = com.bytedance.crash.resource.i.b.e();
                                break;
                            case 6:
                                b = com.bytedance.crash.resource.i.b.d();
                                break;
                            default:
                                b = null;
                                break;
                        }
                        cVar.f4676g = b;
                    }
                    File file = cVar.f4676g;
                    this.a = file;
                    if (file != null && (file.exists() || this.a.mkdir())) {
                        this.b = this.a.getAbsolutePath() + "/" + com.bytedance.crash.crash.c.b();
                        String absolutePath = this.a.getAbsolutePath();
                        if (cVar.f4672c == null) {
                            int i2 = cVar.f4675f;
                            cVar.f4672c = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "unknown" : "ref_monitor.guard" : "tls_monitor.guard" : "vm_monitor.guard" : "fd_track.guard" : "heap_track.guard" : "gwp_asan.guard";
                        }
                        com.bytedance.crash.resource.i.a aVar = new com.bytedance.crash.resource.i.a(absolutePath, cVar.f4672c, 604800L);
                        this.f4661e = aVar;
                        if (aVar.a()) {
                            if (b()) {
                                d(cVar);
                                com.bytedance.android.input.k.b.a.X("ResourceMonitorAdapter: ", "loadLibrary...");
                                if (!this.f4662f) {
                                    try {
                                        e.b.h.a.a(cVar.a(), C0652g.g());
                                        this.f4662f = true;
                                    } catch (Throwable unused) {
                                    }
                                }
                                if (this.f4662f) {
                                    try {
                                        if (this.f4659c != null) {
                                            int i3 = Build.VERSION.SDK_INT;
                                            int i4 = cVar.f4675f;
                                            String str = "lib" + cVar.a() + ".so";
                                            com.bytedance.crash.monitor.a e2 = l.e();
                                            z = NativeResourceMonitor.a(i3, i4, str, e2 != null ? String.valueOf(e2.m()) : "unknown", this.b, this.f4659c) == 0;
                                        }
                                    } catch (Throwable th) {
                                        th.printStackTrace();
                                    }
                                } else {
                                    com.bytedance.android.input.k.b.a.X("ResourceMonitorAdapter: ", "loadLibrary() failed!");
                                }
                            }
                        }
                    }
                    com.bytedance.android.input.k.b.a.D("ResourceMonitorAdapter: ", "cannot create " + this.a);
                }
                com.bytedance.android.input.k.b.a.D("ResourceMonitorAdapter: ", "Unsupported API!!!");
            }
        }
        if (z) {
            this.f4661e.c();
            a();
        }
    }
}
