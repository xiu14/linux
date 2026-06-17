package com.bytedance.bdinstall.p0;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.text.TextUtils;
import com.bytedance.bdinstall.e0;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class a implements com.bytedance.bdinstall.o0.a {
    protected final Context a;
    protected final j b;

    /* renamed from: c, reason: collision with root package name */
    protected d f4088c;

    /* renamed from: d, reason: collision with root package name */
    protected b f4089d;

    /* renamed from: e, reason: collision with root package name */
    protected String f4090e;

    /* renamed from: f, reason: collision with root package name */
    protected String f4091f;

    /* renamed from: g, reason: collision with root package name */
    private volatile String f4092g;
    protected final String h;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
    
        if ((r5.getApplicationInfo().targetSdkVersion >= 30) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    a(android.content.Context r5, com.bytedance.bdinstall.p0.j r6) {
        /*
            r4 = this;
            r4.<init>()
            boolean r0 = r6.g()
            if (r0 == 0) goto Lc
            java.lang.String r0 = "_local"
            goto Le
        Lc:
            java.lang.String r0 = ""
        Le:
            r4.h = r0
            android.content.Context r0 = r5.getApplicationContext()
            r4.a = r0
            r4.b = r6
            com.bytedance.bdinstall.p0.i r1 = new com.bytedance.bdinstall.p0.i
            android.content.SharedPreferences r2 = r6.d()
            com.bytedance.bdinstall.Q r3 = r6.c()
            r1.<init>(r0, r2, r3)
            r4.f4088c = r1
            com.bytedance.bdinstall.Q r0 = r6.c()
            android.content.SharedPreferences r0 = com.bytedance.bdinstall.util.g.d(r5, r0)
            r1 = 0
            java.lang.String r2 = "is_migrate"
            boolean r0 = r0.getBoolean(r2, r1)
            if (r0 != 0) goto L6a
            com.bytedance.bdinstall.p0.b r0 = new com.bytedance.bdinstall.p0.b
            java.lang.String r2 = r6.e()
            com.bytedance.bdinstall.Q r3 = r6.c()
            r0.<init>(r5, r2, r3)
            r4.f4089d = r0
            com.bytedance.bdinstall.p0.d r2 = r4.f4088c
            r2.m(r0)
            com.bytedance.bdinstall.p0.b r0 = r4.f4089d
            boolean r2 = com.bytedance.bdinstall.util.n.g()
            if (r2 == 0) goto L61
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            int r5 = r5.targetSdkVersion
            r2 = 30
            if (r5 < r2) goto L5f
            r1 = 1
        L5f:
            if (r1 != 0) goto L6a
        L61:
            boolean r5 = r6.h()
            if (r5 == 0) goto L6a
            r4.e(r6, r0)
        L6a:
            android.accounts.Account r5 = r6.a()
            com.bytedance.bdinstall.p0.b r0 = r4.f4089d
            if (r0 == 0) goto L7d
            com.bytedance.bdinstall.Q r6 = r6.c()
            java.lang.String r6 = r6.i()
            r0.p(r6, r5)
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdinstall.p0.a.<init>(android.content.Context, com.bytedance.bdinstall.p0.j):void");
    }

    @Override // com.bytedance.bdinstall.o0.a
    public void b(String str) {
        if (!e0.b(str) || e0.e(str, this.f4092g)) {
            return;
        }
        this.f4092g = this.f4088c.c(str, this.f4092g);
    }

    @Override // com.bytedance.bdinstall.o0.a
    public String c(boolean z) {
        String str;
        if (!TextUtils.isEmpty(this.f4090e)) {
            return this.f4090e;
        }
        try {
            str = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
        } catch (Exception e2) {
            e2.printStackTrace();
            str = null;
        }
        SharedPreferences d2 = com.bytedance.bdinstall.util.g.d(this.a, this.b.c());
        String string = d2.getString("openudid", null);
        try {
            if (!e0.g(str) || "9774d56d682e549c".equals(str)) {
                if (!e0.g(string)) {
                    string = new BigInteger(80, new SecureRandom()).toString(16);
                    if (string.charAt(0) == '-') {
                        string = string.substring(1);
                    }
                    int length = 13 - string.length();
                    if (length > 0) {
                        StringBuilder sb = new StringBuilder();
                        while (length > 0) {
                            sb.append('F');
                            length--;
                        }
                        sb.append(string);
                        str = sb.toString();
                    }
                }
                str = string;
            }
        } catch (Exception unused) {
        }
        SharedPreferences.Editor edit = d2.edit();
        edit.putString("openudid", str);
        edit.apply();
        if (!TextUtils.isEmpty(str)) {
            StringBuilder M = e.a.a.a.a.M(str);
            M.append(this.h);
            str = M.toString();
        }
        if (!TextUtils.isEmpty(str)) {
            this.f4090e = str;
        }
        return str;
    }

    @Override // com.bytedance.bdinstall.o0.a
    public String d() {
        if (!TextUtils.isEmpty(this.f4091f)) {
            return this.f4091f;
        }
        try {
            SharedPreferences d2 = com.bytedance.bdinstall.util.g.d(this.a, this.b.c());
            String string = d2.getString("clientudid", null);
            if (!e0.g(string)) {
                string = UUID.randomUUID().toString();
                SharedPreferences.Editor edit = d2.edit();
                edit.putString("clientudid", string);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                string = string + this.h;
            }
            this.f4091f = string;
            return string;
        } catch (Exception e2) {
            e2.printStackTrace();
            return "";
        }
    }

    protected void e(j jVar, d dVar) {
    }

    @Override // com.bytedance.bdinstall.o0.a
    public String getDeviceId() {
        if (!TextUtils.isEmpty(this.f4092g)) {
            return this.f4092g;
        }
        this.f4092g = this.f4088c.c("", "");
        return this.f4092g;
    }
}
