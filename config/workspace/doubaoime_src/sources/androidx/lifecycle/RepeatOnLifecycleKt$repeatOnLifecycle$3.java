package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.o;
import kotlin.r.h.a.i;
import kotlin.s.b.p;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.G;
import kotlinx.coroutines.N0.q;
import kotlinx.coroutines.S;
import kotlinx.coroutines.v0;

@kotlin.r.h.a.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends i implements p<G, kotlin.r.d<? super o>, Object> {
    final /* synthetic */ p<G, kotlin.r.d<? super o>, Object> $block;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    @kotlin.r.h.a.e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {166}, m = "invokeSuspend")
    @SourceDebugExtension({"SMAP\nRepeatOnLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,165:1\n314#2,11:166\n*S KotlinDebug\n*F\n+ 1 RepeatOnLifecycle.kt\nandroidx/lifecycle/RepeatOnLifecycleKt$repeatOnLifecycle$3$1\n*L\n97#1:166,11\n*E\n"})
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends i implements p<G, kotlin.r.d<? super o>, Object> {
        final /* synthetic */ G $$this$coroutineScope;
        final /* synthetic */ p<G, kotlin.r.d<? super o>, Object> $block;
        final /* synthetic */ Lifecycle.State $state;
        final /* synthetic */ Lifecycle $this_repeatOnLifecycle;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, G g2, p<? super G, ? super kotlin.r.d<? super o>, ? extends Object> pVar, kotlin.r.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$this_repeatOnLifecycle = lifecycle;
            this.$state = state;
            this.$$this$coroutineScope = g2;
            this.$block = pVar;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
            return new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, this.$$this$coroutineScope, this.$block, dVar);
        }

        @Override // kotlin.s.b.p
        public final Object invoke(G g2, kotlin.r.d<? super o> dVar) {
            return ((AnonymousClass1) create(g2, dVar)).invokeSuspend(o.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00d2  */
        /* JADX WARN: Type inference failed for: r10v0, types: [T, androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, java.lang.Object] */
        @Override // kotlin.r.h.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 216
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, p<? super G, ? super kotlin.r.d<? super o>, ? extends Object> pVar, kotlin.r.d<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> dVar) {
        super(2, dVar);
        this.$this_repeatOnLifecycle = lifecycle;
        this.$state = state;
        this.$block = pVar;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<o> create(Object obj, kotlin.r.d<?> dVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.$this_repeatOnLifecycle, this.$state, this.$block, dVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.L$0 = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // kotlin.s.b.p
    public final Object invoke(G g2, kotlin.r.d<? super o> dVar) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(g2, dVar)).invokeSuspend(o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            r.k0(obj);
            G g2 = (G) this.L$0;
            int i2 = S.f10199c;
            v0 U = q.f10173c.U();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_repeatOnLifecycle, this.$state, g2, this.$block, null);
            this.label = 1;
            if (C0795d.s(U, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.k0(obj);
        }
        return o.a;
    }
}
