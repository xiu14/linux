package com.ttnet.org.chromium.base.library_loader;

import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.base.k.b;
import com.ttnet.org.chromium.base.library_loader.Linker;

/* loaded from: classes2.dex */
class ModernLinkerJni {
    ModernLinkerJni() {
    }

    private static native int nativeGetRelroSharingResult();

    private static native boolean nativeLoadLibrary(String str, Linker.LibInfo libInfo, boolean z);

    private static native boolean nativeUseRelros(long j, Linker.LibInfo libInfo);

    @CalledByNative
    public static void reportDlopenExtTime(long j) {
        b.c("ChromiumAndroidLinker.ModernLinkerDlopenExtTime", j);
    }

    @CalledByNative
    public static void reportIteratePhdrTime(long j) {
        b.c("ChromiumAndroidLinker.ModernLinkerIteratePhdrTime", j);
    }
}
