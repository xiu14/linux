package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.base.annotations.CalledByNative;

/* loaded from: classes2.dex */
public class TTThreadConfigInfoProvider$ThreadConfigInfo {
    private TTThreadConfigInfoProvider$ThreadType a;
    private int b = 20;

    /* renamed from: c, reason: collision with root package name */
    private int f8645c;

    @CalledByNative
    public int getThreadPriority() {
        return this.b;
    }

    @CalledByNative
    public int getThreadStackSize() {
        return this.f8645c;
    }

    @CalledByNative
    public int getThreadType() {
        return this.a.ordinal();
    }
}
