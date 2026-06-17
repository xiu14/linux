package com.huawei.d.a.j;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class f implements Runnable {
    public final /* synthetic */ com.huawei.d.a.g a;
    public final /* synthetic */ Callable b;

    public f(com.huawei.d.a.g gVar, Callable callable) {
        this.a = gVar;
        this.b = callable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.a.b(this.b.call());
        } catch (Exception e2) {
            this.a.a(e2);
        }
    }
}
