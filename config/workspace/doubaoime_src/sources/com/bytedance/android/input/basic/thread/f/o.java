package com.bytedance.android.input.basic.thread.f;

import com.prolificinteractive.materialcalendarview.r;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import kotlin.h;

/* loaded from: classes.dex */
public final class o {
    public static final o a = new o();
    private static final HashSet<String> b;

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f2156c;

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f2157d;

    /* renamed from: e, reason: collision with root package name */
    private static volatile Field f2158e;

    /* renamed from: f, reason: collision with root package name */
    private static volatile Field f2159f;

    static {
        String[] strArr = {"java.lang.Integer", "java.lang.Boolean", "java.lang.Long", "java.lang.Float", "java.lang.Double", "java.lang.String", "sun.misc.Unsafe", "bolts.TaskCompletionSource", "java.util.ArrayList"};
        kotlin.s.c.l.f(strArr, "elements");
        HashSet<String> hashSet = new HashSet<>(kotlin.collections.g.H(9));
        kotlin.collections.g.d0(strArr, hashSet);
        b = hashSet;
        f2156c = new String[]{"android.os.Handler", "com.bytedance.common.utility.collection.WeakHandler", "java.util.concurrent.Executors$RunnableAdapter", "bolts.Task"};
        f2157d = new String[]{"libcore.io", "java.io", "android.database.sqlite", "android.database.AbstractCursor", "dalvik.system", "android.os", "com.ss.android.ugc.conan", "com.lody.whale"};
    }

    private o() {
    }

    private final boolean d(Class<?> cls) {
        boolean z;
        if (cls.isPrimitive()) {
            return true;
        }
        String name = cls.getName();
        if (b.contains(name)) {
            return true;
        }
        String[] strArr = f2156c;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            String str = strArr[i];
            kotlin.s.c.l.e(name, "name");
            if (kotlin.text.a.d(name, str, false, 2, null)) {
                z = true;
                break;
            }
            i++;
        }
        return z;
    }

    public final Callable<?> a(Object obj) {
        Object J2;
        kotlin.s.c.l.f(obj, "obj");
        try {
            Field field = f2158e;
            if (field == null) {
                synchronized (this) {
                    field = f2158e;
                    if (field == null) {
                        field = FutureTask.class.getDeclaredField("callable");
                        field.setAccessible(true);
                        f2158e = field;
                    }
                }
            }
            Object obj2 = field.get(obj);
            J2 = obj2 instanceof Callable ? (Callable) obj2 : null;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        return (Callable) (J2 instanceof h.a ? null : J2);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x001b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(java.lang.StackTraceElement[] r12) {
        /*
            r11 = this;
            int r0 = r12.length
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto L8
        L7:
            r0 = r2
        L8:
            if (r0 == 0) goto Lc
            r0 = r1
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L12
            java.lang.String r12 = ""
            return r12
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r12 = kotlin.s.c.C0782b.a(r12)
        L1b:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L99
            java.lang.Object r3 = r12.next()
            java.lang.StackTraceElement r3 = (java.lang.StackTraceElement) r3
            java.lang.String r4 = r3.getClassName()
            java.lang.String[] r5 = com.bytedance.android.input.basic.thread.f.o.f2157d
            int r6 = r5.length
            r7 = r2
        L2f:
            if (r7 >= r6) goto L45
            r8 = r5[r7]
            java.lang.String r9 = "className"
            kotlin.s.c.l.e(r4, r9)
            r9 = 2
            r10 = 0
            boolean r8 = kotlin.text.a.d(r4, r8, r2, r9, r10)
            if (r8 == 0) goto L42
            r4 = r1
            goto L46
        L42:
            int r7 = r7 + 1
            goto L2f
        L45:
            r4 = r2
        L46:
            if (r4 == 0) goto L49
            goto L60
        L49:
            java.lang.String r4 = r3.getMethodName()
            java.lang.String r5 = "getThreadStackTrace"
            boolean r5 = kotlin.s.c.l.a(r4, r5)
            if (r5 != 0) goto L60
            java.lang.String r5 = "getStackTrace"
            boolean r4 = kotlin.s.c.l.a(r4, r5)
            if (r4 == 0) goto L5e
            goto L60
        L5e:
            r4 = r2
            goto L61
        L60:
            r4 = r1
        L61:
            if (r4 != 0) goto L1b
            java.lang.String r4 = "\tat "
            r0.append(r4)
            java.lang.String r4 = r3.getClassName()
            r0.append(r4)
            r4 = 46
            r0.append(r4)
            java.lang.String r4 = r3.getMethodName()
            r0.append(r4)
            r4 = 40
            r0.append(r4)
            java.lang.String r4 = r3.getFileName()
            r0.append(r4)
            r4 = 58
            r0.append(r4)
            int r3 = r3.getLineNumber()
            r0.append(r3)
            java.lang.String r3 = ")\n"
            r0.append(r3)
            goto L1b
        L99:
            java.lang.String r12 = r0.toString()
            java.lang.String r0 = "sb.toString()"
            kotlin.s.c.l.e(r12, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.basic.thread.f.o.b(java.lang.StackTraceElement[]):java.lang.String");
    }

    public final String c(Object obj) {
        Object J2;
        Callable<?> a2;
        kotlin.s.c.l.f(obj, "source");
        kotlin.s.c.l.f(obj, "obj");
        if ((obj instanceof FutureTask) && (a2 = a(obj)) != null) {
            obj = a2;
        }
        kotlin.s.c.l.f(obj, "obj");
        if (kotlin.s.c.l.a(obj.getClass().getName(), "java.util.concurrent.Executors$RunnableAdapter")) {
            kotlin.s.c.l.f(obj, "obj");
            try {
                Field field = f2159f;
                if (field == null) {
                    synchronized (this) {
                        field = f2159f;
                        if (field == null) {
                            field = obj.getClass().getDeclaredField("task");
                            field.setAccessible(true);
                            f2159f = field;
                        }
                    }
                }
                J2 = field.get(obj);
            } catch (Throwable th) {
                J2 = r.J(th);
            }
            if (J2 instanceof h.a) {
                J2 = null;
            }
            if (J2 != null) {
                obj = J2;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (!d(obj.getClass())) {
            sb.append(kotlin.text.a.P(obj.toString(), '@', null, 2, null));
            sb.append(',');
        }
        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            kotlin.s.c.l.e(declaredFields, "origin.javaClass.declaredFields");
            for (Field field2 : declaredFields) {
                field2.setAccessible(true);
                Object obj2 = field2.get(obj);
                if (obj2 != null) {
                    kotlin.s.c.l.e(obj2, "field.get(origin) ?: continue");
                    Class<?> cls = obj2.getClass();
                    if (!d(cls)) {
                        String name = cls.getName();
                        kotlin.s.c.l.e(name, "clazz.name");
                        sb.append(kotlin.text.a.P(name, '@', null, 2, null));
                        sb.append(',');
                    }
                }
            }
        } catch (Throwable th2) {
            r.J(th2);
        }
        String sb2 = sb.toString();
        kotlin.s.c.l.e(sb2, "sb.toString()");
        return kotlin.text.a.E(sb2, "class ", "", false, 4, null);
    }
}
