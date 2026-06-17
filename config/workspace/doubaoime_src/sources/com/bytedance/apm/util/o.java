package com.bytedance.apm.util;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public class o<E extends Comparable> {
    private PriorityQueue<E> a;
    private int b;

    class a implements Comparator<E> {
        a(o oVar) {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    public o(int i) {
        if (i <= 0) {
            throw new IllegalStateException();
        }
        this.b = i;
        this.a = new PriorityQueue<>(i, new a(this));
    }

    public void a(E e2) {
        if (this.a.size() < this.b) {
            this.a.add(e2);
        } else if (e2.compareTo(this.a.peek()) > 0) {
            this.a.poll();
            this.a.add(e2);
        }
    }

    public void b() {
        this.a.clear();
    }

    public int c() {
        return this.a.size();
    }

    public List<E> d() {
        ArrayList arrayList = new ArrayList(this.a);
        Collections.sort(arrayList);
        return arrayList;
    }
}
