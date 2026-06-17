package com.ss.ugc.effectplatform.e;

import android.content.Context;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class e {
    private static final Object a = new Object();
    private static e b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f8466c = null;

    public e(Object obj) {
        l.g(obj, "context");
    }

    public static final e d(Object obj) {
        if (b == null && obj != null && (obj instanceof Context)) {
            synchronized (a) {
                if (b == null) {
                    b = new e(obj);
                }
            }
        }
        return b;
    }
}
