package com.ttnet.org.chromium.base.task;

import J.N;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: g, reason: collision with root package name */
    private static final ReferenceQueue<Object> f8588g = new ReferenceQueue<>();
    private static final Set<a> h = new HashSet();
    private final f a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private volatile long f8589c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f8590d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private LinkedList<Runnable> f8591e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private List<Pair<Runnable, Long>> f8592f;

    private static class a extends WeakReference<e> {
        final long a;

        a(e eVar) {
            super(eVar, e.f8588g);
            this.a = eVar.f8589c;
        }
    }

    private static void c() {
        while (true) {
            a aVar = (a) f8588g.poll();
            if (aVar == null) {
                return;
            }
            N.Mvd960xb(aVar.a);
            Set<a> set = h;
            synchronized (set) {
                set.remove(aVar);
            }
        }
    }

    void d() {
        int i = this.b;
        f fVar = this.a;
        long MLtH82Um = N.MLtH82Um(i, fVar.a, fVar.b, fVar.f8593c, fVar.f8594d, fVar.f8595e);
        synchronized (this.f8590d) {
            LinkedList<Runnable> linkedList = this.f8591e;
            if (linkedList != null) {
                Iterator<Runnable> it2 = linkedList.iterator();
                while (it2.hasNext()) {
                    Runnable next = it2.next();
                    N.MJ_h_2p2(MLtH82Um, next, 0L, next.getClass().getName());
                }
                this.f8591e = null;
            }
            List<Pair<Runnable, Long>> list = this.f8592f;
            if (list != null) {
                for (Pair<Runnable, Long> pair : list) {
                    N.MJ_h_2p2(MLtH82Um, (Runnable) pair.first, ((Long) pair.second).longValue(), pair.getClass().getName());
                }
                this.f8592f = null;
            }
            this.f8589c = MLtH82Um;
        }
        Set<a> set = h;
        synchronized (set) {
            set.add(new a(this));
        }
        c();
    }
}
