package c;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class h<TResult> {
    public static final ExecutorService h = b.a();
    private static final Executor i = b.b();
    public static final Executor j = a.a();
    private static h<?> k = new h<>((Object) null);
    private static h<Boolean> l = new h<>(Boolean.TRUE);
    private static h<Boolean> m = new h<>(Boolean.FALSE);
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1244c;

    /* renamed from: d, reason: collision with root package name */
    private TResult f1245d;

    /* renamed from: e, reason: collision with root package name */
    private Exception f1246e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1247f;
    private final Object a = new Object();

    /* renamed from: g, reason: collision with root package name */
    private List<c<TResult, Void>> f1248g = new ArrayList();

    static {
        new h(true);
    }

    h() {
    }

    public static <TResult> h<TResult> a(Callable<TResult> callable, Executor executor) {
        i iVar = new i();
        try {
            executor.execute(new g(iVar, callable));
        } catch (Exception e2) {
            iVar.c(new d(e2));
        }
        return iVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <TResult> h<TResult> c(TResult tresult) {
        if (tresult == 0) {
            return (h<TResult>) k;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (h<TResult>) l : (h<TResult>) m;
        }
        i iVar = new i();
        iVar.d(tresult);
        return iVar.a();
    }

    private void h() {
        synchronized (this.a) {
            Iterator<c<TResult, Void>> it2 = this.f1248g.iterator();
            while (it2.hasNext()) {
                try {
                    it2.next().a(this);
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception e3) {
                    throw new RuntimeException(e3);
                }
            }
            this.f1248g = null;
        }
    }

    public <TContinuationResult> h<TContinuationResult> b(c<TResult, TContinuationResult> cVar) {
        boolean z;
        Executor executor = i;
        i iVar = new i();
        synchronized (this.a) {
            synchronized (this.a) {
                z = this.b;
            }
            if (!z) {
                this.f1248g.add(new e(this, iVar, cVar, executor));
            }
        }
        if (z) {
            try {
                executor.execute(new f(iVar, cVar, this));
            } catch (Exception e2) {
                iVar.c(new d(e2));
            }
        }
        return iVar.a();
    }

    public Exception d() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f1246e;
            if (exc != null) {
                this.f1247f = true;
            }
        }
        return exc;
    }

    public TResult e() {
        TResult tresult;
        synchronized (this.a) {
            tresult = this.f1245d;
        }
        return tresult;
    }

    public boolean f() {
        boolean z;
        synchronized (this.a) {
            z = this.f1244c;
        }
        return z;
    }

    public boolean g() {
        boolean z;
        synchronized (this.a) {
            z = d() != null;
        }
        return z;
    }

    boolean i() {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.f1244c = true;
            this.a.notifyAll();
            h();
            return true;
        }
    }

    boolean j(Exception exc) {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.f1246e = exc;
            this.f1247f = false;
            this.a.notifyAll();
            h();
            boolean z = this.f1247f;
            return true;
        }
    }

    boolean k(TResult tresult) {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.f1245d = tresult;
            this.a.notifyAll();
            h();
            return true;
        }
    }

    private h(TResult tresult) {
        k(tresult);
    }

    private h(boolean z) {
        if (z) {
            i();
        } else {
            k(null);
        }
    }
}
