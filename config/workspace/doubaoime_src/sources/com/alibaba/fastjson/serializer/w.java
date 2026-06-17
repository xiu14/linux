package com.alibaba.fastjson.serializer;

/* loaded from: classes.dex */
public class w {
    public final w a;
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1526c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1527d;

    public w(w wVar, Object obj, Object obj2, int i) {
        this.a = wVar;
        this.b = obj;
        this.f1526c = obj2;
        this.f1527d = i;
    }

    public String toString() {
        if (this.a == null) {
            return "$";
        }
        if (!(this.f1526c instanceof Integer)) {
            return this.a.toString() + "." + this.f1526c;
        }
        return this.a.toString() + "[" + this.f1526c + "]";
    }
}
