package com.vivo.push.restructure.request;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.vivo.push.restructure.request.a.a.b;
import com.vivo.push.util.t;

/* loaded from: classes2.dex */
public final class b<I extends com.vivo.push.restructure.request.a.a.b, O extends com.vivo.push.restructure.request.a.a.b> {
    private a<I, O> a;
    private c<O> b;

    /* renamed from: c, reason: collision with root package name */
    private long f8888c;

    private b(a<I, O> aVar) {
        this.f8888c = com.heytap.mcssdk.constant.a.r;
        this.a = aVar;
        if (aVar == null) {
            t.a(JosStatusCodes.RTN_CODE_PARAMS_ERROR, "Command object is null, please construct command first");
        }
    }

    public final a a() {
        return this.a;
    }

    public final c b() {
        return this.b;
    }

    public final long c() {
        return this.f8888c;
    }

    private b(a<I, O> aVar, c<O> cVar) {
        this(aVar);
        this.b = cVar;
    }

    public b(a<I, O> aVar, c<O> cVar, long j) {
        this(aVar, cVar);
        this.f8888c = j;
    }
}
