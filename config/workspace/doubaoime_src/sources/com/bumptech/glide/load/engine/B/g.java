package com.bumptech.glide.load.engine.B;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.B.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class g<K extends l, V> {
    private final a<K, V> a = new a<>(null);
    private final Map<K, a<K, V>> b = new HashMap();

    private static class a<K, V> {
        final K a;
        private List<V> b;

        /* renamed from: c, reason: collision with root package name */
        a<K, V> f1587c;

        /* renamed from: d, reason: collision with root package name */
        a<K, V> f1588d;

        a() {
            this(null);
        }

        public void a(V v) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            this.b.add(v);
        }

        @Nullable
        public V b() {
            List<V> list = this.b;
            int size = list != null ? list.size() : 0;
            if (size > 0) {
                return this.b.remove(size - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        a(K k) {
            this.f1588d = this;
            this.f1587c = this;
            this.a = k;
        }
    }

    g() {
    }

    @Nullable
    public V a(K k) {
        a<K, V> aVar = this.b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            this.b.put(k, aVar);
        } else {
            k.a();
        }
        a<K, V> aVar2 = aVar.f1588d;
        aVar2.f1587c = aVar.f1587c;
        aVar.f1587c.f1588d = aVar2;
        a<K, V> aVar3 = this.a;
        aVar.f1588d = aVar3;
        a<K, V> aVar4 = aVar3.f1587c;
        aVar.f1587c = aVar4;
        aVar4.f1588d = aVar;
        aVar.f1588d.f1587c = aVar;
        return aVar.b();
    }

    public void b(K k, V v) {
        a<K, V> aVar = this.b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            a<K, V> aVar2 = aVar.f1588d;
            aVar2.f1587c = aVar.f1587c;
            aVar.f1587c.f1588d = aVar2;
            a<K, V> aVar3 = this.a;
            aVar.f1588d = aVar3.f1588d;
            aVar.f1587c = aVar3;
            aVar3.f1588d = aVar;
            aVar.f1588d.f1587c = aVar;
            this.b.put(k, aVar);
        } else {
            k.a();
        }
        aVar.a(v);
    }

    @Nullable
    public V c() {
        for (a aVar = this.a.f1588d; !aVar.equals(this.a); aVar = aVar.f1588d) {
            V v = (V) aVar.b();
            if (v != null) {
                return v;
            }
            a<K, V> aVar2 = aVar.f1588d;
            aVar2.f1587c = aVar.f1587c;
            aVar.f1587c.f1588d = aVar2;
            this.b.remove(aVar.a);
            ((l) aVar.a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (a aVar = this.a.f1587c; !aVar.equals(this.a); aVar = aVar.f1587c) {
            z = true;
            sb.append('{');
            sb.append(aVar.a);
            sb.append(':');
            sb.append(aVar.c());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
