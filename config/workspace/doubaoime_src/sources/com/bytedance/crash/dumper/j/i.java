package com.bytedance.crash.dumper.j;

/* loaded from: classes.dex */
public class i {
    private static final char[] b = {'t', 'r', 'u', 'e'};

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f4609c = {'f', 'a', 'l', 's', 'e'};
    private final a a;

    public i(String str) {
        a cVar;
        try {
            cVar = new b(str);
        } catch (Throwable unused) {
            cVar = new c(str);
        }
        this.a = cVar;
    }

    public i a(char c2) {
        this.a.a(c2);
        return this;
    }

    public i b(int i) {
        this.a.b(i);
        return this;
    }

    public i c(long j) {
        this.a.c(j);
        return this;
    }

    public i d(String str) {
        if (str != null) {
            this.a.d(str);
        }
        return this;
    }

    public i e(Throwable th) {
        d(th.getClass().getName());
        String localizedMessage = th.getLocalizedMessage();
        if (localizedMessage != null) {
            this.a.a(':');
            this.a.a(' ');
            d(localizedMessage);
        }
        return this;
    }

    public i f(boolean z) {
        if (z) {
            this.a.e(b);
        } else {
            this.a.e(f4609c);
        }
        return this;
    }

    public i g(char[] cArr) {
        this.a.e(cArr);
        return this;
    }

    public i h() {
        this.a.g();
        return this;
    }
}
