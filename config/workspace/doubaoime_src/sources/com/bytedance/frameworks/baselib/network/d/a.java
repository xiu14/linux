package com.bytedance.frameworks.baselib.network.d;

import com.bytedance.frameworks.baselib.network.asynctask.NetworkAsyncTaskType;
import com.bytedance.frameworks.baselib.network.asynctask.b;
import com.bytedance.frameworks.baselib.network.asynctask.c;
import com.bytedance.retrofit2.InterfaceC0699c;

/* loaded from: classes.dex */
public class a implements InterfaceC0699c {

    /* renamed from: com.bytedance.frameworks.baselib.network.d.a$a, reason: collision with other inner class name */
    class C0251a extends b {
        final /* synthetic */ Runnable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0251a(a aVar, long j, long j2, Runnable runnable) {
            super(j, j2);
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.run();
        }
    }

    public void a(Runnable runnable, long j) {
        c.d(NetworkAsyncTaskType.NETWORK).e(new C0251a(this, j, 0L, runnable));
    }
}
