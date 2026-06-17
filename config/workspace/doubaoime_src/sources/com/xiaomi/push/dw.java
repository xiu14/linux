package com.xiaomi.push;

/* loaded from: classes2.dex */
public class dw {
    private static volatile dw a;

    /* renamed from: a, reason: collision with other field name */
    private dv f300a;

    public static dw a() {
        if (a == null) {
            synchronized (dw.class) {
                if (a == null) {
                    a = new dw();
                }
            }
        }
        return a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public dv m260a() {
        return this.f300a;
    }

    public void a(dv dvVar) {
        this.f300a = dvVar;
    }
}
