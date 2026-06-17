package androidx.core.util;

import android.util.LruCache;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.b.p;
import kotlin.s.b.r;

/* loaded from: classes.dex */
public final class LruCacheKt {
    public static final <K, V> LruCache<K, V> lruCache(int i, p<? super K, ? super V, Integer> pVar, l<? super K, ? extends V> lVar, r<? super Boolean, ? super K, ? super V, ? super V, o> rVar) {
        kotlin.s.c.l.f(pVar, "sizeOf");
        kotlin.s.c.l.f(lVar, "create");
        kotlin.s.c.l.f(rVar, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i, pVar, lVar, rVar);
    }

    public static /* synthetic */ LruCache lruCache$default(int i, p pVar, l lVar, r rVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            pVar = LruCacheKt$lruCache$1.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            lVar = LruCacheKt$lruCache$2.INSTANCE;
        }
        if ((i2 & 8) != 0) {
            rVar = LruCacheKt$lruCache$3.INSTANCE;
        }
        kotlin.s.c.l.f(pVar, "sizeOf");
        kotlin.s.c.l.f(lVar, "create");
        kotlin.s.c.l.f(rVar, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(i, pVar, lVar, rVar);
    }
}
