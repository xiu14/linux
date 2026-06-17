package com.bytedance.android.input.keyboard.emoji;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Predicate;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C0795d;
import kotlinx.coroutines.G;
import kotlinx.coroutines.S;
import kotlinx.coroutines.flow.t;
import kotlinx.coroutines.flow.x;
import kotlinx.coroutines.flow.z;
import kotlinx.coroutines.r0;

/* loaded from: classes.dex */
public final class p {
    private final G a;
    private final o b;

    /* renamed from: c, reason: collision with root package name */
    private final n f2721c;

    /* renamed from: d, reason: collision with root package name */
    private final r f2722d;

    /* renamed from: e, reason: collision with root package name */
    private final int f2723e;

    /* renamed from: f, reason: collision with root package name */
    private final t<h> f2724f;

    /* renamed from: g, reason: collision with root package name */
    private h f2725g;
    private List<h> h;
    private final t<h> i;
    private h j;
    private List<h> k;
    private boolean l;
    private boolean m;
    private final t<List<h>> n;
    private final x<List<h>> o;
    private final t<List<h>> p;
    private final x<List<h>> q;

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.keyboard.emoji.EmojiViewModel$1", f = "EmojiViewModel.kt", l = {41}, m = "invokeSuspend")
    static final class a extends kotlin.r.h.a.i implements kotlin.s.b.p<G, kotlin.r.d<? super kotlin.o>, Object> {
        int a;

        /* renamed from: com.bytedance.android.input.keyboard.emoji.p$a$a, reason: collision with other inner class name */
        static final class C0080a<T> implements kotlinx.coroutines.flow.g {
            final /* synthetic */ p a;

            C0080a(p pVar) {
                this.a = pVar;
            }

            @Override // kotlinx.coroutines.flow.g
            public Object emit(Object obj, kotlin.r.d dVar) {
                h hVar = (h) obj;
                h hVar2 = new h("", null, 2);
                hVar2.e(hVar.d().size());
                hVar2.d().addAll(hVar.d());
                hVar2.d().addAll(this.a.f2725g.d());
                t tVar = this.a.n;
                List K = kotlin.collections.g.K(hVar2);
                List list = this.a.h;
                if (list == null) {
                    kotlin.s.c.l.l("emojiDataList");
                    throw null;
                }
                K.addAll(list);
                tVar.setValue(K);
                return kotlin.o.a;
            }
        }

        a(kotlin.r.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return p.this.new a(dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, kotlin.r.d<? super kotlin.o> dVar) {
            return p.this.new a(dVar).invokeSuspend(kotlin.o.a);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                com.prolificinteractive.materialcalendarview.r.k0(obj);
                kotlinx.coroutines.flow.r rVar = new kotlinx.coroutines.flow.r(p.this.f2724f);
                C0080a c0080a = new C0080a(p.this);
                this.a = 1;
                if (rVar.a(c0080a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.prolificinteractive.materialcalendarview.r.k0(obj);
            }
            return kotlin.o.a;
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.keyboard.emoji.EmojiViewModel$2", f = "EmojiViewModel.kt", l = {50}, m = "invokeSuspend")
    static final class b extends kotlin.r.h.a.i implements kotlin.s.b.p<G, kotlin.r.d<? super kotlin.o>, Object> {
        int a;

        static final class a<T> implements kotlinx.coroutines.flow.g {
            final /* synthetic */ p a;

            a(p pVar) {
                this.a = pVar;
            }

            @Override // kotlinx.coroutines.flow.g
            public Object emit(Object obj, kotlin.r.d dVar) {
                h hVar = (h) obj;
                h hVar2 = new h("", null, 2);
                hVar2.e(hVar.d().size());
                hVar2.d().addAll(hVar.d());
                hVar2.d().addAll(this.a.j.d());
                t tVar = this.a.p;
                List K = kotlin.collections.g.K(hVar2);
                List list = this.a.k;
                if (list == null) {
                    kotlin.s.c.l.l("kaomojiDataList");
                    throw null;
                }
                K.addAll(list);
                tVar.setValue(K);
                return kotlin.o.a;
            }
        }

        b(kotlin.r.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return p.this.new b(dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, kotlin.r.d<? super kotlin.o> dVar) {
            return p.this.new b(dVar).invokeSuspend(kotlin.o.a);
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.a;
            if (i == 0) {
                com.prolificinteractive.materialcalendarview.r.k0(obj);
                kotlinx.coroutines.flow.r rVar = new kotlinx.coroutines.flow.r(p.this.i);
                a aVar = new a(p.this);
                this.a = 1;
                if (rVar.a(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.prolificinteractive.materialcalendarview.r.k0(obj);
            }
            return kotlin.o.a;
        }
    }

    static final class c extends kotlin.s.c.m implements kotlin.s.b.l<i, Boolean> {
        final /* synthetic */ i a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(i iVar) {
            super(1);
            this.a = iVar;
        }

        @Override // kotlin.s.b.l
        public Boolean invoke(i iVar) {
            i iVar2 = iVar;
            kotlin.s.c.l.f(iVar2, "it");
            return Boolean.valueOf(kotlin.s.c.l.a(iVar2.d(), this.a.d()));
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.keyboard.emoji.EmojiViewModel$loadData$1", f = "EmojiViewModel.kt", l = {}, m = "invokeSuspend")
    static final class d extends kotlin.r.h.a.i implements kotlin.s.b.p<G, kotlin.r.d<? super kotlin.o>, Object> {
        final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, kotlin.r.d<? super d> dVar) {
            super(2, dVar);
            this.b = context;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return p.this.new d(this.b, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, kotlin.r.d<? super kotlin.o> dVar) {
            d dVar2 = p.this.new d(this.b, dVar);
            kotlin.o oVar = kotlin.o.a;
            dVar2.invokeSuspend(oVar);
            return oVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            p pVar = p.this;
            pVar.h = pVar.b.a(this.b, p.this.f2721c);
            p pVar2 = p.this;
            pVar2.f2725g = pVar2.b.c(this.b, p.this.f2721c);
            p.this.f2724f.setValue(p.this.b.b(p.this.f2721c));
            p pVar3 = p.this;
            pVar3.k = pVar3.b.a(this.b, p.this.f2722d);
            r rVar = p.this.f2722d;
            List list = p.this.k;
            if (list == null) {
                kotlin.s.c.l.l("kaomojiDataList");
                throw null;
            }
            Objects.requireNonNull(rVar);
            kotlin.s.c.l.f(list, "list");
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                rVar.f((h) it2.next());
            }
            p pVar4 = p.this;
            h c2 = pVar4.b.c(this.b, p.this.f2722d);
            p.this.f2722d.f(c2);
            pVar4.j = c2;
            t tVar = p.this.i;
            h b = p.this.b.b(p.this.f2722d);
            p.this.f2722d.f(b);
            tVar.setValue(b);
            return kotlin.o.a;
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.keyboard.emoji.EmojiViewModel$saveHistory$1$1", f = "EmojiViewModel.kt", l = {}, m = "invokeSuspend")
    static final class e extends kotlin.r.h.a.i implements kotlin.s.b.p<G, kotlin.r.d<? super kotlin.o>, Object> {
        final /* synthetic */ h b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(h hVar, kotlin.r.d<? super e> dVar) {
            super(2, dVar);
            this.b = hVar;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return p.this.new e(this.b, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, kotlin.r.d<? super kotlin.o> dVar) {
            e eVar = p.this.new e(this.b, dVar);
            kotlin.o oVar = kotlin.o.a;
            eVar.invokeSuspend(oVar);
            return oVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            p.this.b.d(this.b, p.this.f2721c);
            return kotlin.o.a;
        }
    }

    @kotlin.r.h.a.e(c = "com.bytedance.android.input.keyboard.emoji.EmojiViewModel$saveHistory$2$1", f = "EmojiViewModel.kt", l = {}, m = "invokeSuspend")
    static final class f extends kotlin.r.h.a.i implements kotlin.s.b.p<G, kotlin.r.d<? super kotlin.o>, Object> {
        final /* synthetic */ h b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(h hVar, kotlin.r.d<? super f> dVar) {
            super(2, dVar);
            this.b = hVar;
        }

        @Override // kotlin.r.h.a.a
        public final kotlin.r.d<kotlin.o> create(Object obj, kotlin.r.d<?> dVar) {
            return p.this.new f(this.b, dVar);
        }

        @Override // kotlin.s.b.p
        public Object invoke(G g2, kotlin.r.d<? super kotlin.o> dVar) {
            f fVar = p.this.new f(this.b, dVar);
            kotlin.o oVar = kotlin.o.a;
            fVar.invokeSuspend(oVar);
            return oVar;
        }

        @Override // kotlin.r.h.a.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            com.prolificinteractive.materialcalendarview.r.k0(obj);
            p.this.b.d(this.b, p.this.f2722d);
            return kotlin.o.a;
        }
    }

    public p() {
        G b2 = com.prolificinteractive.materialcalendarview.r.b(com.prolificinteractive.materialcalendarview.r.d0((r0) C0795d.a(null, 1), S.b()));
        this.a = b2;
        this.b = new o();
        this.f2721c = new n();
        this.f2722d = new r();
        this.f2723e = 60;
        this.f2724f = z.a(null);
        this.f2725g = new h("", null, 2);
        this.i = z.a(null);
        this.j = new h("", null, 2);
        kotlin.collections.l lVar = kotlin.collections.l.a;
        t<List<h>> a2 = z.a(lVar);
        this.n = a2;
        this.o = a2;
        t<List<h>> a3 = z.a(lVar);
        this.p = a3;
        this.q = a3;
        C0795d.l(b2, null, null, new a(null), 3, null);
        C0795d.l(b2, null, null, new b(null), 3, null);
    }

    public final void p(i iVar, boolean z) {
        t<h> tVar;
        h value;
        h hVar;
        kotlin.s.c.l.f(iVar, "item");
        if (z) {
            tVar = this.f2724f;
            if (tVar.getValue() == null) {
                return;
            } else {
                this.l = true;
            }
        } else {
            tVar = this.i;
            if (tVar.getValue() == null) {
                return;
            } else {
                this.m = true;
            }
        }
        do {
            value = tVar.getValue();
            h hVar2 = value;
            hVar = null;
            if (hVar2 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(hVar2.d());
                final c cVar = new c(iVar);
                arrayList.removeIf(new Predicate() { // from class: com.bytedance.android.input.keyboard.emoji.f
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        kotlin.s.b.l lVar = kotlin.s.b.l.this;
                        kotlin.s.c.l.f(lVar, "$tmp0");
                        return ((Boolean) lVar.invoke(obj)).booleanValue();
                    }
                });
                if (arrayList.size() >= this.f2723e) {
                    kotlin.s.c.l.f(arrayList, "<this>");
                    if (arrayList.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    arrayList.remove(kotlin.collections.g.w(arrayList));
                }
                arrayList.add(0, i.a(iVar, 0, null, 0, 7));
                hVar = h.a(hVar2, null, arrayList, 1);
                if (!z) {
                    this.f2722d.f(hVar);
                }
            }
        } while (!tVar.c(value, hVar));
    }

    public final x<List<h>> q() {
        return this.o;
    }

    public final x<List<h>> r() {
        return this.q;
    }

    public final void s(Context context) {
        kotlin.s.c.l.f(context, "context");
        C0795d.l(this.a, null, null, new d(context, null), 3, null);
    }

    public final void t() {
        h value;
        h value2;
        if (this.l && (value2 = this.f2724f.getValue()) != null) {
            C0795d.l(this.a, S.b(), null, new e(value2, null), 2, null);
        }
        if (!this.m || (value = this.i.getValue()) == null) {
            return;
        }
        C0795d.l(this.a, S.b(), null, new f(value, null), 2, null);
    }
}
