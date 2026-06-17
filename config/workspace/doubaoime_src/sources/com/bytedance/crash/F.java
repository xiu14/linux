package com.bytedance.crash;

import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class F {
    private static CopyOnWriteArrayList<a> a = new CopyOnWriteArrayList<>();

    public interface a {
    }

    public static void a(a aVar) {
        a.add(aVar);
    }
}
