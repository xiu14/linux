package com.bytedance.memory.b;

import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class b {
    public static final InterfaceC0268b a;

    static class a implements InterfaceC0268b {
        a() {
        }

        @Override // com.bytedance.memory.b.b.InterfaceC0268b
        public void a(Runnable runnable, String str) {
            ((com.bytedance.monitor.util.thread.a) com.bytedance.monitor.util.thread.c.a()).j(com.bytedance.monitor.util.thread.c.c(str, runnable));
        }
    }

    /* renamed from: com.bytedance.memory.b.b$b, reason: collision with other inner class name */
    public interface InterfaceC0268b {
        void a(Runnable runnable, String str);
    }

    static {
        Executors.newScheduledThreadPool(1, new f("CheckToDump"));
        a = new a();
    }
}
