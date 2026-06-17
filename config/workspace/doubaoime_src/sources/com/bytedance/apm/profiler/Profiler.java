package com.bytedance.apm.profiler;

import androidx.annotation.Keep;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class Profiler {
    static {
        new AtomicReference(null);
    }

    private Profiler() {
    }

    @Keep
    private static native boolean nAttachThread(int i);

    @Keep
    private static native boolean nCheck();

    @Keep
    private static native void nClear();

    @Keep
    private static native boolean nDetachThread(int i);

    @Keep
    private static native String nDump(long j, long j2);

    @Keep
    private static native String nGetStack(int i);

    @Keep
    private static native boolean nInit();

    @Keep
    private static native void nSetAlog(long j);

    @Keep
    private static native boolean nStart(int i);

    @Keep
    private static native boolean nStop();
}
