package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import com.facebook.infer.annotation.ThreadSafe;
import java.util.LinkedList;

@ThreadSafe
/* loaded from: classes2.dex */
public class h<T> {
    protected final SparseArray<b<T>> a = new SparseArray<>();
    b<T> b;

    /* renamed from: c, reason: collision with root package name */
    b<T> f6504c;

    static class b<I> {
        int b;

        /* renamed from: c, reason: collision with root package name */
        LinkedList<I> f6505c;
        b<I> a = null;

        /* renamed from: d, reason: collision with root package name */
        b<I> f6506d = null;

        b(b bVar, int i, LinkedList linkedList, b bVar2, a aVar) {
            this.b = i;
            this.f6505c = linkedList;
        }

        public String toString() {
            return e.a.a.a.a.D(e.a.a.a.a.M("LinkedEntry(key: "), this.b, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b(b<T> bVar) {
        if (this.b == bVar) {
            return;
        }
        c(bVar);
        b<T> bVar2 = this.b;
        if (bVar2 == 0) {
            this.b = bVar;
            this.f6504c = bVar;
        } else {
            bVar.f6506d = bVar2;
            bVar2.a = bVar;
            this.b = bVar;
        }
    }

    private synchronized void c(b<T> bVar) {
        b bVar2 = (b<T>) bVar.a;
        b bVar3 = (b<T>) bVar.f6506d;
        if (bVar2 != null) {
            bVar2.f6506d = bVar3;
        }
        if (bVar3 != null) {
            bVar3.a = bVar2;
        }
        bVar.a = null;
        bVar.f6506d = null;
        if (bVar == this.b) {
            this.b = bVar3;
        }
        if (bVar == this.f6504c) {
            this.f6504c = bVar2;
        }
    }

    public synchronized T a(int i) {
        b<T> bVar = this.a.get(i);
        if (bVar == null) {
            return null;
        }
        T pollFirst = bVar.f6505c.pollFirst();
        b(bVar);
        return pollFirst;
    }

    public synchronized void d(int i, T t) {
        b<T> bVar = this.a.get(i);
        if (bVar == null) {
            bVar = new b<>(null, i, new LinkedList(), null, null);
            this.a.put(i, bVar);
        }
        bVar.f6505c.addLast(t);
        b(bVar);
    }

    public synchronized T e() {
        b<T> bVar = this.f6504c;
        if (bVar == null) {
            return null;
        }
        T pollLast = bVar.f6505c.pollLast();
        if (bVar.f6505c.isEmpty()) {
            c(bVar);
            this.a.remove(bVar.b);
        }
        return pollLast;
    }
}
