package com.bytedance.crash.monitor;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.ICommonParams;
import com.vivo.push.PushClient;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class i extends com.bytedance.crash.monitor.a {
    private final ICommonParams q;
    private String u;
    private boolean v;
    private final d r = new d();
    private final d s = new d();
    private final d t = new d();
    private int w = 3;
    private Runnable x = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.D(i.this);
            if (i.this.f4643e == 0) {
                i.this.L();
            }
            if (i.this.w <= 0 || i.this.f4643e != 0) {
                return;
            }
            com.bytedance.crash.runtime.b.f(i.this.x, WsConstants.EXIT_DELAY_TIME);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.J();
            i.this.r.a();
        }
    }

    class c implements Runnable {
        private int a;

        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long j;
            if (i.this.f4644f == null) {
                i.this.K();
            }
            if (i.this.f4642d == null || i.this.f4645g == null || i.this.h == null || i.this.i == 0 || i.this.u == null) {
                i.this.J();
            }
            if (i.this.f4644f == null || i.this.f4642d == null || i.this.f4645g == null || i.this.u == null || i.this.h == null || i.this.i == 0) {
                int i = this.a + 1;
                this.a = i;
                if (i > 120) {
                    j = -1;
                } else {
                    j = 600000;
                    if (i < 30) {
                        j = 2000;
                    } else if (i < 60) {
                        j = com.heytap.mcssdk.constant.a.r;
                    }
                }
                if (j >= 0) {
                    com.bytedance.crash.runtime.b.f(this, j);
                }
            }
        }
    }

    static class d {
        d() {
        }

        void a() {
            synchronized (this) {
                notifyAll();
            }
        }

        void b(long j) {
            synchronized (this) {
                try {
                    wait(j);
                } catch (Throwable unused) {
                }
            }
        }
    }

    i(@NonNull ICommonParams iCommonParams) {
        this.q = iCommonParams;
        com.bytedance.crash.runtime.b.d(new c());
        com.bytedance.crash.runtime.b.f(this.x, WsConstants.EXIT_DELAY_TIME);
    }

    static /* synthetic */ int D(i iVar) {
        int i = iVar.w;
        iVar.w = i - 1;
        return i;
    }

    private long M(Object obj) {
        if (obj == null) {
            return 0L;
        }
        try {
            return Long.parseLong(String.valueOf(obj));
        } catch (Exception unused) {
            return 0L;
        }
    }

    void J() {
        Object obj;
        PackageInfo packageInfo;
        Object obj2;
        Object obj3;
        try {
            Map<String, Object> commonParams = this.q.getCommonParams();
            if (this.f4642d == null && (obj3 = commonParams.get(WsConstants.KEY_APP_ID)) != null) {
                String valueOf = String.valueOf(obj3);
                this.f4642d = valueOf;
                this.m.q(valueOf);
            }
            try {
                if (!this.v && (obj2 = commonParams.get("app_start_time")) != null) {
                    long M = M(obj2);
                    if (M > 0) {
                        this.v = true;
                        C0652g.n(Long.valueOf(M));
                    }
                }
            } catch (Throwable unused) {
            }
            if (this.f4645g == null) {
                Object obj4 = commonParams.get("channel");
                if (obj4 instanceof String) {
                    q((String) obj4);
                }
            }
            if (this.h == null || this.i == 0 || this.u == null) {
                Object obj5 = commonParams.get("app_version");
                Object obj6 = commonParams.get("version_code");
                Object obj7 = commonParams.get("version_name");
                if (obj7 instanceof String) {
                    this.u = (String) obj7;
                }
                String str = this.u;
                if (str != null) {
                    obj5 = str;
                }
                if (obj5 instanceof String) {
                    if (obj6 == null) {
                        packageInfo = C0652g.g().getPackageManager().getPackageInfo(C0652g.g().getPackageName(), 128);
                        obj = Integer.valueOf(packageInfo.versionCode);
                    } else {
                        obj = obj6;
                        packageInfo = null;
                    }
                    long M2 = M(commonParams.get("manifest_version_code"));
                    long M3 = M(commonParams.get("update_version_code"));
                    if (M3 == 0) {
                        if (packageInfo == null) {
                            try {
                                packageInfo = C0652g.g().getPackageManager().getPackageInfo(C0652g.g().getPackageName(), 128);
                            } catch (Throwable unused2) {
                            }
                        }
                        Bundle bundle = packageInfo.applicationInfo.metaData;
                        Object obj8 = bundle != null ? bundle.get("UPDATE_VERSION_CODE") : null;
                        if (obj8 == null) {
                            obj8 = Long.valueOf(M(commonParams.get("version_code")));
                        }
                        M3 = M(obj8);
                    }
                    if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof String)) {
                        try {
                            long M4 = M(obj);
                            if (M2 <= 0) {
                                M2 = M4;
                            }
                            String str2 = (String) obj5;
                            this.k = M3;
                            this.i = M4;
                            this.h = str2;
                            this.j = M2;
                            this.m.u(M4, M3, M2, str2);
                            C0652g.o(M4, M3, M2, str2);
                        } catch (Throwable th) {
                            com.bytedance.crash.Q.b.e("NPTH_CATCH_NEW", th);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            com.bytedance.android.input.k.b.a.F(th2);
        }
    }

    void K() {
        try {
            String deviceId = this.q.getDeviceId();
            com.bytedance.android.input.k.b.a.X("ConfigManager", "doUpdateDeviceId");
            if (deviceId != null) {
                this.f4644f = deviceId;
                this.m.s(deviceId);
            }
        } catch (Throwable th) {
            com.bytedance.crash.Q.b.e("NPTH_CATCH_NEW", th);
        }
    }

    void L() {
        try {
            long userId = this.q.getUserId();
            if (userId != 0) {
                this.f4643e = userId;
                this.m.t(userId);
            }
        } catch (Throwable th) {
            com.bytedance.crash.Q.b.e("NPTH_CATCH_NEW", th);
        }
    }

    void N() {
        if (com.bytedance.crash.runtime.b.a() == Thread.currentThread()) {
            J();
        } else {
            com.bytedance.crash.runtime.b.d(new b());
            this.r.b(200L);
        }
    }

    @Override // com.bytedance.crash.monitor.f, com.bytedance.crash.monitor.h
    public String b() {
        if (this.f4642d == null) {
            N();
        }
        return super.b();
    }

    @Override // com.bytedance.crash.monitor.f, com.bytedance.crash.monitor.h
    public String d() {
        if (this.f4645g == null) {
            N();
        }
        return super.d();
    }

    @Override // com.bytedance.crash.monitor.a, com.bytedance.crash.monitor.h
    public Map<String, Object> e() {
        ICommonParams iCommonParams = this.q;
        HashMap hashMap = null;
        if (iCommonParams != null) {
            Map<String, Object> commonParams = iCommonParams.getCommonParams();
            if (commonParams != null) {
                hashMap = new HashMap(commonParams);
                if (hashMap.containsKey("version_name")) {
                    try {
                        if (!hashMap.containsKey("app_version")) {
                            hashMap.put("app_version", hashMap.get("version_name"));
                            hashMap.put("app_version_from_name", PushClient.DEFAULT_REQUEST_ID);
                        }
                    } catch (Throwable unused) {
                    }
                }
                hashMap.remove("release_build");
            }
            String sessionId = this.q.getSessionId();
            long userId = this.q.getUserId();
            if (sessionId != null || userId > 0) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (sessionId != null) {
                    hashMap.put("session_id", sessionId);
                }
                if (userId > 0) {
                    hashMap.put("user_id", Long.valueOf(userId));
                }
            }
        }
        return hashMap;
    }

    @Override // com.bytedance.crash.monitor.f, com.bytedance.crash.monitor.h
    @NonNull
    public String f(String str) {
        if (TextUtils.isEmpty(this.f4644f)) {
            if (com.bytedance.crash.runtime.b.a() == Thread.currentThread()) {
                K();
            } else {
                com.bytedance.crash.runtime.b.d(new j(this));
                this.s.b(100L);
            }
        }
        return super.f(str);
    }

    @Override // com.bytedance.crash.monitor.f, com.bytedance.crash.monitor.h
    public long i() {
        if (this.h == null || this.i == 0) {
            N();
        }
        return super.i();
    }

    @Override // com.bytedance.crash.monitor.f, com.bytedance.crash.monitor.h
    public long k() {
        if (this.f4643e == 0) {
            if (com.bytedance.crash.runtime.b.a() == Thread.currentThread()) {
                L();
            } else {
                com.bytedance.crash.runtime.b.d(new k(this));
                this.t.b(200L);
            }
        }
        return this.f4643e != 0 ? this.f4643e : this.m.m(0L);
    }

    @Override // com.bytedance.crash.monitor.f, com.bytedance.crash.monitor.h
    @NonNull
    public com.bytedance.crash.monitor.c l() {
        if (this.h == null || this.i == 0) {
            N();
        }
        return super.l();
    }

    @Override // com.bytedance.crash.monitor.f, com.bytedance.crash.monitor.h
    public long m() {
        if (this.h == null || this.i == 0) {
            N();
        }
        return super.m();
    }

    @Override // com.bytedance.crash.monitor.f, com.bytedance.crash.monitor.h
    public String n() {
        if (this.h == null || this.i == 0) {
            N();
        }
        return super.n();
    }

    @Override // com.bytedance.crash.monitor.f
    public long w() {
        if (this.h == null || this.i == 0) {
            N();
        }
        return l().a();
    }
}
