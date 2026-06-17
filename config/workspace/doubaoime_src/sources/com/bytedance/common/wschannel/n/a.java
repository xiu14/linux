package com.bytedance.common.wschannel.n;

import android.os.Handler;
import com.bytedance.common.wschannel.heartbeat.model.AppState;
import com.bytedance.common.wschannel.heartbeat.model.a;
import okhttp3.B;

/* JADX WARN: Unexpected interfaces in signature: [com.bytedance.common.wschannel.n.a] */
/* loaded from: classes.dex */
public abstract class a<T extends com.bytedance.common.wschannel.heartbeat.model.a> {
    protected T a;

    public a(T t) {
        this.a = t;
    }

    public abstract void a(c cVar, Handler handler);

    public abstract void b(AppState appState);

    public abstract void c(B b);

    public abstract void d();

    public abstract void e();

    public abstract void f();
}
