package com.bytedance.android.input.keyboard.gif.list_layout;

import java.io.File;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class l<T> implements Comparator {
    final /* synthetic */ m a;

    public l(m mVar) {
        this.a = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        File file = (File) t2;
        m mVar = this.a;
        kotlin.s.c.l.e(file, "it");
        Long valueOf = Long.valueOf(m.a(mVar, file));
        File file2 = (File) t;
        m mVar2 = this.a;
        kotlin.s.c.l.e(file2, "it");
        return kotlin.q.a.a(valueOf, Long.valueOf(m.a(mVar2, file2)));
    }
}
