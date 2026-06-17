package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher;

import java.util.List;

/* loaded from: classes.dex */
public class k {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private int f5223c;

    /* renamed from: d, reason: collision with root package name */
    private final List<com.bytedance.retrofit2.client.b> f5224d;

    public k(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.f5223c = 0;
        this.f5224d = null;
    }

    public int a() {
        return this.f5223c;
    }

    public List<com.bytedance.retrofit2.client.b> b() {
        return this.f5224d;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public void e(int i) {
        this.f5223c = i;
    }

    public k(String str, String str2, List<com.bytedance.retrofit2.client.b> list) {
        this.a = str;
        this.b = str2;
        this.f5223c = 0;
        this.f5224d = list;
    }
}
