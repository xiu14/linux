package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class m {
    public final x a;
    public final y b;
    private String j;
    private DateFormat k;
    protected w m;
    public TimeZone n;

    /* renamed from: c, reason: collision with root package name */
    protected List<d> f1516c = null;

    /* renamed from: d, reason: collision with root package name */
    protected List<AbstractC0499a> f1517d = null;

    /* renamed from: e, reason: collision with root package name */
    protected List<u> f1518e = null;

    /* renamed from: f, reason: collision with root package name */
    protected List<A> f1519f = null;

    /* renamed from: g, reason: collision with root package name */
    protected List<r> f1520g = null;
    protected List<v> h = null;
    private int i = 0;
    protected IdentityHashMap<Object, w> l = null;
    public Locale o = com.alibaba.fastjson.a.b;

    public m(y yVar, x xVar) {
        this.n = com.alibaba.fastjson.a.a;
        this.b = yVar;
        this.a = xVar;
        this.n = com.alibaba.fastjson.a.a;
    }

    public void a() {
        this.i--;
    }

    public DateFormat b() {
        if (this.k == null && this.j != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.j, this.o);
            this.k = simpleDateFormat;
            simpleDateFormat.setTimeZone(this.n);
        }
        return this.k;
    }

    public void c() {
        this.i++;
    }

    public void d() {
        this.b.write(10);
        for (int i = 0; i < this.i; i++) {
            this.b.write(9);
        }
    }

    public void e(w wVar, Object obj, Object obj2, int i) {
        if ((this.b.f1531c & SerializerFeature.DisableCircularReferenceDetect.mask) == 0) {
            this.m = new w(wVar, obj, obj2, i);
            if (this.l == null) {
                this.l = new IdentityHashMap<>();
            }
            this.l.put(obj, this.m);
        }
    }

    public final void f(Object obj) {
        if (obj == null) {
            this.b.write("null");
            return;
        }
        try {
            this.a.a(obj.getClass()).b(this, obj, null, null);
        } catch (IOException e2) {
            throw new com.alibaba.fastjson.d(e2.getMessage(), e2);
        }
    }

    public final void g(String str) {
        if (str == null) {
            y yVar = this.b;
            if ((yVar.f1531c & SerializerFeature.WriteNullStringAsEmpty.mask) != 0) {
                yVar.w("");
                return;
            } else {
                yVar.write("null");
                return;
            }
        }
        y yVar2 = this.b;
        if ((yVar2.f1531c & SerializerFeature.UseSingleQuotes.mask) != 0) {
            yVar2.z(str);
        } else {
            yVar2.x(str, (char) 0, true);
        }
    }

    public void h(Object obj) {
        w wVar = this.m;
        if (obj == wVar.b) {
            this.b.write("{\"$ref\":\"@\"}");
            return;
        }
        w wVar2 = wVar.a;
        if (wVar2 != null && obj == wVar2.b) {
            this.b.write("{\"$ref\":\"..\"}");
            return;
        }
        while (true) {
            w wVar3 = wVar.a;
            if (wVar3 == null) {
                break;
            } else {
                wVar = wVar3;
            }
        }
        if (obj == wVar.b) {
            this.b.write("{\"$ref\":\"$\"}");
            return;
        }
        String wVar4 = this.l.get(obj).toString();
        this.b.write("{\"$ref\":\"");
        this.b.write(wVar4);
        this.b.write("\"}");
    }

    public String toString() {
        return this.b.toString();
    }
}
