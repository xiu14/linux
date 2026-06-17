package com.xiaomi.push;

/* loaded from: classes2.dex */
public class jm {
    public final byte a;

    /* renamed from: a, reason: collision with other field name */
    public final String f915a;

    /* renamed from: a, reason: collision with other field name */
    public final short f916a;

    public jm() {
        this("", (byte) 0, (short) 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("<TField name:'");
        M.append(this.f915a);
        M.append("' type:");
        M.append((int) this.a);
        M.append(" field-id:");
        return e.a.a.a.a.D(M, this.f916a, ">");
    }

    public jm(String str, byte b, short s) {
        this.f915a = str;
        this.a = b;
        this.f916a = s;
    }
}
