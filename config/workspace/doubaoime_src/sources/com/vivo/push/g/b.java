package com.vivo.push.g;

import android.content.Context;
import com.vivo.push.util.ContextDelegate;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    private static volatile b f8817c;
    private a a;
    private Context b;

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (f8817c == null) {
                f8817c = new b();
            }
            bVar = f8817c;
        }
        return bVar;
    }

    public final synchronized a a(Context context) {
        a aVar = this.a;
        if (aVar != null) {
            return aVar;
        }
        if (context == null) {
            return null;
        }
        if (aVar == null) {
            Context context2 = ContextDelegate.getContext(context.getApplicationContext());
            this.b = context2;
            this.a = new c(context2);
        }
        return this.a;
    }
}
