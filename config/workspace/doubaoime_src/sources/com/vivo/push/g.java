package com.vivo.push;

import com.vivo.push.restructure.request.a.a.c;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class g implements com.vivo.push.restructure.request.a.a.c {
    public static c.a<g> a = new h();
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private String f8816c;

    protected g(com.vivo.push.restructure.request.a.a.a aVar) throws JSONException {
        this.b = aVar.a();
        this.f8816c = aVar.c();
    }

    @Override // com.vivo.push.restructure.request.a.a.c
    public final String a() {
        com.vivo.push.restructure.request.a.a.a aVar = new com.vivo.push.restructure.request.a.a.a();
        aVar.a(this.b);
        aVar.a(this.f8816c);
        return aVar.e();
    }

    public final String b() {
        return this.f8816c;
    }
}
