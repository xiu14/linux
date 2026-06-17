package e.c.h.f;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class t {
    public final int a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9878c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9879d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9880e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9881f;

    public t(int i, int i2, int i3, int i4, int i5) {
        this(i, i2, i3, i4, i5, TimeUnit.MINUTES.toMillis(5L));
    }

    public t(int i, int i2, int i3, int i4, int i5, long j) {
        this.a = i;
        this.b = i2;
        this.f9878c = i3;
        this.f9879d = i4;
        this.f9880e = i5;
        this.f9881f = j;
    }
}
