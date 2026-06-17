package com.ttnet.org.chromium.base;

import com.ttnet.org.chromium.base.ThreadUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes2.dex */
public class g<E> implements Iterable<E> {

    /* renamed from: c, reason: collision with root package name */
    private int f8568c;

    /* renamed from: d, reason: collision with root package name */
    private int f8569d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8570e;
    public final List<E> a = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private boolean f8571f = true;
    private final ThreadUtils.a b = new ThreadUtils.a();

    private class b implements Object<E> {
        private int a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8572c;

        b(a aVar) {
            g.a(g.this);
            this.a = g.this.a.size();
        }

        public boolean hasNext() {
            if (g.this.f8571f) {
                Objects.requireNonNull(g.this.b);
            }
            int i = this.b;
            while (i < this.a && g.d(g.this, i) == null) {
                i++;
            }
            if (i < this.a) {
                return true;
            }
            if (this.f8572c) {
                return false;
            }
            this.f8572c = true;
            g.e(g.this);
            return false;
        }

        public E next() {
            if (g.this.f8571f) {
                Objects.requireNonNull(g.this.b);
            }
            while (true) {
                int i = this.b;
                if (i >= this.a || g.d(g.this, i) != null) {
                    break;
                }
                this.b++;
            }
            int i2 = this.b;
            if (i2 < this.a) {
                g gVar = g.this;
                this.b = i2 + 1;
                return (E) g.d(gVar, i2);
            }
            if (!this.f8572c) {
                this.f8572c = true;
                g.e(g.this);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    static void a(g gVar) {
        gVar.f8568c++;
    }

    static Object d(g gVar, int i) {
        return gVar.a.get(i);
    }

    static void e(g gVar) {
        int i = gVar.f8568c - 1;
        gVar.f8568c = i;
        if (i > 0 || !gVar.f8570e) {
            return;
        }
        gVar.f8570e = false;
        int size = gVar.a.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (gVar.a.get(size) == null) {
                gVar.a.remove(size);
            }
        }
    }

    public boolean f(E e2) {
        if (this.f8571f) {
            Objects.requireNonNull(this.b);
        }
        if (e2 == null || this.a.contains(e2)) {
            return false;
        }
        this.a.add(e2);
        this.f8569d++;
        return true;
    }

    public void g() {
        this.f8571f = false;
    }

    public boolean h(E e2) {
        int indexOf;
        if (this.f8571f) {
            Objects.requireNonNull(this.b);
        }
        if (e2 == null || (indexOf = this.a.indexOf(e2)) == -1) {
            return false;
        }
        if (this.f8568c == 0) {
            this.a.remove(indexOf);
        } else {
            this.f8570e = true;
            this.a.set(indexOf, null);
        }
        this.f8569d--;
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        if (this.f8571f) {
            Objects.requireNonNull(this.b);
        }
        return new b(null);
    }
}
