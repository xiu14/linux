package com.bytedance.android.input.keyboard.emoji;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.G;
import kotlinx.coroutines.flow.x;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.keyboard.emoji.EmojiLayout$bindData$2", f = "EmojiLayout.kt", l = {443}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class k extends kotlin.r.h.a.i implements kotlin.s.b.p<G, kotlin.r.d<? super kotlin.o>, Object> {
    int a;
    final /* synthetic */ EmojiLayout b;

    static final class a<T> implements kotlinx.coroutines.flow.g {
        final /* synthetic */ EmojiLayout a;

        a(EmojiLayout emojiLayout) {
            this.a = emojiLayout;
        }

        @Override // kotlinx.coroutines.flow.g
        public Object emit(Object obj, kotlin.r.d dVar) {
            KaomojiPageAdapter kaomojiPageAdapter;
            KaomojiPageAdapter kaomojiPageAdapter2;
            KaomojiPageAdapter kaomojiPageAdapter3;
            kaomojiPageAdapter = this.a.f2706g;
            boolean isEmpty = kaomojiPageAdapter.a().isEmpty();
            kaomojiPageAdapter2 = this.a.f2706g;
            kaomojiPageAdapter2.b((List) obj);
            e.a.a.a.a.y0("bindData kaomoji notify ", isEmpty, this.a.a);
            if (isEmpty) {
                kaomojiPageAdapter3 = this.a.f2706g;
                kaomojiPageAdapter3.notifyDataSetChanged();
            }
            return kotlin.o.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(EmojiLayout emojiLayout, kotlin.r.d<? super k> dVar) {
        super(2, dVar);
        this.b = emojiLayout;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        return new k(this.b, dVar);
    }

    @Override // kotlin.s.b.p
    public Object invoke(G g2, kotlin.r.d<? super kotlin.o> dVar) {
        return new k(this.b, dVar).invokeSuspend(kotlin.o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        p pVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            pVar = this.b.f2703d;
            x<List<h>> r = pVar.r();
            a aVar = new a(this.b);
            this.a = 1;
            if (r.a(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.prolificinteractive.materialcalendarview.r.k0(obj);
        }
        throw new kotlin.c();
    }
}
