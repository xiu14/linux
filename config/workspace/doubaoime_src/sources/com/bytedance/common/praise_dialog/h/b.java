package com.bytedance.common.praise_dialog.h;

import com.bytedance.android.input.basic.IAppGlobals;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class b implements e.b.k.c.b {
    private final ThreadPoolExecutor a = new ThreadPoolExecutor(1, 5, 0, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());

    @Override // e.b.k.c.b
    public void execute(Runnable runnable) {
        IAppGlobals.a.j("PraiseDialogAsyncThreadConfigImpl", "execute: " + runnable);
        ThreadPoolExecutor threadPoolExecutor = this.a;
        l.c(runnable);
        threadPoolExecutor.execute(runnable);
    }
}
