package com.ttnet.org.chromium.base;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes2.dex */
public class f {
    private static volatile String a;

    public static void a(Class<?>[] clsArr, Object... objArr) {
        if (objArr == null) {
            objArr = new Object[0];
        }
        if (clsArr.length != objArr.length) {
            throw new IllegalArgumentException(String.format("param count mismatch: expected %d, actual %d", Integer.valueOf(clsArr.length), Integer.valueOf(objArr.length)));
        }
        for (int i = 0; i < clsArr.length; i++) {
            Class<?> cls = clsArr[i];
            Object obj = objArr[i];
            if (!(obj == null ? !cls.isPrimitive() : d(cls).isAssignableFrom(d(obj.getClass())))) {
                throw new IllegalArgumentException(String.format("The param %d type mismatch: expected %s, actual %s", Integer.valueOf(i + 1), b(cls), obj == null ? "null" : b(obj.getClass())));
            }
        }
    }

    private static String b(Class<?> cls) {
        return cls == null ? "null" : cls.isArray() ? cls.getCanonicalName() : cls.isPrimitive() ? cls.getName() : cls.getCanonicalName();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.f.c(android.content.Context):boolean");
    }

    private static Class<?> d(Class<?> cls) {
        if (cls == null || !cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        return !name.equals("double") ? !name.equals("int") ? !name.equals("byte") ? !name.equals("char") ? !name.equals("long") ? !name.equals("void") ? !name.equals(TypedValues.Custom.S_BOOLEAN) ? !name.equals(TypedValues.Custom.S_FLOAT) ? !name.equals("short") ? cls : Short.class : Float.class : Boolean.class : Void.class : Long.class : Character.class : Byte.class : Integer.class : Double.class;
    }
}
