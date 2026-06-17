package kotlin.r;

import java.io.Serializable;
import java.util.Objects;
import kotlin.r.f;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
public final class c implements f, Serializable {
    private final f a;
    private final f.b b;

    static final class a extends m implements p<String, f.b, String> {
        public static final a a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.s.b.p
        public String invoke(String str, f.b bVar) {
            String str2 = str;
            f.b bVar2 = bVar;
            l.f(str2, "acc");
            l.f(bVar2, "element");
            if (str2.length() == 0) {
                return bVar2.toString();
            }
            return str2 + ", " + bVar2;
        }
    }

    public c(f fVar, f.b bVar) {
        l.f(fVar, "left");
        l.f(bVar, "element");
        this.a = fVar;
        this.b = bVar;
    }

    private final int b() {
        int i = 2;
        c cVar = this;
        while (true) {
            f fVar = cVar.a;
            cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar == null) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (cVar.b() != b()) {
                return false;
            }
            Objects.requireNonNull(cVar);
            c cVar2 = this;
            while (true) {
                f.b bVar = cVar2.b;
                if (!l.a(cVar.get(bVar.getKey()), bVar)) {
                    z = false;
                    break;
                }
                f fVar = cVar2.a;
                if (!(fVar instanceof c)) {
                    l.d(fVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    f.b bVar2 = (f.b) fVar;
                    z = l.a(cVar.get(bVar2.getKey()), bVar2);
                    break;
                }
                cVar2 = (c) fVar;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.r.f
    public <R> R fold(R r, p<? super R, ? super f.b, ? extends R> pVar) {
        l.f(pVar, "operation");
        return pVar.invoke((Object) this.a.fold(r, pVar), this.b);
    }

    @Override // kotlin.r.f
    public <E extends f.b> E get(f.c<E> cVar) {
        l.f(cVar, "key");
        c cVar2 = this;
        while (true) {
            E e2 = (E) cVar2.b.get(cVar);
            if (e2 != null) {
                return e2;
            }
            f fVar = cVar2.a;
            if (!(fVar instanceof c)) {
                return (E) fVar.get(cVar);
            }
            cVar2 = (c) fVar;
        }
    }

    public int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    @Override // kotlin.r.f
    public f minusKey(f.c<?> cVar) {
        l.f(cVar, "key");
        if (this.b.get(cVar) != null) {
            return this.a;
        }
        f minusKey = this.a.minusKey(cVar);
        return minusKey == this.a ? this : minusKey == g.a ? this.b : new c(minusKey, this.b);
    }

    @Override // kotlin.r.f
    public f plus(f fVar) {
        l.f(fVar, "context");
        return fVar == g.a ? this : (f) fVar.fold(this, f.a.C0472a.a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        return e.a.a.a.a.G(sb, (String) fold("", a.a), ']');
    }
}
