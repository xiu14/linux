package com.google.gson.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
class r<T> implements w<T> {
    final /* synthetic */ Constructor a;

    r(Constructor constructor) {
        this.a = constructor;
    }

    @Override // com.google.gson.internal.w
    public T a() {
        try {
            return (T) this.a.newInstance(new Object[0]);
        } catch (IllegalAccessException e2) {
            com.google.gson.internal.H.a.d(e2);
            throw null;
        } catch (InstantiationException e3) {
            StringBuilder M = e.a.a.a.a.M("Failed to invoke constructor '");
            M.append(com.google.gson.internal.H.a.c(this.a));
            M.append("' with no args");
            throw new RuntimeException(M.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder M2 = e.a.a.a.a.M("Failed to invoke constructor '");
            M2.append(com.google.gson.internal.H.a.c(this.a));
            M2.append("' with no args");
            throw new RuntimeException(M2.toString(), e4.getCause());
        }
    }
}
