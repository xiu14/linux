package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.j;
import com.bumptech.glide.k;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
class f {
    private final com.bumptech.glide.n.a a;
    private final Handler b;

    /* renamed from: c, reason: collision with root package name */
    private final List<b> f1777c;

    /* renamed from: d, reason: collision with root package name */
    final k f1778d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.B.d f1779e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1780f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1781g;
    private j<Bitmap> h;
    private a i;
    private boolean j;
    private a k;
    private Bitmap l;
    private com.bumptech.glide.load.i<Bitmap> m;
    private a n;
    private int o;
    private int p;
    private int q;

    @VisibleForTesting
    static class a extends com.bumptech.glide.request.k.c<Bitmap> {

        /* renamed from: d, reason: collision with root package name */
        private final Handler f1782d;

        /* renamed from: e, reason: collision with root package name */
        final int f1783e;

        /* renamed from: f, reason: collision with root package name */
        private final long f1784f;

        /* renamed from: g, reason: collision with root package name */
        private Bitmap f1785g;

        a(Handler handler, int i, long j) {
            this.f1782d = handler;
            this.f1783e = i;
            this.f1784f = j;
        }

        @Override // com.bumptech.glide.request.k.h
        public void b(@NonNull Object obj, @Nullable com.bumptech.glide.request.l.b bVar) {
            this.f1785g = (Bitmap) obj;
            this.f1782d.sendMessageAtTime(this.f1782d.obtainMessage(1, this), this.f1784f);
        }

        Bitmap d() {
            return this.f1785g;
        }

        @Override // com.bumptech.glide.request.k.h
        public void j(@Nullable Drawable drawable) {
            this.f1785g = null;
        }
    }

    public interface b {
        void a();
    }

    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                f.this.k((a) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            f.this.f1778d.n((a) message.obj);
            return false;
        }
    }

    f(com.bumptech.glide.c cVar, com.bumptech.glide.n.a aVar, int i, int i2, com.bumptech.glide.load.i<Bitmap> iVar, Bitmap bitmap) {
        com.bumptech.glide.load.engine.B.d d2 = cVar.d();
        k n = com.bumptech.glide.c.n(cVar.f());
        j<Bitmap> a2 = com.bumptech.glide.c.n(cVar.f()).g().a(new com.bumptech.glide.request.h().e(com.bumptech.glide.load.engine.j.a).b0(true).W(true).Q(i, i2));
        this.f1777c = new ArrayList();
        this.f1778d = n;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f1779e = d2;
        this.b = handler;
        this.h = a2;
        this.a = aVar;
        l(iVar, bitmap);
    }

    private void j() {
        if (!this.f1780f || this.f1781g) {
            return;
        }
        a aVar = this.n;
        if (aVar != null) {
            this.n = null;
            k(aVar);
            return;
        }
        this.f1781g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.a.d();
        this.a.c();
        this.k = new a(this.b, this.a.f(), uptimeMillis);
        this.h.a(new com.bumptech.glide.request.h().V(new com.bumptech.glide.q.b(Double.valueOf(Math.random())))).l0(this.a).h0(this.k);
    }

    void a() {
        this.f1777c.clear();
        Bitmap bitmap = this.l;
        if (bitmap != null) {
            this.f1779e.c(bitmap);
            this.l = null;
        }
        this.f1780f = false;
        a aVar = this.i;
        if (aVar != null) {
            this.f1778d.n(aVar);
            this.i = null;
        }
        a aVar2 = this.k;
        if (aVar2 != null) {
            this.f1778d.n(aVar2);
            this.k = null;
        }
        a aVar3 = this.n;
        if (aVar3 != null) {
            this.f1778d.n(aVar3);
            this.n = null;
        }
        this.a.clear();
        this.j = true;
    }

    ByteBuffer b() {
        return this.a.e().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.i;
        return aVar != null ? aVar.d() : this.l;
    }

    int d() {
        a aVar = this.i;
        if (aVar != null) {
            return aVar.f1783e;
        }
        return -1;
    }

    Bitmap e() {
        return this.l;
    }

    int f() {
        return this.a.a();
    }

    int g() {
        return this.q;
    }

    int h() {
        return this.a.g() + this.o;
    }

    int i() {
        return this.p;
    }

    @VisibleForTesting
    void k(a aVar) {
        this.f1781g = false;
        if (this.j) {
            this.b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f1780f) {
            this.n = aVar;
            return;
        }
        if (aVar.d() != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.f1779e.c(bitmap);
                this.l = null;
            }
            a aVar2 = this.i;
            this.i = aVar;
            int size = this.f1777c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    this.f1777c.get(size).a();
                }
            }
            if (aVar2 != null) {
                this.b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        j();
    }

    void l(com.bumptech.glide.load.i<Bitmap> iVar, Bitmap bitmap) {
        Objects.requireNonNull(iVar, "Argument must not be null");
        this.m = iVar;
        Objects.requireNonNull(bitmap, "Argument must not be null");
        this.l = bitmap;
        this.h = this.h.a(new com.bumptech.glide.request.h().Y(iVar));
        this.o = com.bumptech.glide.util.j.c(bitmap);
        this.p = bitmap.getWidth();
        this.q = bitmap.getHeight();
    }

    void m(b bVar) {
        if (this.j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f1777c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = this.f1777c.isEmpty();
        this.f1777c.add(bVar);
        if (!isEmpty || this.f1780f) {
            return;
        }
        this.f1780f = true;
        this.j = false;
        j();
    }

    void n(b bVar) {
        this.f1777c.remove(bVar);
        if (this.f1777c.isEmpty()) {
            this.f1780f = false;
        }
    }
}
