package com.bytedance.memory.d;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.IOOMCallback;

/* loaded from: classes.dex */
class c implements IOOMCallback {
    final /* synthetic */ b a;

    c(b bVar) {
        this.a = bVar;
    }

    @Override // com.bytedance.crash.IOOMCallback
    public void onCrash(@NonNull CrashType crashType, @Nullable Throwable th, @Nullable Thread thread, long j) {
        com.bytedance.memory.b.c.b("onCrash callback", new Object[0]);
        if (th == null || (th instanceof OutOfMemoryError) || !com.bytedance.memory.c.d.g().b()) {
            return;
        }
        b.a(this.a);
    }
}
