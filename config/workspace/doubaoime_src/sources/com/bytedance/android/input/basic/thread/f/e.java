package com.bytedance.android.input.basic.thread.f;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2134c;

    public /* synthetic */ e(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.f2134c = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return k.g(this.a, this.b, this.f2134c, runnable);
    }
}
