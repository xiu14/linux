package com.bytedance.retrofit2;

import androidx.core.app.NotificationCompat;
import java.lang.reflect.Method;
import kotlinx.coroutines.InterfaceC0812k;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
public final class v<T> implements InterfaceC0704h<T> {
    final /* synthetic */ InterfaceC0812k a;

    v(InterfaceC0812k interfaceC0812k) {
        this.a = interfaceC0812k;
    }

    @Override // com.bytedance.retrofit2.InterfaceC0704h
    public void a(InterfaceC0701e<T> interfaceC0701e, N<T> n) {
        kotlin.s.c.l.f(interfaceC0701e, NotificationCompat.CATEGORY_CALL);
        kotlin.s.c.l.f(n, "response");
        if (!n.f()) {
            this.a.resumeWith(com.prolificinteractive.materialcalendarview.r.J(new C0711o(n)));
            return;
        }
        T a = n.a();
        if (a != null) {
            this.a.resumeWith(a);
            return;
        }
        Object tag = interfaceC0701e.request().tag(t.class);
        kotlin.s.c.l.c(tag);
        Method a2 = ((t) tag).a();
        StringBuilder sb = new StringBuilder();
        sb.append("Response from ");
        kotlin.s.c.l.e(a2, "method");
        Class<?> declaringClass = a2.getDeclaringClass();
        kotlin.s.c.l.e(declaringClass, "method.declaringClass");
        sb.append(declaringClass.getName());
        sb.append('.');
        sb.append(a2.getName());
        sb.append(" was null but response body type was declared as non-null");
        this.a.resumeWith(com.prolificinteractive.materialcalendarview.r.J(new kotlin.d(sb.toString())));
    }

    @Override // com.bytedance.retrofit2.InterfaceC0704h
    public void b(InterfaceC0701e<T> interfaceC0701e, Throwable th) {
        kotlin.s.c.l.f(interfaceC0701e, NotificationCompat.CATEGORY_CALL);
        kotlin.s.c.l.f(th, "t");
        this.a.resumeWith(com.prolificinteractive.materialcalendarview.r.J(th));
    }
}
