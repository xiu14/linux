package com.bytedance.crash.resource.h;

import java.util.Objects;

/* loaded from: classes.dex */
public class a extends com.bytedance.crash.resource.b {
    private static a h;

    public static void e(b bVar) {
        if (h == null) {
            synchronized (a.class) {
                if (h == null) {
                    h = new a();
                }
            }
        }
        a aVar = h;
        Objects.requireNonNull(aVar);
        aVar.c(bVar);
    }
}
