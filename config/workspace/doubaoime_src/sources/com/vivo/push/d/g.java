package com.vivo.push.d;

import com.vivo.push.restructure.request.a.a.b;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class g implements com.vivo.push.restructure.request.a.a.b {
    public static final b.a<g> a = new h();
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private int f8804c;

    /* renamed from: d, reason: collision with root package name */
    private int f8805d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8806e;

    public g(int i, boolean z) {
        this.f8804c = i;
        this.f8805d = 1;
        this.f8806e = z;
    }

    @Override // com.vivo.push.restructure.request.a.a.b
    public final void a(com.vivo.push.restructure.request.a.a.a aVar) {
        aVar.a(this.b);
        aVar.a(this.f8804c);
        aVar.a(this.f8805d);
        aVar.a(this.f8806e);
    }

    public g(long j, int i, boolean z) {
        this.b = j;
        this.f8804c = i;
        this.f8805d = 2;
        this.f8806e = z;
    }

    public g(com.vivo.push.restructure.request.a.a.a aVar) {
        try {
            this.b = aVar.b();
            this.f8804c = aVar.a();
            this.f8805d = aVar.a();
            this.f8806e = aVar.d();
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }
}
