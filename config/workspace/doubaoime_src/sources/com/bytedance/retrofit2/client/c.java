package com.bytedance.retrofit2.client;

import com.bytedance.retrofit2.mime.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class c {
    private final String a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6010c;

    /* renamed from: d, reason: collision with root package name */
    private final List<b> f6011d;

    /* renamed from: e, reason: collision with root package name */
    private final h f6012e;

    /* renamed from: f, reason: collision with root package name */
    private Object f6013f;

    /* renamed from: g, reason: collision with root package name */
    private String f6014g;

    public c(String str, int i, String str2, List<b> list, h hVar) {
        if (str == null) {
            throw new IllegalArgumentException("url == null");
        }
        if (i < 200) {
            throw new IllegalArgumentException(e.a.a.a.a.j("Invalid status code: ", i));
        }
        if (str2 == null) {
            throw new IllegalArgumentException("reason == null");
        }
        if (list == null) {
            throw new IllegalArgumentException("headers == null");
        }
        this.a = str;
        this.b = i;
        this.f6010c = str2;
        this.f6011d = Collections.unmodifiableList(new ArrayList(list));
        this.f6012e = hVar;
    }

    public h a() {
        return this.f6012e;
    }

    public Object b() {
        return this.f6013f;
    }

    public b c(String str) {
        List<b> list;
        if (str != null && (list = this.f6011d) != null) {
            for (b bVar : list) {
                if (str.equalsIgnoreCase(bVar.a())) {
                    return bVar;
                }
            }
        }
        return null;
    }

    public List<b> d() {
        return this.f6011d;
    }

    public String e() {
        return this.f6010c;
    }

    public int f() {
        return this.b;
    }

    public String g() {
        return this.f6014g;
    }

    public String h() {
        return this.a;
    }

    public List<b> i(String str) {
        List<b> list;
        ArrayList arrayList = null;
        if (str != null && (list = this.f6011d) != null) {
            for (b bVar : list) {
                if (str.equalsIgnoreCase(bVar.a())) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    public boolean j() {
        int i = this.b;
        return i >= 200 && i < 300;
    }

    public void k(Object obj) {
        this.f6013f = obj;
    }

    public void l(String str) {
        this.f6014g = str;
    }
}
