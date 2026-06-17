package com.bytedance.android.input.fragment.custom_symbol.m;

import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a {
    private String a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2330c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2331d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2332e;

    public a(String str, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? true : z2;
        z3 = (i & 8) != 0 ? false : z3;
        z4 = (i & 16) != 0 ? false : z4;
        l.f(str, "symbolText");
        this.a = str;
        this.b = z;
        this.f2330c = z2;
        this.f2331d = z3;
        this.f2332e = z4;
    }

    public final boolean a() {
        return this.f2332e;
    }

    public final boolean b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean d() {
        return this.f2331d;
    }

    public final void e(boolean z) {
        this.f2331d = z;
    }

    public boolean equals(Object obj) {
        if (obj == null || !l.a(obj, this.a)) {
            return super.equals(obj);
        }
        return true;
    }

    public final void f(boolean z) {
        this.f2332e = z;
    }

    public final void g(boolean z) {
        this.b = z;
    }

    public final void h(String str) {
        l.f(str, "<set-?>");
        this.a = str;
    }

    public int hashCode() {
        return this.a.hashCode() + ((Boolean.hashCode(this.f2332e) + ((Boolean.hashCode(this.f2331d) + ((Boolean.hashCode(this.f2330c) + (Boolean.hashCode(this.b) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("CustomSymbolItem(symbolText=");
        M.append(this.a);
        M.append(", showDeleteTip=");
        M.append(this.b);
        M.append(", enableEdit=");
        M.append(this.f2330c);
        M.append(", isExtensionState=");
        M.append(this.f2331d);
        M.append(", needRequestFocus=");
        return e.a.a.a.a.L(M, this.f2332e, ')');
    }
}
