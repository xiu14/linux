package androidx.core.util;

import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
public final class LruCacheKt$lruCache$1<K, V> extends m implements p<K, V, Integer> {
    public static final LruCacheKt$lruCache$1 INSTANCE = new LruCacheKt$lruCache$1();

    public LruCacheKt$lruCache$1() {
        super(2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.s.b.p
    public final Integer invoke(K k, V v) {
        l.f(k, "<anonymous parameter 0>");
        l.f(v, "<anonymous parameter 1>");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.s.b.p
    public /* bridge */ /* synthetic */ Integer invoke(Object obj, Object obj2) {
        return invoke((LruCacheKt$lruCache$1<K, V>) obj, obj2);
    }
}
