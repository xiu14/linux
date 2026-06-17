package e.c.c.e;

import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes2.dex */
public class b {
    public static final b b = new b();
    private int a = 5;

    private b() {
    }

    private void f(int i, String str, String str2) {
        Log.println(i, "unknown" + Constants.COLON_SEPARATOR + str, str2);
    }

    private void g(int i, String str, String str2, Throwable th) {
        String stringWriter;
        String t = e.a.a.a.a.t("unknown", Constants.COLON_SEPARATOR, str);
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append('\n');
        if (th == null) {
            stringWriter = "";
        } else {
            StringWriter stringWriter2 = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter2));
            stringWriter = stringWriter2.toString();
        }
        sb.append(stringWriter);
        Log.println(i, t, sb.toString());
    }

    public void a(String str, String str2) {
        f(3, str, str2);
    }

    public void b(String str, String str2, Throwable th) {
        g(3, str, str2, th);
    }

    public void c(String str, String str2) {
        f(6, str, str2);
    }

    public void d(String str, String str2, Throwable th) {
        g(6, str, str2, th);
    }

    public boolean e(int i) {
        return this.a <= i;
    }

    public void h(int i) {
        this.a = i;
    }

    public void i(String str, String str2) {
        f(2, str, str2);
    }

    public void j(String str, String str2) {
        f(5, str, str2);
    }

    public void k(String str, String str2, Throwable th) {
        g(5, str, str2, th);
    }

    public void l(String str, String str2) {
        f(6, str, str2);
    }

    public void m(String str, String str2, Throwable th) {
        g(6, str, str2, th);
    }
}
