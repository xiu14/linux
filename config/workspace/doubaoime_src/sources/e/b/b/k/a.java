package e.b.b.k;

import java.util.List;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
final class a implements Runnable {
    a() {
    }

    @Override // java.lang.Runnable
    public void run() {
        BlockingQueue blockingQueue;
        List<d> list;
        while (true) {
            try {
                blockingQueue = b.b;
                c cVar = (c) blockingQueue.take();
                list = b.a;
                for (d dVar : list) {
                    try {
                        if (cVar.b()) {
                            dVar.a(cVar);
                        } else if (e.b.b.n.a.b()) {
                            e.b.b.n.g.b.f("APM-Monitor", "monitorable invalid. ignored. " + cVar);
                        }
                    } catch (Throwable th) {
                        e.b.b.n.g.b.c("APM-Monitor", "monitorableHandler " + dVar + " handle monitorable " + cVar + "failed.", th);
                    }
                }
            } catch (Throwable th2) {
                e.b.b.n.g.b.c("APM", "Oh, Damn it!!!", th2);
            }
        }
    }
}
