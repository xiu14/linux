package com.ss.android.c;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes2.dex */
final class b implements FilenameFilter {
    b() {
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.startsWith(".logCache_");
    }
}
