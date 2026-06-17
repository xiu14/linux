package com.bytedance.android.input.keyboard.gif.list_layout;

/* loaded from: classes.dex */
final class n extends kotlin.s.c.m implements kotlin.s.b.l<com.bytedance.android.input.keyboard.gif.send.models.b, kotlin.o> {
    final /* synthetic */ ImeEmoticonsLayout a;
    final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.bytedance.android.input.keyboard.gif.list_layout.models.b f2759c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(ImeEmoticonsLayout imeEmoticonsLayout, int i, com.bytedance.android.input.keyboard.gif.list_layout.models.b bVar) {
        super(1);
        this.a = imeEmoticonsLayout;
        this.b = i;
        this.f2759c = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if (r7 != 4) goto L23;
     */
    @Override // kotlin.s.b.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kotlin.o invoke(com.bytedance.android.input.keyboard.gif.send.models.b r7) {
        /*
            r6 = this;
            com.bytedance.android.input.keyboard.gif.send.models.b r7 = (com.bytedance.android.input.keyboard.gif.send.models.b) r7
            java.lang.String r0 = "result"
            kotlin.s.c.l.f(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "send finish---resultState = "
            r0.append(r1)
            com.bytedance.android.input.keyboard.gif.send.models.MediaSendResultState r1 = r7.b()
            r0.append(r1)
            java.lang.String r1 = "---mode  "
            r0.append(r1)
            com.bytedance.android.input.keyboard.gif.send.models.MediaSendMode r1 = r7.a()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ImeEmoticons-UI"
            com.bytedance.android.input.r.j.i(r1, r0)
            com.bytedance.android.input.keyboard.gif.send.models.MediaSendResultState r7 = r7.b()
            int r7 = r7.ordinal()
            if (r7 == 0) goto L68
            r0 = 1
            if (r7 == r0) goto L57
            r0 = 2
            if (r7 == r0) goto L45
            r0 = 3
            if (r7 == r0) goto L57
            r0 = 4
            if (r7 == r0) goto L57
            goto Ld6
        L45:
            com.bytedance.android.input.keyboard.gif.list_layout.ImeEmoticonsLayout r7 = r6.a
            android.os.Handler r7 = com.bytedance.android.input.keyboard.gif.list_layout.ImeEmoticonsLayout.d(r7)
            com.bytedance.android.input.keyboard.gif.list_layout.ImeEmoticonsLayout r0 = r6.a
            com.bytedance.android.input.keyboard.gif.list_layout.e r1 = new com.bytedance.android.input.keyboard.gif.list_layout.e
            r1.<init>()
            r7.post(r1)
            goto Ld6
        L57:
            com.bytedance.android.input.keyboard.gif.list_layout.ImeEmoticonsLayout r7 = r6.a
            android.os.Handler r7 = com.bytedance.android.input.keyboard.gif.list_layout.ImeEmoticonsLayout.d(r7)
            com.bytedance.android.input.keyboard.gif.list_layout.ImeEmoticonsLayout r0 = r6.a
            com.bytedance.android.input.keyboard.gif.list_layout.f r1 = new com.bytedance.android.input.keyboard.gif.list_layout.f
            r1.<init>()
            r7.post(r1)
            goto Ld6
        L68:
            com.bytedance.android.input.keyboard.gif.list_layout.ImeEmoticonsLayout r7 = r6.a
            int r0 = r6.b
            com.bytedance.android.input.keyboard.gif.list_layout.models.b r2 = r6.f2759c
            com.bytedance.android.input.keyboard.gif.list_layout.ImeEmoticonsLayout r3 = com.bytedance.android.input.keyboard.gif.list_layout.ImeEmoticonsLayout.i
            java.util.Objects.requireNonNull(r7)
            java.lang.String r7 = "commitRecord= "
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb7
            r3.<init>()     // Catch: java.lang.Throwable -> Lb7
            r3.add(r2)     // Catch: java.lang.Throwable -> Lb7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r4.<init>()     // Catch: java.lang.Throwable -> Lb7
            r4.append(r7)     // Catch: java.lang.Throwable -> Lb7
            r4.append(r0)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r5 = "---data = "
            r4.append(r5)     // Catch: java.lang.Throwable -> Lb7
            r4.append(r2)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> Lb7
            com.bytedance.android.input.r.j.i(r1, r2)     // Catch: java.lang.Throwable -> Lb7
            com.bytedance.android.input.keyboard.s.a.f r2 = com.bytedance.android.input.keyboard.s.a.f.a     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r4 = "listData"
            kotlin.s.c.l.f(r3, r4)     // Catch: java.lang.Throwable -> Lb7
            com.google.gson.Gson r4 = new com.google.gson.Gson     // Catch: java.lang.Throwable -> Lb7
            r4.<init>()     // Catch: java.lang.Throwable -> Lb7
            com.google.gson.l r5 = new com.google.gson.l     // Catch: java.lang.Throwable -> Lb7
            r5.<init>()     // Catch: java.lang.Throwable -> Lb7
            com.google.gson.i r3 = r4.m(r3)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r4 = "list"
            r5.d(r4, r3)     // Catch: java.lang.Throwable -> Lb7
            r2.a(r5)     // Catch: java.lang.Throwable -> Lb7
            kotlin.o r2 = kotlin.o.a     // Catch: java.lang.Throwable -> Lb7
            goto Lbc
        Lb7:
            r2 = move-exception
            java.lang.Object r2 = com.prolificinteractive.materialcalendarview.r.J(r2)
        Lbc:
            java.lang.Throwable r2 = kotlin.h.b(r2)
            if (r2 == 0) goto Ld6
            java.lang.String r3 = "---exception = "
            java.lang.StringBuilder r7 = e.a.a.a.a.N(r7, r0, r3)
            java.lang.String r0 = kotlin.a.d(r2)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.bytedance.android.input.r.j.m(r1, r7)
        Ld6:
            kotlin.o r7 = kotlin.o.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.gif.list_layout.n.invoke(java.lang.Object):java.lang.Object");
    }
}
