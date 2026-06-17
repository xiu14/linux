package com.alibaba.fastjson.parser;

/* loaded from: classes.dex */
public class j {
    public Object a;
    public final j b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1503c;

    /* renamed from: d, reason: collision with root package name */
    private transient String f1504d;

    public j(j jVar, Object obj, Object obj2) {
        this.b = jVar;
        this.a = obj;
        this.f1503c = obj2;
    }

    public String toString() {
        if (this.f1504d == null) {
            if (this.b == null) {
                this.f1504d = "$";
            } else if (this.f1503c instanceof Integer) {
                this.f1504d = this.b.toString() + "[" + this.f1503c + "]";
            } else {
                this.f1504d = this.b.toString() + "." + this.f1503c;
            }
        }
        return this.f1504d;
    }
}
