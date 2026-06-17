package com.ttnet.org.chromium.base.library_loader;

import androidx.annotation.NonNull;
import com.ttnet.org.chromium.base.library_loader.Linker;

/* loaded from: classes2.dex */
class LinkerJni {
    LinkerJni() {
    }

    private static native void nativeFindMemoryRegionAtRandomAddress(@NonNull Linker.LibInfo libInfo, boolean z);

    private static native boolean nativeFindRegionReservedByWebViewZygote(@NonNull Linker.LibInfo libInfo);

    private static native void nativeReserveMemoryForLibrary(@NonNull Linker.LibInfo libInfo);
}
