package e.b.g.a.b;

import android.content.Context;

/* loaded from: classes.dex */
public final class c {
    private static b a = new a();
    private static boolean b;

    public static class a implements b {
        @Override // e.b.g.a.b.c.b
        public boolean a(Context context) {
            return false;
        }
    }

    public interface b {
        boolean a(Context context);
    }

    public static void a(b bVar) {
        if (b) {
            return;
        }
        a = bVar;
        b = true;
    }

    static boolean b(Context context) {
        return a.a(context);
    }
}
