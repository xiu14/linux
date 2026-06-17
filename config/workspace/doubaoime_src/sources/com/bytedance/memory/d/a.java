package com.bytedance.memory.d;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.IOOMCallback;

/* loaded from: classes.dex */
public class a implements IOOMCallback {
    @Override // com.bytedance.crash.IOOMCallback
    public void onCrash(@NonNull CrashType crashType, @Nullable Throwable th, @Nullable Thread thread, long j) {
        try {
            if (com.bytedance.memory.c.b.c().j()) {
                return;
            }
            com.bytedance.memory.c.d.g().d(j);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
