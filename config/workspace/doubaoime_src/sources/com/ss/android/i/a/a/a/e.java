package com.ss.android.i.a.a.a;

import com.ss.android.i.a.a.a.a;
import com.ss.android.i.a.a.a.g;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class e {
    final ConcurrentHashMap<Class<?>, Set<f<?>>> a = new ConcurrentHashMap<>();
    final Set<String> b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f8316c;

    /* renamed from: d, reason: collision with root package name */
    final Set<Class<?>> f8317d;

    private static final class b {
        private static final e a = new e(null);
    }

    e(a aVar) {
        Collections.synchronizedMap(new HashMap());
        this.b = Collections.synchronizedSet(new HashSet());
        this.f8316c = true;
        this.f8317d = Collections.synchronizedSet(new HashSet());
    }

    public static e a() {
        return b.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T b(java.lang.Class<T> r9) {
        /*
            r8 = this;
            boolean r0 = r8.f8316c
            com.ss.android.i.a.a.a.c r1 = com.ss.android.i.a.a.a.c.a.a()
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f8313c
            java.lang.String r3 = r9.getName()
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 0
            if (r3 != 0) goto L20
            java.util.Set<java.lang.String> r1 = r1.f8314d
            boolean r1 = r1.contains(r2)
            goto L21
        L20:
            r1 = r4
        L21:
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L33
            com.ss.android.i.a.a.a.c r1 = com.ss.android.i.a.a.a.c.a.a()
            java.lang.Object r1 = r1.a(r9)
            if (r1 == 0) goto L31
            goto Lb7
        L31:
            r5 = r2
            goto L35
        L33:
            r1 = r3
            r5 = r4
        L35:
            java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, java.util.Set<com.ss.android.i.a.a.a.f<?>>> r6 = r8.a
            java.lang.Object r6 = r6.get(r9)
            java.util.Set r6 = (java.util.Set) r6
            if (r6 == 0) goto L51
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L51
            java.lang.Object[] r1 = r6.toArray()
            r1 = r1[r4]
            com.ss.android.i.a.a.a.f r1 = (com.ss.android.i.a.a.a.f) r1
            java.lang.Object r1 = r1.get()
        L51:
            if (r1 == 0) goto L59
            java.util.Set<java.lang.Class<?>> r0 = r8.f8317d
            r0.add(r9)
            goto Lb7
        L59:
            com.ss.android.i.a.a.a.g r1 = com.ss.android.i.a.a.a.g.a.a()
            java.lang.Object r1 = r1.a(r9)
            if (r1 == 0) goto L69
            java.util.Set<java.lang.Class<?>> r0 = r8.f8317d
            r0.add(r9)
            goto Lb7
        L69:
            java.util.Set<java.lang.String> r1 = r8.b
            java.lang.String r6 = r9.getName()
            boolean r1 = r1.contains(r6)
            if (r1 != 0) goto L76
            goto L87
        L76:
            java.util.Iterator r1 = com.ss.android.i.a.a.a.a.b(r9)
            com.ss.android.i.a.a.a.a$b r1 = (com.ss.android.i.a.a.a.a.b) r1
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L87
            java.lang.Object r1 = r1.next()
            goto L88
        L87:
            r1 = r3
        L88:
            if (r1 == 0) goto L90
            java.util.Set<java.lang.Class<?>> r0 = r8.f8317d
            r0.add(r9)
            goto Lb7
        L90:
            if (r5 != 0) goto L9a
            com.ss.android.i.a.a.a.c r1 = com.ss.android.i.a.a.a.c.a.a()
            java.lang.Object r1 = r1.a(r9)
        L9a:
            if (r1 != 0) goto Lb7
            if (r0 == 0) goto Lb7
            boolean r0 = r9.isInterface()
            if (r0 != 0) goto La5
            goto Lb6
        La5:
            java.lang.ClassLoader r0 = r9.getClassLoader()
            java.lang.Class[] r1 = new java.lang.Class[r2]
            r1[r4] = r9
            com.ss.android.i.a.a.a.d r9 = new com.ss.android.i.a.a.a.d
            r9.<init>()
            java.lang.Object r3 = java.lang.reflect.Proxy.newProxyInstance(r0, r1, r9)
        Lb6:
            r1 = r3
        Lb7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.i.a.a.a.e.b(java.lang.Class):java.lang.Object");
    }

    public <T> Set<T> c(Class<T> cls) {
        g gVar;
        Set<f<?>> set = this.a.get(cls);
        if (set != null && !set.isEmpty()) {
            e.c.c.d.g gVar2 = (Set<T>) Collections.synchronizedSet(new LinkedHashSet());
            Iterator<f<?>> it2 = set.iterator();
            while (it2.hasNext()) {
                gVar2.add(it2.next().get());
            }
            return gVar2;
        }
        gVar = g.a.a;
        Set b2 = gVar.b(cls);
        if (b2 == null || b2.isEmpty()) {
            b2 = Collections.synchronizedSet(new LinkedHashSet());
            if (this.b.contains(cls.getName())) {
                Iterator b3 = com.ss.android.i.a.a.a.a.b(cls);
                while (true) {
                    a.b bVar = (a.b) b3;
                    if (!bVar.hasNext()) {
                        break;
                    }
                    b2.add(bVar.next());
                }
            }
        }
        return b2;
    }
}
