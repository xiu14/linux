package com.ttnet.org.chromium.net.impl;

import java.io.IOException;

/* renamed from: com.ttnet.org.chromium.net.impl.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class RunnableC0773m implements Runnable {
    final /* synthetic */ C0772l a;

    RunnableC0773m(C0772l c0772l) {
        this.a = c0772l;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a.m != null) {
            try {
                this.a.m.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            this.a.m = null;
        }
    }
}
