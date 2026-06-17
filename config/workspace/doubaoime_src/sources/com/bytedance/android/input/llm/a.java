package com.bytedance.android.input.llm;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.r.j;
import com.prolificinteractive.materialcalendarview.r;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.e;
import kotlin.g;
import kotlin.o;
import kotlin.r.d;
import kotlin.r.h.a.i;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlin.s.c.m;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.C0800f0;
import kotlinx.coroutines.G;
import kotlinx.coroutines.N0.q;
import kotlinx.coroutines.S;

/* loaded from: classes.dex */
public final class a {
    public static final a b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final e<a> f2851c = kotlin.a.c(C0082a.a);
    private long a;

    /* renamed from: com.bytedance.android.input.llm.a$a, reason: collision with other inner class name */
    static final class C0082a extends m implements kotlin.s.b.a<a> {
        public static final C0082a a = new C0082a();

        C0082a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public a invoke() {
            return new a();
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.llm.LLMCandidate$updateCandidateList$1", f = "LLMCandidate.kt", l = {}, m = "invokeSuspend")
    static final class b extends i implements p<G, d<? super o>, Object> {
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f2852c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2853d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f2854e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f2855f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f2856g;
        final /* synthetic */ String h;

        @kotlin.r.h.a.e(c = "com.bytedance.android.input.llm.LLMCandidate$updateCandidateList$1$2", f = "LLMCandidate.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.bytedance.android.input.llm.a$b$a, reason: collision with other inner class name */
        static final class C0083a extends i implements p<G, d<? super o>, Object> {
            final /* synthetic */ a a;
            final /* synthetic */ long b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f2857c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f2858d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f2859e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f2860f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0083a(a aVar, long j, String str, String str2, String str3, String str4, d<? super C0083a> dVar) {
                super(2, dVar);
                this.a = aVar;
                this.b = j;
                this.f2857c = str;
                this.f2858d = str2;
                this.f2859e = str3;
                this.f2860f = str4;
            }

            @Override // kotlin.r.h.a.a
            public final d<o> create(Object obj, d<?> dVar) {
                return new C0083a(this.a, this.b, this.f2857c, this.f2858d, this.f2859e, this.f2860f, dVar);
            }

            @Override // kotlin.s.b.p
            public Object invoke(G g2, d<? super o> dVar) {
                return ((C0083a) create(g2, dVar)).invokeSuspend(o.a);
            }

            @Override // kotlin.r.h.a.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                r.k0(obj);
                a aVar = this.a;
                a aVar2 = a.b;
                Objects.requireNonNull(aVar);
                StringBuilder sb = new StringBuilder();
                sb.append("llm-run --------- update --- ");
                sb.append(this.b);
                sb.append(", ");
                sb.append(this.a.a);
                sb.append(' ');
                e.a.a.a.a.H0(sb, this.f2857c, "LLMCandidateWindow");
                if (this.b != this.a.a) {
                    Objects.requireNonNull(this.a);
                    j.i("LLMCandidateWindow", "currentIndex ！=currentCompIndex return");
                    return o.a;
                }
                com.bytedance.android.input.common_biz.performance.j.o("[android][request][llm] request llm finish , and notify C++");
                KeyboardJni keyboardJni = KeyboardJni.getKeyboardJni();
                String str = this.f2858d;
                keyboardJni.updateLLMCand(str, this.f2859e, this.f2857c, "", str, this.f2860f);
                Objects.requireNonNull(this.a);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("response = ");
                e.a.a.a.a.H0(sb2, this.f2858d, "LLMCandidateWindow");
                return o.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, long j, int i, String str2, String str3, String str4, String str5, d<? super b> dVar) {
            super(2, dVar);
            this.b = str;
            this.f2852c = j;
            this.f2853d = i;
            this.f2854e = str2;
            this.f2855f = str3;
            this.f2856g = str4;
            this.h = str5;
        }

        @Override // kotlin.r.h.a.a
        public final d<o> create(Object obj, d<?> dVar) {
            return a.this.new b(this.b, this.f2852c, this.f2853d, this.f2854e, this.f2855f, this.f2856g, this.h, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, d<? super o> dVar) {
            return ((b) create(g2, dVar)).invokeSuspend(o.a);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            g<String, ArrayList<String>> gVar;
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            r.k0(obj);
            long j = a.this.a;
            Objects.requireNonNull(a.this);
            StringBuilder sb = new StringBuilder();
            sb.append("llm-run --------- llm io run ");
            sb.append(j);
            sb.append(" --- ");
            e.a.a.a.a.H0(sb, this.b, "LLMCandidateWindow");
            try {
                gVar = LLMRequest.a.f(this.b, this.f2854e, this.f2855f, this.f2856g, this.f2853d);
                l.c(gVar);
            } catch (Throwable th) {
                r.J(th);
                gVar = null;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - this.f2852c;
            Objects.requireNonNull(a.this);
            j.i("LLMCandidateWindow", "[time] timeout1 = " + this.f2853d + ", cost = " + uptimeMillis);
            Objects.requireNonNull(a.this);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("response = ");
            e.a.a.a.a.H0(sb2, gVar != null ? gVar.c() : null, "LLMCandidateWindow");
            Objects.requireNonNull(a.this);
            j.i("LLMCandidateWindow", "llm-run --------- llm io end. last index=" + j + ", current index=" + a.this.a);
            if (j != a.this.a) {
                Objects.requireNonNull(a.this);
                j.i("LLMCandidateWindow", "currentIndex ！=currentCompIndex return");
                return o.a;
            }
            if (gVar == null || (str = gVar.c()) == null) {
                str = "";
            }
            String str2 = str;
            C0800f0 c0800f0 = C0800f0.a;
            int i = S.f10199c;
            C0795d.l(c0800f0, q.f10173c, null, new C0083a(a.this, j, this.b, str2, this.f2854e, this.h, null), 2, null);
            return o.a;
        }
    }

    @SuppressLint({"SuspiciousIndentation"})
    public final void c(String str, String str2, String str3, String str4, int i, String str5) {
        l.f(str, "comp");
        l.f(str2, "leftContext");
        l.f(str3, "rightContext");
        l.f(str4, "imeMode");
        l.f(str5, "rawCompUnconvert");
        j.i("LLMCandidateWindow", "[UpdateCandidate] updateCandidateList timeoutMs = " + i);
        if (!(((Integer) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.full_base_input_mode, "IAppGlobals.context.getS…ing.full_base_input_mode)", "null cannot be cast to non-null type kotlin.Int")).intValue() == 0)) {
            j.i("LLMCandidateWindow", "updateCandidateList, not in full input mode");
            return;
        }
        e.a.a.a.a.r0("updateCandidate, comp is ", str, "LLMCandidateWindow");
        this.a++;
        if (str.length() == 0) {
            return;
        }
        C0795d.b(C0800f0.a, S.b(), null, new b(str, SystemClock.uptimeMillis(), i, str2, str3, str4, str5, null), 2, null);
    }
}
