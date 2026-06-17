package com.ss.ugc.effectplatform.task;

import kotlin.s.c.l;

/* loaded from: classes2.dex */
public abstract class b implements d.a.d.b {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private final com.ss.ugc.effectplatform.h.a f8505c;

    public b(String str, com.ss.ugc.effectplatform.h.a aVar) {
        this.b = str;
        this.f8505c = aVar;
        this.a = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if ((r0.length() == 0) != false) goto L9;
     */
    @Override // d.a.d.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a() {
        /*
            r3 = this;
            java.lang.String r0 = r3.a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L11
            int r0 = r0.length()
            if (r0 != 0) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L12
        L11:
            r1 = r2
        L12:
            if (r1 == 0) goto L27
            java.lang.Class r0 = r3.getClass()
            kotlin.reflect.c r0 = kotlin.s.c.A.b(r0)
            kotlin.s.c.e r0 = (kotlin.s.c.e) r0
            java.lang.String r0 = r0.f()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L29
        L27:
            java.lang.String r0 = r3.a
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.task.b.a():java.lang.String");
    }

    protected abstract void b();

    public void c(String str) {
        l.g(str, "<set-?>");
        this.a = str;
    }

    @Override // d.a.d.b
    public String getId() {
        String str = this.b;
        return str != null ? str : "0";
    }

    @Override // d.a.d.b
    public void run() {
        String str = this.b;
        if (str != null) {
            com.ss.ugc.effectplatform.h.a aVar = this.f8505c;
            com.ss.ugc.effectplatform.h.b a = aVar != null ? aVar.a(str) : null;
            if (a instanceof com.ss.ugc.effectplatform.h.c) {
                ((com.ss.ugc.effectplatform.h.c) a).onStart();
            }
        }
        b();
        String str2 = this.b;
        if (str2 != null) {
            com.ss.ugc.effectplatform.h.a aVar2 = this.f8505c;
            com.ss.ugc.effectplatform.h.b a2 = aVar2 != null ? aVar2.a(str2) : null;
            if (a2 instanceof com.ss.ugc.effectplatform.h.c) {
                ((com.ss.ugc.effectplatform.h.c) a2).a();
            }
        }
    }

    public b(String str, com.ss.ugc.effectplatform.h.a aVar, int i) {
        int i2 = i & 2;
        this.b = str;
        this.f8505c = null;
        this.a = "";
    }
}
