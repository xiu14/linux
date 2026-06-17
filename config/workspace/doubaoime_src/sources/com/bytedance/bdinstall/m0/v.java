package com.bytedance.bdinstall.m0;

import android.content.Context;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.bdinstall.m0.m;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class v implements m {
    private static Object a;
    private static Class<?> b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f4084c;

    static {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            b = cls;
            a = cls.newInstance();
            f4084c = b.getMethod("getOAID", Context.class);
        } catch (Exception e2) {
            e2.getMessage();
            int i = C0640u.a;
        }
    }

    v() {
    }

    static boolean c() {
        return (b == null || a == null || f4084c == null) ? false : true;
    }

    @Override // com.bytedance.bdinstall.m0.m
    public m.a a(Context context) {
        String str;
        Object invoke;
        try {
            m.a aVar = new m.a();
            Method method = f4084c;
            Object obj = a;
            if (obj != null && method != null) {
                try {
                    invoke = method.invoke(obj, context);
                } catch (Exception unused) {
                }
                if (invoke != null) {
                    str = (String) invoke;
                    aVar.a = str;
                    return aVar;
                }
            }
            str = null;
            aVar.a = str;
            return aVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.bytedance.bdinstall.m0.m
    public boolean b(Context context) {
        return (b == null || a == null || f4084c == null) ? false : true;
    }

    @Override // com.bytedance.bdinstall.m0.m
    public String getName() {
        return "Xiaomi";
    }
}
