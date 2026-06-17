package kotlin.x;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d<T> implements e<T> {
    private final kotlin.s.b.a<T> a;
    private final kotlin.s.b.l<T, T> b;

    public static final class a implements Iterator<T>, kotlin.s.c.E.a {
        private T a;
        private int b = -2;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ d<T> f10147c;

        a(d<T> dVar) {
            this.f10147c = dVar;
        }

        private final void a() {
            T t;
            if (this.b == -2) {
                t = (T) ((d) this.f10147c).a.invoke();
            } else {
                kotlin.s.b.l lVar = ((d) this.f10147c).b;
                T t2 = this.a;
                kotlin.s.c.l.c(t2);
                t = (T) lVar.invoke(t2);
            }
            this.a = t;
            this.b = t == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b < 0) {
                a();
            }
            return this.b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.b < 0) {
                a();
            }
            if (this.b == 0) {
                throw new NoSuchElementException();
            }
            T t = this.a;
            kotlin.s.c.l.d(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.b = -1;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(kotlin.s.b.a<? extends T> aVar, kotlin.s.b.l<? super T, ? extends T> lVar) {
        kotlin.s.c.l.f(aVar, "getInitialValue");
        kotlin.s.c.l.f(lVar, "getNextValue");
        this.a = aVar;
        this.b = lVar;
    }

    @Override // kotlin.x.e
    public Iterator<T> iterator() {
        return new a(this);
    }
}
