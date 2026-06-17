package e.c.c.g;

import e.c.c.d.h;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class e<T> {

    /* renamed from: d, reason: collision with root package name */
    private static final Map<Object, Integer> f9759d = new IdentityHashMap();
    private T a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private final d<T> f9760c;

    public static class a extends RuntimeException {
        public a() {
            super("Null shared reference");
        }
    }

    public e(T t, d<T> dVar) {
        Objects.requireNonNull(t);
        this.a = t;
        Objects.requireNonNull(dVar);
        this.f9760c = dVar;
        this.b = 1;
        int i = e.c.c.g.a.h;
        Map<Object, Integer> map = f9759d;
        synchronized (map) {
            Integer num = map.get(t);
            if (num == null) {
                map.put(t, 1);
            } else {
                map.put(t, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    private void c() {
        boolean z;
        synchronized (this) {
            z = this.b > 0;
        }
        if (!(z)) {
            throw new a();
        }
    }

    public synchronized void a() {
        c();
        this.b++;
    }

    public void b() {
        int i;
        T t;
        synchronized (this) {
            c();
            h.a(this.b > 0);
            i = this.b - 1;
            this.b = i;
        }
        if (i == 0) {
            synchronized (this) {
                t = this.a;
                this.a = null;
            }
            this.f9760c.release(t);
            Map<Object, Integer> map = f9759d;
            synchronized (map) {
                Integer num = map.get(t);
                if (num == null) {
                    e.c.c.e.a.z("SharedReference", "No entry in sLiveObjects for value of type %s", t.getClass());
                } else if (num.intValue() == 1) {
                    map.remove(t);
                } else {
                    map.put(t, Integer.valueOf(num.intValue() - 1));
                }
            }
        }
    }

    public synchronized T d() {
        return this.a;
    }
}
