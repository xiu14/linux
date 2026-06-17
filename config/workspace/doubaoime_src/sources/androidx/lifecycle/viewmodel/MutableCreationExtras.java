package androidx.lifecycle.viewmodel;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.s.c.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class MutableCreationExtras extends CreationExtras {
    /* JADX WARN: Multi-variable type inference failed */
    public MutableCreationExtras() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public MutableCreationExtras(CreationExtras creationExtras) {
        l.f(creationExtras, "initialExtras");
        getMap$lifecycle_viewmodel_release().putAll(creationExtras.getMap$lifecycle_viewmodel_release());
    }

    @Override // androidx.lifecycle.viewmodel.CreationExtras
    public <T> T get(CreationExtras.Key<T> key) {
        l.f(key, "key");
        return (T) getMap$lifecycle_viewmodel_release().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void set(CreationExtras.Key<T> key, T t) {
        l.f(key, "key");
        getMap$lifecycle_viewmodel_release().put(key, t);
    }

    public /* synthetic */ MutableCreationExtras(CreationExtras creationExtras, int i, g gVar) {
        this((i & 1) != 0 ? CreationExtras.Empty.INSTANCE : creationExtras);
    }
}
