package ms.bd.c;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public final class z {
    public final Context a;
    public final String b = (String) y2.a(16777217, 0, 0, "792776", new byte[]{37, 52, 76, 13, 5, 37, 61, 28, 45, 106, 53, 58});

    /* renamed from: c, reason: collision with root package name */
    public final LinkedBlockingQueue f10483c = new LinkedBlockingQueue(1);

    /* renamed from: d, reason: collision with root package name */
    public final y f10484d = new y(this);

    public z(Context context) {
        this.a = context;
    }

    public final void a(j1 j1Var) {
        if (Build.VERSION.SDK_INT <= 28 ? false : k1.b(this.a, this.b)) {
            String packageName = this.a.getPackageName();
            Intent intent = new Intent();
            intent.setClassName(this.b, (String) y2.a(16777217, 0, 0L, "c878f1", new byte[]{113, 53, 73, 2, 84, 34, 105, 29, 40, 101, 97, 59, 10, 95, 92, 52, 118, 16, 101, 109, 60, 23, 87, 77, 114, 42, 83, 28, 116, 126, 123, 57, 65}));
            intent.setAction((String) y2.a(16777217, 0, 0L, "3695b8", new byte[]{33, 59, 71, 15, 95, 58, 62, 89, 101, 118, 35, 122, 75, 66, 73, 38, 63, 25, 38, 118, 54, 53, 88, 85, 19, 60, 53, 5, 126, 108, 33, 49}));
            intent.putExtra((String) y2.a(16777217, 0, 0L, "1f2845", new byte[]{35, 107, 76, 2, 9, 55, 60, 9, 110, 123, 33, 42, 81, 77, 25, 35, 63, 9, 115, 99, 39, 106, 64, 65, 14}), packageName);
            try {
                intent.putExtra((String) y2.a(16777217, 0, 0L, "066a20", new byte[]{34, 59, 72, 91, 15, 50, 61, 89, 106, 34, 32, 122, 85, 20, 31, 38, 62, 89, 117, 36, 47, 61, 75, 6, 8, 51}), true);
                this.a.startService(intent);
            } catch (Exception unused) {
            }
            Intent intent2 = new Intent();
            intent2.setClassName((String) y2.a(16777217, 0, 0L, "283f69", new byte[]{32, 53, 77, 92, 4, 42, 56, 29, 44, 59, 48, 59}), (String) y2.a(16777217, 0, 0L, "6e0e67", new byte[]{36, 104, 78, 95, 4, 36, 60, 64, 47, 56, 52, 102, 13, 2, 12, 50, 35, 77, 98, 48, 105, 74, 80, 16, 32, 36, 6, 65, 115, 35, 46, 100, 70}));
            intent2.setAction((String) y2.a(16777217, 0, 0L, "3e49b3", new byte[]{33, 104, 74, 3, 95, 49, 62, 10, 104, 122, 35, 41, 70, 78, 73, 45, 63, 74, 43, 107, 43, 105, 67, 89, 82, 106, 35, 65, 119, Byte.MAX_VALUE, 43, 100, 66}));
            intent2.putExtra((String) y2.a(16777217, 0, 0L, "95dbd8", new byte[]{43, 56, 26, 88, 89, 58, 52, 90, 56, 33, 41, 121, 7, 23, 73, 46, 55, 90, 37, 57, 47, 57, 22, 27, 94}), packageName);
            if (this.a.bindService(intent2, this.f10484d, 1)) {
                try {
                    j1Var.a.a = new a0((IBinder) this.f10483c.take()).d();
                } catch (Exception unused2) {
                } catch (Throwable th) {
                    this.a.unbindService(this.f10484d);
                    throw th;
                }
                this.a.unbindService(this.f10484d);
            }
        }
    }
}
