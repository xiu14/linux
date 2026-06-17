package com.ttnet.org.chromium.net;

/* loaded from: classes2.dex */
class o implements Runnable {
    final /* synthetic */ NetworkChangeNotifier a;

    o(NetworkChangeNotifier networkChangeNotifier) {
        this.a = networkChangeNotifier;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        NetworkChangeNotifier networkChangeNotifier = this.a;
        i = networkChangeNotifier.f8608d;
        networkChangeNotifier.e(i);
    }
}
