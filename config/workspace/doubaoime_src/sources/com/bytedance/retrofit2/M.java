package com.bytedance.retrofit2;

import java.lang.annotation.Annotation;

/* loaded from: classes2.dex */
final class M implements L {

    /* renamed from: e, reason: collision with root package name */
    private static final L f5985e = new M();

    M() {
    }

    static Annotation[] a(Annotation[] annotationArr) {
        if (P.j(annotationArr, L.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f5985e;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return L.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof L;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        StringBuilder M = e.a.a.a.a.M("@");
        M.append(L.class.getName());
        M.append("()");
        return M.toString();
    }
}
