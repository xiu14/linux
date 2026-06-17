package com.bytedance.bdinstall;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import com.bytedance.bdinstall.AbstractC0631k;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
class K implements Handler.Callback, com.bytedance.bdinstall.g0.e {
    private static final com.bytedance.bdinstall.util.p<d> l = new a();
    private final Q a;
    private final com.bytedance.bdinstall.k0.m b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f3943c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bytedance.bdinstall.f0.b f3944d;

    /* renamed from: e, reason: collision with root package name */
    private C0641v f3945e;

    /* renamed from: g, reason: collision with root package name */
    private a0 f3947g;
    private C0623c h;
    private long i;
    private com.bytedance.bdinstall.g0.c j;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f3946f = new AtomicBoolean(false);
    private final AtomicBoolean k = new AtomicBoolean(false);

    static class a extends com.bytedance.bdinstall.util.p<d> {
        a() {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected d a(Object[] objArr) {
            return new d((Context) objArr[0]);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            K.this.b.r();
        }
    }

    class c implements Runnable {
        final /* synthetic */ AbstractC0631k a;

        class a implements d.a {
            a() {
            }

            @Override // com.bytedance.bdinstall.K.d.a
            public void a() {
                if (K.this.f3943c.hasMessages(1235, c.this.a)) {
                    K.this.f3943c.removeMessages(1235, c.this.a);
                    K.this.f3943c.obtainMessage(1235, c.this.a).sendToTarget();
                    int i = C0640u.a;
                }
                c.this.a.l(null);
                ((d) K.l.b(K.this.a.q())).d(this);
                StringBuilder M = e.a.a.a.a.M("remove observer ");
                M.append(c.this.a);
                M.append(", ");
                M.append(this);
                M.toString();
                int i2 = C0640u.a;
            }
        }

        c(AbstractC0631k abstractC0631k) {
            this.a = abstractC0631k;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!K.this.a.N()) {
                AbstractC0631k.a o = this.a.o();
                K.d(K.this, o, this.a);
                if (this.a.f()) {
                    int i = C0640u.a;
                    return;
                } else {
                    K.this.f3943c.sendMessageDelayed(K.this.f3943c.obtainMessage(1235, this.a), o.f4013c);
                    return;
                }
            }
            d.a d2 = this.a.d();
            if (d2 != null) {
                this.a.l(null);
                ((d) K.l.b(K.this.a.q())).d(d2);
                int i2 = C0640u.a;
            }
            AbstractC0631k.a o2 = this.a.o();
            K.d(K.this, o2, this.a);
            if (this.a.f()) {
                int i3 = C0640u.a;
                return;
            }
            if (!o2.a && this.a.g() && o2.b == 1) {
                a aVar = new a();
                this.a.l(aVar);
                ((d) K.l.b(K.this.a.q())).c(aVar);
            }
            K.this.f3943c.sendMessageDelayed(K.this.f3943c.obtainMessage(1235, this.a), o2.f4013c);
        }
    }

    static class d {
        private final Set<WeakReference<a>> a = Collections.synchronizedSet(new HashSet());
        private final AtomicBoolean b = new AtomicBoolean(false);

        /* renamed from: c, reason: collision with root package name */
        private final Context f3948c;

        interface a {
            void a();
        }

        public d(Context context) {
            this.f3948c = context;
        }

        public synchronized void c(a aVar) {
            this.a.add(new WeakReference<>(aVar));
            if (this.b.compareAndSet(false, true)) {
                try {
                    this.f3948c.registerReceiver(new N(this), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
        
            r0.remove();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public synchronized void d(com.bytedance.bdinstall.K.d.a r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                java.util.Set<java.lang.ref.WeakReference<com.bytedance.bdinstall.K$d$a>> r0 = r2.a     // Catch: java.lang.Throwable -> L26
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L26
            L7:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L26
                if (r1 == 0) goto L24
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L26
                java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1     // Catch: java.lang.Throwable -> L26
                if (r1 != 0) goto L19
                r0.remove()     // Catch: java.lang.Throwable -> L26
                goto L7
            L19:
                java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L26
                com.bytedance.bdinstall.K$d$a r1 = (com.bytedance.bdinstall.K.d.a) r1     // Catch: java.lang.Throwable -> L26
                if (r1 != r3) goto L7
                r0.remove()     // Catch: java.lang.Throwable -> L26
            L24:
                monitor-exit(r2)
                return
            L26:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdinstall.K.d.d(com.bytedance.bdinstall.K$d$a):void");
        }
    }

    K(Q q, com.bytedance.bdinstall.k0.m mVar, com.bytedance.bdinstall.f0.b bVar, C0641v c0641v) {
        this.a = q;
        this.b = mVar;
        this.f3944d = bVar;
        this.f3943c = new Handler(C0643x.f(q.i()), this);
        this.f3945e = c0641v;
    }

    static void d(K k, AbstractC0631k.a aVar, AbstractC0631k abstractC0631k) {
        Objects.requireNonNull(k);
        if (abstractC0631k != null && aVar.a) {
            abstractC0631k.n(aVar.f4014d);
            abstractC0631k.j(aVar.a);
            abstractC0631k.a();
        } else {
            if (abstractC0631k == null || aVar.b != 4) {
                return;
            }
            abstractC0631k.n(aVar.f4014d);
            abstractC0631k.j(aVar.a);
            abstractC0631k.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(C0623c c0623c) {
        int i = C0640u.a;
        this.f3946f.set(true);
        C0623c c0623c2 = this.h;
        if (c0623c2 != null && c0623c != null) {
            c0623c2.m();
            this.f3943c.removeMessages(1235, this.h);
        }
        this.h = c0623c;
        s(c0623c, false);
    }

    private void o(C0641v c0641v, boolean z) {
        C0643x.j(String.valueOf(this.a.h()), new b());
        if (!this.b.n()) {
            this.f3943c.removeMessages(1234);
            Handler handler = this.f3943c;
            handler.sendMessageDelayed(handler.obtainMessage(1234, Boolean.valueOf(z)), 1000L);
            return;
        }
        a0 a0Var = new a0(this.a, this.b, c0641v, this.f3944d);
        com.bytedance.bdinstall.g0.c cVar = this.j;
        if (cVar != null) {
            cVar.b(new com.bytedance.bdinstall.g0.i.a(this.b.e()));
        }
        if (z || this.b.m() || this.b.l() || this.b.k()) {
            a0Var.k();
        }
        Objects.requireNonNull(C0629i.d());
        r(a0Var);
        this.f3947g = a0Var;
    }

    private void r(AbstractC0631k abstractC0631k) {
        C0643x.j(String.valueOf(this.a.h()), new c(abstractC0631k));
    }

    @AnyThread
    private void s(AbstractC0631k abstractC0631k, boolean z) {
        Handler handler = this.f3943c;
        if (handler == null || abstractC0631k == null) {
            return;
        }
        handler.removeMessages(1235, abstractC0631k);
        Handler handler2 = this.f3943c;
        abstractC0631k.k();
        Message obtainMessage = handler2.obtainMessage(1235, abstractC0631k);
        if (z && Looper.myLooper() == this.f3943c.getLooper()) {
            handleMessage(obtainMessage);
        } else {
            this.f3943c.sendMessage(obtainMessage);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NonNull Message message) {
        boolean z;
        int i = message.what;
        if (i == 1234) {
            o(this.f3945e, ((Boolean) message.obj).booleanValue());
        } else if (i == 1235) {
            AbstractC0631k abstractC0631k = (AbstractC0631k) message.obj;
            if (!this.a.S() || ((com.bytedance.bdinstall.f0.a) this.f3944d).b()) {
                z = false;
            } else {
                int i2 = C0640u.a;
                Handler handler = this.f3943c;
                Message obtainMessage = handler.obtainMessage(1235, abstractC0631k);
                Objects.requireNonNull(abstractC0631k);
                handler.sendMessageDelayed(obtainMessage, com.heytap.mcssdk.constant.a.f6886d);
                z = true;
            }
            if (!z && !abstractC0631k.f()) {
                r(abstractC0631k);
            }
        }
        return false;
    }

    void k() {
        int i = C0640u.a;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.i < com.heytap.mcssdk.constant.a.h || !com.bytedance.android.input.k.b.a.j0(this.a.q())) {
            return;
        }
        this.i = currentTimeMillis;
        j(new C0623c(this.a, this.f3945e));
    }

    boolean l(C0641v c0641v, boolean z) {
        if (this.f3945e.equals(c0641v)) {
            return false;
        }
        this.f3945e = c0641v;
        this.b.a(c0641v, z);
        return true;
    }

    boolean m(C0641v c0641v, boolean z, boolean z2) {
        if (!l(c0641v, z2) && !z) {
            String str = "the env is the same with before,ignore." + c0641v;
            int i = C0640u.a;
            return false;
        }
        this.f3943c.removeMessages(1235);
        if (this.f3943c.hasMessages(1234)) {
            this.f3943c.removeMessages(1234);
            Handler handler = this.f3943c;
            handler.sendMessage(handler.obtainMessage(1234, Boolean.TRUE));
            return true;
        }
        a0 a0Var = new a0(this.a, this.b, c0641v, this.f3944d);
        s(a0Var, false);
        this.f3947g = a0Var;
        if (!this.a.L() || !this.f3946f.get()) {
            return true;
        }
        j(new C0623c(this.a, c0641v));
        return true;
    }

    @AnyThread
    void n() {
        a0 a0Var = this.f3947g;
        if (a0Var != null) {
            s(a0Var, true);
        }
    }

    public void p(com.bytedance.bdinstall.g0.c cVar) {
        this.j = cVar;
    }

    void q(boolean z) {
        o(this.f3945e, z);
        if (this.a.L()) {
            L l2 = new L(this);
            ((com.bytedance.bdinstall.f0.a) this.f3944d).c(new M(this, l2));
            Objects.requireNonNull(this.a);
            if (((com.bytedance.bdinstall.f0.a) this.f3944d).a()) {
                int i = C0640u.a;
                l2.run();
            }
        }
    }
}
