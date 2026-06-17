package com.bytedance.crash.L;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
class i implements FilenameFilter {
    i(j jVar) {
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        if (!new File(file, str).isDirectory()) {
            return false;
        }
        try {
            Long.parseLong(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
