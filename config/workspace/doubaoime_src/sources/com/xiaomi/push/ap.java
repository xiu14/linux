package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes2.dex */
class ap {
    static int a;

    public static al a(Context context) {
        if (k.m654a()) {
            a = 1;
            return new ao(context);
        }
        if (ak.a(context)) {
            a = 2;
            return new ak(context);
        }
        if (ar.a(context)) {
            a = 4;
            return new ar(context);
        }
        if (at.a(context)) {
            a = 5;
            return new at(context);
        }
        if (an.a(context)) {
            a = 3;
            return new am(context);
        }
        a = 0;
        return new as();
    }
}
