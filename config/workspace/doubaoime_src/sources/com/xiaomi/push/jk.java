package com.xiaomi.push;

import com.xiaomi.push.jl;
import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public class jk {
    private jp a;

    /* renamed from: a, reason: collision with other field name */
    private final jw f907a;

    /* renamed from: a, reason: collision with other field name */
    private final ByteArrayOutputStream f908a;

    public jk() {
        this(new jl.a());
    }

    public byte[] a(jf jfVar) {
        this.f908a.reset();
        jfVar.b(this.a);
        return this.f908a.toByteArray();
    }

    public jk(jr jrVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f908a = byteArrayOutputStream;
        jw jwVar = new jw(byteArrayOutputStream);
        this.f907a = jwVar;
        this.a = jrVar.a(jwVar);
    }
}
