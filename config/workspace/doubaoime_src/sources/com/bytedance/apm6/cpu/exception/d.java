package com.bytedance.apm6.cpu.exception;

import android.content.Context;
import androidx.annotation.Nullable;
import com.bytedance.apm.g;

/* loaded from: classes.dex */
public class d {
    private boolean a = false;
    private boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3684c;

    /* renamed from: d, reason: collision with root package name */
    private e.b.b.m.g.a f3685d;

    /* renamed from: e, reason: collision with root package name */
    private e.b.o.a.a.b f3686e;

    /* renamed from: f, reason: collision with root package name */
    private a f3687f;

    /* renamed from: g, reason: collision with root package name */
    private com.bytedance.apm6.cpu.b.c f3688g;
    private a h;
    private a i;
    private a j;
    private a k;
    private a l;

    public d(e.b.b.m.g.a aVar) {
        this.f3685d = aVar;
    }

    private void a(a aVar) {
        if (this.a && this.b) {
            this.f3687f = aVar;
            com.bytedance.apm6.cpu.b.c cVar = this.f3688g;
            e.b.b.m.g.a aVar2 = this.f3685d;
            aVar.b(cVar, aVar2 == null || !aVar2.isForeground());
            if (e.b.b.n.a.b()) {
                StringBuilder M = e.a.a.a.a.M("change cpu exception detect state: ");
                M.append(this.f3687f);
                e.b.b.n.g.b.d("APM-CPU", M.toString());
            }
        }
    }

    @Nullable
    public e.b.o.a.a.b b() {
        return this.f3686e;
    }

    public void c(a aVar, a aVar2, a aVar3, a aVar4, a aVar5) {
        if (this.b) {
            return;
        }
        this.h = aVar;
        this.i = aVar2;
        this.j = aVar3;
        this.k = aVar4;
        this.l = aVar5;
        try {
            Context h = g.h();
            this.f3686e = h == null ? null : e.b.o.a.b.a.e(h);
        } catch (Throwable unused) {
        }
        this.b = true;
    }

    public synchronized void d() {
        a(this.k);
    }

    public synchronized void e() {
        a(this.l);
    }

    public synchronized void f(boolean z) {
        a aVar = this.f3687f;
        if (aVar != null && this.a) {
            if (this.f3684c == z) {
                return;
            }
            this.f3684c = z;
            aVar.c(z);
        }
    }

    public synchronized void g() {
        a(this.h);
    }

    public synchronized void h() {
        a(this.i);
    }

    public synchronized void i() {
        a(this.j);
    }

    public synchronized void j(com.bytedance.apm6.cpu.b.c cVar) {
        if (!this.a && this.b) {
            this.f3688g = cVar;
            boolean z = true;
            this.a = true;
            b.b(com.bytedance.apm6.cpu.a.c().b());
            if (this.f3685d.isForeground()) {
                z = false;
            }
            this.f3684c = z;
            g();
        }
    }

    public synchronized void k() {
        a aVar = this.f3687f;
        if (aVar != null && this.a) {
            aVar.d();
            this.a = false;
        }
    }
}
