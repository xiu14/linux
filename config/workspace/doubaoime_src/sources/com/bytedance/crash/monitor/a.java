package com.bytedance.crash.monitor;

import androidx.annotation.NonNull;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.J;
import java.util.Map;

/* loaded from: classes.dex */
public class a extends f {
    private static final J p = new J();

    a(@NonNull String str, @NonNull String str2, long j) {
        super(p, str, str2, j);
        C0652g.o(j, 0L, 0L, str2);
    }

    static J A() {
        return p;
    }

    public c B(long j) {
        return this.m.p(j);
    }

    @Override // com.bytedance.crash.monitor.h
    public Map<String, Object> e() {
        return null;
    }

    @Override // com.bytedance.crash.monitor.h
    public com.bytedance.crash.R.d g() {
        com.bytedance.crash.R.d d2 = l.d();
        d2.r(this);
        return d2;
    }

    a() {
        super(p);
    }
}
