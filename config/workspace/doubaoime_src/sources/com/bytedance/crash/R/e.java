package com.bytedance.crash.R;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.I;
import com.bytedance.crash.J;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {
    private static int o = Process.myPid();
    private Throwable a;
    private StackTraceElement[] b;

    /* renamed from: c, reason: collision with root package name */
    private String f4492c;

    /* renamed from: d, reason: collision with root package name */
    private String f4493d;

    /* renamed from: e, reason: collision with root package name */
    private String f4494e;

    /* renamed from: f, reason: collision with root package name */
    private String f4495f;

    /* renamed from: g, reason: collision with root package name */
    private String f4496g;
    private String h;
    private String i;
    private Map<String, String> j;
    private boolean k;
    private int l;
    private long m;
    private String n;

    public e(Throwable th, StackTraceElement[] stackTraceElementArr, int i, String str, boolean z, Map<String, String> map, String str2, String str3, String str4, String str5) {
        this.a = th;
        this.b = stackTraceElementArr;
        this.l = i;
        this.f4492c = str;
        this.k = z;
        this.j = map;
        this.f4493d = str2;
        this.f4494e = str3;
        this.f4495f = str4;
        this.m = System.currentTimeMillis();
        this.n = str5;
    }

    private void a(JSONObject jSONObject, com.bytedance.crash.monitor.h hVar) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            Map<String, String> map = this.j;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
            }
            if (hVar != null) {
                for (Map.Entry entry2 : ((HashMap) hVar.j().s(CrashType.ENSURE)).entrySet()) {
                    jSONObject2.put((String) entry2.getKey(), entry2.getValue());
                }
            }
            if (com.bytedance.android.input.k.b.a.f0(jSONObject2)) {
                return;
            }
            jSONObject.put(MonitorConstants.CUSTOM, jSONObject2);
        } catch (Throwable unused) {
        }
    }

    protected void b(JSONObject jSONObject, com.bytedance.crash.monitor.h hVar, Map<String, String> map) {
        Map<String, String> map2;
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("storage_free_range", com.bytedance.crash.dumper.a.i(com.bytedance.crash.dumper.a.y()));
            jSONObject2.put("alog_inited", com.bytedance.crash.K.a.c());
            jSONObject.put("filters", jSONObject2);
            if (this.h != null) {
                jSONObject2.put("has_dump", "true");
            }
            if (hVar == null) {
                return;
            }
            if (this.h != null && (map2 = this.j) != null) {
                for (Map.Entry<String, String> entry : map2.entrySet()) {
                    if (!TextUtils.isEmpty(entry.getKey()) && entry.getValue() != null) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map == null || map.size() <= 0) {
                return;
            }
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                if (!TextUtils.isEmpty(entry2.getKey()) && entry2.getValue() != null) {
                    jSONObject2.put(entry2.getKey(), entry2.getValue());
                }
            }
        } catch (Throwable th) {
            Log.e("NPTH", "EnsureReportData", th);
        }
    }

    public String c() {
        String str;
        String str2 = this.f4496g;
        if (str2 != null) {
            return str2;
        }
        Throwable th = this.a;
        if (th != null) {
            str = com.bytedance.crash.util.g.a(th);
        } else {
            StackTraceElement[] stackTraceElementArr = this.b;
            if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
                str = null;
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i = this.l; i < stackTraceElementArr.length; i++) {
                    StackTraceElement stackTraceElement = stackTraceElementArr[i];
                    int i2 = com.bytedance.crash.util.g.a;
                    String className = stackTraceElement.getClassName();
                    sb.append("  at ");
                    sb.append(className);
                    sb.append(".");
                    sb.append(stackTraceElement.getMethodName());
                    sb.append("(");
                    sb.append(stackTraceElement.getFileName());
                    sb.append(Constants.COLON_SEPARATOR);
                    sb.append(stackTraceElement.getLineNumber());
                    sb.append(")\n");
                }
                str = sb.toString();
            }
        }
        this.f4496g = str;
        return str;
    }

    public String d() {
        return this.f4495f;
    }

    public String e() {
        return this.f4492c;
    }

    public String f() {
        String str = this.i;
        if (str != null) {
            return str;
        }
        String str2 = this.h;
        if (str2 != null) {
            this.i = com.bytedance.android.input.k.b.a.N(str2);
        } else {
            this.i = com.bytedance.android.input.k.b.a.N(c());
        }
        return this.i;
    }

    public JSONObject g(com.bytedance.crash.monitor.h hVar) {
        if (J.E()) {
            return h(hVar, null);
        }
        Map<String, String> x = hVar.j().x();
        Map<String, String> k = I.k();
        if (k != null) {
            HashMap hashMap = new HashMap();
            hashMap.putAll(x);
            hashMap.putAll(k);
            x = hashMap;
        }
        return h(hVar, x);
    }

    public JSONObject h(com.bytedance.crash.monitor.h hVar, Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event_type", this.n);
            jSONObject.put("crash_time", this.m);
            jSONObject.put("log_type", TextUtils.isEmpty(this.f4495f) ? "core_exception_monitor" : this.f4495f);
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("crash_md5", f());
            jSONObject.put("message", this.f4492c);
            jSONObject.put("crash_thread_name", this.f4493d);
            jSONObject.put("process_name", com.bytedance.crash.util.a.i());
            jSONObject.put("app_start_time", C0652g.b());
            int i = 1;
            jSONObject.put("exception_type", 1);
            jSONObject.put("pid", o);
            if (this.h != null) {
                jSONObject.put("class_ref", "Native");
                jSONObject.put("method", "Native");
                jSONObject.put("is_core", 1);
                jSONObject.put("line_num", -1);
                jSONObject.put("ensure_type", "EnsureNotReachHere");
                jSONObject.put("crash_lib_uuid", com.bytedance.crash.util.c.a().b(this.h));
                jSONObject.put("stack", this.h);
                jSONObject.put("has_dump", "true");
                String str = this.f4496g;
                if (str != null) {
                    jSONObject.put("java_data", str);
                }
            } else {
                StackTraceElement[] stackTraceElementArr = this.b;
                if (stackTraceElementArr == null) {
                    stackTraceElementArr = this.a.getStackTrace();
                }
                StackTraceElement stackTraceElement = stackTraceElementArr[this.l];
                jSONObject.put("class_ref", stackTraceElement.getClassName());
                jSONObject.put("method", stackTraceElement.getMethodName());
                jSONObject.put("line_num", stackTraceElement.getLineNumber());
                jSONObject.put("stack", c());
                if (!this.k) {
                    i = 0;
                }
                jSONObject.put("is_core", i);
                if (!TextUtils.isEmpty(this.f4494e)) {
                    jSONObject.put("ensure_type", this.f4494e);
                }
            }
            String e2 = C0652g.e();
            if (e2 != null) {
                jSONObject.put("business", e2);
            }
            a(jSONObject, hVar);
            b(jSONObject, hVar, map);
            com.bytedance.android.input.k.b.a.w0(jSONObject);
            jSONObject.put("is_background", com.bytedance.crash.a0.a.A());
            com.bytedance.crash.a0.a.C(jSONObject);
            com.bytedance.crash.a0.a.D(jSONObject);
            try {
                com.bytedance.crash.dumper.e c2 = hVar.c();
                if (c2 != null) {
                    com.bytedance.android.input.k.b.a.j(jSONObject, c2.c(CrashType.ENSURE));
                }
            } catch (Throwable unused) {
            }
        } catch (Exception e3) {
            Log.e("NPTH", "EnsureReportData", e3);
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("EnsureReportData{throwable=");
        M.append(this.a);
        M.append(", traceElements=");
        M.append(Arrays.toString(this.b));
        M.append(", stackDepth=");
        M.append(this.l);
        M.append(", message='");
        e.a.a.a.a.G0(M, this.f4492c, '\'', ", isCore=");
        M.append(this.k);
        M.append(", data=");
        M.append(this.j);
        M.append(", threadName='");
        e.a.a.a.a.G0(M, this.f4493d, '\'', ", exceptionType='");
        e.a.a.a.a.G0(M, this.f4494e, '\'', ", logType='");
        e.a.a.a.a.G0(M, this.f4495f, '\'', ", javaStack='");
        e.a.a.a.a.G0(M, this.f4496g, '\'', ", nativeStack='");
        e.a.a.a.a.G0(M, this.h, '\'', ", eventTime=");
        M.append(this.m);
        M.append(", md5='");
        M.append(this.i);
        M.append('\'');
        M.append(", totalData=");
        M.append((Object) null);
        M.append('}');
        return M.toString();
    }

    public e(String str, String str2, String str3, Map<String, String> map, String str4, String str5, String str6, int i) {
        this.f4496g = str;
        if (str2 != null && !str2.startsWith("Signal")) {
            StringBuilder sb = new StringBuilder();
            try {
                if (str3 == null) {
                    sb.append("Signal 111(NATIVE_EXCEPTION)\n");
                } else {
                    sb.append("Signal 111(");
                    if (str3.length() > 30) {
                        sb.append(str3.substring(0, 30));
                    } else {
                        sb.append(str3);
                    }
                    sb.append(")\n");
                }
                sb.append(str2);
            } catch (Throwable unused) {
            }
            str2 = sb.toString();
        }
        this.h = str2;
        this.f4492c = str3;
        this.f4493d = str4;
        this.f4495f = str5;
        this.j = map;
        this.m = System.currentTimeMillis();
        this.n = str6;
        o = i;
    }
}
