package com.vivo.push.util;

import android.content.Context;
import com.vivo.push.h.u;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.NotifyArriveCallbackByUser;
import java.util.List;

/* loaded from: classes2.dex */
final class p implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ o b;

    p(o oVar, List list) {
        this.b = oVar;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InsideNotificationItem insideNotificationItem;
        long j;
        Context context;
        InsideNotificationItem insideNotificationItem2;
        long j2;
        int i;
        NotifyArriveCallbackByUser notifyArriveCallbackByUser;
        u.a aVar;
        insideNotificationItem = this.b.b;
        if (insideNotificationItem != null) {
            ad c2 = ad.c();
            j = this.b.f8930c;
            c2.a("com.vivo.push.notify_key", j);
            context = this.b.a;
            List list = this.a;
            insideNotificationItem2 = this.b.b;
            j2 = this.b.f8930c;
            i = this.b.f8932e;
            notifyArriveCallbackByUser = this.b.f8933f;
            aVar = this.b.f8934g;
            NotifyAdapterUtil.pushNotification(context, list, insideNotificationItem2, j2, i, notifyArriveCallbackByUser, aVar);
        }
    }
}
