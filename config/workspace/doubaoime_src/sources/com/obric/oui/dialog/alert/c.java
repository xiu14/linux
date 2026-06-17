package com.obric.oui.dialog.alert;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import java.util.Objects;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
final class c implements Runnable {
    final /* synthetic */ b a;

    static final class a extends m implements l<e.i.b.b.a.c<View>, o> {
        a() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public o invoke(e.i.b.b.a.c<View> cVar) {
            kotlin.s.c.l.f(cVar, "it");
            if (c.this.a.h().getAlpha() == 0.0f) {
                c.this.a.h().setAlpha(1.0f);
            }
            return o.a;
        }
    }

    c(b bVar) {
        this.a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean f2;
        View h = this.a.h();
        Window window = this.a.getWindow();
        b bVar = this.a;
        Context context = bVar.getContext();
        kotlin.s.c.l.e(context, "context");
        Objects.requireNonNull(bVar);
        kotlin.s.c.l.f(context, "context");
        Resources resources = context.getResources();
        kotlin.s.c.l.e(resources, "context.resources");
        e.i.b.b.a.c<View> c2 = e.i.b.b.c.a.c(h, window, true, (resources.getConfiguration().uiMode & 48) == 32 ? 0.8f : 0.32f);
        c2.h();
        f2 = this.a.f();
        if (f2) {
            e.i.b.b.a.c.e(c2, new a(), null, null, 6);
        }
    }
}
