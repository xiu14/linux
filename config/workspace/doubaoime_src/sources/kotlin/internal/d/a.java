package kotlin.internal.d;

import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class a extends kotlin.internal.a {

    /* renamed from: kotlin.internal.d.a$a, reason: collision with other inner class name */
    private static final class C0469a {
        public static final Integer a;

        /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
        static {
            /*
                r0 = 0
                java.lang.String r1 = "android.os.Build$VERSION"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L18
                java.lang.String r2 = "SDK_INT"
                java.lang.reflect.Field r1 = r1.getField(r2)     // Catch: java.lang.Throwable -> L18
                java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L18
                boolean r2 = r1 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L18
                if (r2 == 0) goto L18
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L18
                goto L19
            L18:
                r1 = r0
            L19:
                if (r1 == 0) goto L27
                int r2 = r1.intValue()
                if (r2 <= 0) goto L23
                r2 = 1
                goto L24
            L23:
                r2 = 0
            L24:
                if (r2 == 0) goto L27
                r0 = r1
            L27:
                kotlin.internal.d.a.C0469a.a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.d.a.C0469a.<clinit>():void");
        }
    }

    @Override // kotlin.internal.a
    public void a(Throwable th, Throwable th2) {
        l.f(th, "cause");
        l.f(th2, "exception");
        Integer num = C0469a.a;
        if (num == null || num.intValue() >= 19) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
