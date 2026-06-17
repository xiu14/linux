package com.bytedance.feedbackerlib.model.j;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class c {
    public final long a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4954c;

    public c(long j, String str, int i, c cVar, List<c> list) {
        this.a = j;
        this.b = str;
        this.f4954c = i;
    }

    public static c a(@Nullable c cVar, @NonNull com.bytedance.feedbackerlib.model.i.a aVar) {
        ArrayList arrayList = new ArrayList();
        c cVar2 = new c(aVar.a, aVar.b, aVar.f4953d, cVar, arrayList);
        List<com.bytedance.feedbackerlib.model.i.a> list = aVar.f4952c;
        if (list != null) {
            Iterator<com.bytedance.feedbackerlib.model.i.a> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(a(cVar2, it2.next()));
            }
        }
        return cVar2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.b.equals(((c) obj).b);
    }

    public int hashCode() {
        return e.a.a.a.a.p0(this.b, 217, 31) + this.f4954c;
    }
}
