package com.bytedance.bdinstall;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
class U {
    private final ThreadLocal<Boolean> a;

    U() {
        new AtomicBoolean(false);
        this.a = new ThreadLocal<>();
    }

    void a(boolean z) {
        if (z) {
            this.a.set(Boolean.valueOf(z));
        } else {
            this.a.remove();
        }
    }

    void b(boolean z) {
        if (z) {
            this.a.set(Boolean.valueOf(z));
        } else {
            this.a.remove();
            int i = C0640u.a;
        }
    }
}
