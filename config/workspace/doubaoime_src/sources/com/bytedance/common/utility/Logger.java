package com.bytedance.common.utility;

import android.util.Log;
import e.b.a.a.a.a.a;

@Deprecated
/* loaded from: classes.dex */
public class Logger {
    private static final String TAG = "Logger";
    private static int mLevel = 4;
    private static c sLogWriter = b.a.a;

    private static final class b extends c {

        private static class a {
            private static final b a = new b(null);
        }

        b(a aVar) {
        }

        @Override // e.b.a.a.a.a.a.c
        public void b(String str, String str2) {
            Log.d(str, str2);
        }

        @Override // e.b.a.a.a.a.a.c
        public void c(String str, String str2, Throwable th) {
            Log.d(str, str2, th);
        }

        @Override // e.b.a.a.a.a.a.c
        public void d(String str, String str2) {
            Log.e(str, str2);
        }

        @Override // e.b.a.a.a.a.a.c
        public void e(String str, String str2, Throwable th) {
            Log.e(str, str2, th);
        }

        @Override // e.b.a.a.a.a.a.c
        public void f(String str, String str2) {
            Log.i(str, str2);
        }

        @Override // e.b.a.a.a.a.a.c
        public void g(String str, String str2, Throwable th) {
            Log.i(str, str2, th);
        }

        @Override // e.b.a.a.a.a.a.c
        public void i(String str, String str2) {
            Log.v(str, str2);
        }

        @Override // e.b.a.a.a.a.a.c
        public void j(String str, String str2, Throwable th) {
            Log.v(str, str2, th);
        }

        @Override // e.b.a.a.a.a.a.c
        public void k(String str, String str2) {
            Log.w(str, str2);
        }

        @Override // e.b.a.a.a.a.a.c
        public void l(String str, String str2, Throwable th) {
            Log.w(str, str2, th);
        }
    }

    public static abstract class c extends a.c {
        @Override // e.b.a.a.a.a.a.c
        public boolean a(int i) {
            return Logger.getLogLevel() <= i;
        }

        @Override // e.b.a.a.a.a.a.c
        public void h(String str, String str2) {
        }
    }

    public static void alertErrorInfo(String str) {
        if (e.b.a.a.a.a.a.c()) {
            e.b.a.a.a.a.a.d(Log.getStackTraceString(new IllegalStateException(str)));
        }
    }

    public static void d(String str, String str2) {
        e.b.a.a.a.a.a.a(str, str2);
    }

    public static boolean debug() {
        return e.b.a.a.a.a.a.c();
    }

    public static void e(String str) {
        e.b.a.a.a.a.a.d(str);
    }

    public static int getLogLevel() {
        return e.b.a.a.a.a.a.g();
    }

    private static String getSimpleClassName(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf < 0 ? str : str.substring(lastIndexOf + 1);
    }

    public static void i(String str) {
        e.b.a.a.a.a.a.h(str);
    }

    @Deprecated
    public static void k(String str) {
        e.b.a.a.a.a.a.k(str);
    }

    public static void registerLogHandler(c cVar) {
        e.b.a.a.a.a.a.m(cVar);
    }

    public static void setLogLevel(int i) {
        e.b.a.a.a.a.a.n(i);
    }

    public static void st(String str, int i) {
        int i2 = e.b.a.a.a.a.a.f9361c;
        try {
            throw new Exception();
        } catch (Exception e2) {
            StackTraceElement[] stackTrace = e2.getStackTrace();
            StringBuilder sb = new StringBuilder();
            for (int i3 = 1; i3 < Math.min(i, stackTrace.length); i3++) {
                if (i3 > 1) {
                    sb.append("\n");
                }
                String className = stackTrace[i3].getClassName();
                int lastIndexOf = className.lastIndexOf(46);
                if (lastIndexOf >= 0) {
                    className = className.substring(lastIndexOf + 1);
                }
                sb.append(className);
                sb.append(".");
                sb.append(stackTrace[i3].getMethodName());
            }
            e.b.a.a.a.a.a.o(str, sb.toString());
        }
    }

    public static void throwException(Throwable th) {
        int i = e.b.a.a.a.a.a.f9361c;
        if (th == null) {
            return;
        }
        th.printStackTrace();
        if (e.b.a.a.a.a.a.c()) {
            e.b.a.a.a.a.a.d(Log.getStackTraceString(new RuntimeException("Error! Now in debug, we alert to you to correct it !", th)));
        }
    }

    public static void v(String str) {
        e.b.a.a.a.a.a.o(TAG, str);
    }

    public static void w(String str) {
        e.b.a.a.a.a.a.q(str);
    }

    public static void d(String str) {
        e.b.a.a.a.a.a.a(TAG, str);
    }

    public static void e(String str, String str2) {
        e.b.a.a.a.a.a.e(str, str2);
    }

    public static void i(String str, String str2) {
        e.b.a.a.a.a.a.i(str, str2);
    }

    @Deprecated
    public static void k(String str, String str2) {
        e.b.a.a.a.a.a.l(str, str2);
    }

    public static void v(String str, String str2) {
        e.b.a.a.a.a.a.o(str, str2);
    }

    public static void w(String str, String str2) {
        e.b.a.a.a.a.a.r(str, str2);
    }

    public static void d(String str, String str2, Throwable th) {
        e.b.a.a.a.a.a.b(str, str2, th);
    }

    public static void e(String str, String str2, Throwable th) {
        e.b.a.a.a.a.a.f(str, str2, th);
    }

    public static void i(String str, String str2, Throwable th) {
        e.b.a.a.a.a.a.j(str, str2, th);
    }

    public static void v(String str, String str2, Throwable th) {
        e.b.a.a.a.a.a.p(str, str2, th);
    }

    public static void w(String str, String str2, Throwable th) {
        e.b.a.a.a.a.a.s(str, str2, th);
    }
}
