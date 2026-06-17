package e.b.b.k;

import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedTransferQueue;

/* loaded from: classes.dex */
public class b {
    private static List<d> a = new CopyOnWriteArrayList();
    private static final BlockingQueue<c> b = new LinkedTransferQueue();

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f9485c = false;

    public static void c(c cVar) {
        if (cVar == null) {
            return;
        }
        b.offer(cVar);
        if (f9485c) {
            return;
        }
        synchronized (b.class) {
            if (f9485c) {
                return;
            }
            f9485c = true;
            new Thread(new a(), "APM-Monitor").start();
        }
    }

    public static void d(d dVar) {
        if (a.contains(dVar)) {
            return;
        }
        a.add(dVar);
    }
}
