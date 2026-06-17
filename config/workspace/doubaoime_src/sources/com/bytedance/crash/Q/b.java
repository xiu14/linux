package com.bytedance.crash.Q;

import android.content.Context;
import android.os.Environment;
import android.os.Looper;
import android.os.Process;
import android.os.StatFs;
import androidx.annotation.NonNull;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.N.g;
import com.bytedance.crash.R.e;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.monitor.h;
import com.bytedance.crash.upload.CrashUploader;
import com.bytedance.crash.upload.l;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    private static b b;
    private final h a;

    static class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ JSONObject b;

        a(String str, JSONObject jSONObject) {
            this.a = str;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (CrashUploader.q(this.a, this.b)) {
                    l.d().i();
                }
            } catch (Throwable unused) {
            }
        }
    }

    private b(@NonNull Context context) {
        h b2 = com.bytedance.crash.monitor.l.b(context, "2010", 4020158L, 4020158L, "4.2.1-rc.8-oime");
        this.a = b2;
        b2.q("release");
        com.bytedance.crash.monitor.a e2 = com.bytedance.crash.monitor.l.e();
        if (e2 != null) {
            b2.r(e2.f("0"));
        }
    }

    static b a() {
        return b;
    }

    static h b(b bVar) {
        return bVar.a;
    }

    public static void c(String str, Throwable th) {
        b bVar = b;
        if (bVar == null) {
            return;
        }
        h hVar = bVar.a;
        try {
            e eVar = new e(th, null, 0, str, true, null, Thread.currentThread().getName(), "EnsureNotReachHere", "core_exception_monitor", "exception");
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(eVar.g(hVar));
            jSONObject.put(RemoteMessageConst.DATA, jSONArray);
            JSONObject e2 = Header.b(hVar, System.currentTimeMillis(), CrashType.ENSURE, Process.myPid()).e();
            jSONObject.put("header", e2);
            String d2 = CrashUploader.d(g.h(), e2);
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                com.bytedance.crash.runtime.b.d(new a(d2, jSONObject));
            }
        } catch (Throwable unused) {
        }
    }

    public static void d() {
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b(C0652g.g());
                }
            }
        }
    }

    public static void e(String str, Throwable th) {
        b bVar = b;
        if (bVar != null) {
            bVar.a.g().o(th, str);
        }
    }

    public static void f(String str, Throwable th) {
        long j;
        try {
            j = new StatFs(Environment.getDataDirectory().getPath()).getFreeBytes();
        } catch (Throwable unused) {
            j = 0;
        }
        boolean z = j < 25165824;
        b bVar = b;
        if (bVar != null) {
            bVar.a.p(str + BundleUtil.UNDERLINE_TAG + z, th);
        }
    }

    /* renamed from: com.bytedance.crash.Q.b$b, reason: collision with other inner class name */
    public static class C0199b {
        private final JSONObject a;
        private JSONObject b;

        /* renamed from: c, reason: collision with root package name */
        private final String f4474c;

        public C0199b(String str) {
            this.b = new JSONObject();
            this.f4474c = str;
            this.a = new JSONObject();
        }

        public C0199b a(Object... objArr) {
            com.bytedance.android.input.k.b.a.c(this.a, objArr);
            return this;
        }

        public C0199b b(JSONObject jSONObject) {
            this.b = jSONObject;
            return this;
        }

        public C0199b c(Object... objArr) {
            com.bytedance.android.input.k.b.a.c(this.b, objArr);
            return this;
        }

        public void d() {
            b a = b.a();
            if (a != null) {
                com.bytedance.crash.monitor.a e2 = com.bytedance.crash.monitor.l.e();
                if (e2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(WsConstants.KEY_APP_ID, e2.b());
                    hashMap.put("device_id", e2.f("0"));
                    hashMap.put("update_version_code", String.valueOf(e2.i()));
                    hashMap.put("version_code", String.valueOf(e2.m()));
                    hashMap.put("app_version", String.valueOf(e2.n()));
                    hashMap.put("channel", e2.d());
                    hashMap.put("npth_version", "4.2.1-rc.8-oime");
                    com.bytedance.android.input.k.b.a.z0(this.a, hashMap);
                }
                h b = b.b(a);
                b.h().e(this.f4474c, 1, this.a, this.b);
            }
        }

        public C0199b(String str, JSONObject jSONObject) {
            this.b = new JSONObject();
            this.f4474c = str;
            this.a = jSONObject;
        }
    }
}
