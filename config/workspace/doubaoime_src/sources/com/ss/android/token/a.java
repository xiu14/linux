package com.ss.android.token;

/* loaded from: classes2.dex */
class a implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AuthTokenMultiProcessSharedProvider f8378c;

    a(AuthTokenMultiProcessSharedProvider authTokenMultiProcessSharedProvider, String str, String str2) {
        this.f8378c = authTokenMultiProcessSharedProvider;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        AuthTokenMultiProcessSharedProvider authTokenMultiProcessSharedProvider = this.f8378c;
        authTokenMultiProcessSharedProvider.getContext().getContentResolver().notifyChange(AuthTokenMultiProcessSharedProvider.b(authTokenMultiProcessSharedProvider.getContext(), this.a, this.b), null);
    }
}
