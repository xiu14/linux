package com.bytedance.applog.D;

import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class f extends HandlerThread {

    /* renamed from: e, reason: collision with root package name */
    private static volatile f f3757e;
    private volatile Handler a;
    private final Object b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f3758c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedList<Runnable> f3759d;

    private f() {
        super("TeaThread");
        this.b = new Object();
        this.f3758c = false;
        this.f3759d = new LinkedList<>();
    }

    public static f b() {
        if (f3757e == null) {
            synchronized (f.class) {
                if (f3757e == null) {
                    f3757e = new f();
                    f3757e.start();
                }
            }
        }
        return f3757e;
    }

    public void a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (this.f3758c) {
            d(runnable, 0L);
            return;
        }
        synchronized (this.b) {
            if (this.f3758c) {
                d(runnable, 0L);
            } else {
                if (this.f3759d.size() > 1000) {
                    this.f3759d.poll();
                }
                this.f3759d.add(runnable);
            }
        }
    }

    @NonNull
    public Handler c() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = new Handler(getLooper());
                }
            }
        }
        return this.a;
    }

    public void d(Runnable runnable, long j) {
        c().postDelayed(runnable, j);
    }

    public void e(Runnable runnable) {
        c().removeCallbacks(runnable);
    }

    @Override // android.os.HandlerThread
    protected void onLooperPrepared() {
        super.onLooperPrepared();
        synchronized (this.b) {
            this.f3758c = true;
            ArrayList arrayList = new ArrayList(this.f3759d);
            this.f3759d.clear();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Runnable runnable = (Runnable) it2.next();
                    if (runnable != null) {
                        c().post(runnable);
                    }
                }
            }
        }
    }
}
