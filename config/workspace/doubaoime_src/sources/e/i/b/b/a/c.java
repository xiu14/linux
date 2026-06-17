package e.i.b.b.a;

import android.view.View;
import e.i.b.b.b.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.g;
import kotlin.o;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class c<T extends View> {
    private final List<e.d.a.a.a> a;
    private final Map<e.i.b.b.b.c<? super T>, e.i.b.b.b.d> b;

    /* renamed from: c, reason: collision with root package name */
    private float f9976c;

    /* renamed from: d, reason: collision with root package name */
    private float f9977d;

    /* renamed from: e, reason: collision with root package name */
    private a<T> f9978e;

    /* renamed from: f, reason: collision with root package name */
    private b.k f9979f;

    /* renamed from: g, reason: collision with root package name */
    private final T f9980g;

    public interface a<T extends View> {
        void a(c<T> cVar);

        void b(c<T> cVar);
    }

    public c(T t) {
        l.f(t, "view");
        this.f9980g = t;
        this.a = new ArrayList();
        this.b = new LinkedHashMap();
        this.f9976c = 0.5f;
        this.f9977d = 1500.0f;
    }

    public static c e(c cVar, kotlin.s.b.l lVar, kotlin.s.b.l lVar2, kotlin.s.b.l lVar3, int i) {
        if ((i & 1) != 0) {
            lVar = e.i.b.b.a.a.b;
        }
        e.i.b.b.a.a aVar = (i & 2) != 0 ? e.i.b.b.a.a.f9969c : null;
        if ((i & 4) != 0) {
            lVar3 = e.i.b.b.a.a.f9970d;
        }
        l.f(lVar, "onStart");
        l.f(aVar, "onCancel");
        l.f(lVar3, "onEnd");
        cVar.f9978e = new f(lVar, aVar, lVar3);
        return cVar;
    }

    public final void f(b.k kVar) {
        l.f(kVar, "listener");
        this.f9979f = kVar;
    }

    public final void g() {
        this.a.clear();
        List e0 = g.e0(this.b.values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : e0) {
            if (((e.i.b.b.b.d) obj).n()) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((e.i.b.b.b.d) it2.next()).q();
        }
    }

    public final c<T> h() {
        if (!this.a.isEmpty()) {
            List e0 = g.e0(this.a);
            this.a.clear();
            a<T> aVar = this.f9978e;
            if (aVar != null) {
                aVar.b(this);
            }
            Iterator it2 = e0.iterator();
            while (it2.hasNext()) {
                ((e.d.a.a.a) it2.next()).a();
            }
        }
        return this;
    }

    public final c<T> i(float f2, kotlin.s.b.l<? super b, o> lVar) {
        l.f(lVar, "config");
        b.l lVar2 = e.i.b.b.b.b.m;
        l.e(lVar2, "DynamicAnimation.TRANSLATION_Y");
        l.f(lVar2, "property");
        l.f(lVar, "config");
        e.i.b.b.b.d dVar = this.b.get(lVar2);
        if (dVar == null) {
            dVar = new e.i.b.b.b.d(this.f9980g, lVar2);
            e eVar = new e(this);
            dVar.b(eVar);
            dVar.a(new d(this, lVar2, eVar));
            this.b.put(lVar2, dVar);
        }
        b bVar = new b(f2);
        lVar.invoke(bVar);
        bVar.c(this.f9976c);
        bVar.d(this.f9977d);
        this.a.add(new e.d.a.a.a(dVar, bVar));
        return this;
    }
}
