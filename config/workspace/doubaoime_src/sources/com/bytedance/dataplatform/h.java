package com.bytedance.dataplatform;

import android.app.Application;
import android.util.Log;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.s.c.A;
import kotlin.s.c.t;

/* loaded from: classes.dex */
public final class h {
    static final /* synthetic */ kotlin.reflect.i[] a;
    private static Application b;

    /* renamed from: c, reason: collision with root package name */
    private static o f4725c;

    /* renamed from: d, reason: collision with root package name */
    private static final List<kotlin.k<String, com.bytedance.dataplatform.u.a<?>, String>> f4726d;

    /* renamed from: e, reason: collision with root package name */
    private static final kotlin.e f4727e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f4728f;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.a<Map<String, Integer>> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public Map<String, Integer> invoke() {
            return d.b(h.f4728f.b(), "CLIENT_EXPERIMENT_CACHE_TAG");
        }
    }

    static final class b implements Runnable {
        final /* synthetic */ o a;

        b(o oVar) {
            this.a = oVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (kotlin.k kVar : h.a(h.f4728f)) {
                this.a.e((String) kVar.d(), (com.bytedance.dataplatform.u.a) kVar.e(), (String) kVar.f());
            }
        }
    }

    static {
        t tVar = new t(A.b(h.class), "clientExperimentLayer", "getClientExperimentLayer()Ljava/util/Map;");
        A.g(tVar);
        a = new kotlin.reflect.i[]{tVar};
        f4728f = new h();
        f4726d = new CopyOnWriteArrayList();
        new HashMap();
        f4727e = kotlin.a.c(a.a);
    }

    private h() {
    }

    public static final /* synthetic */ List a(h hVar) {
        return f4726d;
    }

    public final Application b() {
        return b;
    }

    public final void c(Application application) {
        b = application;
    }

    public final void d(o oVar) {
        kotlin.s.c.l.g(oVar, "exposureManager");
        if (f4725c == null) {
            Log.d("Experiment:", "setExposureManager");
            f4725c = oVar;
            s.a(new b(oVar));
        }
    }
}
