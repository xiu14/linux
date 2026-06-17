package com.bytedance.android.input.keyboard.s.b;

import com.bytedance.android.input.keyboard.gif.send.models.MediaSendMode;
import com.bytedance.android.input.keyboard.gif.send.models.MediaSendResultState;
import com.bytedance.android.input.keyboard.gif.send.models.b;
import com.bytedance.android.input.keyboard.s.b.c.c;
import com.bytedance.android.input.r.j;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.g;
import kotlin.f;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class a implements com.bytedance.android.input.keyboard.s.b.b.a {
    public static final a a = new a();

    /* renamed from: com.bytedance.android.input.keyboard.s.b.a$a, reason: collision with other inner class name */
    static final class C0081a extends m implements l<b, o> {
        final /* synthetic */ l<b, o> a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<com.bytedance.android.input.keyboard.s.b.b.a> f2786c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.input.keyboard.gif.send.models.a f2787d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0081a(l<? super b, o> lVar, int i, List<? extends com.bytedance.android.input.keyboard.s.b.b.a> list, com.bytedance.android.input.keyboard.gif.send.models.a aVar) {
            super(1);
            this.a = lVar;
            this.b = i;
            this.f2786c = list;
            this.f2787d = aVar;
        }

        @Override // kotlin.s.b.l
        public o invoke(b bVar) {
            b bVar2 = bVar;
            kotlin.s.c.l.f(bVar2, "result");
            if (bVar2.b() == MediaSendResultState.SUCCESS) {
                this.a.invoke(bVar2);
            } else {
                a.a.d(this.b + 1, this.f2786c, this.f2787d, this.a);
            }
            return o.a;
        }
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(int i, List<? extends com.bytedance.android.input.keyboard.s.b.b.a> list, com.bytedance.android.input.keyboard.gif.send.models.a aVar, l<? super b, o> lVar) {
        if (i >= list.size()) {
            StringBuilder N = e.a.a.a.a.N("index >= size, index = ", i, ", size = ");
            N.append(list.size());
            j.m("ImeEmoticons-SendManager", N.toString());
            return;
        }
        com.bytedance.android.input.keyboard.s.b.b.a aVar2 = list.get(i);
        boolean b = aVar2.b(aVar);
        if (i == list.size() - 1 && !b) {
            lVar.invoke(new b(MediaSendResultState.UN_SUPPORT, aVar.c()));
        } else if (b) {
            aVar2.a(aVar, new C0081a(lVar, i, list, aVar));
        } else {
            d(i + 1, list, aVar, lVar);
        }
    }

    private final List<com.bytedance.android.input.keyboard.s.b.b.a> e(MediaSendMode mediaSendMode) {
        int ordinal = mediaSendMode.ordinal();
        if (ordinal == 0) {
            return g.G(c.a, com.bytedance.android.input.keyboard.s.b.c.a.a, com.bytedance.android.input.keyboard.s.b.c.b.a);
        }
        if (ordinal == 1) {
            return g.F(com.bytedance.android.input.keyboard.s.b.c.a.a);
        }
        if (ordinal == 2) {
            return g.F(com.bytedance.android.input.keyboard.s.b.c.b.a);
        }
        if (ordinal == 3) {
            return g.F(c.a);
        }
        throw new f();
    }

    @Override // com.bytedance.android.input.keyboard.s.b.b.a
    public void a(com.bytedance.android.input.keyboard.gif.send.models.a aVar, l<? super b, o> lVar) {
        kotlin.s.c.l.f(aVar, "request");
        kotlin.s.c.l.f(lVar, "callback");
        d(0, e(aVar.c()), aVar, lVar);
    }

    @Override // com.bytedance.android.input.keyboard.s.b.b.a
    public boolean b(com.bytedance.android.input.keyboard.gif.send.models.a aVar) {
        kotlin.s.c.l.f(aVar, "request");
        Iterator<T> it2 = e(aVar.c()).iterator();
        while (it2.hasNext()) {
            if (((com.bytedance.android.input.keyboard.s.b.b.a) it2.next()).b(aVar)) {
                return true;
            }
        }
        return false;
    }
}
