package com.bytedance.applog;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.bdinstall.G;
import com.bytedance.bdinstall.InterfaceC0627g;

/* loaded from: classes.dex */
public class l {
    private final String a;

    /* renamed from: c, reason: collision with root package name */
    private String f3793c;

    /* renamed from: e, reason: collision with root package name */
    private String f3795e;

    /* renamed from: f, reason: collision with root package name */
    private m f3796f;

    /* renamed from: g, reason: collision with root package name */
    private String f3797g;
    private long h;
    private long i;
    private String j;
    private G k;
    private String m;
    private d o;
    private boolean b = true;

    /* renamed from: d, reason: collision with root package name */
    private int f3794d = 0;
    private boolean l = false;
    private boolean n = true;

    public l(@NonNull String str, @NonNull String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException("App id must not be empty!");
        }
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalStateException("Channel must not be empty!");
        }
        this.a = str;
        this.f3793c = str2;
    }

    public l A(int i) {
        this.f3796f = com.bytedance.applog.util.j.a();
        return this;
    }

    public l B(String str) {
        this.f3797g = str;
        return this;
    }

    public l C(long j) {
        this.h = j;
        return this;
    }

    public l D(String str) {
        this.j = str;
        return this;
    }

    public boolean a() {
        return this.b;
    }

    public InterfaceC0627g b() {
        return null;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.f3795e;
    }

    public d e() {
        return this.o;
    }

    public String f() {
        return this.f3793c;
    }

    public String g() {
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String str = this.a;
        return e.a.a.a.a.K(sb, str != null ? str.toString() : "", "@", "bd_tea_agent.db");
    }

    public G h() {
        return this.k;
    }

    public int i() {
        return this.f3794d;
    }

    public String j() {
        return this.m;
    }

    public long k() {
        return this.i;
    }

    public m l() {
        return this.f3796f;
    }

    public String m() {
        return this.f3797g;
    }

    public long n() {
        return this.h;
    }

    public String o() {
        return this.j;
    }

    public boolean p() {
        return this.l;
    }

    public boolean q() {
        return this.n;
    }

    public l r(String str) {
        this.f3795e = str;
        return this;
    }

    public l s(boolean z) {
        this.b = z;
        return this;
    }

    public l t(d dVar) {
        this.o = dVar;
        return this;
    }

    public void u(boolean z) {
        this.l = z;
    }

    public l v(boolean z) {
        this.n = z;
        return this;
    }

    public l w(G g2) {
        this.k = g2;
        return this;
    }

    @NonNull
    public l x(boolean z) {
        this.f3794d = z ? 1 : 2;
        return this;
    }

    public l y(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.m = str;
        }
        return this;
    }

    public l z(long j) {
        this.i = j;
        return this;
    }
}
