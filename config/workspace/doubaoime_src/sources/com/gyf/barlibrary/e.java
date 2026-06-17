package com.gyf.barlibrary;

import androidx.fragment.app.Fragment;

/* loaded from: classes2.dex */
public class e {
    private Fragment a;
    private d b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6856c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(Fragment fragment) {
        this.a = fragment;
        this.b = (d) fragment;
    }

    private void e() {
        Fragment fragment = this.a;
        if (fragment != null && this.f6856c && fragment.getUserVisibleHint() && this.b.b()) {
            this.b.a();
        }
    }

    public void a() {
        this.f6856c = true;
        e();
    }

    public void b() {
        e();
    }

    public void c() {
        Fragment fragment = this.a;
        if (fragment != null && fragment.getActivity() != null && this.b.b()) {
            a.b(this.a).a();
        }
        this.a = null;
        this.b = null;
    }

    public void d(boolean z) {
        Fragment fragment = this.a;
        if (fragment != null) {
            fragment.setUserVisibleHint(!z);
        }
    }

    public void f() {
        e();
    }
}
