package com.ss.ugc.effectplatform.e;

import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class c {
    private static d.a.a.b<String, d> a = new d.a.a.b<>(true);
    public static final c b = null;

    public static final d a(String str) {
        l.g(str, "dirPath");
        if (!(str.length() == 0) && a.containsKey(str)) {
            return a.get(str);
        }
        return null;
    }

    public static final void b(String str, d dVar) {
        l.g(str, "dirPath");
        a.put(str, dVar);
    }
}
