package e.i.b.f.e;

import android.util.Log;
import e.i.b.f.e.b;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a implements b.a {
    private final String a;
    private final boolean b;

    public a(String str, boolean z, int i) {
        z = (i & 2) != 0 ? false : z;
        l.f(str, "baseTag");
        this.a = str;
        this.b = z;
    }

    @Override // e.i.b.f.e.b.a
    public void a(String str, int i, String str2, Throwable th) {
        l.f(str2, "msg");
        if (!(str == null || str.length() == 0)) {
            str2 = e.a.a.a.a.t(str, "-->", str2);
        }
        if (this.b) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            Thread currentThread = Thread.currentThread();
            l.e(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append("]|");
            sb.append(str2);
            str2 = sb.toString();
        }
        if (i == 1) {
            Log.v(this.a, str2);
            return;
        }
        if (i == 2) {
            Log.d(this.a, str2);
            return;
        }
        if (i == 4) {
            Log.i(this.a, str2);
            return;
        }
        if (i == 8) {
            String str3 = this.a;
            if (th == null) {
                Log.w(str3, str2);
                return;
            } else {
                Log.w(str3, str2, th);
                return;
            }
        }
        if (i != 16) {
            return;
        }
        String str4 = this.a;
        if (th == null) {
            Log.e(str4, str2);
        } else {
            Log.e(str4, str2, th);
        }
    }
}
