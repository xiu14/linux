package com.bytedance.android.input.keyboard.gif.list_layout;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.G;

@kotlin.r.h.a.e(c = "com.bytedance.android.input.keyboard.gif.list_layout.ImeEmoticonsLayout$realLoadHotListData$1", f = "ImeEmoticonsLayout.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class r extends kotlin.r.h.a.i implements kotlin.s.b.p<G, kotlin.r.d<? super kotlin.o>, Object> {
    final /* synthetic */ ImeEmoticonsLayout a;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.l<com.bytedance.android.input.keyboard.gif.list_layout.models.a, kotlin.o> {
        final /* synthetic */ ImeEmoticonsLayout a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ImeEmoticonsLayout imeEmoticonsLayout) {
            super(1);
            this.a = imeEmoticonsLayout;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(com.bytedance.android.input.keyboard.gif.list_layout.models.a aVar) {
            com.bytedance.android.input.keyboard.gif.list_layout.models.a aVar2 = aVar;
            kotlin.s.c.l.f(aVar2, RemoteMessageConst.DATA);
            com.bytedance.android.input.r.j.i("ImeEmoticons-UI", "loadData request success--listData.size = " + aVar2.a().size());
            ImeEmoticonsLayout.h(this.a, aVar2.a());
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
            com.bytedance.android.input.r.j.i("ImeEmoticons-UI", "loadData onFailure code = " + intValue + "---message = " + str2);
            this.a.o();
            return kotlin.o.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(ImeEmoticonsLayout imeEmoticonsLayout, kotlin.r.d<? super r> dVar) {
        super(2, dVar);
        this.a = imeEmoticonsLayout;
    }

    @Override // kotlin.r.h.a.a
    public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
        return new r(this.a, dVar);
    }

    @Override // kotlin.s.b.p
    public Object invoke(G g2, kotlin.r.d<? super kotlin.o> dVar) {
        r rVar = new r(this.a, dVar);
        kotlin.o oVar = kotlin.o.a;
        rVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // kotlin.r.h.a.a
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        com.prolificinteractive.materialcalendarview.r.k0(obj);
        com.bytedance.android.input.keyboard.s.a.f fVar = com.bytedance.android.input.keyboard.s.a.f.a;
        i = this.a.f2731c;
        fVar.c(100, i, new a(this.a), new b(this.a));
        return kotlin.o.a;
    }
}
