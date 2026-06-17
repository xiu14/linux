package com.bytedance.mobsec.metasec.ml;

import android.text.TextUtils;
import java.util.Objects;
import ms.bd.c.e3;
import ms.bd.c.w2;

/* loaded from: classes.dex */
public final class c implements w2 {
    private final w2 a;

    c(com.bytedance.mobsec.metasec.core.d dVar) {
        this.a = dVar;
    }

    @Override // ms.bd.c.w2
    public void a(String str, String str2) {
        Objects.requireNonNull(e3.a);
        if (!TextUtils.isEmpty(null)) {
            this.a.b(null);
        }
        this.a.a(str, str2);
    }

    @Override // ms.bd.c.w2
    public void b(String str) {
        this.a.b(str);
    }

    @Override // ms.bd.c.w2
    public void c(String str) {
        this.a.c(str);
    }

    @Override // ms.bd.c.w2
    public void d(int i) {
        this.a.d(i);
    }

    @Override // ms.bd.c.w2
    public void e(String str) {
        this.a.e(str);
    }
}
