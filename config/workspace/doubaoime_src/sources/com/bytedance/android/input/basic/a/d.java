package com.bytedance.android.input.basic.a;

import android.content.Context;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.s.c.l;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.S;

/* loaded from: classes.dex */
public final class d {
    public static final d a = new d();

    private d() {
    }

    public static void a(d dVar, Context context, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        l.f(context, "context");
        C0795d.l(r.b(S.b()), null, null, new c(z, context, null), 3, null);
    }
}
