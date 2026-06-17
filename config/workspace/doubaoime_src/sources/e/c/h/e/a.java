package e.c.h.e;

import android.graphics.Bitmap;
import android.os.SystemClock;
import e.c.h.g.n;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public static final int f9852d = Runtime.getRuntime().availableProcessors();

    /* renamed from: e, reason: collision with root package name */
    private static Executor f9853e;
    private String a;
    private b b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f9854c;

    /* renamed from: e.c.h.e.a$a, reason: collision with other inner class name */
    class RunnableC0451a implements Runnable {
        RunnableC0451a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long uptimeMillis = SystemClock.uptimeMillis();
            Objects.requireNonNull(a.this);
            Bitmap a = new c().a(a.this.a, 200, 120, 1.0f, true);
            StringBuilder M = e.a.a.a.a.M("setBlurHashImage: decode blurHash cost time is ");
            M.append(SystemClock.uptimeMillis() - uptimeMillis);
            e.c.c.e.a.c("SimpleDraweeView", M.toString());
            if (a.this.b != null) {
                a.this.b.a(a);
            }
        }
    }

    public interface b {
        void a(Bitmap bitmap);
    }

    public a(String str, b bVar) {
        RunnableC0451a runnableC0451a = new RunnableC0451a();
        this.f9854c = runnableC0451a;
        if (f9853e == null) {
            f9853e = Executors.newFixedThreadPool(f9852d, new n(10, "BlurDecodeExecutor", true));
        }
        this.a = str;
        this.b = bVar;
        f9853e.execute(runnableC0451a);
    }
}
