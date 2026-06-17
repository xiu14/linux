package com.bytedance.apm.z;

import java.util.Map;

/* loaded from: classes.dex */
public class a {
    private static c a = null;
    private static b b = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f3620c = false;

    /* renamed from: com.bytedance.apm.z.a$a, reason: collision with other inner class name */
    public interface InterfaceC0131a {
        Map<String, String> a();
    }

    public interface b {
        void a();
    }

    public interface c {
        void a(Map<String, String> map);

        void b(InterfaceC0131a interfaceC0131a);
    }

    public static void a(Map<String, String> map) {
        c cVar = a;
        if (cVar != null) {
            cVar.a(map);
        }
    }

    public static void b(InterfaceC0131a interfaceC0131a) {
        c cVar = a;
        if (cVar != null) {
            cVar.b(interfaceC0131a);
        }
    }

    public static void c(b bVar) {
        b = bVar;
    }

    public static void d(c cVar) {
        a = cVar;
    }

    public static void e() {
        b bVar;
        if (f3620c || (bVar = b) == null) {
            return;
        }
        bVar.a();
        f3620c = true;
    }
}
