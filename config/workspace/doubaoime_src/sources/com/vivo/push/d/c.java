package com.vivo.push.d;

import android.app.Activity;
import com.bytedance.common.wschannel.WsConstants;
import com.vivo.push.IPushActionListener;
import com.vivo.push.util.v;
import com.vivo.push.util.w;

/* loaded from: classes2.dex */
final class c implements Runnable {
    final /* synthetic */ Activity a;
    final /* synthetic */ IPushActionListener b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ b f8801c;

    c(b bVar, Activity activity, IPushActionListener iPushActionListener) {
        this.f8801c = bVar;
        this.a = activity;
        this.b = iPushActionListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int a = b.a(this.a);
        if (a != 0) {
            this.b.onStateChanged(a);
            return;
        }
        com.vivo.push.restructure.request.d.a().a(new com.vivo.push.restructure.request.b(new a(new g(v.a(), w.a(this.a))), new d(this), WsConstants.EXIT_DELAY_TIME));
    }
}
