package com.bytedance.applog.util;

import com.bytedance.bdinstall.util.p;

/* loaded from: classes.dex */
public class h {
    private static final p<Boolean> a = new a();

    static class a extends p<Boolean> {
        a() {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected Boolean a(Object[] objArr) {
            try {
                Class<?> cls = Class.forName("com.huawei.system.BuildEx");
                return Boolean.valueOf("harmony".equals(cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0])));
            } catch (Throwable unused) {
                return Boolean.FALSE;
            }
        }
    }

    public static boolean a() {
        return a.b(new Object[0]).booleanValue();
    }
}
