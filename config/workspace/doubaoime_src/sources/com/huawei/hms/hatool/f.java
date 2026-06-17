package com.huawei.hms.hatool;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class f implements g {
    private byte[] a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f7345c;

    /* renamed from: d, reason: collision with root package name */
    private String f7346d;

    /* renamed from: e, reason: collision with root package name */
    private String f7347e;

    /* renamed from: f, reason: collision with root package name */
    private List<b1> f7348f;

    public f(byte[] bArr, String str, String str2, String str3, String str4, List<b1> list) {
        this.a = (byte[]) bArr.clone();
        this.b = str;
        this.f7345c = str2;
        this.f7347e = str3;
        this.f7346d = str4;
        this.f7348f = list;
    }

    private n0 a(Map<String, String> map) {
        return w.a(this.b, this.a, map);
    }

    private Map<String, String> a() {
        return k.b(this.f7345c, this.f7347e, this.f7346d);
    }

    private void b() {
        b0.c().a(new d1(this.f7348f, this.f7345c, this.f7346d, this.f7347e));
    }

    @Override // java.lang.Runnable
    public void run() {
        v.a("hmsSdk", "send data running");
        int b = a(a()).b();
        if (b != 200) {
            b();
            return;
        }
        StringBuilder M = e.a.a.a.a.M("events PostRequest sendevent TYPE : %s, TAG : %s, resultCode: %d ,reqID:");
        M.append(this.f7346d);
        v.b("hmsSdk", M.toString(), this.f7347e, this.f7345c, Integer.valueOf(b));
    }
}
