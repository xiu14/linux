package com.ss.android.ugc.aweme.thread;

import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
class k {
    private l a = new l();
    private b b = new d();

    public interface b {
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {
        private static final k a = new k(null);
    }

    k(a aVar) {
    }

    ExecutorService a(j jVar, boolean z) {
        ExecutorService i = ((d) this.b).i(jVar);
        Objects.requireNonNull(h.b());
        return i;
    }
}
