package com.bytedance.apm.t;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.l;

/* loaded from: classes.dex */
public class b extends a implements com.bytedance.services.apm.api.d, com.bytedance.apm.k {
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3526c;

    /* renamed from: d, reason: collision with root package name */
    private j f3527d = j.r();

    @Override // com.bytedance.apm.k
    public void b(com.bytedance.apm.config.e eVar) {
        if (eVar == null) {
            return;
        }
        long b = eVar.b();
        long c2 = eVar.c();
        boolean h = eVar.h();
        boolean e2 = eVar.e();
        this.f3527d.z(h);
        this.f3527d.x(b);
        this.f3527d.D(c2);
        this.f3527d.y(e2);
        this.f3527d.B(eVar.f());
        this.f3527d.C(com.bytedance.apm.g.H() || eVar.i());
    }

    @Override // com.bytedance.apm.t.a
    public void c(String str) {
        super.c(str);
        if (this.f3526c) {
            this.f3527d.w(str);
        }
    }

    @Override // com.bytedance.apm.t.a
    public void d(long j, long j2, long j3, long j4, boolean z) {
        super.d(j, j2, j3, j4, z);
        if (this.f3526c) {
            this.f3527d.v(z);
        }
    }

    public void h() {
        ActivityLifeObserver.getInstance().register(this);
        l.a(this);
        this.f3527d.t();
        com.bytedance.apm.t.l.d.i().h(this);
        com.bytedance.apm.t.l.d.i().n();
        this.b = true;
        if (com.bytedance.apm.g.B()) {
            com.bytedance.apm.y.d.b("BlockDetector", "BlockDetector init: ");
        }
    }

    public void i(long j) {
        this.f3527d.x(j);
    }

    public void j(boolean z) {
        this.f3527d.E(z);
    }

    public void k(boolean z) {
        this.f3527d.F(z);
    }

    public void l() {
        if (!this.b || this.f3526c) {
            return;
        }
        this.f3526c = true;
        if (com.bytedance.apm.g.B()) {
            com.bytedance.apm.y.d.b("BlockDetector", "BlockDetector start: ");
        }
    }

    @Override // com.bytedance.services.apm.api.d
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onActivityPause(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onActivityResume(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onActivityStarted(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onBackground(Activity activity) {
        if (this.f3526c) {
            this.f3526c = false;
            this.f3527d.v(false);
            if (com.bytedance.apm.g.B()) {
                com.bytedance.apm.y.d.b("BlockDetector", "BlockDetector stop: ");
            }
        }
    }

    @Override // com.bytedance.services.apm.api.d
    public void onChange(Activity activity, Fragment fragment) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onFront(Activity activity) {
        l();
    }
}
