package com.bytedance.frameworks.baselib.network.dispatcher;

import com.bytedance.frameworks.baselib.network.dispatcher.IRequest;
import com.bytedance.retrofit2.O;
import com.bytedance.retrofit2.RetrofitMetrics;

/* loaded from: classes.dex */
public class a extends b {

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f5040d;

    /* renamed from: e, reason: collision with root package name */
    private final IRequest.Priority f5041e;

    public a(String str, IRequest.Priority priority, int i, Runnable runnable, boolean z) {
        this.f5041e = priority;
        if (com.bytedance.android.input.k.b.a.Y(str)) {
        }
        this.b = i;
        this.f5040d = runnable;
    }

    @Override // com.bytedance.frameworks.baselib.network.dispatcher.IRequest
    public IRequest.Priority a() {
        return this.f5041e;
    }

    @Override // com.bytedance.frameworks.baselib.network.dispatcher.IRequest
    public int b() {
        return this.f5042c;
    }

    @Override // java.lang.Comparable
    public int compareTo(IRequest iRequest) {
        IRequest iRequest2 = iRequest;
        IRequest.Priority priority = this.f5041e;
        IRequest.Priority a = iRequest2.a();
        if (priority == null) {
            priority = IRequest.Priority.NORMAL;
        }
        if (a == null) {
            a = IRequest.Priority.NORMAL;
        }
        return priority == a ? this.f5042c - iRequest2.b() : a.ordinal() - priority.ordinal();
    }

    @Override // com.bytedance.frameworks.baselib.network.dispatcher.b
    public b d(int i) {
        this.f5042c = i;
        return this;
    }

    public void e(int i) {
        RetrofitMetrics w;
        Runnable runnable = this.f5040d;
        if (!(runnable instanceof O) || (w = ((O) runnable).w()) == null) {
            return;
        }
        w.E0.f5964e.f5981d = i;
        w.B0 = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f5040d == null || c()) {
            return;
        }
        this.f5040d.run();
    }
}
