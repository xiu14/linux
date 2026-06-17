package com.bytedance.retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: com.bytedance.retrofit2.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC0705i<F, T> {

    /* renamed from: com.bytedance.retrofit2.i$a */
    public static abstract class a {
        public InterfaceC0705i<?, com.bytedance.retrofit2.client.b> a(Type type, Annotation[] annotationArr, H h) {
            return null;
        }

        public InterfaceC0705i<?, Object> b(Type type, Annotation[] annotationArr, H h) {
            return null;
        }

        public InterfaceC0705i<?, com.bytedance.retrofit2.mime.i> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, H h) {
            return null;
        }

        public InterfaceC0705i<com.bytedance.retrofit2.mime.h, ?> d(Type type, Annotation[] annotationArr, H h) {
            return null;
        }

        public InterfaceC0705i<?, String> e(Type type, Annotation[] annotationArr, H h) {
            return null;
        }
    }

    T a(F f2) throws IOException;

    default boolean b() {
        return false;
    }

    default T c(F f2, F f3) {
        return null;
    }
}
