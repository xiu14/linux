package com.ss.ugc.effectplatform.algorithm;

import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a {
    private static volatile boolean a;
    public static final a b = new a();

    private a() {
    }

    public final void a() {
        if (a) {
            return;
        }
        synchronized (this) {
            if (!a) {
                l.g("newep", "soName");
                System.loadLibrary("newep");
                a = true;
            }
        }
    }
}
