package com.airbnb.lottie.model.content;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class j implements b {
    private final String a;
    private final List<b> b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1335c;

    public j(String str, List<b> list, boolean z) {
        this.a = str;
        this.b = list;
        this.f1335c = z;
    }

    @Override // com.airbnb.lottie.model.content.b
    public com.airbnb.lottie.v.b.c a(com.airbnb.lottie.i iVar, com.airbnb.lottie.model.layer.b bVar) {
        return new com.airbnb.lottie.v.b.d(iVar, bVar, this);
    }

    public List<b> b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.f1335c;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ShapeGroup{name='");
        M.append(this.a);
        M.append("' Shapes: ");
        M.append(Arrays.toString(this.b.toArray()));
        M.append('}');
        return M.toString();
    }
}
