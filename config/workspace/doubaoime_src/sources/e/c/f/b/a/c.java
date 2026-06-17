package e.c.f.b.a;

import android.util.Log;
import e.c.f.b.a.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class c<I> extends a<I> {
    private final List<b<I>> a = new ArrayList(2);

    private synchronized void f(String str, Throwable th) {
        Log.e("FwdControllerListener2", str, th);
    }

    @Override // e.c.f.b.a.b
    public void a(String str, Object obj, b.a aVar) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                b<I> bVar = this.a.get(i);
                if (bVar != null) {
                    bVar.a(str, obj, aVar);
                }
            } catch (Exception e2) {
                f("ForwardingControllerListener2 exception in onSubmit", e2);
            }
        }
    }

    @Override // e.c.f.b.a.b
    public void b(String str, Throwable th, b.a aVar) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                b<I> bVar = this.a.get(i);
                if (bVar != null) {
                    bVar.b(str, th, aVar);
                }
            } catch (Exception e2) {
                f("ForwardingControllerListener2 exception in onFailure", e2);
            }
        }
    }

    @Override // e.c.f.b.a.b
    public void c(String str, b.a aVar) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            try {
                b<I> bVar = this.a.get(i);
                if (bVar != null) {
                    bVar.c(str, aVar);
                }
            } catch (Exception e2) {
                f("ForwardingControllerListener2 exception in onRelease", e2);
            }
        }
    }

    @Override // e.c.f.b.a.b
    public void d(String str, I i, b.a aVar) {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                b<I> bVar = this.a.get(i2);
                if (bVar != null) {
                    bVar.d(str, i, aVar);
                }
            } catch (Exception e2) {
                f("ForwardingControllerListener2 exception in onFinalImageSet", e2);
            }
        }
    }

    public synchronized void e(b<I> bVar) {
        this.a.add(bVar);
    }

    public synchronized void g(b<I> bVar) {
        int indexOf = this.a.indexOf(bVar);
        if (indexOf != -1) {
            this.a.set(indexOf, null);
        }
    }
}
