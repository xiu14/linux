package com.vivo.push.restructure;

import android.content.Context;
import com.vivo.push.k;
import com.vivo.push.restructure.a.a.d;
import com.vivo.push.restructure.b.b;
import com.vivo.push.restructure.b.f;
import com.vivo.push.util.z;

/* loaded from: classes2.dex */
public final class a {
    private Context a;
    private com.vivo.push.restructure.c.a b;

    /* renamed from: c, reason: collision with root package name */
    private d f8859c;

    /* renamed from: d, reason: collision with root package name */
    private com.vivo.push.restructure.b.a f8860d;

    /* renamed from: e, reason: collision with root package name */
    private b f8861e;

    /* renamed from: f, reason: collision with root package name */
    private com.vivo.push.c.a f8862f;

    /* renamed from: g, reason: collision with root package name */
    private k f8863g;

    /* renamed from: com.vivo.push.restructure.a$a, reason: collision with other inner class name */
    private static class C0405a {
        static a a = new a(0);
    }

    /* synthetic */ a(byte b) {
        this();
    }

    public static a a() {
        return C0405a.a;
    }

    public final synchronized Context b() {
        return this.a;
    }

    public final com.vivo.push.restructure.c.a c() {
        return this.b;
    }

    public final d d() {
        return this.f8859c;
    }

    public final synchronized com.vivo.push.restructure.b.a e() {
        return this.f8860d;
    }

    public final b f() {
        return this.f8861e;
    }

    public final com.vivo.push.c.a g() {
        return this.f8862f;
    }

    public final k h() {
        return this.f8863g;
    }

    private a() {
    }

    public final synchronized void a(Context context) {
        if (context == null) {
            return;
        }
        if (this.a == null) {
            this.a = context;
            com.vivo.push.restructure.b.d dVar = new com.vivo.push.restructure.b.d(new z(context));
            this.f8860d = dVar;
            this.b = new com.vivo.push.restructure.c.b(dVar);
            this.f8859c = new d();
            this.f8861e = new f();
            com.vivo.push.c.a aVar = new com.vivo.push.c.a(context);
            this.f8862f = aVar;
            this.f8863g = new com.vivo.push.z(aVar, e());
        }
    }
}
