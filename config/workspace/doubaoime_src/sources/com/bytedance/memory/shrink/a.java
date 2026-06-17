package com.bytedance.memory.shrink;

/* loaded from: classes.dex */
public final class a {
    public final int a;
    public final c b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5396c;

    public a(int i, c cVar, Object obj) {
        this.a = i;
        this.b = cVar;
        this.f5396c = obj;
    }

    public boolean equals(Object obj) {
        Object obj2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a != aVar.a || !this.b.equals(aVar.b)) {
            return false;
        }
        Object obj3 = this.f5396c;
        return (obj3 == null || obj3.equals(aVar.f5396c)) && ((obj2 = aVar.f5396c) == null || obj2.equals(this.f5396c));
    }

    public int hashCode() {
        return (this.b.hashCode() << 31) + this.a;
    }
}
