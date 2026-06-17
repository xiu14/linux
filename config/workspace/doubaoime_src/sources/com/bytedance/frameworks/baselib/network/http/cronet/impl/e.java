package com.bytedance.frameworks.baselib.network.http.cronet.impl;

import java.net.URL;

/* loaded from: classes.dex */
public class e extends com.bytedance.retrofit2.T.c {

    /* renamed from: d, reason: collision with root package name */
    private int f5105d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5106e;

    public e(Exception exc, com.bytedance.frameworks.baselib.network.http.b bVar, int i) {
        super(exc.getMessage(), exc.getCause() == null ? exc : exc.getCause());
        URL url = bVar.r;
        a(false, true, url != null ? url.toString() : "", bVar.G, bVar);
        this.f5106e = i;
        if (exc instanceof com.bytedance.frameworks.baselib.network.http.l.c) {
            this.f5105d = ((com.bytedance.frameworks.baselib.network.http.l.c) exc).c();
        }
        Object obj = bVar.f5083d.F0.f5889e.f5914f;
        if (obj instanceof f) {
        }
    }

    public int c() {
        return this.f5106e;
    }

    public int d() {
        return this.f5105d;
    }
}
