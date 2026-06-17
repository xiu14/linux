package com.bytedance.push.third;

import com.bytedance.push.g0.k;

/* loaded from: classes2.dex */
public class f extends k<d> implements d {
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private String f5877c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5878d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5879e = false;

    /* renamed from: f, reason: collision with root package name */
    private c f5880f;

    /* renamed from: g, reason: collision with root package name */
    private String f5881g;
    private com.bytedance.push.third.i.b h;

    public f(int i, String str, String str2, com.bytedance.push.third.i.b bVar) {
        this.b = i;
        this.f5877c = str;
        this.f5881g = str2;
        this.h = bVar;
    }

    @Override // com.bytedance.push.third.d
    public boolean a() {
        StringBuilder M = e.a.a.a.a.M("[isSupport]channelId:");
        M.append(this.b);
        M.append(" mInited:");
        M.append(this.f5879e);
        M.append(" mIsSupport:");
        M.append(this.f5878d);
        com.bytedance.push.g0.f.g("PushChannel", M.toString());
        if (!this.f5879e) {
            this.f5878d = this.h.a(this.f5880f, this.b);
            StringBuilder M2 = e.a.a.a.a.M("[isSupport]channelId:");
            M2.append(this.b);
            M2.append(" mBaseChannelSupportHelper:");
            M2.append(this.h);
            M2.append(" mIPushAdapter:");
            M2.append(this.f5880f);
            M2.append(" invoke isSupportChannel result:");
            M2.append(this.f5878d);
            com.bytedance.push.g0.f.g("PushChannel", M2.toString());
            this.f5879e = true;
        }
        return this.f5878d;
    }

    @Override // com.bytedance.push.third.d
    public String b() {
        return this.f5881g;
    }

    @Override // com.bytedance.push.third.d
    public String c() {
        return this.f5877c;
    }

    @Override // com.bytedance.push.third.d
    public c d() {
        return this.f5880f;
    }

    @Override // com.bytedance.push.g0.k
    protected d e(Object[] objArr) {
        if (!com.bytedance.android.input.k.b.a.Y(this.f5877c)) {
            try {
                Object newInstance = Class.forName(this.f5877c).newInstance();
                if (newInstance instanceof c) {
                    this.f5880f = (c) newInstance;
                }
                com.bytedance.push.g0.f.g("PushManager", "load PushManagerImpl success: " + this.f5877c);
            } catch (Throwable th) {
                StringBuilder M = e.a.a.a.a.M("load PushManagerImpl exception: ");
                M.append(this.f5877c);
                M.append(" exception is:");
                M.append(th);
                com.bytedance.push.g0.f.e("PushManager", M.toString());
            }
        }
        return this;
    }
}
