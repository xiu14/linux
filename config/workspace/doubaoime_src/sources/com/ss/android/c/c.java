package com.ss.android.c;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes2.dex */
final class c implements FilenameFilter {
    c() {
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        if (str.endsWith(".hoting")) {
            return true;
        }
        return str.endsWith(".hot") && !str.endsWith(".alog.hot");
    }
}
