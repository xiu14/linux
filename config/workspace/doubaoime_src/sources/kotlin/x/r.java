package kotlin.x;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class r<T, R> implements e<R> {
    private final e<T> a;
    private final kotlin.s.b.l<T, R> b;

    public static final class a implements Iterator<R>, kotlin.s.c.E.a {
        private final Iterator<T> a;
        final /* synthetic */ r<T, R> b;

        a(r<T, R> rVar) {
            this.b = rVar;
            this.a = ((r) rVar).a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((r) this.b).b.invoke(this.a.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(e<? extends T> eVar, kotlin.s.b.l<? super T, ? extends R> lVar) {
        kotlin.s.c.l.f(eVar, "sequence");
        kotlin.s.c.l.f(lVar, "transformer");
        this.a = eVar;
        this.b = lVar;
    }

    @Override // kotlin.x.e
    public Iterator<R> iterator() {
        return new a(this);
    }
}
