package com.vivo.push;

import com.vivo.push.restructure.request.a.a.c;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class e implements com.vivo.push.restructure.request.a.a.c {
    public static c.a<e> a = new f();
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private String f8807c;

    /* renamed from: d, reason: collision with root package name */
    private String f8808d;

    /* renamed from: e, reason: collision with root package name */
    private String f8809e;

    /* renamed from: f, reason: collision with root package name */
    private String f8810f;

    public e(int i, String str, String str2, String str3, String str4) {
        this.b = i;
        this.f8807c = str;
        this.f8808d = str2;
        this.f8809e = str3;
        this.f8810f = str4;
    }

    @Override // com.vivo.push.restructure.request.a.a.c
    public final String a() {
        com.vivo.push.restructure.request.a.a.a aVar = new com.vivo.push.restructure.request.a.a.a();
        aVar.a(this.b);
        aVar.a(this.f8807c);
        aVar.a(this.f8808d);
        aVar.a(this.f8809e);
        aVar.a(this.f8810f);
        return aVar.e();
    }

    protected e(com.vivo.push.restructure.request.a.a.a aVar) throws JSONException {
        this.b = aVar.a();
        this.f8807c = aVar.c();
        this.f8808d = aVar.c();
        this.f8809e = aVar.c();
        this.f8810f = aVar.c();
    }
}
