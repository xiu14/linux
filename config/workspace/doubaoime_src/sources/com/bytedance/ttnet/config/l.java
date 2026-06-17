package com.bytedance.ttnet.config;

import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.O;
import com.bytedance.retrofit2.RetrofitMetrics;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
class l extends com.bytedance.frameworks.baselib.network.asynctask.b {
    final /* synthetic */ Runnable a;
    final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Executor f6164c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TTHttpCallThrottleControl f6165d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(TTHttpCallThrottleControl tTHttpCallThrottleControl, long j, long j2, Runnable runnable, int i, Executor executor) {
        super(j, j2);
        this.f6165d = tTHttpCallThrottleControl;
        this.a = runnable;
        this.b = i;
        this.f6164c = executor;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f6165d.l.lock();
        try {
            if (this.f6165d.j.containsKey(this.a)) {
                Runnable runnable = this.a;
                if (runnable instanceof O) {
                    RetrofitMetrics w = ((O) runnable).w();
                    w.B = System.currentTimeMillis() - w.E;
                    w.F = this.b;
                }
                if (Logger.debug()) {
                    Logger.d("delayrefine", "release p1 from all p0 done, random is " + this.b);
                }
                this.f6164c.execute(this.a);
                this.f6165d.j.remove(this.a);
            }
        } finally {
            this.f6165d.l.unlock();
        }
    }
}
