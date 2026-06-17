package com.bytedance.common.wschannel.n.d;

/* loaded from: classes.dex */
public class a implements com.bytedance.common.wschannel.heartbeat.model.a<a> {
    private long a;
    private long b;

    private static class b extends a {
        b(C0187a c0187a) {
            super(-1L, com.heytap.mcssdk.constant.a.r);
        }
    }

    public a() {
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public a c() {
        return new b(null);
    }

    void d(long j) {
        this.a = j;
    }

    public a(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
