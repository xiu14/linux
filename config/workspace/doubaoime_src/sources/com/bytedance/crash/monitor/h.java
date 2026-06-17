package com.bytedance.crash.monitor;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.crash.J;
import java.util.Map;

/* loaded from: classes.dex */
public class h {
    protected com.bytedance.crash.R.g a;
    protected com.bytedance.crash.R.d b;

    /* renamed from: c, reason: collision with root package name */
    protected final J f4641c;

    /* renamed from: d, reason: collision with root package name */
    protected volatile String f4642d;

    /* renamed from: e, reason: collision with root package name */
    protected volatile long f4643e;

    /* renamed from: f, reason: collision with root package name */
    protected volatile String f4644f;

    /* renamed from: g, reason: collision with root package name */
    protected volatile String f4645g;
    protected volatile String h;
    protected volatile long i;
    protected volatile long j;
    protected volatile long k;
    private com.bytedance.crash.dumper.e l;

    h(@NonNull String str, @NonNull String str2, long j, long j2, long j3) {
        J j4 = new J();
        this.f4642d = str;
        this.h = str2;
        this.i = j;
        this.j = j3;
        this.k = j2;
        this.f4641c = j4;
    }

    public void a(String str, String str2) {
        this.f4641c.i(str, str2);
    }

    public String b() {
        return this.f4642d;
    }

    public com.bytedance.crash.dumper.e c() {
        return this.l;
    }

    public String d() {
        return this.f4645g;
    }

    public Map<String, Object> e() {
        return null;
    }

    public String f(String str) {
        return TextUtils.isEmpty(this.f4644f) ? str : this.f4644f;
    }

    public com.bytedance.crash.R.d g() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = new com.bytedance.crash.R.d(this);
                }
            }
        }
        return this.b;
    }

    public com.bytedance.crash.R.g h() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = new com.bytedance.crash.R.g(this);
                }
            }
        }
        return this.a;
    }

    public long i() {
        return this.k;
    }

    @NonNull
    public J j() {
        return this.f4641c;
    }

    public long k() {
        return this.f4643e;
    }

    @NonNull
    public c l() {
        return new c(this.i, this.k, 0L, this.h);
    }

    public long m() {
        return this.i;
    }

    public String n() {
        return this.h;
    }

    public void o(com.bytedance.crash.dumper.e eVar) {
        this.l = eVar;
    }

    public void p(String str, Throwable th) {
        g().o(th, str);
    }

    public void q(@NonNull String str) {
        this.f4645g = str;
    }

    public void r(@NonNull String str) {
        this.f4644f = str;
    }

    h(@NonNull J j, @NonNull String str, @NonNull String str2, long j2, long j3, long j4) {
        this.f4642d = str;
        this.h = str2;
        this.i = j2;
        this.j = j4;
        this.k = j3;
        this.f4641c = j;
    }

    h(@NonNull J j) {
        this.f4641c = j;
    }
}
