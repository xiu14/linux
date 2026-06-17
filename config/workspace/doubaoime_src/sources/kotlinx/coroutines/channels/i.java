package kotlinx.coroutines.channels;

import kotlinx.coroutines.C0816m;
import kotlinx.coroutines.I;
import kotlinx.coroutines.N0.m;

/* loaded from: classes2.dex */
public final class i<E> extends v implements t<E> {

    /* renamed from: d, reason: collision with root package name */
    public final Throwable f10230d;

    public i(Throwable th) {
        this.f10230d = th;
    }

    @Override // kotlinx.coroutines.channels.v
    public void A(i<?> iVar) {
    }

    @Override // kotlinx.coroutines.channels.v
    public kotlinx.coroutines.N0.x B(m.b bVar) {
        return C0816m.a;
    }

    @Override // kotlinx.coroutines.channels.t
    public Object c() {
        return this;
    }

    @Override // kotlinx.coroutines.channels.t
    public void h(E e2) {
    }

    @Override // kotlinx.coroutines.channels.t
    public kotlinx.coroutines.N0.x i(E e2, m.b bVar) {
        return C0816m.a;
    }

    @Override // kotlinx.coroutines.N0.m
    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Closed@");
        M.append(I.b(this));
        M.append('[');
        M.append(this.f10230d);
        M.append(']');
        return M.toString();
    }

    @Override // kotlinx.coroutines.channels.v
    public void y() {
    }

    @Override // kotlinx.coroutines.channels.v
    public Object z() {
        return this;
    }
}
