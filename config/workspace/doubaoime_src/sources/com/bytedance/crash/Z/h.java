package com.bytedance.crash.Z;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
final class h implements FilenameFilter {
    h() {
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.isDirectory()) {
            return false;
        }
        com.bytedance.crash.util.a.b(file2);
        return false;
    }
}
