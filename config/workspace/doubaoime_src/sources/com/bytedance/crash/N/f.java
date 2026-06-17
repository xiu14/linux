package com.bytedance.crash.N;

import java.io.File;

/* loaded from: classes.dex */
public class f {

    /* renamed from: f, reason: collision with root package name */
    private static final f f4450f = new f();
    private final String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private File f4451c;

    /* renamed from: d, reason: collision with root package name */
    private File f4452d;

    /* renamed from: e, reason: collision with root package name */
    private File f4453e;

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private f() {
        /*
            r3 = this;
            r3.<init>()
            android.content.Context r0 = com.bytedance.crash.C0652g.g()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L12
            java.io.File r0 = r0.getFilesDir()     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            java.lang.String r0 = ""
        L14:
            r3.a = r0
            java.lang.String r1 = "npth"
            r3.b = r1
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r3.b
            r1.<init>(r0, r2)
            r3.f4451c = r1
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.f4451c
            java.lang.String r2 = "asdawd"
            r0.<init>(r1, r2)
            r3.f4452d = r0
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.f4451c
            java.lang.String r2 = "selflib"
            r0.<init>(r1, r2)
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.f4451c
            java.lang.String r2 = "PriorityMonitor"
            r0.<init>(r1, r2)
            r3.f4453e = r0
            java.io.File r0 = r3.f4451c
            boolean r0 = r0.exists()
            if (r0 != 0) goto L4f
            java.io.File r0 = r3.f4451c
            r0.mkdirs()
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.N.f.<init>():void");
    }

    public static File a() {
        return f4450f.f4452d;
    }

    public static File b() {
        return f4450f.f4451c;
    }

    public static File c() {
        return f4450f.f4453e;
    }
}
