package kotlin.internal;

import java.lang.reflect.Method;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: kotlin.internal.a$a, reason: collision with other inner class name */
    private static final class C0468a {
        public static final Method a;

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
        
            if (kotlin.s.c.l.a(r7.length == 1 ? r7[0] : null, java.lang.Throwable.class) != false) goto L14;
         */
        static {
            /*
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                kotlin.s.c.l.e(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            Le:
                r5 = 0
                if (r4 >= r2) goto L42
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = kotlin.s.c.l.a(r7, r8)
                r8 = 1
                if (r7 == 0) goto L3a
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r9 = "it.parameterTypes"
                kotlin.s.c.l.e(r7, r9)
                java.lang.String r9 = "<this>"
                kotlin.s.c.l.f(r7, r9)
                int r9 = r7.length
                if (r9 != r8) goto L33
                r5 = r7[r3]
            L33:
                boolean r5 = kotlin.s.c.l.a(r5, r0)
                if (r5 == 0) goto L3a
                goto L3b
            L3a:
                r8 = r3
            L3b:
                if (r8 == 0) goto L3f
                r5 = r6
                goto L42
            L3f:
                int r4 = r4 + 1
                goto Le
            L42:
                kotlin.internal.a.C0468a.a = r5
                int r0 = r1.length
            L45:
                if (r3 >= r0) goto L59
                r2 = r1[r3]
                java.lang.String r2 = r2.getName()
                java.lang.String r4 = "getSuppressed"
                boolean r2 = kotlin.s.c.l.a(r2, r4)
                if (r2 == 0) goto L56
                goto L59
            L56:
                int r3 = r3 + 1
                goto L45
            L59:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.a.C0468a.<clinit>():void");
        }
    }

    public void a(Throwable th, Throwable th2) {
        l.f(th, "cause");
        l.f(th2, "exception");
        Method method = C0468a.a;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public kotlin.v.c b() {
        return new kotlin.v.b();
    }
}
