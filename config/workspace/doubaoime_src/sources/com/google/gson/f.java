package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class f extends i implements Iterable<i> {
    private final ArrayList<i> a = new ArrayList<>();

    @Override // com.google.gson.i
    public String c() {
        int size = this.a.size();
        if (size == 1) {
            return this.a.get(0).c();
        }
        throw new IllegalStateException(e.a.a.a.a.j("Array must have size 1, but has size ", size));
    }

    public void d(i iVar) {
        if (iVar == null) {
            iVar = k.a;
        }
        this.a.add(iVar);
    }

    public void e(Number number) {
        this.a.add(number == null ? k.a : new o(number));
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof f) && ((f) obj).a.equals(this.a));
    }

    public void f(String str) {
        this.a.add(str == null ? k.a : new o(str));
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<i> iterator() {
        return this.a.iterator();
    }

    public int size() {
        return this.a.size();
    }
}
