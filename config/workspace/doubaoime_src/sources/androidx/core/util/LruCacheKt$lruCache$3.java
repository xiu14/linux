package androidx.core.util;

import kotlin.o;
import kotlin.s.b.r;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
public final class LruCacheKt$lruCache$3<K, V> extends m implements r<Boolean, K, V, V, o> {
    public static final LruCacheKt$lruCache$3 INSTANCE = new LruCacheKt$lruCache$3();

    public LruCacheKt$lruCache$3() {
        super(4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.s.b.r
    public /* bridge */ /* synthetic */ o invoke(Boolean bool, Object obj, Object obj2, Object obj3) {
        invoke(bool.booleanValue(), (boolean) obj, obj2, obj3);
        return o.a;
    }

    public final void invoke(boolean z, K k, V v, V v2) {
        l.f(k, "<anonymous parameter 1>");
        l.f(v, "<anonymous parameter 2>");
    }
}
