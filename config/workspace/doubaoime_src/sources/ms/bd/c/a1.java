package ms.bd.c;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public final class a1 {
    public final Context a;
    public final LinkedBlockingQueue b = new LinkedBlockingQueue(1024);

    /* renamed from: c, reason: collision with root package name */
    public final z0 f10345c = new z0(this);

    public a1(Context context) {
        this.a = context;
    }

    public final void a(j1 j1Var) {
        if (k1.b(this.a, (String) y2.a(16777217, 0, 0L, "541898", new byte[]{39, 57, 79, 2, 14, 58, 55, 2, 101, 97, 106, 62, 85, 69, 2}))) {
            Intent intent = new Intent((String) y2.a(16777217, 0, 0L, "4e256a", new byte[]{38, 104, 76, 15, 28, 121, 51, 77, 112, 43, 42, 119, 68, 79, 13, 115, 33, 77, 96, 96, 107, 72, 113, 100, 39, 95, 19, 119, 92, 86, 0, 85, 119, 104, 42, 83}));
            intent.setPackage((String) y2.a(16777217, 0, 0L, "dbcf65", new byte[]{118, 111, 29, 92, 1, 55, 102, 84, 55, 63, 59, 104, 7, 27, 13}));
            if (this.a.bindService(intent, this.f10345c, 1)) {
                try {
                    j1Var.a.a = new b1((IBinder) this.b.take()).d();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    this.a.unbindService(this.f10345c);
                    throw th;
                }
                this.a.unbindService(this.f10345c);
            }
        }
    }
}
