package com.vivo.push.restructure.request.a;

import com.vivo.push.restructure.request.a.a.b;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class c implements com.vivo.push.restructure.request.a.a.b {
    public static final b.a<c> a = new d();
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private int f8885c;

    /* renamed from: d, reason: collision with root package name */
    private long f8886d;

    /* renamed from: e, reason: collision with root package name */
    private int f8887e;

    public c(int i, int i2) {
        this.b = com.vivo.push.restructure.a.a().b().getPackageName();
        this.f8885c = i;
        this.f8886d = 356L;
        this.f8887e = i2;
    }

    @Override // com.vivo.push.restructure.request.a.a.b
    public final void a(com.vivo.push.restructure.request.a.a.a aVar) {
        aVar.a(this.b);
        aVar.a(this.f8885c);
        aVar.a(this.f8886d);
        aVar.a(this.f8887e);
    }

    protected c(com.vivo.push.restructure.request.a.a.a aVar) {
        try {
            this.b = aVar.c();
            this.f8885c = aVar.a();
            this.f8886d = aVar.b();
            this.f8887e = aVar.a();
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
