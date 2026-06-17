package kotlin.x;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class c<T> implements e<T> {
    private final e<T> a;
    private final boolean b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.s.b.l<T, Boolean> f10144c;

    public static final class a implements Iterator<T>, kotlin.s.c.E.a {
        private final Iterator<T> a;
        private int b = -1;

        /* renamed from: c, reason: collision with root package name */
        private T f10145c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c<T> f10146d;

        a(c<T> cVar) {
            this.f10146d = cVar;
            this.a = ((c) cVar).a.iterator();
        }

        private final void a() {
            while (this.a.hasNext()) {
                T next = this.a.next();
                if (((Boolean) ((c) this.f10146d).f10144c.invoke(next)).booleanValue() == ((c) this.f10146d).b) {
                    this.f10145c = next;
                    this.b = 1;
                    return;
                }
            }
            this.b = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b == -1) {
                a();
            }
            return this.b == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.b == -1) {
                a();
            }
            if (this.b == 0) {
                throw new NoSuchElementException();
            }
            T t = this.f10145c;
            this.f10145c = null;
            this.b = -1;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(e<? extends T> eVar, boolean z, kotlin.s.b.l<? super T, Boolean> lVar) {
        kotlin.s.c.l.f(eVar, "sequence");
        kotlin.s.c.l.f(lVar, "predicate");
        this.a = eVar;
        this.b = z;
        this.f10144c = lVar;
    }

    @Override // kotlin.x.e
    public Iterator<T> iterator() {
        return new a(this);
    }
}
