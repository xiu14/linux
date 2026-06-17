package e.b.b.h.d;

import android.util.Log;
import e.b.b.n.g.b;

/* loaded from: classes.dex */
public class c extends b.a {
    @Override // e.b.b.n.g.b.a, e.b.b.n.g.a
    public void a(String str, String str2, Throwable th) {
        if (e.b.b.n.a.b()) {
            Log.e(str, str2, th);
        }
        b.c(str, str2, th);
    }

    @Override // e.b.b.n.g.b.a, e.b.b.n.g.a
    public void e(String str, String str2) {
        if (e.b.b.n.a.b()) {
            Log.e(str, str2);
        }
        b.c(str, str2, null);
    }
}
