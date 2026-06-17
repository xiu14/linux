package kotlin.w;

import kotlin.collections.o;

/* loaded from: classes2.dex */
public class b implements Iterable<Integer>, kotlin.s.c.E.a {
    private final int a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10136c;

    public b(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.a = i;
        this.b = kotlin.internal.c.a(i, i2, i3);
        this.f10136c = i3;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.f10136c;
    }

    @Override // java.lang.Iterable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public o iterator() {
        return new c(this.a, this.b, this.f10136c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            if (!isEmpty() || !((b) obj).isEmpty()) {
                b bVar = (b) obj;
                if (this.a != bVar.a || this.b != bVar.b || this.f10136c != bVar.f10136c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.f10136c;
    }

    public boolean isEmpty() {
        if (this.f10136c > 0) {
            if (this.a > this.b) {
                return true;
            }
        } else if (this.a < this.b) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f10136c > 0) {
            sb = new StringBuilder();
            sb.append(this.a);
            sb.append("..");
            sb.append(this.b);
            sb.append(" step ");
            i = this.f10136c;
        } else {
            sb = new StringBuilder();
            sb.append(this.a);
            sb.append(" downTo ");
            sb.append(this.b);
            sb.append(" step ");
            i = -this.f10136c;
        }
        sb.append(i);
        return sb.toString();
    }
}
