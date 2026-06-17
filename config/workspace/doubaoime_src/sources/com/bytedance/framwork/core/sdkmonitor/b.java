package com.bytedance.framwork.core.sdkmonitor;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

/* loaded from: classes.dex */
public class b {
    private final LinkedList<i> a = new LinkedList<>();
    private final LinkedList<c> b = new LinkedList<>();

    /* renamed from: c, reason: collision with root package name */
    private final LinkedList<com.bytedance.framwork.core.sdkmonitor.a> f5257c = new LinkedList<>();

    /* renamed from: d, reason: collision with root package name */
    private int f5258d = 200;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5259e;

    class a implements Runnable {
        final /* synthetic */ f a;

        a(f fVar) {
            this.a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinkedList linkedList;
            LinkedList linkedList2;
            LinkedList linkedList3;
            try {
                synchronized (b.this.a) {
                    linkedList = new LinkedList(b.this.a);
                    b.this.a.clear();
                }
                Iterator it2 = linkedList.iterator();
                while (it2.hasNext()) {
                    i iVar = (i) it2.next();
                    b bVar = b.this;
                    f fVar = this.a;
                    Objects.requireNonNull(bVar);
                    if (iVar != null && !TextUtils.isEmpty(iVar.a)) {
                        fVar.Q(iVar.a, iVar.b, iVar.f5283c, iVar.f5284d, iVar.f5285e, iVar.f5286f, iVar.f5287g);
                    }
                }
                synchronized (b.this.b) {
                    linkedList2 = new LinkedList(b.this.b);
                    b.this.b.clear();
                }
                Iterator it3 = linkedList2.iterator();
                while (it3.hasNext()) {
                    c cVar = (c) it3.next();
                    b bVar2 = b.this;
                    f fVar2 = this.a;
                    Objects.requireNonNull(bVar2);
                    if (cVar != null) {
                        fVar2.N(null, null, 0L);
                    }
                }
                synchronized (b.this.f5257c) {
                    linkedList3 = new LinkedList(b.this.f5257c);
                    b.this.f5257c.clear();
                }
                Iterator it4 = linkedList3.iterator();
                while (it4.hasNext()) {
                    b.d(b.this, this.a, (com.bytedance.framwork.core.sdkmonitor.a) it4.next());
                }
            } catch (Throwable unused) {
            }
        }
    }

    static void d(b bVar, f fVar, com.bytedance.framwork.core.sdkmonitor.a aVar) {
        Objects.requireNonNull(bVar);
        if (aVar == null || TextUtils.isEmpty(aVar.a)) {
            return;
        }
        if (aVar.a.equals("api_error")) {
            fVar.M(aVar.b, aVar.f5252c, aVar.f5253d, aVar.f5254e, aVar.f5255f, aVar.f5256g, aVar.h);
        } else if (aVar.a.equals("api_all")) {
            fVar.P(aVar.b, aVar.f5252c, aVar.f5253d, aVar.f5254e, aVar.f5255f, aVar.f5256g, aVar.h);
        }
    }

    public void e(f fVar) {
        if (this.f5259e) {
            return;
        }
        this.f5259e = true;
        e.b.g.a.a.h.a.d().e(new a(fVar));
    }

    public void f(com.bytedance.framwork.core.sdkmonitor.a aVar) {
        synchronized (this.f5257c) {
            if (this.f5257c.size() > this.f5258d) {
                this.f5257c.poll();
            }
            this.f5257c.add(aVar);
        }
    }

    public void g(i iVar) {
        synchronized (this.a) {
            if (this.a.size() > this.f5258d) {
                this.a.poll();
            }
            this.a.add(iVar);
        }
    }
}
