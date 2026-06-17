package com.bytedance.android.input.speech;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.asr.api.IAsr;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import kotlinx.coroutines.C0795d;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.speech.AsrProcess$startFlow$1", f = "AsrProcess.kt", l = {TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class A extends kotlin.r.h.a.i implements kotlin.s.b.p<kotlinx.coroutines.channels.q<? super s>, kotlin.r.d<? super kotlin.o>, Object> {
    int a;
    private /* synthetic */ Object b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ z f3024c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f3025d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f3026e;

    public static final class a extends TimerTask {
        final /* synthetic */ kotlin.s.c.v a;
        final /* synthetic */ z b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.q<s> f3027c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.s.b.p<s, Boolean, Object> f3028d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.s.c.z<String> f3029e;

        /* JADX WARN: Multi-variable type inference failed */
        a(kotlin.s.c.v vVar, z zVar, kotlinx.coroutines.channels.q<? super s> qVar, kotlin.s.b.p<? super s, ? super Boolean, ? extends Object> pVar, kotlin.s.c.z<String> zVar2) {
            this.a = vVar;
            this.b = zVar;
            this.f3027c = qVar;
            this.f3028d = pVar;
            this.f3029e = zVar2;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (this.a.a) {
                return;
            }
            z zVar = this.b;
            StringBuilder M = e.a.a.a.a.M("startFlow timer: 8s timer, ");
            M.append(com.prolificinteractive.materialcalendarview.r.W(this.f3027c));
            zVar.v(M.toString());
            this.f3028d.invoke(new s(3, null, this.f3029e.a, 0, null, null, false, 0L, false, false, 1018), Boolean.TRUE);
        }
    }

    public static final class b extends TimerTask {
        final /* synthetic */ z a;
        final /* synthetic */ kotlin.s.c.y b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.q<s> f3030c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlin.s.b.p<s, Boolean, Object> f3031d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.s.c.z<String> f3032e;

        /* JADX WARN: Multi-variable type inference failed */
        b(z zVar, kotlin.s.c.y yVar, kotlinx.coroutines.channels.q<? super s> qVar, kotlin.s.b.p<? super s, ? super Boolean, ? extends Object> pVar, kotlin.s.c.z<String> zVar2) {
            this.a = zVar;
            this.b = yVar;
            this.f3030c = qVar;
            this.f3031d = pVar;
            this.f3032e = zVar2;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            z zVar = this.a;
            StringBuilder M = e.a.a.a.a.M("mAsrInWorkCheck, ");
            M.append(com.bytedance.android.input.speech.view.l.a.r().getValue());
            z.g(zVar, M.toString());
            if (this.b.a != 0) {
                long uptimeMillis = SystemClock.uptimeMillis() - this.b.a;
                Objects.requireNonNull(this.a);
                if (uptimeMillis > 300000) {
                    Objects.requireNonNull(this.a);
                    com.bytedance.android.input.r.j.m("Asr-Flow-AsrProcess", "flow[timer]: no voice to long, " + com.prolificinteractive.materialcalendarview.r.W(this.f3030c));
                    this.f3031d.invoke(new s(7, null, this.f3032e.a, 0, null, null, false, 0L, false, false, 1018), Boolean.TRUE);
                }
            }
        }
    }

    public static final class c implements IAsr.a {
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f3033c;

        /* renamed from: e, reason: collision with root package name */
        private long f3035e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f3036f;

        /* renamed from: g, reason: collision with root package name */
        private final J f3037g;
        private long h;
        private long i;
        final /* synthetic */ z j;
        final /* synthetic */ kotlin.s.b.p<s, Boolean, Object> k;
        final /* synthetic */ kotlin.s.c.z<String> l;
        final /* synthetic */ Timer m;
        final /* synthetic */ kotlin.s.c.v n;
        final /* synthetic */ kotlin.s.c.y o;
        private IAsr.ErrorType a = IAsr.ErrorType.NET_ERROR;

        /* renamed from: d, reason: collision with root package name */
        private String f3034d = "";

        static final class a extends kotlin.s.c.m implements kotlin.s.b.q<String, Boolean, Boolean, kotlin.o> {
            final /* synthetic */ z a;
            final /* synthetic */ c b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.s.b.p<s, Boolean, Object> f3038c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.s.c.z<String> f3039d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(z zVar, c cVar, kotlin.s.b.p<? super s, ? super Boolean, ? extends Object> pVar, kotlin.s.c.z<String> zVar2) {
                super(3);
                this.a = zVar;
                this.b = cVar;
                this.f3038c = pVar;
                this.f3039d = zVar2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.s.b.q
            public kotlin.o d(String str, Boolean bool, Boolean bool2) {
                String str2 = str;
                boolean booleanValue = bool.booleanValue();
                boolean booleanValue2 = bool2.booleanValue();
                kotlin.s.c.l.f(str2, "text");
                z.g(this.a, "startFlow IAsr.Callback#Stream: show text = " + str2 + " , isFinish = " + booleanValue + ", isOffline = " + booleanValue2);
                if ((str2.length() > 0) != false) {
                    boolean z = (this.b.h().length() > 0) == true && TextUtils.equals(str2, this.b.h());
                    Objects.requireNonNull(this.a);
                    StringBuilder sb = new StringBuilder();
                    sb.append("flow[stream]: text = ");
                    sb.append(str2);
                    sb.append(" , mVadText = ");
                    sb.append(this.b.h());
                    sb.append(" , isStreamFinish = ");
                    sb.append(z);
                    sb.append(" , isFinish = ");
                    e.a.a.a.a.N0(sb, booleanValue, "Asr-Flow-AsrProcess");
                    if (z || booleanValue) {
                        AsrContext.a.T(1, true);
                    }
                    if (booleanValue) {
                        AsrContext asrContext = AsrContext.a;
                        kotlin.s.c.l.f(str2, "text");
                        com.bytedance.android.input.r.j.i("Asr-Flow-AsrContext", "requestAsrRecord, text " + str2);
                        x xVar = x.a;
                        x.h(str2);
                    }
                    this.f3038c.invoke(new s(2, str2, this.f3039d.a, booleanValue ? 1 : 0, null, null, z, this.b.g(), booleanValue2, booleanValue, 48), Boolean.FALSE);
                }
                return kotlin.o.a;
            }
        }

        static final class b extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
            final /* synthetic */ z a;
            final /* synthetic */ kotlinx.coroutines.G b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ kotlin.s.b.p<s, Boolean, Object> f3040c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f3041d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlin.s.c.z<String> f3042e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(z zVar, kotlinx.coroutines.G g2, kotlin.s.b.p<? super s, ? super Boolean, ? extends Object> pVar, c cVar, kotlin.s.c.z<String> zVar2) {
                super(1);
                this.a = zVar;
                this.b = g2;
                this.f3040c = pVar;
                this.f3041d = cVar;
                this.f3042e = zVar2;
            }

            @Override // kotlin.s.b.l
            public kotlin.o invoke(Boolean bool) {
                boolean booleanValue = bool.booleanValue();
                z.g(this.a, "startFlow IAsr.Callback#Stream: stop isFailed = " + booleanValue);
                C0795d.l(this.b, null, null, new B(booleanValue, this.f3040c, this.f3041d, this.f3042e, null), 3, null);
                return kotlin.o.a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(z zVar, kotlin.s.b.p<? super s, ? super Boolean, ? extends Object> pVar, kotlin.s.c.z<String> zVar2, kotlinx.coroutines.G g2, Timer timer, kotlin.s.c.v vVar, kotlin.s.c.y yVar) {
            this.j = zVar;
            this.k = pVar;
            this.l = zVar2;
            this.m = timer;
            this.n = vVar;
            this.o = yVar;
            this.f3037g = new J(new a(zVar, this, pVar, zVar2), new b(zVar, g2, pVar, this, zVar2));
            long uptimeMillis = SystemClock.uptimeMillis();
            this.h = uptimeMillis;
            this.i = uptimeMillis;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.bytedance.android.input.common.asr.api.IAsr.a
        public void a(boolean z, String str) {
            kotlin.s.c.l.f(str, DBDefinition.TASK_ID);
            if (z) {
                this.h = SystemClock.uptimeMillis();
                z zVar = this.j;
                StringBuilder M = e.a.a.a.a.M("startFlow IAsr.Callback#onSuccess: create handle now = ");
                M.append(this.h);
                M.append(", last = ");
                M.append(this.i);
                M.append(", time = ");
                M.append(this.h - this.i);
                zVar.v(M.toString());
                this.i = this.h;
                y yVar = y.a;
                y.b("[Android][asr][process] sdk callback create handle");
                return;
            }
            if (this.j.j) {
                this.m.cancel();
            }
            this.n.a = true;
            this.l.a = str;
            AsrContext.a.e(str, "");
            this.h = SystemClock.uptimeMillis();
            z zVar2 = this.j;
            StringBuilder M2 = e.a.a.a.a.M("startFlow IAsr.Callback: onSuccess back now = ");
            M2.append(this.h);
            M2.append(", last = ");
            M2.append(this.i);
            M2.append(", time = ");
            M2.append(this.h - this.i);
            zVar2.v(M2.toString());
            AsrManager.a.e0("input_voiceinputcreatehandle", this.h - this.i);
            this.k.invoke(new s(1, null, this.l.a, 0, null, null, false, 0L, false, false, 1018), Boolean.FALSE);
            this.o.a = SystemClock.uptimeMillis();
        }

        @Override // com.bytedance.android.input.common.asr.api.IAsr.a
        public void b() {
            this.j.v("startFlow IAsr.Callback: onFinished");
            this.f3037g.j(false);
        }

        @Override // com.bytedance.android.input.common.asr.api.IAsr.a
        public void c(String str, boolean z, long j, boolean z2, boolean z3, boolean z4) {
            kotlin.s.c.l.f(str, "text");
            this.h = SystemClock.uptimeMillis();
            z zVar = this.j;
            StringBuilder M = e.a.a.a.a.M("startFlow IAsr.Callback: onTextResponse: now = ");
            M.append(this.h);
            M.append(", last = ");
            M.append(this.i);
            M.append(", isFinish: ");
            M.append(z);
            M.append(", isVad: ");
            M.append(z2);
            M.append(", time = ");
            M.append(this.h - this.i);
            M.append(", name = ");
            M.append(this);
            M.append(' ');
            zVar.v(M.toString());
            String i = z.i(this.j, str);
            if (z) {
                this.o.a = 0L;
                AsrManager.a.e0("input_voiceinputvad", this.h - this.i);
            } else {
                this.o.a = SystemClock.uptimeMillis();
            }
            z zVar2 = this.j;
            StringBuilder M2 = e.a.a.a.a.M("startFlow IAsr.Callback: onTextResponse mFirstResponseReceived = ");
            M2.append(this.f3033c);
            z.g(zVar2, M2.toString());
            if (!this.f3033c) {
                this.f3035e = j;
                this.f3033c = true;
                this.f3037g.i(z3);
                AsrContext.a.V(false);
                y yVar = y.a;
                y.b("[Android][asr][process] first word back");
            }
            if (z2) {
                this.f3034d = i;
            }
            z.g(this.j, "startFlow IAsr.Callback: onTextResponse textReplace = " + i + ", isFinish = " + z + ", isOffline = " + z3);
            this.f3037g.g(i, z, z3);
            this.i = this.h;
            if (!z4 || this.f3036f) {
                return;
            }
            this.k.invoke(new s(8, null, this.l.a, 0, null, null, false, 0L, false, false, 1018), Boolean.FALSE);
            this.f3036f = true;
        }

        @Override // com.bytedance.android.input.common.asr.api.IAsr.a
        public void d(IAsr.ErrorType errorType, int i) {
            kotlin.s.c.l.f(errorType, "errorType");
            this.j.v("startFlow IAsr.Callback: onFail " + errorType + ", " + i + ", name = " + this);
            if (errorType != IAsr.ErrorType.NET_SWITCH && errorType != IAsr.ErrorType.OFFLINE_SWITCH) {
                this.a = errorType;
                this.b = i;
                this.f3037g.j(true);
            } else {
                if (errorType == IAsr.ErrorType.OFFLINE_SWITCH && i == 1) {
                    this.m.cancel();
                }
                this.k.invoke(new s(4, null, this.l.a, i, errorType, null, false, 0L, false, false, 994), Boolean.FALSE);
            }
        }

        public final int e() {
            return this.b;
        }

        public final IAsr.ErrorType f() {
            return this.a;
        }

        public final long g() {
            return this.f3035e;
        }

        public final String h() {
            return this.f3034d;
        }
    }

    static final class d extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
        final /* synthetic */ Timer a;
        final /* synthetic */ z b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Timer timer, z zVar) {
            super(0);
            this.a = timer;
            this.b = zVar;
        }

        @Override // kotlin.s.b.a
        public kotlin.o invoke() {
            String str;
            String str2;
            String str3;
            String str4;
            this.a.cancel();
            this.b.z();
            z zVar = this.b;
            str = zVar.i;
            int i = 0;
            if (str.length() > 0) {
                int length = com.bytedance.android.input.speech.view.l.a.m().length();
                str4 = this.b.i;
                i = str4.length() + length;
            }
            zVar.f3204e = i;
            z zVar2 = this.b;
            str2 = zVar2.h;
            zVar2.f3206g = str2;
            if (!AsrContext.a.r()) {
                this.b.f3205f = "";
            }
            this.b.v("startFlow IAsr.Callback: closed");
            z zVar3 = this.b;
            StringBuilder M = e.a.a.a.a.M("startFlow IAsr.Callback: closed mLastDeletePeriod = ");
            str3 = this.b.f3205f;
            M.append(str3);
            z.g(zVar3, M.toString());
            return kotlin.o.a;
        }
    }

    static final class e extends kotlin.s.c.m implements kotlin.s.b.p<s, Boolean, Object> {
        final /* synthetic */ kotlinx.coroutines.G a;
        final /* synthetic */ z b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.q<s> f3043c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.w<s> f3044d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(kotlinx.coroutines.G g2, z zVar, kotlinx.coroutines.channels.q<? super s> qVar, kotlinx.coroutines.channels.w<? super s> wVar) {
            super(2);
            this.a = g2;
            this.b = zVar;
            this.f3043c = qVar;
            this.f3044d = wVar;
        }

        @Override // kotlin.s.b.p
        public Object invoke(s sVar, Boolean bool) {
            s sVar2 = sVar;
            boolean booleanValue = bool.booleanValue();
            kotlin.s.c.l.f(sVar2, "callback");
            try {
                return C0795d.l(this.a, null, null, new C(this.f3044d, this.b, sVar2, booleanValue, this.f3043c, null), 3, null);
            } catch (Exception e2) {
                z zVar = this.b;
                String valueOf = String.valueOf(e2.getMessage());
                Objects.requireNonNull(zVar);
                IAppGlobals.a.e("Asr-Flow-AsrProcess", valueOf);
                return Boolean.valueOf(com.prolificinteractive.materialcalendarview.r.D(this.f3043c, null, 1, null));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(z zVar, String str, String str2, kotlin.r.d<? super A> dVar) {
        super(2, dVar);
        this.f3024c = zVar;
        this.f3025d = str;
        this.f3026e = str2;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        A a2 = new A(this.f3024c, this.f3025d, this.f3026e, dVar);
        a2.b = obj;
        return a2;
    }

    @Override // kotlin.s.b.p
    public Object invoke(kotlinx.coroutines.channels.q<? super s> qVar, kotlin.r.d<? super kotlin.o> dVar) {
        A a2 = new A(this.f3024c, this.f3025d, this.f3026e, dVar);
        a2.b = qVar;
        return a2.invokeSuspend(kotlin.o.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00fe, code lost:
    
        if (r3 == 4) goto L19;
     */
    @Override // kotlin.r.h.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.A.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
