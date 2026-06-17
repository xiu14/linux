package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.cj;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class cc implements Runnable {
    private String a;

    /* renamed from: a, reason: collision with other field name */
    private WeakReference<Context> f170a;

    public cc(String str, WeakReference<Context> weakReference) {
        this.a = str;
        this.f170a = weakReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        WeakReference<Context> weakReference = this.f170a;
        if (weakReference == null || (context = weakReference.get()) == null) {
            return;
        }
        if (cn.a(this.a) <= cb.f168a) {
            com.xiaomi.channel.commonutils.logger.c.b("=====> do not need clean db");
            return;
        }
        cf a = cf.a(this.a);
        ce a2 = ce.a(this.a);
        a.a(a2);
        a2.a(cd.a(context, this.a, 1000));
        cj.a(context).a((cj.a) a);
    }
}
