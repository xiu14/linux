package com.bytedance.android.input.common;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class l<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return kotlin.q.a.a((Integer) ((kotlin.g) t2).c(), (Integer) ((kotlin.g) t).c());
    }
}
