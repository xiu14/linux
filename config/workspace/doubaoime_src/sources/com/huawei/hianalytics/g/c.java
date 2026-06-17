package com.huawei.hianalytics.g;

import android.content.Context;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private static f f7114d = d.a();
    private String b;
    private int a = 4;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7115c = false;

    public void a(int i, String str, String str2) {
        if (a(i)) {
            g gVar = new g(7, this.b, i, str);
            gVar.a(str2);
            f7114d.a(gVar.a() + gVar.b(), i, str, str2);
        }
    }

    public void a(Context context, int i, String str) {
        this.a = i;
        this.b = str;
        f7114d.a(context, "HiAnalytics");
        this.f7115c = true;
    }

    public boolean a(int i) {
        return this.f7115c && i >= this.a;
    }

    public void a(String str, String str2) {
        g gVar = new g(7, this.b, 4, str);
        gVar.a(str2);
        f7114d.a(gVar.a() + '\n' + gVar.b(), 4, str, str2);
    }
}
