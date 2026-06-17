package com.facebook.imagepipeline.producers;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.producers.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0742w {
    private final InterfaceC0732l<com.facebook.imagepipeline.image.f> a;
    private final V b;

    /* renamed from: c, reason: collision with root package name */
    private long f6669c = 0;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f6670d;

    public C0742w(InterfaceC0732l<com.facebook.imagepipeline.image.f> interfaceC0732l, V v) {
        this.a = interfaceC0732l;
        this.b = v;
    }

    public InterfaceC0732l<com.facebook.imagepipeline.image.f> a() {
        return this.a;
    }

    public V b() {
        return this.b;
    }

    public Map<String, String> c() {
        return this.f6670d;
    }

    public long d() {
        return this.f6669c;
    }

    public X e() {
        return this.b.n();
    }

    public Uri f() {
        return this.b.d().v();
    }

    public void g(Map<String, String> map) {
        this.f6670d = map;
    }

    public void h(long j) {
        this.f6669c = j;
    }
}
