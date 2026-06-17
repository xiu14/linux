package com.ss.ugc.effectplatform.task;

import java.util.Iterator;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class g {
    private final d.a.a.b<String, d.a.d.a> a = new d.a.a.b<>(false, 1);
    private final d.a.a.b<String, d.a.d.b> b = new d.a.a.b<>(true);

    /* renamed from: c, reason: collision with root package name */
    private d.a.b.c.b f8518c;

    public static final class a {
        private d.a.b.c.b a;
        private int b = 5;

        public final g a() {
            d.a.c.b bVar = d.a.c.b.b;
            StringBuilder M = e.a.a.a.a.M("[初始化][TaskManager][最大并发任务数:");
            M.append(this.b);
            M.append(']');
            bVar.a("JKL", M.toString());
            int i = this.b;
            d.a.b.c.b bVar2 = this.a;
            if (bVar2 == null) {
                bVar2 = new d.a.b.c.a();
            }
            return new g(false, i, bVar2, null);
        }

        public final a b(int i) {
            this.b = i;
            return this;
        }

        public final a c(d.a.b.c.b bVar) {
            l.g(bVar, "executor");
            this.a = bVar;
            return this;
        }
    }

    public static final class b implements Runnable {
        final /* synthetic */ d.a.d.b b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f8519c;

        b(d.a.d.b bVar, String str) {
            this.b = bVar;
            this.f8519c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.a.c.b bVar = d.a.c.b.b;
            StringBuilder M = e.a.a.a.a.M("[TaskManager][旧接口][开始][");
            M.append(this.b.getId());
            M.append("][");
            M.append(this.f8519c);
            M.append(']');
            bVar.a("JKL", M.toString());
            g.this.b.put(this.b.getId(), this.b);
            this.b.run();
            g.this.b.remove(this.b.getId());
            bVar.a("JKL", "[TaskManager][旧接口][结束][" + this.b.getId() + "][" + this.f8519c + ']');
        }
    }

    public g(boolean z, int i, d.a.b.c.b bVar, kotlin.s.c.g gVar) {
        this.f8518c = bVar;
        new d.a.a.c();
        new d.a.a.c();
        new d.a.b.d.e();
        new d.a.b.d.b(0);
        new d.a.a.b(true);
    }

    public final void b(d.a.d.b bVar) {
        l.g(bVar, "task");
        Iterator<T> it2 = this.a.values().iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (((d.a.d.a) it2.next()).a(bVar)) {
                z = true;
            }
        }
        if (bVar instanceof com.ss.ugc.effectplatform.task.b) {
        }
        String a2 = bVar.a();
        if (z) {
            return;
        }
        this.f8518c.execute(new b(bVar, a2));
    }
}
