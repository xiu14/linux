package e.c.f.b.a;

import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public interface b<INFO> {

    public static class a {
        public Map<String, Object> a;
        public Map<String, Object> b;

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("pipe: ");
            M.append(this.a);
            M.append(", view: ");
            M.append(this.b);
            return M.toString();
        }
    }

    void a(String str, Object obj, a aVar);

    void b(String str, Throwable th, a aVar);

    void c(String str, a aVar);

    void d(String str, INFO info, a aVar);
}
