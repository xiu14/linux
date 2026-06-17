package com.bytedance.android.input.keyboard.emoji;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.G;
import kotlinx.coroutines.flow.x;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.keyboard.emoji.EmojiLayout$bindData$1", f = "EmojiLayout.kt", l = {431}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class j extends kotlin.r.h.a.i implements kotlin.s.b.p<G, kotlin.r.d<? super kotlin.o>, Object> {
    int a;
    final /* synthetic */ EmojiLayout b;

    static final class a<T> implements kotlinx.coroutines.flow.g {
        final /* synthetic */ EmojiLayout a;

        a(EmojiLayout emojiLayout) {
            this.a = emojiLayout;
        }

        @Override // kotlinx.coroutines.flow.g
        public Object emit(Object obj, kotlin.r.d dVar) {
            EmojiPageAdapter emojiPageAdapter;
            EmojiPageAdapter emojiPageAdapter2;
            EmojiPageAdapter emojiPageAdapter3;
            emojiPageAdapter = this.a.f2705f;
            boolean isEmpty = emojiPageAdapter.a().isEmpty();
            emojiPageAdapter2 = this.a.f2705f;
            emojiPageAdapter2.b((List) obj);
            e.a.a.a.a.y0("bindData emoji changeTab ", isEmpty, this.a.a);
            if (isEmpty) {
                emojiPageAdapter3 = this.a.f2705f;
                emojiPageAdapter3.notifyDataSetChanged();
            }
            return kotlin.o.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(EmojiLayout emojiLayout, kotlin.r.d<? super j> dVar) {
        super(2, dVar);
        this.b = emojiLayout;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        return new j(this.b, dVar);
    }

    @Override // kotlin.s.b.p
    public Object invoke(G g2, kotlin.r.d<? super kotlin.o> dVar) {
        return new j(this.b, dVar).invokeSuspend(kotlin.o.a);
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        p pVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        if (i == 0) {
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            pVar = this.b.f2703d;
            x<List<h>> q = pVar.q();
            a aVar = new a(this.b);
            this.a = 1;
            if (q.a(aVar, this) == coroutineSingletons) {
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
