package e.b.d.a.a;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import kotlin.o;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class e {
    private static boolean a = true;
    private static final Handler b = new Handler(Looper.getMainLooper());

    /* renamed from: c, reason: collision with root package name */
    private static final Runnable f9501c = new Runnable() { // from class: e.b.d.a.a.a
        @Override // java.lang.Runnable
        public final void run() {
            e.f();
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f9502d = 0;

    public static final void e(View view) {
        l.f(view, "<this>");
        view.setVisibility(8);
    }

    public static void f() {
        a = true;
    }

    public static final void g(View view, kotlin.s.b.l<? super View, o> lVar) {
        l.f(view, "<this>");
        l.f(lVar, "block");
        view.setOnClickListener(new c(500L, lVar));
    }

    public static final void h(View view) {
        l.f(view, "<this>");
        view.setVisibility(0);
    }
}
