package com.bumptech.glide;

import androidx.tracing.Trace;
import com.bumptech.glide.util.e;
import java.util.List;

/* loaded from: classes.dex */
class h implements e.b<g> {
    private boolean a;
    final /* synthetic */ c b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f1553c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.bumptech.glide.o.a f1554d;

    h(c cVar, List list, com.bumptech.glide.o.a aVar) {
        this.b = cVar;
        this.f1553c = list;
        this.f1554d = aVar;
    }

    @Override // com.bumptech.glide.util.e.b
    public g get() {
        if (this.a) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection("Glide registry");
        this.a = true;
        try {
            return i.a(this.b, this.f1553c, this.f1554d);
        } finally {
            this.a = false;
            Trace.endSection();
        }
    }
}
