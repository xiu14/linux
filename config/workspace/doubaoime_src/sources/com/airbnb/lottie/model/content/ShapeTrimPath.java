package com.airbnb.lottie.model.content;

import com.airbnb.lottie.v.b.s;

/* loaded from: classes.dex */
public class ShapeTrimPath implements b {
    private final String a;
    private final Type b;

    /* renamed from: c, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.b f1307c;

    /* renamed from: d, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.b f1308d;

    /* renamed from: e, reason: collision with root package name */
    private final com.airbnb.lottie.model.i.b f1309e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1310f;

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Type forId(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException(e.a.a.a.a.j("Unknown trim path type ", i));
        }
    }

    public ShapeTrimPath(String str, Type type, com.airbnb.lottie.model.i.b bVar, com.airbnb.lottie.model.i.b bVar2, com.airbnb.lottie.model.i.b bVar3, boolean z) {
        this.a = str;
        this.b = type;
        this.f1307c = bVar;
        this.f1308d = bVar2;
        this.f1309e = bVar3;
        this.f1310f = z;
    }

    @Override // com.airbnb.lottie.model.content.b
    public com.airbnb.lottie.v.b.c a(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar) {
        return new s(bVar, this);
    }

    public com.airbnb.lottie.model.i.b b() {
        return this.f1308d;
    }

    public com.airbnb.lottie.model.i.b c() {
        return this.f1309e;
    }

    public com.airbnb.lottie.model.i.b d() {
        return this.f1307c;
    }

    public Type e() {
        return this.b;
    }

    public boolean f() {
        return this.f1310f;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Trim Path: {start: ");
        M.append(this.f1307c);
        M.append(", end: ");
        M.append(this.f1308d);
        M.append(", offset: ");
        M.append(this.f1309e);
        M.append("}");
        return M.toString();
    }
}
