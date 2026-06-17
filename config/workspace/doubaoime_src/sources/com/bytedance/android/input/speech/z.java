package com.bytedance.android.input.speech;

import android.os.SystemClock;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.asr.api.IAsr;
import com.bytedance.android.input.speech.constants.SpeechRecognitionType;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.AbstractC0796d0;
import kotlinx.coroutines.C0798e0;
import kotlinx.coroutines.InterfaceC0817m0;

/* loaded from: classes.dex */
public final class z {
    private IAsr a = IAsr.a.a(IAsr.Type.SDK);
    private InterfaceC0817m0 b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC0796d0 f3202c;

    /* renamed from: d, reason: collision with root package name */
    private AtomicBoolean f3203d;

    /* renamed from: e, reason: collision with root package name */
    private int f3204e;

    /* renamed from: f, reason: collision with root package name */
    private String f3205f;

    /* renamed from: g, reason: collision with root package name */
    private String f3206g;
    private String h;
    private String i;
    private boolean j;
    private AtomicBoolean k;
    private com.bytedance.android.input.speech.L.a l;
    private s m;

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.speech.AsrProcess$startAsrProcess$1", f = "AsrProcess.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.r.h.a.i implements kotlin.s.b.p<s, kotlin.r.d<? super kotlin.o>, Object> {
        /* synthetic */ Object a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.s.c.v f3207c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.s.c.v vVar, kotlin.r.d<? super a> dVar) {
            super(2, dVar);
            this.f3207c = vVar;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            a aVar = z.this.new a(this.f3207c, dVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.s.b.p
        public Object invoke(s sVar, kotlin.r.d<? super kotlin.o> dVar) {
            a aVar = z.this.new a(this.f3207c, dVar);
            aVar.a = sVar;
            kotlin.o oVar = kotlin.o.a;
            aVar.invokeSuspend(oVar);
            return oVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            s sVar = (s) this.a;
            z.g(z.this, "flow-onEach : " + sVar);
            switch (sVar.f()) {
                case 1:
                    z.this.v("flow-callback-SUCCESS: onSuccess start handle success");
                    AsrManager asrManager = AsrManager.a;
                    if (!asrManager.G()) {
                        asrManager.U(sVar.d());
                        break;
                    } else {
                        IAsr iAsr = z.this.a;
                        if (iAsr != null) {
                            iAsr.stop();
                            break;
                        }
                    }
                    break;
                case 2:
                    z.this.m = sVar;
                    AsrContext asrContext = AsrContext.a;
                    asrContext.b0(sVar.h() ? SpeechRecognitionType.OFFLINE : SpeechRecognitionType.ONLINE);
                    z.this.j = sVar.h();
                    if (sVar.i()) {
                        AsrManager.i0(AsrManager.a, "ReceiveStreamResult", 0L, false, null, 14);
                    }
                    if (sVar.a() != 0 && !z.this.j) {
                        AsrManager.i0(AsrManager.a, "ReceiveSecondResult", 0L, false, null, 14);
                    }
                    if (this.f3207c.a) {
                        if (!z.this.j) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            z zVar = z.this;
                            StringBuilder M = e.a.a.a.a.M("flow-callback-TEXT: mFirstResponseReceived startTime = ");
                            M.append(sVar.c());
                            M.append(", usetime = ");
                            M.append(uptimeMillis - sVar.c());
                            zVar.v(M.toString());
                            AsrManager.a.e0("input_voiceinputfirstresponse", uptimeMillis - sVar.c());
                        }
                        this.f3207c.a = false;
                    }
                    z zVar2 = z.this;
                    StringBuilder M2 = e.a.a.a.a.M("flow-callback-TEXT, text = ");
                    M2.append(sVar.e());
                    M2.append(", errCode = ");
                    M2.append(sVar.a());
                    M2.append(", isStreamFinish = ");
                    M2.append(sVar.i());
                    M2.append(", mCurrentModeIsOffline = ");
                    M2.append(z.this.j);
                    z.g(zVar2, M2.toString());
                    AsrManager asrManager2 = AsrManager.a;
                    asrManager2.Z(sVar.e(), sVar.a() != 0);
                    if (sVar.i()) {
                        asrManager2.l();
                    }
                    if (sVar.a() != 0 && !z.this.j) {
                        asrManager2.p0(false, "onFinish");
                    }
                    if (sVar.g()) {
                        asrContext.T(2, true);
                    }
                    if (z.this.l == null) {
                        H.a.a(sVar, false, null);
                        break;
                    } else {
                        com.bytedance.android.input.speech.L.a aVar = z.this.l;
                        if (aVar != null) {
                            aVar.a(sVar);
                            break;
                        }
                    }
                    break;
                case 3:
                    if (kotlin.s.c.l.a(com.bytedance.android.input.speech.view.l.a.r().getValue(), Boolean.TRUE)) {
                        z.this.v("flow-callback-OUT_TIME: start to long, to stop");
                        AsrManager.a.q(sVar.d());
                        break;
                    }
                    break;
                case 4:
                    if (sVar.b() == IAsr.ErrorType.OFFLINE_SWITCH) {
                        z.this.j = sVar.a() == 1;
                    }
                    AsrManager.a.Y(sVar.b(), sVar.a(), sVar.d());
                    z.this.v("flow-callback-FAIL: onFail");
                    break;
                case 5:
                    z.g(z.this, "flow-callback-FINISHED: onFinish");
                    AsrManager asrManager3 = AsrManager.a;
                    AsrManager.i0(asrManager3, "ReceiveSessionResult", 0L, false, null, 14);
                    asrManager3.p0(false, "onFinish");
                    break;
                case 7:
                    z.g(z.this, "flow-callback-NO_RESPONSE_TO_LONG");
                    AsrManager.a.O(sVar.d());
                    break;
                case 8:
                    AsrManager asrManager4 = AsrManager.a;
                    if (com.bytedance.android.input.speech.view.o.f3179f == null) {
                        e.a.a.a.a.b0();
                    }
                    com.bytedance.android.input.speech.view.o oVar = com.bytedance.android.input.speech.view.o.f3179f;
                    kotlin.s.c.l.d(oVar, "null cannot be cast to non-null type com.bytedance.android.input.speech.view.EditorViewInfo");
                    asrManager4.t(oVar.d(), System.currentTimeMillis());
                    break;
            }
            return kotlin.o.a;
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.speech.AsrProcess$startAsrProcess$2", f = "AsrProcess.kt", l = {}, m = "invokeSuspend")
    static final class b extends kotlin.r.h.a.i implements kotlin.s.b.q<kotlinx.coroutines.flow.g<? super s>, Throwable, kotlin.r.d<? super kotlin.o>, Object> {
        b(kotlin.r.d<? super b> dVar) {
            super(3, dVar);
        }

        @Override // kotlin.s.b.q
        public Object d(kotlinx.coroutines.flow.g<? super s> gVar, Throwable th, kotlin.r.d<? super kotlin.o> dVar) {
            b bVar = z.this.new b(dVar);
            kotlin.o oVar = kotlin.o.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(oVar);
            z.g(z.this, "flow-complete: onCompletion");
            return oVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            z.g(z.this, "flow-complete: onCompletion");
            return kotlin.o.a;
        }
    }

    public z() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.bytedance.android.input.speech.l
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                kotlin.s.c.l.f(z.this, "this$0");
                return new Thread(runnable, z.class.getName());
            }
        });
        kotlin.s.c.l.e(newSingleThreadExecutor, "newSingleThreadExecutor …ead(it, javaClass.name) }");
        this.f3202c = new C0798e0(newSingleThreadExecutor);
        this.f3203d = new AtomicBoolean(false);
        this.f3205f = "";
        this.f3206g = "";
        this.h = "";
        this.i = "";
        this.k = new AtomicBoolean(false);
    }

    public static final void g(z zVar, String str) {
        Objects.requireNonNull(zVar);
        IAppGlobals.a.j("Asr-Flow-AsrProcess", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e3, code lost:
    
        if (r14.length() > 5) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String i(com.bytedance.android.input.speech.z r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.z.i(com.bytedance.android.input.speech.z, java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(String str) {
        IAppGlobals.a.x("Asr-Flow-AsrProcess", str);
    }

    public final void A() {
        this.l = null;
    }

    public final void o() {
        InterfaceC0817m0 interfaceC0817m0 = this.b;
        if (interfaceC0817m0 != null) {
            com.prolificinteractive.materialcalendarview.r.z(interfaceC0817m0, null, 1, null);
        }
    }

    public final void p(byte[] bArr, int i) {
        kotlin.s.c.l.f(bArr, "buffer");
        if (this.a == null) {
            com.bytedance.android.input.r.j.m("Asr-Flow-AsrProcess", "[feedAudio], mIAsr is null");
        }
        IAsr iAsr = this.a;
        if (iAsr != null) {
            iAsr.e(bArr, i, this.f3203d.get(), this.k.get());
        }
        if (this.f3203d.get()) {
            this.f3203d.set(false);
        }
        if (this.k.get()) {
            this.k.set(false);
        }
    }

    public final void q() {
        this.f3203d.set(true);
    }

    public final s r() {
        return this.m;
    }

    public final boolean s() {
        return this.j;
    }

    public final boolean t() {
        InterfaceC0817m0 interfaceC0817m0 = this.b;
        return interfaceC0817m0 != null && interfaceC0817m0.a();
    }

    public final void u() {
        this.k.set(true);
    }

    public final void w(com.bytedance.android.input.speech.L.a aVar) {
        this.l = aVar;
    }

    public final void x() {
        this.m = null;
    }

    public final void y(String str, String str2) {
        LifecycleCoroutineScope lifecycleScope;
        InterfaceC0817m0 interfaceC0817m0;
        kotlin.s.c.l.f(str, "contextInfo");
        kotlin.s.c.l.f(str2, "from");
        y yVar = y.a;
        y.b("[Android][asr][process] init start");
        boolean z = false;
        if (this.k.get()) {
            this.k.set(false);
        }
        AsrContext.a.R();
        this.m = null;
        this.i = "";
        if (this.a == null) {
            v("startAsrProcess begin, mIAsr is null");
            IAsr a2 = IAsr.a.a(IAsr.Type.SDK);
            kotlin.s.c.l.c(a2);
            this.a = a2;
        }
        StringBuilder M = e.a.a.a.a.M("startAsrProcess begin startAsrInternal, ");
        InterfaceC0817m0 interfaceC0817m02 = this.b;
        M.append(interfaceC0817m02 != null ? Boolean.valueOf(interfaceC0817m02.a()) : null);
        v(M.toString());
        InterfaceC0817m0 interfaceC0817m03 = this.b;
        if (interfaceC0817m03 != null && interfaceC0817m03.a()) {
            z = true;
        }
        if (z && (interfaceC0817m0 = this.b) != null) {
            com.prolificinteractive.materialcalendarview.r.z(interfaceC0817m0, null, 1, null);
        }
        ImeService service = KeyboardJni.getService();
        if (service == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(service)) == null) {
            return;
        }
        boolean z2 = !com.bytedance.apm.util.j.b(IAppGlobals.a.getContext());
        this.j = z2;
        if (z2 && !com.bytedance.android.input.speech.M.k.a.x()) {
            AsrManager.a.N("", "", true);
            return;
        }
        kotlin.s.c.v vVar = new kotlin.s.c.v();
        vVar.a = true;
        this.b = kotlinx.coroutines.flow.h.l(new kotlinx.coroutines.flow.m(new kotlinx.coroutines.flow.s(kotlinx.coroutines.flow.h.k(kotlinx.coroutines.flow.h.e(kotlinx.coroutines.flow.h.d(new A(this, str, str2, null))), this.f3202c), new a(vVar, null)), new b(null)), lifecycleScope);
        y.b("[Android][asr][process] init end");
    }

    public final void z() {
        if (this.a == null) {
            com.bytedance.android.input.r.j.m("Asr-Flow-AsrProcess", "[feedAudio], mIAsr is null");
        }
        IAsr iAsr = this.a;
        if (iAsr != null) {
            iAsr.stop();
        }
    }
}
