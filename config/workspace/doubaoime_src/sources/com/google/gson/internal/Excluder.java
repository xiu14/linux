package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class Excluder implements com.google.gson.t, Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public static final Excluder f6778f = new Excluder();
    private double a = -1.0d;
    private int b = 136;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6779c = true;

    /* renamed from: d, reason: collision with root package name */
    private List<com.google.gson.a> f6780d = Collections.emptyList();

    /* renamed from: e, reason: collision with root package name */
    private List<com.google.gson.a> f6781e = Collections.emptyList();

    private boolean c(Class<?> cls) {
        if (this.a != -1.0d && !h((com.google.gson.annotations.b) cls.getAnnotation(com.google.gson.annotations.b.class), (com.google.gson.annotations.c) cls.getAnnotation(com.google.gson.annotations.c.class))) {
            return true;
        }
        if (this.f6779c || !g(cls)) {
            return f(cls);
        }
        return true;
    }

    private boolean d(Class<?> cls, boolean z) {
        Iterator<com.google.gson.a> it2 = (z ? this.f6780d : this.f6781e).iterator();
        while (it2.hasNext()) {
            if (it2.next().b(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean f(Class<?> cls) {
        if (!Enum.class.isAssignableFrom(cls)) {
            if (!((cls.getModifiers() & 8) != 0) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        return false;
    }

    private boolean g(Class<?> cls) {
        if (cls.isMemberClass()) {
            if (!((cls.getModifiers() & 8) != 0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean h(com.google.gson.annotations.b r7, com.google.gson.annotations.c r8) {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L11
            double r2 = r7.value()
            double r4 = r6.a
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 < 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L12
        L11:
            r7 = r1
        L12:
            if (r7 == 0) goto L27
            if (r8 == 0) goto L23
            double r7 = r8.value()
            double r2 = r6.a
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 >= 0) goto L21
            goto L23
        L21:
            r7 = r0
            goto L24
        L23:
            r7 = r1
        L24:
            if (r7 == 0) goto L27
            r0 = r1
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.Excluder.h(com.google.gson.annotations.b, com.google.gson.annotations.c):boolean");
    }

    @Override // com.google.gson.t
    public <T> TypeAdapter<T> a(final Gson gson, final com.google.gson.u.a<T> aVar) {
        Class<? super T> d2 = aVar.d();
        boolean c2 = c(d2);
        final boolean z = c2 || d(d2, true);
        final boolean z2 = c2 || d(d2, false);
        if (z || z2) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1
                private TypeAdapter<T> a;

                @Override // com.google.gson.TypeAdapter
                public T b(com.google.gson.stream.a aVar2) throws IOException {
                    if (z2) {
                        aVar2.p0();
                        return null;
                    }
                    TypeAdapter<T> typeAdapter = this.a;
                    if (typeAdapter == null) {
                        typeAdapter = gson.f(Excluder.this, aVar);
                        this.a = typeAdapter;
                    }
                    return typeAdapter.b(aVar2);
                }

                @Override // com.google.gson.TypeAdapter
                public void c(com.google.gson.stream.b bVar, T t) throws IOException {
                    if (z) {
                        bVar.D();
                        return;
                    }
                    TypeAdapter<T> typeAdapter = this.a;
                    if (typeAdapter == null) {
                        typeAdapter = gson.f(Excluder.this, aVar);
                        this.a = typeAdapter;
                    }
                    typeAdapter.c(bVar, t);
                }
            };
        }
        return null;
    }

    public boolean b(Class<?> cls, boolean z) {
        return c(cls) || d(cls, z);
    }

    protected Object clone() throws CloneNotSupportedException {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public boolean e(Field field, boolean z) {
        if ((this.b & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.a != -1.0d && !h((com.google.gson.annotations.b) field.getAnnotation(com.google.gson.annotations.b.class), (com.google.gson.annotations.c) field.getAnnotation(com.google.gson.annotations.c.class))) || field.isSynthetic()) {
            return true;
        }
        if ((!this.f6779c && g(field.getType())) || f(field.getType())) {
            return true;
        }
        List<com.google.gson.a> list = z ? this.f6780d : this.f6781e;
        if (list.isEmpty()) {
            return false;
        }
        com.google.gson.b bVar = new com.google.gson.b(field);
        Iterator<com.google.gson.a> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().a(bVar)) {
                return true;
            }
        }
        return false;
    }

    public Excluder i(com.google.gson.a aVar, boolean z, boolean z2) {
        try {
            Excluder excluder = (Excluder) super.clone();
            if (z) {
                ArrayList arrayList = new ArrayList(this.f6780d);
                excluder.f6780d = arrayList;
                arrayList.add(aVar);
            }
            if (z2) {
                ArrayList arrayList2 = new ArrayList(this.f6781e);
                excluder.f6781e = arrayList2;
                arrayList2.add(aVar);
            }
            return excluder;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }
}
