package com.bytedance.android.input.fragment.custom_symbol.l;

import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a {
    private final String a;

    public a(String str) {
        l.f(str, "symbolContent");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof a) && l.a(((a) obj).a, this.a)) {
            return true;
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return this.a.hashCode() + super.hashCode();
    }

    public String toString() {
        return e.a.a.a.a.G(e.a.a.a.a.M("CustomSymbolData(symbolContent="), this.a, ')');
    }
}
