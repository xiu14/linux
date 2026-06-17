package com.bytedance.lego.init.model;

import com.xiaomi.mipush.sdk.Constants;
import java.util.List;

/* loaded from: classes.dex */
public class f implements Comparable<f> {
    public String a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5312c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5313d;

    /* renamed from: e, reason: collision with root package name */
    public List<String> f5314e;

    /* renamed from: f, reason: collision with root package name */
    public float f5315f;

    /* renamed from: g, reason: collision with root package name */
    public List<String> f5316g;
    public List<String> h;
    public volatile InitPeriod i;
    public volatile long j;
    public volatile boolean k;

    public f() {
        this.f5315f = 0.0f;
    }

    @Override // java.lang.Comparable
    public int compareTo(f fVar) {
        f fVar2 = fVar;
        float f2 = fVar2.f5315f - this.f5315f;
        if (f2 > 0.0f) {
            return 1;
        }
        if (f2 < 0.0f) {
            return -1;
        }
        return this.b.compareTo(fVar2.b);
    }

    public String toString() {
        return this.f5315f + Constants.ACCEPT_TIME_SEPARATOR_SP + this.a + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f5312c;
    }

    public f(String str, boolean z, boolean z2, float f2, List<String> list, List<String> list2, List<String> list3, List<String> list4, String str2, InitPeriod initPeriod) {
        this.f5315f = 0.0f;
        this.a = str;
        this.f5312c = z;
        this.f5314e = list;
        this.f5315f = f2;
        this.f5316g = list2;
        this.h = list4;
        this.b = str2;
        this.i = initPeriod;
        this.f5313d = z2;
    }
}
