package com.ss.alive.monitor.l;

import android.content.Context;
import com.ss.alive.monitor.services.impl.AssociationStartMonitorEventServiceImpl;

/* loaded from: classes2.dex */
public class a {
    private static volatile a b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile com.ss.alive.monitor.k.a.a f8257c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile AssociationStartMonitorEventServiceImpl f8258d;
    private Context a;

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

    public AssociationStartMonitorEventServiceImpl a() {
        if (f8258d == null) {
            synchronized (this) {
                if (f8258d == null) {
                    Context context = this.a;
                    if (context == null) {
                        context = com.bytedance.common.g.a.c().e().c().a;
                    }
                    f8258d = new AssociationStartMonitorEventServiceImpl(context);
                }
            }
        }
        return f8258d;
    }

    public com.ss.alive.monitor.k.a.a b(Context context) {
        this.a = context;
        if (f8257c == null) {
            synchronized (this) {
                if (f8257c == null) {
                    f8257c = new com.ss.alive.monitor.services.impl.a(context);
                }
            }
        }
        return f8257c;
    }
}
