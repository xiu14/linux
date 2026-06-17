package com.ss.android.d.c;

import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a {
    private String a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private String f8296c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8297d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8298e;

    /* renamed from: f, reason: collision with root package name */
    private final String f8299f;

    /* renamed from: g, reason: collision with root package name */
    private String f8300g;
    private final boolean h;

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        l.f(str, "appId");
        l.f(str5, "deviceName");
        this.a = str;
        this.b = str2;
        this.f8296c = str3;
        this.f8297d = str4;
        this.f8298e = str5;
        this.f8299f = str6;
        this.f8300g = str7;
        this.h = z;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("AnyDoorAppInfo{appId='");
        M.append(this.a);
        M.append("', userId='");
        M.append((Object) this.b);
        M.append("', deviceId='");
        M.append((Object) this.f8296c);
        M.append("', deviceVersion='");
        M.append((Object) this.f8297d);
        M.append("', deviceName='");
        M.append(this.f8298e);
        M.append("', osVersion='");
        M.append((Object) this.f8299f);
        M.append("', ssoEmail='");
        M.append((Object) this.f8300g);
        M.append("', isBoe='");
        M.append(this.h);
        M.append("'}");
        return M.toString();
    }
}
