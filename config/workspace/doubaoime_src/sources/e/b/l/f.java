package e.b.l;

import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public class f extends RuntimeException implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    private static final List<c> f9607g = new ArrayList();
    public static final /* synthetic */ int h = 0;
    private boolean a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f9608c;

    /* renamed from: d, reason: collision with root package name */
    private long f9609d;

    /* renamed from: e, reason: collision with root package name */
    private String f9610e;

    /* renamed from: f, reason: collision with root package name */
    private Map<Class<?>, Object> f9611f;

    public interface c {
        void a(Throwable th, b bVar);
    }

    f(String str, Throwable th, a aVar) {
        super(str, th);
    }

    public static void n(c cVar) {
        f9607g.add(cVar);
    }

    public static b o(Throwable th) {
        return new b(th, null);
    }

    public int p() {
        return this.b;
    }

    public final Throwable q() {
        Throwable cause = getCause();
        if (cause == null) {
            return null;
        }
        while (cause.getCause() != null) {
            cause = cause.getCause();
        }
        return cause;
    }

    public int r() {
        return this.f9608c;
    }

    public String s() {
        return this.f9610e;
    }

    public Object t(Class<?> cls) {
        Map<Class<?>, Object> map = this.f9611f;
        if (map == null) {
            return null;
        }
        return map.get(cls);
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder M = e.a.a.a.a.M("RpcException{code=");
        M.append(this.b);
        M.append(", reason=");
        M.append(getMessage());
        M.append(", httpProtocolError=");
        M.append(this.a);
        M.append(", requestId=");
        M.append(this.f9608c);
        M.append(", errorTime=");
        M.append(this.f9609d);
        M.append(", source='");
        M.append(this.f9610e);
        M.append('\'');
        M.append(", cause=");
        M.append(q());
        M.append(", tags=");
        M.append(this.f9611f);
        M.append('}');
        return M.toString();
    }

    public boolean u() {
        return this.b == 987654323;
    }

    public boolean v() {
        return this.a;
    }

    public boolean w() {
        int i = this.b;
        if (i == 987654324) {
            return true;
        }
        if (i != 987654321) {
            return false;
        }
        Throwable q = q();
        return q != null && ((q instanceof TimeoutException) || (q instanceof SocketTimeoutException));
    }

    public static class b {
        private boolean a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private String f9612c;

        /* renamed from: d, reason: collision with root package name */
        private int f9613d;

        /* renamed from: e, reason: collision with root package name */
        private Throwable f9614e;

        /* renamed from: f, reason: collision with root package name */
        private long f9615f;

        /* renamed from: g, reason: collision with root package name */
        private String f9616g;
        private Map<Class<?>, Object> h;

        b(Throwable th, a aVar) {
            this.f9614e = th;
            this.b = 987654321;
            if (!(th instanceof f)) {
                this.h = new HashMap(2);
                Iterator it2 = f.f9607g.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).a(th, this);
                }
                return;
            }
            f fVar = (f) th;
            this.a = fVar.a;
            this.b = fVar.b;
            this.f9612c = fVar.getMessage();
            this.f9613d = fVar.f9608c;
            this.f9614e = fVar.getCause();
            this.f9615f = fVar.f9609d;
            this.h = fVar.f9611f;
            this.f9616g = fVar.f9610e;
        }

        public f a(f fVar) {
            fVar.b = this.b;
            fVar.f9608c = this.f9613d;
            fVar.f9611f = this.h;
            fVar.f9610e = this.f9616g;
            return fVar;
        }

        public f b() {
            String str;
            if (e.b.l.q.c.a(this.f9612c)) {
                Throwable th = this.f9614e;
                str = th == null ? "" : th.getMessage();
            } else {
                str = this.f9612c;
            }
            f fVar = new f(str, this.f9614e, null);
            fVar.b = this.b;
            fVar.f9608c = this.f9613d;
            fVar.a = this.a;
            long j = this.f9615f;
            fVar.f9609d = j;
            if (j == 0) {
                fVar.f9609d = System.currentTimeMillis();
            }
            fVar.f9611f = this.h;
            fVar.f9610e = this.f9616g;
            return fVar;
        }

        public b c(int i) {
            this.b = i;
            return this;
        }

        public b d(boolean z) {
            this.a = z;
            return this;
        }

        public b e(int i, String str) {
            this.b = i;
            this.f9612c = str;
            return this;
        }

        public b f(int i) {
            this.f9613d = i;
            return this;
        }

        public b g(String str) {
            this.f9616g = str;
            return this;
        }

        public b h(Class<?> cls, Object obj) {
            this.h.put(cls, obj);
            return this;
        }

        b(int i, String str, boolean z, a aVar) {
            this.b = i;
            this.f9612c = str;
            this.a = z;
            this.h = new HashMap(2);
        }
    }
}
