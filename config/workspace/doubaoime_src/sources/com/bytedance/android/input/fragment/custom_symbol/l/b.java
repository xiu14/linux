package com.bytedance.android.input.fragment.custom_symbol.l;

import com.bytedance.android.input.basic.IAppGlobals;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class b {
    public static final b a = null;
    private static final e b = new e();

    /* renamed from: c, reason: collision with root package name */
    private static final d f2327c = new d();

    /* renamed from: d, reason: collision with root package name */
    private static final d.a.b.d.a f2328d = new d.a.b.d.a(false);

    public static final c a() {
        return f2327c;
    }

    public static final c b() {
        return b;
    }

    public static final void c() {
        long currentTimeMillis = System.currentTimeMillis();
        if (!f2328d.a(false, true)) {
            l.f("only init once", "msg");
            IAppGlobals.a.j("[custom_symbol]", "only init once");
            return;
        }
        l.f("init start", "msg");
        IAppGlobals.a.j("[custom_symbol]", "init start");
        b.e();
        f2327c.d();
        String str = "init finish cost time = " + (System.currentTimeMillis() - currentTimeMillis);
        l.f(str, "msg");
        IAppGlobals.a.j("[custom_symbol]", str);
    }
}
