package com.bytedance.applog.w;

import java.util.List;

/* loaded from: classes.dex */
public class h {
    private final g a;

    public h() {
        g gVar = new g();
        this.a = gVar;
        gVar.k(System.currentTimeMillis());
    }

    public h a(String str) {
        this.a.d(str);
        return this;
    }

    public g b() {
        return this.a;
    }

    public h c(int i) {
        this.a.e(i);
        return this;
    }

    public h d(int i) {
        this.a.f(i);
        return this;
    }

    public h e(String str) {
        this.a.g(str);
        return this;
    }

    public h f(List<String> list) {
        this.a.h(list);
        return this;
    }

    public h g(String str) {
        this.a.i(str);
        return this;
    }

    public h h(Throwable th) {
        this.a.j(th);
        return this;
    }
}
