package e.b.g.a.b;

import android.content.Context;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    private static d f9536f;
    private final Context a;
    private final Map<String, a> b;

    /* renamed from: c, reason: collision with root package name */
    private final f f9537c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f9538d;

    /* renamed from: e, reason: collision with root package name */
    private final LinkedList<b> f9539e;

    private d(Context context) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f9538d = atomicBoolean;
        LinkedList<b> linkedList = new LinkedList<>();
        this.f9539e = linkedList;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new ConcurrentHashMap();
        f fVar = new f(applicationContext, this, linkedList, atomicBoolean);
        this.f9537c = fVar;
        fVar.start();
    }

    public static d c(Context context) {
        if (f9536f == null) {
            synchronized (d.class) {
                if (f9536f == null) {
                    f9536f = new d(context);
                }
            }
        }
        return f9536f;
    }

    boolean a(String str, byte[] bArr) {
        if (this.f9538d.get() || bArr == null || bArr.length <= 0 || this.b.get(str) == null) {
            return false;
        }
        synchronized (this.f9539e) {
            if (this.f9538d.get()) {
                return false;
            }
            if (this.f9539e.size() >= 2000) {
                this.f9539e.poll();
            }
            boolean add = this.f9539e.add(new b(str, bArr));
            this.f9537c.a();
            return add;
        }
    }

    Map<String, a> b() {
        return this.b;
    }

    a d(String str) {
        return this.b.get(str);
    }

    public void e(String str, a aVar) {
        if (this.f9538d.get()) {
            return;
        }
        this.b.put(str, aVar);
    }
}
