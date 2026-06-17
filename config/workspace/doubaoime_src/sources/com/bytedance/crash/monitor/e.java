package com.bytedance.crash.monitor;

import androidx.annotation.RequiresApi;
import java.io.File;
import java.util.Comparator;

/* loaded from: classes.dex */
final class e implements Comparator<File> {
    final /* synthetic */ String a;

    e(String str) {
        this.a = str;
    }

    @Override // java.util.Comparator
    @RequiresApi(api = 19)
    public int compare(File file, File file2) {
        return Long.compare(CacheManager.j(file2, this.a), CacheManager.j(file, this.a));
    }
}
