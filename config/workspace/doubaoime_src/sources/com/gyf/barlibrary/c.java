package com.gyf.barlibrary;

import androidx.fragment.app.Fragment;

/* loaded from: classes2.dex */
public class c {
    private Fragment a;
    private b b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6853c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6854d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6855e;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Fragment fragment) {
        this.a = fragment;
        this.b = (b) fragment;
    }

    public void a() {
        this.f6853c = true;
        Fragment fragment = this.a;
        if (fragment == null || !fragment.getUserVisibleHint()) {
            return;
        }
        if (this.b.b()) {
            this.b.a();
        }
        if (this.f6854d) {
            return;
        }
        this.b.c();
        this.f6854d = true;
    }

    public void b() {
        Fragment fragment = this.a;
        if (fragment == null || !fragment.getUserVisibleHint()) {
            return;
        }
        if (this.b.b()) {
            this.b.a();
        }
        this.b.e();
    }

    public void c() {
        Fragment fragment = this.a;
        if (fragment == null || !fragment.getUserVisibleHint() || this.f6855e) {
            return;
        }
        this.b.h();
        this.f6855e = true;
    }

    public void d() {
        Fragment fragment = this.a;
        if (fragment != null && fragment.getActivity() != null && this.b.b()) {
            a.b(this.a).a();
        }
        this.a = null;
        this.b = null;
    }

    public void e(boolean z) {
        Fragment fragment = this.a;
        if (fragment != null) {
            fragment.setUserVisibleHint(!z);
        }
    }

    public void f() {
        if (this.a != null) {
            this.b.f();
        }
    }

    public void g() {
        Fragment fragment = this.a;
        if (fragment == null || !fragment.getUserVisibleHint()) {
            return;
        }
        this.b.e();
    }

    public void h() {
        Fragment fragment = this.a;
        if (fragment != null) {
            if (!fragment.getUserVisibleHint()) {
                if (this.f6853c) {
                    this.b.f();
                    return;
                }
                return;
            }
            if (!this.f6855e) {
                this.b.h();
                this.f6855e = true;
            }
            if (this.f6853c && this.a.getUserVisibleHint()) {
                if (this.b.b()) {
                    this.b.a();
                }
                if (!this.f6854d) {
                    this.b.c();
                    this.f6854d = true;
                }
                this.b.e();
            }
        }
    }
}
