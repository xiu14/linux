package com.bumptech.glide.load.k.g;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class f {
    private final List<a<?, ?>> a = new ArrayList();

    private static final class a<Z, R> {
        final Class<Z> a;
        final Class<R> b;

        /* renamed from: c, reason: collision with root package name */
        final e<Z, R> f1732c;

        a(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull e<Z, R> eVar) {
            this.a = cls;
            this.b = cls2;
            this.f1732c = eVar;
        }

        public boolean a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.b);
        }
    }

    @NonNull
    public synchronized <Z, R> e<Z, R> a(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a<?, ?> aVar : this.a) {
            if (aVar.a(cls, cls2)) {
                return (e<Z, R>) aVar.f1732c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    @NonNull
    public synchronized <Z, R> List<Class<R>> b(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.b)) {
                arrayList.add(aVar.b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull e<Z, R> eVar) {
        this.a.add(new a<>(cls, cls2, eVar));
    }
}
