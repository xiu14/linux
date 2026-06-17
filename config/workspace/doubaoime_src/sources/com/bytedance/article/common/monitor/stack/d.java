package com.bytedance.article.common.monitor.stack;

import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.bytedance.apm.F.b;
import com.bytedance.apm.g;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.util.n;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.LinkedList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d implements b.e {
    private static String h = "https://mon.zijieapi.com/monitor/collect/c/exception";
    private static final Object i = new Object();
    private static volatile d j;
    private volatile long a;
    private volatile int b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f3936c;

    /* renamed from: d, reason: collision with root package name */
    private volatile long f3937d;

    /* renamed from: e, reason: collision with root package name */
    private volatile JSONObject f3938e;

    /* renamed from: f, reason: collision with root package name */
    private final LinkedList<f> f3939f = new LinkedList<>();

    /* renamed from: g, reason: collision with root package name */
    private volatile a f3940g;

    private d() {
        com.bytedance.apm.F.b.e().b(this);
        this.f3940g = new a();
    }

    static void g(d dVar, String str, String str2) {
        Objects.requireNonNull(dVar);
        try {
            if (ApmDelegate.i().o()) {
                com.bytedance.android.input.k.b.a.H(n.a(str, g.x()), str2.getBytes(), HttpUtil$CompressType.GZIP, "application/json; charset=utf-8", true);
            }
        } catch (Throwable th) {
            int i2 = th instanceof e ? th.a : -1;
            if (i2 < 500 || i2 > 600) {
                return;
            }
            dVar.f3937d = System.currentTimeMillis();
            dVar.f3936c = true;
        }
    }

    public static d j() {
        if (j == null) {
            synchronized (i) {
                if (j == null) {
                    j = new d();
                }
            }
        }
        return j;
    }

    public static void k(String str) {
        h = str;
    }

    @WorkerThread
    public void h(Throwable th, String str) {
        try {
            StackTraceElement[] stackTrace = th.getStackTrace();
            String className = stackTrace[0].getClassName();
            String methodName = stackTrace[0].getMethodName();
            int lineNumber = stackTrace[0].getLineNumber();
            String d2 = b.d(th);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_type", "exception");
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("class_ref", className);
            jSONObject.put("method", methodName);
            jSONObject.put("line_num", lineNumber);
            jSONObject.put("stack", d2);
            jSONObject.put("exception_type", 1);
            jSONObject.put("is_core", 1);
            jSONObject.put("message", str);
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject2.put(RemoteMessageConst.DATA, jSONArray);
            if (this.f3938e == null) {
                this.f3938e = g.k();
            }
            jSONObject2.put("header", this.f3938e);
            com.bytedance.android.input.k.b.a.H(n.a(h, g.x()), jSONObject2.toString().getBytes(), HttpUtil$CompressType.GZIP, "application/json; charset=utf-8", true);
        } catch (Throwable unused) {
        }
    }

    public void i(String str, String str2, String str3, boolean z) {
        boolean z2;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (z) {
                    JSONObject jSONObject = new JSONObject(str2);
                    jSONObject.put("log_type", "log_exception");
                    if (str3 != null) {
                        if (str3.length() > 10240) {
                            jSONObject.put("extraMessage", str3.substring(0, 10240));
                        } else {
                            jSONObject.put("extraMessage", str3);
                        }
                    }
                }
                if (!ApmDelegate.i().o()) {
                    if (this.f3940g != null) {
                        this.f3940g.b(str, str2);
                        return;
                    }
                    return;
                }
                boolean j2 = ApmDelegate.i().j(str);
                boolean l = ApmDelegate.i().l(str3);
                if ((j2 || l) && !this.f3936c) {
                    synchronized (i) {
                        int size = this.f3939f.size();
                        z2 = size >= 20;
                        this.f3939f.add(new f(str, str2));
                        this.b = size + 1;
                    }
                    if (z2) {
                        this.a = System.currentTimeMillis();
                        com.bytedance.apm.F.b.e().o(new c(this));
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.bytedance.apm.F.b.e
    public void onTimeEvent(long j2) {
        try {
            if (this.f3940g != null) {
                this.f3940g.c();
            }
            long currentTimeMillis = System.currentTimeMillis();
            if ((currentTimeMillis - this.a > 1200000 && this.b > 0) || this.b > 20) {
                this.a = System.currentTimeMillis();
                com.bytedance.apm.F.b.e().o(new c(this));
            }
            if (!this.f3936c || currentTimeMillis - this.f3937d <= 1800000) {
                return;
            }
            this.f3936c = false;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
