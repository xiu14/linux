package com.bytedance.apm;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.internal.ApmDelegate;
import com.huawei.hms.framework.common.BundleUtil;
import com.ss.android.message.log.PushLog;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c {
    private static File a = null;
    private static long b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static MappedByteBuffer f3344c;

    /* renamed from: d, reason: collision with root package name */
    static AtomicLong f3345d = new AtomicLong(0);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f3346e = 0;

    static class a implements Runnable {
        final /* synthetic */ com.bytedance.apm.config.d a;
        final /* synthetic */ JSONObject b;

        a(com.bytedance.apm.config.d dVar, JSONObject jSONObject) {
            this.a = dVar;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.b.b.d.a.f(this.a.e(), this.a.f(), null, this.a.b(), this.a.d(), this.b);
        }
    }

    static class b implements Runnable {
        final /* synthetic */ com.bytedance.apm.config.d a;
        final /* synthetic */ JSONObject b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f3347c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ JSONObject f3348d;

        b(com.bytedance.apm.config.d dVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            this.a = dVar;
            this.b = jSONObject;
            this.f3347c = jSONObject2;
            this.f3348d = jSONObject3;
        }

        @Override // java.lang.Runnable
        public void run() {
            String e2 = this.a.e();
            int f2 = this.a.f();
            JSONObject jSONObject = this.b;
            JSONObject jSONObject2 = this.f3347c;
            JSONObject jSONObject3 = this.f3348d;
            this.a.g();
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            try {
                jSONObject3.put("log_type", "service_monitor");
                jSONObject3.put("service", e2);
                jSONObject3.put("status", f2);
                if (jSONObject != null) {
                    jSONObject3.put(PushLog.KEY_CATEGORY, jSONObject);
                }
                if (jSONObject2 != null) {
                    jSONObject3.put("metric", jSONObject2);
                }
            } catch (JSONException unused) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                c.m("monitorEvent", jSONObject3.toString());
            }
        }
    }

    /* renamed from: com.bytedance.apm.c$c, reason: collision with other inner class name */
    static class RunnableC0113c implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f3349c;

        RunnableC0113c(String str, int i, JSONObject jSONObject) {
            this.a = str;
            this.b = i;
            this.f3349c = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.a;
            int i = this.b;
            JSONObject jSONObject = this.f3349c;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("log_type", "service_monitor");
                jSONObject.put("service", str);
                jSONObject.put("status", i);
            } catch (JSONException unused) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                c.m("monitorStatusRate", jSONObject.toString());
            }
        }
    }

    static class d implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ JSONObject b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f3350c;

        d(String str, JSONObject jSONObject, JSONObject jSONObject2) {
            this.a = str;
            this.b = jSONObject;
            this.f3350c = jSONObject2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.a;
            JSONObject jSONObject = this.b;
            JSONObject jSONObject2 = this.f3350c;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            try {
                jSONObject2.put("log_type", "service_monitor");
                jSONObject2.put("service", str);
                jSONObject2.put("status", 0);
                if (jSONObject != null) {
                    jSONObject2.put(PushLog.KEY_VALUE, jSONObject);
                }
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                c.m("monitorDuration", jSONObject2.toString());
            }
        }
    }

    static class e implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f3351c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ JSONObject f3352d;

        e(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
            this.a = str;
            this.b = i;
            this.f3351c = jSONObject;
            this.f3352d = jSONObject2;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.a;
            int i = this.b;
            JSONObject jSONObject = this.f3351c;
            JSONObject jSONObject2 = this.f3352d;
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            try {
                jSONObject2.put("log_type", "service_monitor");
                jSONObject2.put("service", str);
                jSONObject2.put("status", i);
                if (jSONObject != null) {
                    jSONObject2.put(PushLog.KEY_VALUE, jSONObject);
                }
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                c.m("monitorStatusAndDuration", jSONObject2.toString());
            }
        }
    }

    static class f implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ JSONObject b;

        f(String str, JSONObject jSONObject) {
            this.a = str;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.apm.data.pipeline.a.k().d(new com.bytedance.apm.v.d.c(this.a, this.b));
        }
    }

    static class g implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ long b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3353c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f3354d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f3355e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f3356f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ JSONObject f3357g;

        g(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
            this.a = j;
            this.b = j2;
            this.f3353c = str;
            this.f3354d = str2;
            this.f3355e = str3;
            this.f3356f = i;
            this.f3357g = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.apm.data.pipeline.d.l().d(new com.bytedance.apm.v.d.a("api_all", this.a, this.b, this.f3353c, this.f3354d, this.f3355e, this.f3356f, com.bytedance.android.input.k.b.a.r(this.f3357g)));
        }
    }

    static class h implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ JSONObject b;

        h(String str, JSONObject jSONObject) {
            this.a = str;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject c2 = new com.bytedance.apm.v.d.c(this.a, this.b).c();
            if (c2 != null) {
                c.m("monitorExceptionLog", c2.toString());
            }
        }
    }

    static class i implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ long b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3358c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f3359d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f3360e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f3361f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ JSONObject f3362g;

        i(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
            this.a = j;
            this.b = j2;
            this.f3358c = str;
            this.f3359d = str2;
            this.f3360e = str3;
            this.f3361f = i;
            this.f3362g = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            long j = this.a;
            long j2 = this.b;
            String str = this.f3358c;
            String str2 = this.f3359d;
            String str3 = this.f3360e;
            int i = this.f3361f;
            if (this.f3362g == null) {
                new JSONObject();
            }
            JSONObject jSONObject = null;
            if (!TextUtils.isEmpty("api_all")) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("log_type", "api_all");
                    jSONObject2.put("duration", j);
                    jSONObject2.put("uri", Uri.parse(str));
                    if (j2 > 0) {
                        jSONObject2.put("timestamp", j2);
                    }
                    jSONObject2.put("status", i);
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject2.put("ip", str2);
                    }
                    if (TextUtils.isEmpty(str3)) {
                        jSONObject2.put("trace_code", "");
                    } else {
                        jSONObject2.put("trace_code", str3);
                    }
                    jSONObject = jSONObject2;
                } catch (Exception unused) {
                }
            }
            if (jSONObject != null) {
                c.m("monitorSLA", jSONObject.toString());
            }
        }
    }

    static class j implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ long b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3363c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f3364d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f3365e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f3366f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ JSONObject f3367g;

        j(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
            this.a = j;
            this.b = j2;
            this.f3363c = str;
            this.f3364d = str2;
            this.f3365e = str3;
            this.f3366f = i;
            this.f3367g = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.apm.data.pipeline.d.l().d(new com.bytedance.apm.v.d.a("api_error", this.a, this.b, this.f3363c, this.f3364d, this.f3365e, this.f3366f, com.bytedance.android.input.k.b.a.r(this.f3367g)));
        }
    }

    static class k implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ long b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3368c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f3369d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f3370e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f3371f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ JSONObject f3372g;

        k(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject) {
            this.a = j;
            this.b = j2;
            this.f3368c = str;
            this.f3369d = str2;
            this.f3370e = str3;
            this.f3371f = i;
            this.f3372g = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            long j = this.a;
            long j2 = this.b;
            String str = this.f3368c;
            String str2 = this.f3369d;
            String str3 = this.f3370e;
            int i = this.f3371f;
            if (this.f3372g == null) {
                new JSONObject();
            }
            JSONObject jSONObject = null;
            if (!TextUtils.isEmpty("api_error")) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("log_type", "api_error");
                    jSONObject2.put("duration", j);
                    jSONObject2.put("uri", Uri.parse(str));
                    if (j2 > 0) {
                        jSONObject2.put("timestamp", j2);
                    }
                    jSONObject2.put("status", i);
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject2.put("ip", str2);
                    }
                    if (TextUtils.isEmpty(str3)) {
                        jSONObject2.put("trace_code", "");
                    } else {
                        jSONObject2.put("trace_code", str3);
                    }
                    jSONObject = jSONObject2;
                } catch (Exception unused) {
                }
            }
            if (jSONObject != null) {
                c.m("monitorApiError", jSONObject.toString());
            }
        }
    }

    static class l implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ JSONObject b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f3373c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ JSONObject f3374d;

        l(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            this.a = str;
            this.b = jSONObject;
            this.f3373c = jSONObject2;
            this.f3374d = jSONObject3;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.a;
            JSONObject jSONObject = this.b;
            JSONObject jSONObject2 = this.f3373c;
            JSONObject jSONObject3 = this.f3374d;
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            try {
                jSONObject3.put("log_type", "service_monitor");
                jSONObject3.put("service", str);
                jSONObject3.put("status", 0);
                if (jSONObject != null) {
                    jSONObject3.put(PushLog.KEY_CATEGORY, jSONObject);
                }
                if (jSONObject2 != null) {
                    jSONObject3.put("metric", jSONObject2);
                }
            } catch (JSONException unused) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                c.m("monitorEvent", jSONObject3.toString());
            }
        }
    }

    public static void a(String str, long j2, long j3, String str2, com.bytedance.apm.r.e eVar, com.bytedance.android.input.basic.a.b bVar) {
        ApmDelegate.i().f(str, j2, j3, str2, eVar, bVar);
    }

    private static void b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("_debug_uuid", com.bytedance.apm.g.z() + BundleUtil.UNDERLINE_TAG + f3345d.getAndAdd(1L));
            jSONObject.put("_debug_self", jSONObject2);
        } catch (Exception unused) {
        }
    }

    public static void c(long j2, long j3, String str, String str2, String str3, int i2, JSONObject jSONObject) {
        JSONObject l2 = l(jSONObject);
        com.bytedance.apm.F.b.e().h(new j(j2, j3, str, str2, str3, i2, l2));
        if (com.bytedance.apm.g.D()) {
            com.bytedance.apm.F.d.a().b(new k(j2, j3, str, str2, str3, i2, l2));
        }
    }

    public static void d(String str, JSONObject jSONObject) {
        int i2 = e.b.b.d.a.f9364e;
        JSONObject l2 = l(jSONObject);
        b(l2);
        com.bytedance.apm.F.b.e().h(new com.bytedance.apm.d(str, l2));
        if (com.bytedance.apm.g.D()) {
            com.bytedance.apm.F.d.a().b(new com.bytedance.apm.e(str, com.bytedance.android.input.k.b.a.r(l2), false));
        }
    }

    @Deprecated
    public static void e(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        int i2 = e.b.b.d.a.f9364e;
        JSONObject l2 = l(jSONObject2);
        b(l2);
        e.b.b.d.a.d(str, jSONObject, l2);
        if (com.bytedance.apm.g.D()) {
            com.bytedance.apm.F.d.a().b(new d(str, com.bytedance.android.input.k.b.a.r(jSONObject), com.bytedance.android.input.k.b.a.r(l2)));
        }
    }

    public static void f(com.bytedance.apm.config.d dVar) {
        int i2 = e.b.b.d.a.f9364e;
        JSONObject c2 = dVar.c();
        if (c2 == null) {
            c2 = new JSONObject();
        }
        if (c2.isNull("timestamp")) {
            try {
                c2.put("timestamp", System.currentTimeMillis());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        b(c2);
        com.bytedance.apm.F.b.e().h(new a(dVar, c2));
        if (com.bytedance.apm.g.D()) {
            com.bytedance.apm.F.d.a().b(new b(dVar, com.bytedance.android.input.k.b.a.r(dVar.b()), com.bytedance.android.input.k.b.a.r(dVar.d()), com.bytedance.android.input.k.b.a.r(c2)));
        }
    }

    public static void g(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        int i2 = e.b.b.d.a.f9364e;
        JSONObject l2 = l(jSONObject3);
        b(l2);
        e.b.b.d.a.g(str, com.bytedance.android.input.k.b.a.r(jSONObject), com.bytedance.android.input.k.b.a.r(jSONObject2), l2);
        if (com.bytedance.apm.g.D()) {
            com.bytedance.apm.F.d.a().b(new l(str, com.bytedance.android.input.k.b.a.r(jSONObject), com.bytedance.android.input.k.b.a.r(jSONObject2), com.bytedance.android.input.k.b.a.r(l2)));
        }
    }

    public static void h(String str, JSONObject jSONObject) {
        JSONObject l2 = l(jSONObject);
        com.bytedance.apm.F.b.e().h(new f(str, l2));
        if (com.bytedance.apm.g.D()) {
            com.bytedance.apm.F.d.a().b(new h(str, l2));
        }
    }

    public static void i(long j2, long j3, String str, String str2, String str3, int i2, JSONObject jSONObject) {
        JSONObject l2 = l(jSONObject);
        com.bytedance.apm.F.b.e().h(new g(j2, j3, str, str2, str3, i2, l2));
        if (com.bytedance.apm.g.D()) {
            com.bytedance.apm.F.d.a().b(new i(j2, j3, str, str2, str3, i2, l2));
        }
    }

    @Deprecated
    public static void j(String str, int i2, JSONObject jSONObject, JSONObject jSONObject2) {
        int i3 = e.b.b.d.a.f9364e;
        JSONObject l2 = l(jSONObject2);
        b(l2);
        e.b.b.d.a.e(new e.b.b.d.c.a(str, i2, com.bytedance.android.input.k.b.a.r(jSONObject), null, null, com.bytedance.android.input.k.b.a.r(l2)));
        if (com.bytedance.apm.g.D()) {
            com.bytedance.apm.F.d.a().b(new e(str, i2, com.bytedance.android.input.k.b.a.r(jSONObject), com.bytedance.android.input.k.b.a.r(jSONObject2)));
        }
    }

    public static void k(String str, int i2, JSONObject jSONObject) {
        int i3 = e.b.b.d.a.f9364e;
        JSONObject l2 = l(jSONObject);
        b(l2);
        e.b.b.d.a.f(str, i2, null, null, null, l2);
        if (com.bytedance.apm.g.D()) {
            com.bytedance.apm.F.d.a().b(new RunnableC0113c(str, i2, com.bytedance.android.input.k.b.a.r(l2)));
        }
    }

    private static JSONObject l(JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (Exception unused) {
            }
        }
        if (jSONObject.isNull("timestamp")) {
            jSONObject.put("timestamp", System.currentTimeMillis());
        }
        return jSONObject;
    }

    public static void m(String str, String str2) {
        try {
            synchronized (c.class) {
                String i2 = com.bytedance.apm.g.i();
                long id = Thread.currentThread().getId();
                long currentTimeMillis = System.currentTimeMillis();
                String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append("#");
                stringBuffer.append(id);
                stringBuffer.append("#");
                stringBuffer.append(currentTimeMillis);
                stringBuffer.append("#");
                stringBuffer.append(format);
                stringBuffer.append("\n");
                stringBuffer.append(str2);
                stringBuffer.append("\n");
                byte[] bytes = stringBuffer.toString().getBytes("UTF-8");
                String absolutePath = com.bytedance.apm.g.h().getExternalFilesDir(null).getAbsolutePath();
                if (f3344c == null) {
                    File file = new File(absolutePath + "/logs");
                    a = new File(absolutePath + "/logs/proc: " + i2);
                    File file2 = new File(absolutePath + "/logs/proc: " + i2 + "/" + format);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    if (!a.exists()) {
                        a.mkdirs();
                    }
                    file2.createNewFile();
                    f3344c = new RandomAccessFile(file2, "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0L, com.bytedance.apm.g.F() ? 2097152L : 262144L);
                }
                if (f3344c.remaining() < bytes.length) {
                    f3344c.force();
                    f3344c = new RandomAccessFile(new File(absolutePath + "/logs/proc: " + i2 + "/" + format), "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0L, com.bytedance.apm.g.F() ? 2097152L : 262144L);
                }
                f3344c.put(bytes);
                if (b == -1 || System.currentTimeMillis() - b > 3600000) {
                    if ((com.bytedance.apm.util.f.d(a) > DownloadConstants.GB || com.bytedance.apm.util.f.c(com.bytedance.apm.g.h()).getFreeSpace() < DownloadConstants.GB) && com.bytedance.apm.g.F() && a.exists()) {
                        File[] listFiles = a.listFiles();
                        Arrays.sort(listFiles, new com.bytedance.apm.f());
                        int i3 = 60;
                        if (listFiles.length <= 60) {
                            i3 = listFiles.length;
                        }
                        for (int i4 = 0; i4 < i3; i4++) {
                            listFiles[i4].delete();
                        }
                    }
                    b = System.currentTimeMillis();
                }
            }
        } catch (Throwable unused) {
        }
    }
}
