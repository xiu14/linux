package com.bytedance.article.common.monitor.stack;

import com.bytedance.apm.internal.ApmDelegate;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class a {
    private final LinkedList<f> a = new LinkedList<>();
    private volatile boolean b = false;

    /* renamed from: com.bytedance.article.common.monitor.stack.a$a, reason: collision with other inner class name */
    class RunnableC0153a implements Runnable {
        RunnableC0153a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (ApmDelegate.i().o()) {
                    LinkedList linkedList = new LinkedList();
                    synchronized (a.this.a) {
                        linkedList.addAll(a.this.a);
                        a.this.a.clear();
                    }
                    while (!linkedList.isEmpty()) {
                        f fVar = (f) linkedList.poll();
                        if (fVar != null) {
                            d.j().i(fVar.a, fVar.b, null, false);
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    void b(String str, String str2) {
        if (this.b) {
            return;
        }
        synchronized (this.a) {
            if (this.a.size() > 40) {
                this.a.poll();
            }
            this.a.add(new f(str, str2));
        }
    }

    void c() {
        if (this.b) {
            return;
        }
        if (ApmDelegate.i().o()) {
            this.b = true;
        }
        com.bytedance.apm.F.b.e().o(new RunnableC0153a());
    }
}
