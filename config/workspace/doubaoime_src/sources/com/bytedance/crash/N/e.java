package com.bytedance.crash.N;

import com.bytedance.services.slardar.config.IConfigManager;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends com.bytedance.crash.N.b implements com.bytedance.services.slardar.config.a {
    private volatile int l;
    private IConfigManager m;
    private final Runnable n;
    private volatile boolean o;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.l(e.this);
        }
    }

    class b implements Runnable {
        final /* synthetic */ JSONObject a;

        b(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.i(this.a);
        }
    }

    public e(com.bytedance.crash.monitor.h hVar) {
        super(hVar);
        this.o = false;
        this.n = new a();
    }

    static void l(e eVar) {
        Objects.requireNonNull(eVar);
        com.bytedance.android.input.k.b.a.W("tryGetConfigFromApm isReady:" + eVar.o);
        if (eVar.o) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("tryGetConfigFromApm mTryCount:");
        M.append(eVar.l);
        com.bytedance.android.input.k.b.a.W(M.toString());
        if (eVar.l >= 30) {
            com.bytedance.crash.runtime.b.h(eVar.n);
            super.d();
        } else {
            if (eVar.m == null) {
                IConfigManager iConfigManager = (IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class);
                eVar.m = iConfigManager;
                if (iConfigManager != null) {
                    iConfigManager.registerConfigListener(eVar);
                }
            }
            com.bytedance.crash.runtime.b.h(eVar.n);
            com.bytedance.crash.runtime.b.f(eVar.n, 2000L);
        }
        eVar.l++;
    }

    @Override // com.bytedance.crash.N.b
    protected void d() {
        if (!com.bytedance.crash.util.a.k()) {
            super.d();
            return;
        }
        try {
            IConfigManager iConfigManager = (IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class);
            this.m = iConfigManager;
            if (iConfigManager != null) {
                iConfigManager.registerConfigListener(this);
            }
            com.bytedance.crash.runtime.b.f(this.n, 2000L);
        } catch (Throwable th) {
            super.d();
            com.bytedance.android.input.k.b.a.F(th);
        }
    }

    @Override // com.bytedance.services.slardar.config.a
    public void onReady() {
    }

    @Override // com.bytedance.services.slardar.config.a
    public void onRefresh(JSONObject jSONObject, boolean z) {
        this.o = true;
        com.bytedance.crash.runtime.b.h(this);
        com.bytedance.crash.runtime.b.d(new b(jSONObject));
    }
}
