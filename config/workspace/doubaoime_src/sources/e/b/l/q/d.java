package e.b.l.q;

import android.os.Handler;

/* loaded from: classes2.dex */
public class d implements Runnable {
    private Handler a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private int f9650c;

    /* renamed from: d, reason: collision with root package name */
    private int f9651d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9652e;

    public d(Handler handler, long j, int i, int i2, boolean z) {
        this.a = handler;
        this.b = j;
        this.f9650c = i;
        this.f9651d = i2;
    }

    public void a() {
        Handler handler;
        if (this.f9652e) {
            return;
        }
        if (this.b > 0 && (handler = this.a) != null) {
            handler.removeCallbacks(this);
        }
        this.f9652e = true;
        this.a = null;
    }

    public void b() {
        this.f9652e = false;
        long j = this.b;
        if (j > 0) {
            this.a.postDelayed(this, j);
        } else {
            this.a = null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Handler handler = this.a;
        if (handler != null) {
            handler.obtainMessage(this.f9650c, this.f9651d, 0).sendToTarget();
        }
        this.a = null;
    }
}
