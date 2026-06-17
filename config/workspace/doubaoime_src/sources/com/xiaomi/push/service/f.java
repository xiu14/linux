package com.xiaomi.push.service;

import com.xiaomi.push.er;
import com.xiaomi.push.gg;

/* loaded from: classes2.dex */
public abstract class f {
    public static boolean a(gg ggVar) {
        return ggVar != null && ggVar.a() == 10 && ggVar.m422b();
    }

    public static boolean b(gg ggVar) {
        return ggVar != null && ggVar.a() == 5 && ggVar.m422b();
    }

    public static int a() {
        return (er.a().m359a() ? 10000 : 0) + 48;
    }
}
