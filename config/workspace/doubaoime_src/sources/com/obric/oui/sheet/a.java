package com.obric.oui.sheet;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import com.obric.oui.dialog.alert.view.RadiusLayout;
import java.util.Objects;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
final class a implements Runnable {
    final /* synthetic */ OInsetSheet a;

    /* renamed from: com.obric.oui.sheet.a$a, reason: collision with other inner class name */
    static final class C0362a extends m implements l<e.i.b.b.a.c<View>, o> {
        public static final C0362a a = new C0362a();

        C0362a() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public o invoke(e.i.b.b.a.c<View> cVar) {
            kotlin.s.c.l.f(cVar, "it");
            return o.a;
        }
    }

    a(OInsetSheet oInsetSheet) {
        this.a = oInsetSheet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RadiusLayout b = this.a.b();
        Window window = this.a.getWindow();
        boolean a = OInsetSheet.a(this.a);
        OInsetSheet oInsetSheet = this.a;
        Context context = oInsetSheet.getContext();
        kotlin.s.c.l.e(context, "context");
        Objects.requireNonNull(oInsetSheet);
        Resources resources = context.getResources();
        kotlin.s.c.l.e(resources, "context.resources");
        e.i.b.b.a.c<View> c2 = e.i.b.b.c.a.c(b, window, a, (resources.getConfiguration().uiMode & 48) == 32 ? 0.5f : 0.16f);
        e.i.b.b.a.c.e(c2, null, null, C0362a.a, 3);
        Objects.requireNonNull(this.a);
        c2.h();
    }
}
