package com.ss.ugc.effectplatform.util;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes2.dex */
final class h implements FilenameFilter {
    public static final h a = new h();

    h() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        kotlin.s.c.l.b(file, "file");
        if (!file.isDirectory()) {
            return false;
        }
        kotlin.s.c.l.b(str, "s");
        return kotlin.text.a.d(str, "kgsl", false, 2, null);
    }
}
