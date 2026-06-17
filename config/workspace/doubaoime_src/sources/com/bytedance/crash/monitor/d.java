package com.bytedance.crash.monitor;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes.dex */
final class d implements FilenameFilter {
    final /* synthetic */ String a;

    d(String str) {
        this.a = str;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.endsWith(this.a) && !str.startsWith("current");
    }
}
