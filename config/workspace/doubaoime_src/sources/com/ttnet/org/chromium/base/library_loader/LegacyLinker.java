package com.ttnet.org.chromium.base.library_loader;

import androidx.annotation.NonNull;
import com.ttnet.org.chromium.base.library_loader.Linker;

/* loaded from: classes2.dex */
class LegacyLinker extends Linker {
    LegacyLinker() {
    }

    private static native boolean nativeAddZipArchivePath(String str);

    private static native boolean nativeCreateSharedRelro(String str, long j, Linker.LibInfo libInfo);

    private static native boolean nativeLoadLibrary(String str, long j, @NonNull Linker.LibInfo libInfo);

    private static native boolean nativeUseSharedRelro(String str, Linker.LibInfo libInfo);
}
