package e.b.b.n.f;

import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class a<T> {
    private final int a;
    private ConcurrentLinkedQueue<T> b = new ConcurrentLinkedQueue<>();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0429a<T> f9495c;

    /* renamed from: e.b.b.n.f.a$a, reason: collision with other inner class name */
    public interface InterfaceC0429a<T> {
        void a(T t);
    }

    public a(int i) {
        this.a = i;
    }

    public boolean a() {
        return this.b.isEmpty();
    }

    public T b() {
        return this.b.poll();
    }

    public void c(T t) {
        this.b.add(t);
        if (this.b.size() > this.a) {
            T poll = this.b.poll();
            InterfaceC0429a<T> interfaceC0429a = this.f9495c;
            if (interfaceC0429a != null) {
                interfaceC0429a.a(poll);
            }
        }
    }

    public void d(InterfaceC0429a<T> interfaceC0429a) {
        this.f9495c = interfaceC0429a;
    }
}
