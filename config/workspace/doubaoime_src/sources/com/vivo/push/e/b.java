package com.vivo.push.e;

import com.vivo.push.restructure.request.a.a.c;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class b implements com.vivo.push.restructure.request.a.a.c {
    public static c.a<b> a = new c();
    private String b;

    public b(String str) {
        this.b = str;
    }

    @Override // com.vivo.push.restructure.request.a.a.c
    public final String a() {
        com.vivo.push.restructure.request.a.a.a aVar = new com.vivo.push.restructure.request.a.a.a();
        aVar.a(this.b);
        return aVar.e();
    }

    public final String b() {
        return this.b;
    }

    protected b(com.vivo.push.restructure.request.a.a.a aVar) throws JSONException {
        this.b = aVar.c();
    }
}
