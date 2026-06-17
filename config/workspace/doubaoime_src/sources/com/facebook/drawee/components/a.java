package com.facebook.drawee.components;

/* loaded from: classes2.dex */
public abstract class a {
    private static a a;

    /* renamed from: com.facebook.drawee.components.a$a, reason: collision with other inner class name */
    public interface InterfaceC0323a {
        void release();
    }

    public static synchronized a b() {
        a aVar;
        synchronized (a.class) {
            if (a == null) {
                a = new b();
            }
            aVar = a;
        }
        return aVar;
    }

    public abstract void a(InterfaceC0323a interfaceC0323a);

    public abstract void c(InterfaceC0323a interfaceC0323a);
}
