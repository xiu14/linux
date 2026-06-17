package com.bytedance.frameworks.baselib.network.http;

import java.util.Map;

/* loaded from: classes.dex */
public class h {
    private boolean a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f5124c;

    public h(boolean z) {
        this.b = true;
        this.a = z;
    }

    public Map<String, String> a() {
        return this.f5124c;
    }

    public boolean b() {
        return this.b;
    }

    public boolean c() {
        return this.a;
    }

    public void d(Map<String, String> map) {
        this.f5124c = map;
    }

    public void e(boolean z) {
        this.b = z;
    }

    public h(boolean z, boolean z2, Map<String, String> map) {
        this.b = true;
        this.a = z;
        this.b = z2;
        this.f5124c = map;
    }
}
