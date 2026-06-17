package com.ss.ugc.effectplatform.h;

import com.ss.android.socialbase.downloader.constants.DBDefinition;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a {
    private final d.a.a.b<String, b<?>> a = new d.a.a.b<>(true);

    public final <T> b<T> a(String str) {
        l.g(str, DBDefinition.TASK_ID);
        Object obj = this.a.get(str);
        if (!(obj instanceof b)) {
            obj = null;
        }
        b<T> bVar = (b) obj;
        if (bVar != null) {
            return bVar;
        }
        return null;
    }
}
