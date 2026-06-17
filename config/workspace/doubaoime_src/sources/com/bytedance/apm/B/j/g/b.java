package com.bytedance.apm.B.j.g;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class b extends WeakReference<Object> {
    public final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Object obj, String str, String str2, ReferenceQueue<Object> referenceQueue) {
        super(obj, referenceQueue);
        a(obj, "referent");
        a(referenceQueue, "referenceQueue");
        a(str, "key");
        this.a = str;
        a(str2, "name");
    }

    static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(e.a.a.a.a.s(str, " must not be null"));
    }
}
