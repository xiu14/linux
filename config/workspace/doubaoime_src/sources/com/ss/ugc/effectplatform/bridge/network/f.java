package com.ss.ugc.effectplatform.bridge.network;

import java.util.List;
import java.util.Map;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class f {
    private final String a;
    private final List<String> b;

    /* renamed from: c, reason: collision with root package name */
    private final HTTPMethod f8443c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, String> f8444d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Object> f8445e;

    /* renamed from: f, reason: collision with root package name */
    private final String f8446f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f8447g;
    private final Map<String, Object> h;

    public f(String str, List list, HTTPMethod hTTPMethod, Map map, Map map2, String str2, boolean z, Map map3, int i) {
        list = (i & 2) != 0 ? null : list;
        hTTPMethod = (i & 4) != 0 ? HTTPMethod.GET : hTTPMethod;
        int i2 = i & 8;
        int i3 = i & 16;
        String str3 = (i & 32) != 0 ? "application/x-www-form-urlencoded" : null;
        z = (i & 64) != 0 ? true : z;
        int i4 = i & 128;
        l.g(str, "url");
        l.g(hTTPMethod, "method");
        l.g(str3, "contentType");
        this.a = str;
        this.b = list;
        this.f8443c = hTTPMethod;
        this.f8444d = null;
        this.f8445e = null;
        this.f8446f = str3;
        this.f8447g = z;
        this.h = null;
    }

    public final List<String> a() {
        return this.b;
    }

    public final Map<String, Object> b() {
        return this.f8445e;
    }

    public final String c() {
        return this.f8446f;
    }

    public final Map<String, Object> d() {
        return this.h;
    }

    public final Map<String, String> e() {
        return this.f8444d;
    }

    public final HTTPMethod f() {
        return this.f8443c;
    }

    public final String g() {
        return this.a;
    }

    public final boolean h() {
        return this.f8447g;
    }
}
