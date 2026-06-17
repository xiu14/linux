package com.ttnet.org.chromium.base;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class b {
    private static final AtomicReference<b> a = new AtomicReference<>();

    private b() {
    }

    public static b a() {
        return a.get();
    }

    public abstract boolean b(String str);
}
