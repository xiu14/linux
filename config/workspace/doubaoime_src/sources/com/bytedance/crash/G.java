package com.bytedance.crash;

/* loaded from: classes.dex */
final class G implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    G(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        t tVar;
        String str;
        t tVar2;
        String str2;
        try {
            I.a();
            if (this.a == null) {
                tVar2 = I.a;
                str2 = I.b;
                tVar2.a(str2, this.b);
            } else {
                tVar = I.a;
                str = I.b;
                tVar.c(str, this.b, this.a);
            }
        } catch (Throwable unused) {
        }
    }
}
