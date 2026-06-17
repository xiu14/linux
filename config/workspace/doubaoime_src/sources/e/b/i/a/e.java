package e.b.i.a;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class e {
    private static Map<String, Method> a = new HashMap();

    private static Method a(Class<?> cls, String str, Class<?>... clsArr) {
        while (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                if (Modifier.isPublic(interfaces[i].getModifiers())) {
                    try {
                        return interfaces[i].getDeclaredMethod(str, clsArr);
                    } catch (NoSuchMethodException unused) {
                        Method a2 = a(interfaces[i], str, clsArr);
                        if (a2 != null) {
                            return a2;
                        }
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x012e, code lost:
    
        r7 = r8.getMethod(r9, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x014e A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(java.lang.Class r13, java.lang.String r14, java.lang.Object... r15) throws java.lang.NoSuchMethodException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.i.a.e.b(java.lang.Class, java.lang.String, java.lang.Object[]):java.lang.Object");
    }
}
