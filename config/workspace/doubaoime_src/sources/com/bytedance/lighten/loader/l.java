package com.bytedance.lighten.loader;

import android.util.Log;
import com.facebook.common.memory.MemoryTrimType;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class l implements com.facebook.common.memory.c {
    private CopyOnWriteArraySet<com.facebook.common.memory.b> a = new CopyOnWriteArraySet<>();

    /* JADX INFO: Access modifiers changed from: private */
    static class b {
        private static l a = new l(null);
    }

    l(a aVar) {
    }

    @Override // com.facebook.common.memory.c
    public void a(com.facebook.common.memory.b bVar) {
        this.a.add(bVar);
    }

    public void b(MemoryTrimType memoryTrimType) {
        Log.d("Lighten:", "trimMemory: trimType=" + memoryTrimType + ", memoryTrimmableSet.size=" + this.a.size());
        try {
            Iterator<com.facebook.common.memory.b> it2 = this.a.iterator();
            while (it2.hasNext()) {
                it2.next().a(memoryTrimType);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
