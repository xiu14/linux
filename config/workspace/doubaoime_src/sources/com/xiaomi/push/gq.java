package com.xiaomi.push;

import java.util.Map;

/* loaded from: classes2.dex */
public class gq implements Cloneable {
    public static String a = "wcc-ml-test10.bj";
    public static final String b = bj.b("MTAuMzguMTYyLjM1");

    /* renamed from: c, reason: collision with root package name */
    public static String f9113c = null;

    /* renamed from: a, reason: collision with other field name */
    private int f522a;

    /* renamed from: a, reason: collision with other field name */
    private gt f523a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f524a = gp.f506a;

    /* renamed from: b, reason: collision with other field name */
    private boolean f525b = true;

    /* renamed from: d, reason: collision with root package name */
    private String f9114d;

    /* renamed from: e, reason: collision with root package name */
    private String f9115e;

    /* renamed from: f, reason: collision with root package name */
    private String f9116f;

    public gq(Map<String, Integer> map, int i, String str, gt gtVar) {
        a(map, i, str, gtVar);
    }

    public static final String a() {
        String str = f9113c;
        return str != null ? str : z.m851a() ? "sandbox.xmpush.xiaomi.com" : z.b() ? b : "app.chat.xiaomi.net";
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] mo447a() {
        return null;
    }

    public void b(String str) {
        this.f9116f = str;
    }

    public String c() {
        if (this.f9115e == null) {
            this.f9115e = a();
        }
        return this.f9115e;
    }

    public String b() {
        return this.f9116f;
    }

    public void c(String str) {
        this.f9115e = str;
    }

    public static final void a(String str) {
        if (z.b()) {
            return;
        }
        f9113c = str;
    }

    private void a(Map<String, Integer> map, int i, String str, gt gtVar) {
        this.f522a = i;
        this.f9114d = str;
        this.f523a = gtVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    public int m445a() {
        return this.f522a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m446a() {
        return this.f524a;
    }

    public void a(boolean z) {
        this.f524a = z;
    }
}
