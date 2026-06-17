package androidx.lifecycle.viewmodel;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public abstract class CreationExtras {
    private final Map<Key<?>, Object> map = new LinkedHashMap();

    public static final class Empty extends CreationExtras {
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        @Override // androidx.lifecycle.viewmodel.CreationExtras
        public <T> T get(Key<T> key) {
            l.f(key, "key");
            return null;
        }
    }

    public interface Key<T> {
    }

    public abstract <T> T get(Key<T> key);

    public final Map<Key<?>, Object> getMap$lifecycle_viewmodel_release() {
        return this.map;
    }
}
