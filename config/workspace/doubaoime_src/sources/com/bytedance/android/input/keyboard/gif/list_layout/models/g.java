package com.bytedance.android.input.keyboard.gif.list_layout.models;

import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.settings.api.IInputSettings;
import com.bytedance.android.input.r.j;
import com.prolificinteractive.materialcalendarview.r;
import java.util.Objects;
import kotlin.o;
import kotlin.r.h.a.i;
import kotlin.s.b.p;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.G;
import kotlinx.coroutines.InterfaceC0817m0;
import kotlinx.coroutines.S;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    private static InterfaceC0817m0 f2755c;

    /* renamed from: d, reason: collision with root package name */
    private static long f2756d;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f2758f;
    public static final g a = new g();
    private static final G b = r.b(S.b().plus(C0795d.a(null, 1)));

    /* renamed from: e, reason: collision with root package name */
    private static long f2757e = 3600000;

    public static final class a implements com.bytedance.android.input.basic.settings.api.b {
        a() {
        }

        @Override // com.bytedance.android.input.basic.settings.api.b
        public void onSettingsUpdate() {
            long q = IInputSettings.a.a().q() * 60 * 1000;
            j.i("EmoticonsWordManager", "onSettingsUpdate settingsUpdate: " + q);
            if (g.f2757e != q) {
                g gVar = g.a;
                g.f2757e = q;
                gVar.g();
            }
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.keyboard.gif.list_layout.models.EmoticonsWordManager$startUpdateTask$1", f = "EmoticonsWordManager.kt", l = {57, 62}, m = "invokeSuspend")
    static final class b extends i implements p<G, kotlin.r.d<? super o>, Object> {
        int a;
        private /* synthetic */ Object b;

        b(kotlin.r.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, kotlin.r.d<? super o> dVar) {
            b bVar = new b(dVar);
            bVar.b = g2;
            return bVar.invokeSuspend(o.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0033, code lost:
        
            r3 = r4;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
        @Override // kotlin.r.h.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r11.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                java.lang.Object r1 = r11.b
                kotlinx.coroutines.G r1 = (kotlinx.coroutines.G) r1
                com.prolificinteractive.materialcalendarview.r.k0(r12)
                goto L32
            L14:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1c:
                java.lang.Object r1 = r11.b
                kotlinx.coroutines.G r1 = (kotlinx.coroutines.G) r1
                com.prolificinteractive.materialcalendarview.r.k0(r12)
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r0 = r11
                goto L92
            L2a:
                com.prolificinteractive.materialcalendarview.r.k0(r12)
                java.lang.Object r12 = r11.b
                r1 = r12
                kotlinx.coroutines.G r1 = (kotlinx.coroutines.G) r1
            L32:
                r12 = r11
            L33:
                boolean r4 = com.prolificinteractive.materialcalendarview.r.W(r1)
                if (r4 == 0) goto Lb3
                long r4 = java.lang.System.currentTimeMillis()
                long r6 = com.bytedance.android.input.keyboard.gif.list_layout.models.g.b()
                long r6 = r4 - r6
                long r8 = com.bytedance.android.input.keyboard.gif.list_layout.models.g.c()
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r6 < 0) goto L4d
                r6 = r3
                goto L4e
            L4d:
                r6 = 0
            L4e:
                java.lang.String r7 = "startUpdateUpdate needImmediate: "
                java.lang.String r8 = ", "
                java.lang.StringBuilder r7 = e.a.a.a.a.X(r7, r6, r8)
                long r8 = com.bytedance.android.input.keyboard.gif.list_layout.models.g.b()
                long r8 = r4 - r8
                r7.append(r8)
                java.lang.String r8 = ", now = "
                r7.append(r8)
                r7.append(r4)
                java.lang.String r4 = ", last = "
                r7.append(r4)
                long r4 = com.bytedance.android.input.keyboard.gif.list_layout.models.g.b()
                r7.append(r4)
                java.lang.String r4 = r7.toString()
                java.lang.String r5 = "EmoticonsWordManager"
                com.bytedance.android.input.r.j.i(r5, r4)
                if (r6 == 0) goto L9f
                com.bytedance.android.input.keyboard.gif.list_layout.models.g r4 = com.bytedance.android.input.keyboard.gif.list_layout.models.g.a
                r12.b = r1
                r12.a = r3
                java.lang.Object r4 = com.bytedance.android.input.keyboard.gif.list_layout.models.g.a(r4, r12)
                if (r4 != r0) goto L8b
                return r0
            L8b:
                r10 = r0
                r0 = r12
                r12 = r4
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r10
            L92:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                r10 = r3
                r3 = r12
                r12 = r0
                r0 = r1
                r1 = r2
                r2 = r10
                goto La0
            L9f:
                r4 = r3
            La0:
                if (r3 == 0) goto Lb1
                long r5 = com.bytedance.android.input.keyboard.gif.list_layout.models.g.c()
                r12.b = r1
                r12.a = r2
                java.lang.Object r3 = com.prolificinteractive.materialcalendarview.r.K(r5, r12)
                if (r3 != r0) goto Lb1
                return r0
            Lb1:
                r3 = r4
                goto L33
            Lb3:
                kotlin.o r12 = kotlin.o.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.gif.list_layout.models.g.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private g() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.bytedance.android.input.keyboard.gif.list_layout.models.g r6, kotlin.r.d r7) {
        /*
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r7 instanceof com.bytedance.android.input.keyboard.gif.list_layout.models.e
            if (r0 == 0) goto L16
            r0 = r7
            com.bytedance.android.input.keyboard.gif.list_layout.models.e r0 = (com.bytedance.android.input.keyboard.gif.list_layout.models.e) r0
            int r1 = r0.f2754c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f2754c = r1
            goto L1b
        L16:
            com.bytedance.android.input.keyboard.gif.list_layout.models.e r0 = new com.bytedance.android.input.keyboard.gif.list_layout.models.e
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r6 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r0.f2754c
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            com.prolificinteractive.materialcalendarview.r.k0(r6)
            goto L87
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.prolificinteractive.materialcalendarview.r.k0(r6)
            kotlin.s.c.v r6 = new kotlin.s.c.v
            r6.<init>()
            r6.a = r2
            com.bytedance.android.input.keyboard.s.a.f r1 = com.bytedance.android.input.keyboard.s.a.f.a
            com.bytedance.android.input.keyboard.gif.list_layout.models.f r3 = new com.bytedance.android.input.keyboard.gif.list_layout.models.f
            r3.<init>(r6)
            boolean r1 = r1.f(r3)
            java.lang.String r3 = "doUpdate success: "
            java.lang.String r4 = ", downloadSuccess: "
            java.lang.StringBuilder r3 = e.a.a.a.a.X(r3, r1, r4)
            boolean r4 = r6.a
            java.lang.String r5 = "EmoticonsWordManager"
            e.a.a.a.a.N0(r3, r4, r5)
            if (r1 == 0) goto L7b
            boolean r6 = r6.a
            if (r6 == 0) goto L7b
            long r6 = java.lang.System.currentTimeMillis()
            com.bytedance.android.input.keyboard.gif.list_layout.models.g.f2756d = r6
            com.bytedance.android.input.basic.IAppGlobals$a r6 = com.bytedance.android.input.basic.IAppGlobals.a
            java.util.Objects.requireNonNull(r6)
            android.content.SharedPreferences r6 = r6.o()
            android.content.SharedPreferences$Editor r6 = r6.edit()
            long r0 = com.bytedance.android.input.keyboard.gif.list_layout.models.g.f2756d
            java.lang.String r7 = "word_emoticons_update_last"
            android.content.SharedPreferences$Editor r6 = r6.putLong(r7, r0)
            r6.apply()
            goto L87
        L7b:
            r3 = 300000(0x493e0, double:1.482197E-318)
            r0.f2754c = r2
            java.lang.Object r6 = com.prolificinteractive.materialcalendarview.r.K(r3, r0)
            if (r6 != r7) goto L87
            goto L89
        L87:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
        L89:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.gif.list_layout.models.g.a(com.bytedance.android.input.keyboard.gif.list_layout.models.g, kotlin.r.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        InterfaceC0817m0 interfaceC0817m0 = f2755c;
        if (interfaceC0817m0 != null) {
            r.z(interfaceC0817m0, null, 1, null);
        }
        f2755c = C0795d.l(b, null, null, new b(null), 3, null);
    }

    public final void f() {
        if (f2758f) {
            return;
        }
        f2758f = true;
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        f2756d = aVar.o().getLong("word_emoticons_update_last", 0L);
        IInputSettings.a aVar2 = IInputSettings.a;
        f2757e = aVar2.a().q() * 60 * 1000;
        aVar2.i(new a());
        g();
    }
}
