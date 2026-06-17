package com.bytedance.rpc.serialize;

/* loaded from: classes2.dex */
public class c {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f6052c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f6053d;

    public c(byte[] bArr, String str, String str2, String str3) {
        this.f6053d = bArr == null ? e.b.l.q.c.f9649c : bArr;
        this.b = str == null ? "" : str;
        this.a = str2 == null ? "" : str2;
        this.f6052c = str3 == null ? "" : str3;
    }

    public int a() {
        return this.f6053d.length;
    }

    public String b() {
        return this.b;
    }

    public byte[] c() {
        return this.f6053d;
    }

    public String d() {
        return this.f6052c;
    }

    public String e() {
        return this.a;
    }
}
