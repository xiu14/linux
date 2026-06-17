package e.b.h;

import android.content.Context;

/* loaded from: classes.dex */
public class a {
    static Context a;

    public static void a(String str, Context context) {
        if (a == null) {
            a = context;
        }
        b bVar = b.p;
        if (bVar != null) {
            bVar.l(str, false);
        } else {
            System.loadLibrary(str);
        }
    }
}
