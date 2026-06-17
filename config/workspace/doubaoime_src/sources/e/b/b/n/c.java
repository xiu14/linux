package e.b.b.n;

import android.os.Build;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class c {
    public static boolean a = false;
    public static boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static String f9493c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f9494d;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (e.a.a.a.a.S0(r0, "flyme") != false) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a() {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.b.n.c.a():java.lang.String");
    }

    private static String b(String str) {
        String str2;
        String str3 = "";
        BufferedReader bufferedReader = null;
        try {
            if (f9494d == null) {
                f9494d = Class.forName("android.os.SystemProperties").getMethod(MonitorConstants.CONNECT_TYPE_GET, String.class);
            }
            str2 = (String) f9494d.invoke(null, str);
        } catch (Exception e2) {
            e2.printStackTrace();
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            Process exec = Runtime.getRuntime().exec("getprop " + str);
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getInputStream()), 1024);
            try {
                str3 = bufferedReader2.readLine();
                exec.destroy();
                try {
                    bufferedReader2.close();
                } catch (Throwable unused) {
                }
                return str3;
            } catch (Throwable unused2) {
                bufferedReader = bufferedReader2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused3) {
                    }
                }
                return str3;
            }
        } catch (Throwable unused4) {
        }
    }

    public static boolean c() {
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return e.a.a.a.a.S0(str, "oppo");
    }
}
