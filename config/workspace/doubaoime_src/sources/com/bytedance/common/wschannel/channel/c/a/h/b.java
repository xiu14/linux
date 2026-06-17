package com.bytedance.common.wschannel.channel.c.a.h;

import android.content.Context;

/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: c, reason: collision with root package name */
    private int f4221c;

    public b(Context context) {
        super(context);
    }

    @Override // com.bytedance.common.wschannel.channel.c.a.h.a
    public long a() {
        long a = this.f4221c < 4 ? super.a() : -1L;
        if (a != -1) {
            this.f4221c++;
        }
        return a;
    }

    @Override // com.bytedance.common.wschannel.channel.c.a.h.a
    public void c() {
        super.c();
        this.f4221c = 0;
    }

    public String toString() {
        return e.a.a.a.a.C(e.a.a.a.a.N("RetryTimesPolicy{mMaxRetryTime=", 4, ", mCurrRetryTime="), this.f4221c, '}');
    }
}
