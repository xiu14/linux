package com.bytedance.apm.E;

import java.util.LinkedList;

/* loaded from: classes.dex */
public class a<T> {
    private LinkedList<T> a = new LinkedList<>();
    private int b;

    public a(int i) {
        this.b = i;
    }

    public void a(T t) {
        if (this.a.size() > this.b) {
            this.a.removeFirst();
        }
        this.a.addLast(t);
    }

    public LinkedList<T> b() {
        return this.a;
    }
}
