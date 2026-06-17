package com.google.gson.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
abstract class z {
    public static final z a;

    class a extends z {
        final /* synthetic */ Method b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Method method) {
            super(null);
            this.b = method;
        }

        @Override // com.google.gson.internal.z
        public boolean a(AccessibleObject accessibleObject, Object obj) {
            try {
                return ((Boolean) this.b.invoke(accessibleObject, obj)).booleanValue();
            } catch (Exception e2) {
                throw new RuntimeException("Failed invoking canAccess", e2);
            }
        }
    }

    class b extends z {
        b() {
            super(null);
        }

        @Override // com.google.gson.internal.z
        public boolean a(AccessibleObject accessibleObject, Object obj) {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001f  */
    static {
        /*
            boolean r0 = com.google.gson.internal.s.a()
            if (r0 == 0) goto L1c
            java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
            java.lang.String r1 = "canAccess"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L1c
            r3 = 0
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L1c
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L1c
            com.google.gson.internal.z$a r1 = new com.google.gson.internal.z$a     // Catch: java.lang.NoSuchMethodException -> L1c
            r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L1c
            goto L1d
        L1c:
            r1 = 0
        L1d:
            if (r1 != 0) goto L24
            com.google.gson.internal.z$b r1 = new com.google.gson.internal.z$b
            r1.<init>()
        L24:
            com.google.gson.internal.z.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.z.<clinit>():void");
    }

    z(y yVar) {
    }

    public abstract boolean a(AccessibleObject accessibleObject, Object obj);
}
