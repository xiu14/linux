package com.bytedance.bdinstall.p0;

import android.accounts.Account;
import android.content.SharedPreferences;
import com.bytedance.bdinstall.Q;

/* loaded from: classes.dex */
public class j {
    private String a;
    private SharedPreferences b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4104c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4105d;

    /* renamed from: e, reason: collision with root package name */
    private Account f4106e;

    /* renamed from: f, reason: collision with root package name */
    private String f4107f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4108g = false;
    private Q h;

    public Account a() {
        return this.f4106e;
    }

    String b() {
        return this.a;
    }

    public Q c() {
        return this.h;
    }

    public SharedPreferences d() {
        return this.b;
    }

    String e() {
        return this.f4107f;
    }

    public boolean f() {
        return this.f4105d;
    }

    boolean g() {
        return this.f4104c;
    }

    public boolean h() {
        return this.f4108g;
    }

    public void i(Account account, String str) {
        this.f4106e = account;
        this.f4107f = str;
    }

    void j(boolean z) {
        this.f4105d = z;
    }

    public void k(String str) {
        this.a = str;
    }

    public void l(boolean z) {
        this.f4104c = z;
    }

    public void m(boolean z) {
        this.f4108g = z;
    }

    public void n(Q q) {
        this.h = q;
    }

    public void o(SharedPreferences sharedPreferences) {
        this.b = sharedPreferences;
    }
}
