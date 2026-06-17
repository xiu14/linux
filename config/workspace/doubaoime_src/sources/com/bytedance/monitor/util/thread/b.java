package com.bytedance.monitor.util.thread;

import com.bytedance.monitor.util.thread.a;

/* loaded from: classes.dex */
final class b implements e {
    final /* synthetic */ String a;
    final /* synthetic */ AsyncTaskType b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Runnable f5482c;

    b(String str, AsyncTaskType asyncTaskType, Runnable runnable) {
        this.a = str;
        this.b = asyncTaskType;
        this.f5482c = runnable;
    }

    @Override // com.bytedance.monitor.util.thread.e
    public AsyncTaskType M() {
        return this.b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Runnable runnable = this.f5482c;
            if (runnable != null) {
                runnable.run();
                int i = a.i;
                a aVar = a.d.a;
            }
        } catch (Throwable th) {
            int i2 = a.i;
            a.d.a.b(th, "APM_INNER_ERROR_async_task");
        }
    }
}
