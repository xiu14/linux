package d.a.c;

import android.util.Log;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class c implements a {
    @Override // d.a.c.a
    public void a(String str, String str2, Throwable th) {
        l.g(str, "tag");
        l.g(str2, "message");
        l.g(th, "exception");
        Log.e(str, str2, th);
    }

    @Override // d.a.c.a
    public void b(String str, String str2) {
        l.g(str, "tag");
        l.g(str2, "message");
        Log.e(str, str2);
    }

    @Override // d.a.c.a
    public boolean c() {
        return false;
    }

    @Override // d.a.c.a
    public void d(String str, String str2) {
        l.g(str, "tag");
        l.g(str2, "message");
    }

    @Override // d.a.c.a
    public void e(String str, String str2) {
        l.g(str, "tag");
        l.g(str2, "message");
    }
}
