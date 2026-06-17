package androidx.core.util;

import android.util.LruCache;
import com.ss.android.message.log.PushLog;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.b.p;
import kotlin.s.b.r;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
public final class LruCacheKt$lruCache$4<K, V> extends LruCache<K, V> {
    final /* synthetic */ l<K, V> $create;
    final /* synthetic */ r<Boolean, K, V, V, o> $onEntryRemoved;
    final /* synthetic */ p<K, V, Integer> $sizeOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LruCacheKt$lruCache$4(int i, p<? super K, ? super V, Integer> pVar, l<? super K, ? extends V> lVar, r<? super Boolean, ? super K, ? super V, ? super V, o> rVar) {
        super(i);
        this.$sizeOf = pVar;
        this.$create = lVar;
        this.$onEntryRemoved = rVar;
    }

    @Override // android.util.LruCache
    protected V create(K k) {
        kotlin.s.c.l.f(k, "key");
        return this.$create.invoke(k);
    }

    @Override // android.util.LruCache
    protected void entryRemoved(boolean z, K k, V v, V v2) {
        kotlin.s.c.l.f(k, "key");
        kotlin.s.c.l.f(v, "oldValue");
        this.$onEntryRemoved.invoke(Boolean.valueOf(z), k, v, v2);
    }

    @Override // android.util.LruCache
    protected int sizeOf(K k, V v) {
        kotlin.s.c.l.f(k, "key");
        kotlin.s.c.l.f(v, PushLog.KEY_VALUE);
        return this.$sizeOf.invoke(k, v).intValue();
    }
}
