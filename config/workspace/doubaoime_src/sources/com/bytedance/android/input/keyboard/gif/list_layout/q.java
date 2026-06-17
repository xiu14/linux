package com.bytedance.android.input.keyboard.gif.list_layout;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.G;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.keyboard.gif.list_layout.ImeEmoticonsLayout$realLoadDataByKeyword$1", f = "ImeEmoticonsLayout.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class q extends kotlin.r.h.a.i implements kotlin.s.b.p<G, kotlin.r.d<? super kotlin.o>, Object> {
    final /* synthetic */ ImeEmoticonsLayout a;
    final /* synthetic */ String b;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.l<com.bytedance.android.input.keyboard.gif.list_layout.models.c, kotlin.o> {
        final /* synthetic */ ImeEmoticonsLayout a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ImeEmoticonsLayout imeEmoticonsLayout) {
            super(1);
            this.a = imeEmoticonsLayout;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(com.bytedance.android.input.keyboard.gif.list_layout.models.c cVar) {
            com.bytedance.android.input.keyboard.gif.list_layout.models.c cVar2 = cVar;
            kotlin.s.c.l.f(cVar2, RemoteMessageConst.DATA);
            com.bytedance.android.input.r.j.i("ImeEmoticons-UI", "loadDataByKeyword request success--listData.size = " + cVar2.a().size());
            ImeEmoticonsLayout.h(this.a, cVar2.a());
            return kotlin.o.a;
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.p<Integer, String, kotlin.o> {
        final /* synthetic */ ImeEmoticonsLayout a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ImeEmoticonsLayout imeEmoticonsLayout) {
            super(2);
            this.a = imeEmoticonsLayout;
        }

        @Override // kotlin.s.b.p
        public kotlin.o invoke(Integer num, String str) {
            int intValue = num.intValue();
            String str2 = str;
            kotlin.s.c.l.f(str2, "message");
            com.bytedance.android.input.r.j.i("ImeEmoticons-UI", "loadDataByKeyword onFailure code = " + intValue + "---message = " + str2);
            this.a.o();
            return kotlin.o.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(ImeEmoticonsLayout imeEmoticonsLayout, String str, kotlin.r.d<? super q> dVar) {
        super(2, dVar);
        this.a = imeEmoticonsLayout;
        this.b = str;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        return new q(this.a, this.b, dVar);
    }

    @Override // kotlin.s.b.p
    public Object invoke(G g2, kotlin.r.d<? super kotlin.o> dVar) {
        q qVar = new q(this.a, this.b, dVar);
        kotlin.o oVar = kotlin.o.a;
        qVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        com.prolificinteractive.materialcalendarview.r.k0(obj);
        com.bytedance.android.input.keyboard.s.a.f fVar = com.bytedance.android.input.keyboard.s.a.f.a;
        i = this.a.f2731c;
        fVar.d(100, i, this.b, new a(this.a), new b(this.a));
        return kotlin.o.a;
    }
}
