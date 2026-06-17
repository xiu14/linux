package com.facebook.cache.disk;

import com.facebook.infer.annotation.ReturnsOwnership;

/* loaded from: classes2.dex */
public class j implements com.facebook.cache.common.a {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f6309c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static j f6310d;

    /* renamed from: e, reason: collision with root package name */
    private static int f6311e;
    private com.facebook.cache.common.b a;
    private j b;

    private j() {
    }

    @ReturnsOwnership
    public static j a() {
        synchronized (f6309c) {
            j jVar = f6310d;
            if (jVar == null) {
                return new j();
            }
            f6310d = jVar.b;
            jVar.b = null;
            f6311e--;
            return jVar;
        }
    }

    public void b() {
        synchronized (f6309c) {
            int i = f6311e;
            if (i < 5) {
                f6311e = i + 1;
                j jVar = f6310d;
                if (jVar != null) {
                    this.b = jVar;
                }
                f6310d = this;
            }
        }
    }

    public j c(com.facebook.cache.common.b bVar) {
        this.a = bVar;
        return this;
    }
}
