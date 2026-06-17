package e.c.e.b.a.i.i;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.facebook.imagepipeline.image.h;
import e.c.c.d.j;
import e.c.e.b.a.i.f;
import e.c.e.b.a.i.g;
import e.c.f.b.a.b;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<com.facebook.imagepipeline.image.h>] */
/* loaded from: classes2.dex */
public class a extends e.c.f.b.a.a<h> {
    private final com.facebook.common.time.b a;
    private final e.c.e.b.a.i.h b;

    /* renamed from: c, reason: collision with root package name */
    private final g f9787c;

    /* renamed from: d, reason: collision with root package name */
    private final j<Boolean> f9788d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f9789e;

    /* renamed from: e.c.e.b.a.i.i.a$a, reason: collision with other inner class name */
    static class HandlerC0448a extends Handler {
        private final g a;

        public HandlerC0448a(@NonNull Looper looper, @NonNull g gVar) {
            super(looper);
            this.a = gVar;
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i == 1) {
                ((f) this.a).c((e.c.e.b.a.i.h) message.obj, message.arg1);
            } else {
                if (i != 2) {
                    return;
                }
                ((f) this.a).b((e.c.e.b.a.i.h) message.obj, message.arg1);
            }
        }
    }

    public a(com.facebook.common.time.b bVar, e.c.e.b.a.i.h hVar, g gVar, j<Boolean> jVar) {
        this.a = bVar;
        this.b = hVar;
        this.f9787c = gVar;
        this.f9788d = jVar;
    }

    private boolean e() {
        boolean booleanValue = this.f9788d.get().booleanValue();
        if (booleanValue && this.f9789e == null) {
            synchronized (this) {
                if (this.f9789e == null) {
                    HandlerThread handlerThread = new HandlerThread("ImagePerfControllerListener2Thread");
                    handlerThread.start();
                    this.f9789e = new HandlerC0448a(handlerThread.getLooper(), this.f9787c);
                }
            }
        }
        return booleanValue;
    }

    private void f(int i) {
        if (!e()) {
            ((f) this.f9787c).c(this.b, i);
        } else {
            Message obtainMessage = this.f9789e.obtainMessage();
            obtainMessage.what = 1;
            obtainMessage.arg1 = i;
            obtainMessage.obj = this.b;
            this.f9789e.sendMessage(obtainMessage);
        }
    }

    private void g(int i) {
        if (!e()) {
            ((f) this.f9787c).b(this.b, i);
        } else {
            Message obtainMessage = this.f9789e.obtainMessage();
            obtainMessage.what = 2;
            obtainMessage.arg1 = i;
            obtainMessage.obj = this.b;
            this.f9789e.sendMessage(obtainMessage);
        }
    }

    @Override // e.c.f.b.a.b
    public void a(String str, Object obj, b.a aVar) {
        long now = this.a.now();
        this.b.c();
        this.b.j(now);
        this.b.h(str);
        this.b.d(obj);
        this.b.l(aVar);
        f(0);
        this.b.z(true);
        this.b.y(now);
        g(1);
    }

    @Override // e.c.f.b.a.b
    public void b(String str, Throwable th, b.a aVar) {
        long now = this.a.now();
        this.b.l(aVar);
        this.b.f(now);
        this.b.h(str);
        this.b.k(th);
        f(5);
        this.b.z(false);
        this.b.s(now);
        g(2);
    }

    @Override // e.c.f.b.a.b
    public void c(String str, b.a aVar) {
        long now = this.a.now();
        this.b.l(aVar);
        int a = this.b.a();
        if (a != 3 && a != 5 && a != 6) {
            this.b.e(now);
            this.b.h(str);
            f(4);
        }
        this.b.z(false);
        this.b.s(now);
        g(2);
    }

    @Override // e.c.f.b.a.b
    public void d(String str, Object obj, b.a aVar) {
        long now = this.a.now();
        aVar.b.size();
        this.b.l(aVar);
        this.b.g(now);
        this.b.q(now);
        this.b.h(str);
        this.b.m((h) obj);
        f(3);
    }
}
