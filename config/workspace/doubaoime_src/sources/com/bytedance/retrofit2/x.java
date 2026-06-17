package com.bytedance.retrofit2;

import androidx.core.app.NotificationCompat;
import kotlinx.coroutines.InterfaceC0812k;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class x<T> implements InterfaceC0704h<T> {
    final /* synthetic */ InterfaceC0812k a;

    x(InterfaceC0812k interfaceC0812k) {
        this.a = interfaceC0812k;
    }

    @Override // com.bytedance.retrofit2.InterfaceC0704h
    public void a(InterfaceC0701e<T> interfaceC0701e, N<T> n) {
        kotlin.s.c.l.f(interfaceC0701e, NotificationCompat.CATEGORY_CALL);
        kotlin.s.c.l.f(n, "response");
        this.a.resumeWith(n);
    }

    @Override // com.bytedance.retrofit2.InterfaceC0704h
    public void b(InterfaceC0701e<T> interfaceC0701e, Throwable th) {
        kotlin.s.c.l.f(interfaceC0701e, NotificationCompat.CATEGORY_CALL);
        kotlin.s.c.l.f(th, "t");
        this.a.resumeWith(com.prolificinteractive.materialcalendarview.r.J(th));
    }
}
