package com.ttnet.org.chromium.net.impl;

import java.io.IOException;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public class URLDispatch {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f8732c;

    /* renamed from: d, reason: collision with root package name */
    private String f8733d;

    /* renamed from: e, reason: collision with root package name */
    private com.ttnet.org.chromium.net.urlconnection.g f8734e = new com.ttnet.org.chromium.net.urlconnection.g();

    public URLDispatch(String str) {
    }

    public void a() {
        this.f8734e.d();
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.f8732c;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.f8733d;
    }

    public void f(Runnable runnable) {
        try {
            this.f8734e.execute(runnable);
        } catch (RejectedExecutionException e2) {
            com.ttnet.org.chromium.base.d.a("URLDispatch", "Exception URLDispatch resume ", e2);
        }
    }

    public void g(String str, String str2, String str3, String str4) {
        this.a = str;
        this.f8732c = str2;
        this.b = str3;
        this.f8733d = str4;
    }

    public void h(int i) throws IOException {
        com.ttnet.org.chromium.net.urlconnection.g gVar = this.f8734e;
        if (i <= 0) {
            i = 300;
        }
        gVar.b(i);
    }
}
