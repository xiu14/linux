package com.vivo.push.restructure.request.a;

import com.vivo.push.restructure.request.a.a.b;
import com.vivo.push.util.t;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class a implements com.vivo.push.restructure.request.a.a.b {
    public static final b.a<a> a = new b();
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private int f8879c;

    /* renamed from: d, reason: collision with root package name */
    private int f8880d;

    /* renamed from: e, reason: collision with root package name */
    private long f8881e;

    /* renamed from: f, reason: collision with root package name */
    private int f8882f;

    /* renamed from: g, reason: collision with root package name */
    private int f8883g;

    protected a(com.vivo.push.restructure.request.a.a.a aVar) {
        try {
            this.b = aVar.c();
            this.f8879c = aVar.a();
            this.f8881e = aVar.b();
            this.f8882f = aVar.a();
            this.f8880d = aVar.a();
            this.f8883g = aVar.a();
        } catch (JSONException e2) {
            t.a("CFToClientDS", e2);
        }
    }

    public final int a() {
        return this.f8879c;
    }

    public final int b() {
        return this.f8882f;
    }

    public final int c() {
        return this.f8883g;
    }

    @Override // com.vivo.push.restructure.request.a.a.b
    public final void a(com.vivo.push.restructure.request.a.a.a aVar) {
        aVar.a(this.b);
        aVar.a(this.f8879c);
        aVar.a(this.f8881e);
        aVar.a(this.f8882f);
        aVar.a(this.f8880d);
        aVar.a(this.f8883g);
    }
}
