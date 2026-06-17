package com.bytedance.frameworks.baselib.network.http.n.d.a;

import com.bytedance.retrofit2.H;
import com.bytedance.retrofit2.InterfaceC0705i;
import com.bytedance.retrofit2.mime.h;
import com.bytedance.retrofit2.mime.i;
import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a extends InterfaceC0705i.a {
    private final Gson a;

    private a(Gson gson) {
        Objects.requireNonNull(gson, "gson == null");
        this.a = gson;
    }

    public static a f() {
        return new a(new Gson());
    }

    @Override // com.bytedance.retrofit2.InterfaceC0705i.a
    public InterfaceC0705i<?, i> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, H h) {
        return new b(this.a, this.a.e(com.google.gson.u.a.b(type)));
    }

    @Override // com.bytedance.retrofit2.InterfaceC0705i.a
    public InterfaceC0705i<h, ?> d(Type type, Annotation[] annotationArr, H h) {
        return new c(this.a, this.a.e(com.google.gson.u.a.b(type)));
    }
}
