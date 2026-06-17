package com.bumptech.glide.load.j;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public class n<A, B> {
    private final com.bumptech.glide.util.g<b<A>, B> a;

    class a extends com.bumptech.glide.util.g<b<A>, B> {
        a(n nVar, long j) {
            super(j);
        }

        @Override // com.bumptech.glide.util.g
        protected void h(@NonNull Object obj, @Nullable Object obj2) {
            ((b) obj).b();
        }
    }

    @VisibleForTesting
    static final class b<A> {

        /* renamed from: d, reason: collision with root package name */
        private static final Queue<b<?>> f1713d;
        private int a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private A f1714c;

        static {
            int i = com.bumptech.glide.util.j.f1862d;
            f1713d = new ArrayDeque(0);
        }

        private b() {
        }

        static <A> b<A> a(A a, int i, int i2) {
            b<A> bVar;
            Queue<b<?>> queue = f1713d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            ((b) bVar).f1714c = a;
            ((b) bVar).b = i;
            ((b) bVar).a = i2;
            return bVar;
        }

        public void b() {
            Queue<b<?>> queue = f1713d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.a == bVar.a && this.f1714c.equals(bVar.f1714c);
        }

        public int hashCode() {
            return this.f1714c.hashCode() + (((this.a * 31) + this.b) * 31);
        }
    }

    public n(long j) {
        this.a = new a(this, j);
    }

    @Nullable
    public B a(A a2, int i, int i2) {
        b<A> a3 = b.a(a2, i, i2);
        B e2 = this.a.e(a3);
        a3.b();
        return e2;
    }

    public void b(A a2, int i, int i2, B b2) {
        this.a.i(b.a(a2, i, i2), b2);
    }
}
