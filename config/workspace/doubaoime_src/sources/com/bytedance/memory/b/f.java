package com.bytedance.memory.b;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class f implements ThreadFactory {
    private final String a;

    public f(@NonNull String str) {
        this.a = e.a.a.a.a.s("MemoryWidget_", str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(@NonNull Runnable runnable) {
        return new Thread(runnable, this.a);
    }
}
