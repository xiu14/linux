package okhttp3.F.e;

import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.E;

/* loaded from: classes2.dex */
public final class d {
    private final Set<E> a = new LinkedHashSet();

    public synchronized void a(E e2) {
        this.a.remove(e2);
    }

    public synchronized void b(E e2) {
        this.a.add(e2);
    }

    public synchronized boolean c(E e2) {
        return this.a.contains(e2);
    }
}
