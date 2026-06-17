package com.bytedance.push.notification;

/* loaded from: classes2.dex */
class s implements Runnable {
    final /* synthetic */ t a;

    s(t tVar) {
        this.a = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.b.onSuccess();
    }
}
