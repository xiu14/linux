package com.bytedance.bdinstall;

import android.content.Context;
import com.bytedance.bdinstall.K;
import org.json.JSONException;

/* renamed from: com.bytedance.bdinstall.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0631k {
    final Context a;
    final Q b;

    /* renamed from: c, reason: collision with root package name */
    protected int f4008c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f4009d;

    /* renamed from: e, reason: collision with root package name */
    protected C0632l f4010e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f4011f;

    /* renamed from: g, reason: collision with root package name */
    private K.d.a f4012g;

    /* renamed from: com.bytedance.bdinstall.k$a */
    static class a {
        boolean a = false;
        int b = 0;

        /* renamed from: c, reason: collision with root package name */
        long f4013c = 0;

        /* renamed from: d, reason: collision with root package name */
        int f4014d = 0;

        a() {
        }
    }

    protected AbstractC0631k(Context context, Q q) {
        this.a = context;
        this.b = q;
        this.f4010e = C0632l.n(String.valueOf(q.h()));
    }

    protected abstract void a();

    protected abstract boolean b() throws JSONException;

    protected abstract String c();

    public K.d.a d() {
        return this.f4012g;
    }

    protected abstract long[] e();

    boolean f() {
        return this.f4011f;
    }

    public abstract boolean g();

    protected abstract boolean h();

    protected abstract long i();

    protected abstract void j(boolean z);

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends AbstractC0631k> T k() {
        this.f4009d = 0L;
        return this;
    }

    public void l(K.d.a aVar) {
        this.f4012g = aVar;
    }

    protected void m() {
        this.f4011f = true;
    }

    protected abstract void n(int i);

    /* JADX WARN: Multi-variable type inference failed */
    final a o() {
        boolean z;
        long j;
        int i;
        int i2 = 1;
        boolean z2 = 0;
        z2 = 0;
        Object[] objArr = !h() || com.bytedance.android.input.k.b.a.j0(this.a);
        a aVar = new a();
        if (objArr == true) {
            long i3 = this.f4009d + i();
            long currentTimeMillis = System.currentTimeMillis();
            if (i3 <= 1000 + currentTimeMillis) {
                try {
                    z = b();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    int i4 = C0640u.a;
                    z = false;
                }
                if (z) {
                    aVar.f4014d = this.f4008c;
                    this.f4008c = 0;
                    this.f4009d = System.currentTimeMillis();
                    j = i();
                    i = 0;
                } else {
                    long[] e3 = e();
                    int i5 = this.f4008c;
                    int i6 = i5 + 1;
                    this.f4008c = i6;
                    int length = i5 % e3.length;
                    long j2 = e3[length];
                    if (length == e3.length - 1) {
                        aVar.f4014d = i6;
                        i = 4;
                        i2 = 0;
                        j = j2;
                    } else {
                        i2 = 0;
                        j = j2;
                        i = 3;
                    }
                }
                c();
                int i7 = C0640u.a;
                z2 = i2;
                i2 = i;
            } else {
                j = i3 - currentTimeMillis;
                i2 = 2;
                c();
                int i8 = C0640u.a;
            }
        } else {
            j = com.heytap.mcssdk.constant.a.f6886d;
            c();
            int i9 = C0640u.a;
        }
        aVar.b = i2;
        aVar.a = z2;
        aVar.f4013c = j;
        return aVar;
    }

    protected AbstractC0631k(Context context, Q q, long j) {
        this.a = context;
        this.b = q;
        this.f4009d = j;
        this.f4010e = C0632l.n(String.valueOf(q.h()));
    }
}
