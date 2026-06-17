package com.bytedance.android.input.api;

import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a {
    private final String a;
    private final String b;

    public a(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.a, aVar.a) && l.a(this.b, aVar.b);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ImePushBody(title=");
        M.append(this.a);
        M.append(", openUrl=");
        return e.a.a.a.a.G(M, this.b, ')');
    }
}
