package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.producers.J;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
class K extends C0725e {
    final /* synthetic */ Pair a;
    final /* synthetic */ J.b b;

    K(J.b bVar, Pair pair) {
        this.b = bVar;
        this.a = pair;
    }

    @Override // com.facebook.imagepipeline.producers.W
    public void a() {
        CopyOnWriteArraySet copyOnWriteArraySet;
        boolean remove;
        List list;
        C0724d c0724d;
        List list2;
        List list3;
        boolean z;
        CopyOnWriteArraySet copyOnWriteArraySet2;
        List r;
        synchronized (this.b) {
            copyOnWriteArraySet = this.b.b;
            remove = copyOnWriteArraySet.remove(this.a);
            list = null;
            if (remove) {
                copyOnWriteArraySet2 = this.b.b;
                if (copyOnWriteArraySet2.isEmpty()) {
                    c0724d = this.b.f6545f;
                    list2 = null;
                } else {
                    r = this.b.r();
                    list2 = this.b.s();
                    list3 = this.b.q();
                    c0724d = null;
                    list = r;
                }
            } else {
                c0724d = null;
                list2 = null;
            }
            list3 = list2;
        }
        C0724d.r(list);
        C0724d.s(list2);
        C0724d.q(list3);
        if (c0724d != null) {
            z = J.this.f6539c;
            if (!z || c0724d.i()) {
                c0724d.t();
            } else {
                C0724d.s(c0724d.w(Priority.LOW));
            }
        }
        if (remove) {
            ((InterfaceC0732l) this.a.first).d();
        }
    }

    @Override // com.facebook.imagepipeline.producers.C0725e, com.facebook.imagepipeline.producers.W
    public void b() {
        List q;
        q = this.b.q();
        C0724d.q(q);
    }

    @Override // com.facebook.imagepipeline.producers.C0725e, com.facebook.imagepipeline.producers.W
    public void c() {
        List s;
        s = this.b.s();
        C0724d.s(s);
    }

    @Override // com.facebook.imagepipeline.producers.C0725e, com.facebook.imagepipeline.producers.W
    public void d() {
        List r;
        r = this.b.r();
        C0724d.r(r);
    }
}
