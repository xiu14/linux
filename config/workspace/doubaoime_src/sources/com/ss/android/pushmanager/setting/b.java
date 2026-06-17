package com.ss.android.pushmanager.setting;

/* loaded from: classes2.dex */
class b implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ PushMultiProcessSharedProvider f8371c;

    b(PushMultiProcessSharedProvider pushMultiProcessSharedProvider, String str, String str2) {
        this.f8371c = pushMultiProcessSharedProvider;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        PushMultiProcessSharedProvider pushMultiProcessSharedProvider = this.f8371c;
        pushMultiProcessSharedProvider.getContext().getContentResolver().notifyChange(PushMultiProcessSharedProvider.c(pushMultiProcessSharedProvider.getContext(), this.a, this.b), null);
    }
}
