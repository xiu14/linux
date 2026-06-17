package com.bytedance.common.g;

import com.bytedance.common.g.b.b;
import com.bytedance.common.g.b.d;
import com.bytedance.common.push.e.g;
import com.bytedance.push.g0.f;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;

/* loaded from: classes.dex */
public class a {
    private static a b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile b f4137c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile com.bytedance.common.g.c.a f4138d;

    /* renamed from: e, reason: collision with root package name */
    private static volatile com.bytedance.common.g.c.b f4139e;
    private volatile com.bytedance.push.monitor.b a;

    private a() {
    }

    public static a c() {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public com.bytedance.push.monitor.b a() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        Object invoke = Class.forName("com.bytedance.android.service.manager.PushServiceManager").getMethod(MonitorConstants.CONNECT_TYPE_GET, new Class[0]).invoke(null, new Object[0]);
                        Object invoke2 = invoke.getClass().getMethod("getPushExternalService", new Class[0]).invoke(invoke, new Object[0]);
                        this.a = (com.bytedance.push.monitor.b) invoke2.getClass().getMethod("getPushSdkMonitorService", new Class[0]).invoke(invoke2, new Object[0]);
                    } catch (Throwable th) {
                        th.printStackTrace();
                        f.e("PushCommonSupport", "error when getPushSdkMonitorService,use default");
                        this.a = new com.bytedance.push.monitor.a();
                    }
                }
            }
        }
        return this.a;
    }

    public g b() {
        return c().e().c().o;
    }

    public com.bytedance.common.g.c.a d() {
        if (f4138d == null) {
            synchronized (this) {
                if (f4138d == null) {
                    f4138d = new com.bytedance.common.g.b.a();
                }
            }
        }
        return f4138d;
    }

    public b e() {
        if (f4137c == null) {
            synchronized (this) {
                if (f4137c == null) {
                    f4137c = new b();
                }
            }
        }
        return f4137c;
    }

    public com.bytedance.common.g.c.b f() {
        if (f4139e == null) {
            synchronized (this) {
                if (f4139e == null) {
                    f4139e = new d();
                }
            }
        }
        return f4139e;
    }
}
