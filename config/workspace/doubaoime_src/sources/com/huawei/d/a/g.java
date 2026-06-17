package com.huawei.d.a;

/* loaded from: classes2.dex */
public class g<TResult> {
    public final com.huawei.d.a.j.e<TResult> a = new com.huawei.d.a.j.e<>();

    public void a(Exception exc) {
        com.huawei.d.a.j.e<TResult> eVar = this.a;
        synchronized (eVar.a) {
            if (!eVar.b) {
                eVar.b = true;
                eVar.f6988e = exc;
                eVar.a.notifyAll();
                eVar.h();
            }
        }
    }

    public void b(TResult tresult) {
        com.huawei.d.a.j.e<TResult> eVar = this.a;
        synchronized (eVar.a) {
            if (!eVar.b) {
                eVar.b = true;
                eVar.f6987d = tresult;
                eVar.a.notifyAll();
                eVar.h();
            }
        }
    }
}
