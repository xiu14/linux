package com.bytedance.apm;

import java.io.File;
import java.util.Comparator;

/* loaded from: classes.dex */
final class f implements Comparator<File> {
    f() {
    }

    @Override // java.util.Comparator
    public int compare(File file, File file2) {
        return Long.compare(file.lastModified(), file2.lastModified());
    }
}
