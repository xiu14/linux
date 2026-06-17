package com.google.gson;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public final class b {
    private final Field a;

    public b(Field field) {
        this.a = field;
    }

    public <T extends Annotation> T a(Class<T> cls) {
        return (T) this.a.getAnnotation(cls);
    }

    public String toString() {
        return this.a.toString();
    }
}
