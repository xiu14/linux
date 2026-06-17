package com.ss.ugc.effectplatform.bridge.network;

import java.util.Map;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class h {
    private final kotlin.e a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private a f8448c;

    /* renamed from: d, reason: collision with root package name */
    private long f8449d;

    /* renamed from: e, reason: collision with root package name */
    private String f8450e;

    /* renamed from: f, reason: collision with root package name */
    private String f8451f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, String> f8452g;

    public h(int i, a aVar, long j, String str) {
        l.g(aVar, "bodyStream");
        l.g(aVar, "bodyStream");
        this.b = i;
        this.f8448c = aVar;
        this.f8449d = j;
        this.f8450e = str;
        this.f8451f = null;
        this.f8452g = null;
        this.a = kotlin.a.c(new g(this));
    }

    public final a a() {
        return this.f8448c;
    }

    public final long b() {
        return this.f8449d;
    }

    public final String c() {
        return this.f8450e;
    }

    public final String d() {
        return this.f8451f;
    }

    public final Map<String, String> e() {
        return this.f8452g;
    }

    public final int f() {
        return this.b;
    }

    public final void g(a aVar) {
        l.g(aVar, "<set-?>");
        this.f8448c = aVar;
    }

    public final void h(long j) {
        this.f8449d = j;
    }

    public final void i(String str) {
        this.f8450e = str;
    }

    public final void j(String str) {
        this.f8451f = str;
    }

    public final void k(int i) {
        this.b = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i, a aVar, long j, String str, int i2) {
        this(i, aVar, j, null);
        int i3 = i2 & 8;
    }
}
