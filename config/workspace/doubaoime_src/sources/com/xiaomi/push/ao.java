package com.xiaomi.push;

import android.content.Context;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
class ao implements al {
    private Context a;

    /* renamed from: a, reason: collision with other field name */
    private Class<?> f117a;

    /* renamed from: a, reason: collision with other field name */
    private Object f118a;

    /* renamed from: a, reason: collision with other field name */
    private Method f119a = null;
    private Method b = null;

    /* renamed from: c, reason: collision with root package name */
    private Method f8984c = null;

    /* renamed from: d, reason: collision with root package name */
    private Method f8985d = null;

    public ao(Context context) {
        this.a = context;
        a(context);
    }

    private void a(Context context) {
        try {
            Class<?> a = t.a(context, "com.android.id.impl.IdProviderImpl");
            this.f117a = a;
            this.f118a = a.newInstance();
            this.b = this.f117a.getMethod("getOAID", Context.class);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.a("miui load class error", e2);
        }
    }

    @Override // com.xiaomi.push.al
    /* renamed from: a */
    public boolean mo102a() {
        return (this.f117a == null || this.f118a == null) ? false : true;
    }

    @Override // com.xiaomi.push.al
    /* renamed from: a */
    public String mo101a() {
        return a(this.a, this.b);
    }

    private String a(Context context, Method method) {
        Object obj = this.f118a;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(obj, context);
            if (invoke != null) {
                return (String) invoke;
            }
            return null;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.a("miui invoke error", e2);
            return null;
        }
    }
}
