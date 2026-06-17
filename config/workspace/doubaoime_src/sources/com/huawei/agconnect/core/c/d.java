package com.huawei.agconnect.core.c;

import android.content.Context;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class d extends com.huawei.b.c {

    /* renamed from: c, reason: collision with root package name */
    private static List<com.huawei.agconnect.core.a> f6945c;

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, com.huawei.b.c> f6946d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private static String f6947e;
    private final com.huawei.b.d a;
    private final f b;

    public d(com.huawei.b.d dVar) {
        Log.d("AGC_Instance", "AGConnectInstanceImpl init");
        this.a = dVar;
        if (f6945c == null) {
            Log.e("AGC_Instance", "please call `initialize()` first");
        }
        new f(f6945c, dVar.getContext());
        f fVar = new f(null, dVar.getContext());
        this.b = fVar;
        if (dVar instanceof com.huawei.b.g.e.b) {
            fVar.a(((com.huawei.b.g.e.b) dVar).e(), dVar.getContext());
        }
        Log.d("AGC_Instance", "AGConnectInstanceImpl init end");
    }

    public static com.huawei.b.c c() {
        String str = f6947e;
        if (str == null) {
            str = "DEFAULT_INSTANCE";
        }
        return f(str);
    }

    public static com.huawei.b.c d(com.huawei.b.d dVar) {
        return e(dVar, false);
    }

    private static synchronized com.huawei.b.c e(com.huawei.b.d dVar, boolean z) {
        com.huawei.b.c cVar;
        synchronized (d.class) {
            Map<String, com.huawei.b.c> map = f6946d;
            cVar = map.get(dVar.b());
            if (cVar == null || z) {
                cVar = new d(dVar);
                map.put(dVar.b(), cVar);
            }
        }
        return cVar;
    }

    public static synchronized com.huawei.b.c f(String str) {
        com.huawei.b.c cVar;
        synchronized (d.class) {
            cVar = f6946d.get(str);
            if (cVar == null) {
                if ("DEFAULT_INSTANCE".equals(str)) {
                    Log.w("AGC_Instance", "please call `initialize()` first");
                } else {
                    Log.w("AGC_Instance", "not find instance for : " + str);
                }
            }
        }
        return cVar;
    }

    public static synchronized void g(Context context) {
        synchronized (d.class) {
            Log.w("AGC_Instance", "agc sdk initialize");
            if (f6946d.size() > 0) {
                Log.w("AGC_Instance", "Repeated invoking initialize");
            } else {
                h(context, com.huawei.b.g.a.d(context));
            }
        }
    }

    private static synchronized void h(Context context, com.huawei.b.d dVar) {
        synchronized (d.class) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext == null) {
                Log.w("AGC_Instance", "context.getApplicationContext null");
            } else {
                context = applicationContext;
            }
            com.huawei.b.f.b("/agcgw/url", new b());
            com.huawei.b.f.b("/agcgw/backurl", new c());
            if (f6945c == null) {
                f6945c = new e(context).a();
            }
            e(dVar, true);
            f6947e = "DEFAULT_INSTANCE";
            Log.i("AGC_Instance", "initFinish callback start");
            a.a();
            Log.i("AGC_Instance", "AGC SDK initialize end");
        }
    }

    @Override // com.huawei.b.c
    public Context a() {
        return this.a.getContext();
    }

    @Override // com.huawei.b.c
    public com.huawei.b.d b() {
        return this.a;
    }
}
