package com.bytedance.news.common.settings.f;

import androidx.annotation.NonNull;
import com.bytedance.news.common.settings.e.g;
import com.bytedance.news.common.settings.e.h;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a implements h {
    private static final ConcurrentHashMap<String, b> a = new ConcurrentHashMap<>();

    @Override // com.bytedance.news.common.settings.e.h
    public g a(@NonNull String str, boolean z) {
        return b(str, z, false);
    }

    @Override // com.bytedance.news.common.settings.e.h
    public g b(@NonNull String str, boolean z, boolean z2) {
        ConcurrentHashMap<String, b> concurrentHashMap = a;
        b bVar = concurrentHashMap.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(com.bytedance.news.common.settings.internal.a.a(), str, z, z2);
        concurrentHashMap.put(str, bVar2);
        return bVar2;
    }
}
