package e.b.c.a;

import android.util.Log;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class a {
    private static volatile boolean a = false;
    private static volatile boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static Lock f9496c = new ReentrantLock();

    public static boolean a() {
        try {
            try {
                f9496c.lock();
                if (!b) {
                    System.loadLibrary("ttcrypto");
                    b = true;
                }
                if (!a) {
                    System.loadLibrary("ttboringssl");
                    a = true;
                }
            } catch (Error e2) {
                Log.e("BoringsslLoaderWrapper", "load boringssl:" + a + " load crypto:" + b + "  err:" + e2.toString());
            }
            return a && b;
        } finally {
            f9496c.unlock();
        }
    }
}
