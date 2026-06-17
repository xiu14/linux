package com.bytedance.retrofit2.T;

import java.io.IOException;

/* loaded from: classes2.dex */
public class c extends IOException {
    public boolean a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public Object f6004c;

    public c() {
        this.a = false;
        this.b = false;
        this.f6004c = null;
    }

    public static c b(Exception exc, String str, String str2, Object obj) {
        if (exc instanceof c) {
            return (c) exc;
        }
        c cVar = new c(exc.getMessage(), exc);
        cVar.a(false, true, str, str2, obj);
        return cVar;
    }

    public void a(boolean z, boolean z2, String str, String str2, Object obj) {
        this.a = z;
        this.b = z2;
        this.f6004c = obj;
    }

    public c(String str) {
        super(str);
        this.a = false;
        this.b = false;
        this.f6004c = null;
    }

    public c(String str, Throwable th) {
        super(str, th);
        this.a = false;
        this.b = false;
        this.f6004c = null;
    }
}
