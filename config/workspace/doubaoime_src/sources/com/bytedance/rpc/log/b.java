package com.bytedance.rpc.log;

import android.util.Log;
import com.bytedance.common.wschannel.WsConstants;
import e.b.l.q.c;

/* loaded from: classes2.dex */
public class b {
    private static LogLevel a = LogLevel.DEBUG;

    public static void a(CharSequence charSequence) {
        if (h(LogLevel.DEBUG) && c.c(charSequence)) {
            Log.d(i(null), charSequence.toString());
        }
    }

    public static void b(String str, CharSequence charSequence) {
        if (h(LogLevel.ERROR) && c.c(charSequence)) {
            Log.e(i(str), charSequence.toString());
        }
    }

    public static void c(Throwable th) {
        if (h(LogLevel.ERROR)) {
            String i = i(null);
            if (i == null) {
                i = WsConstants.KEY_CONNECTION_ERROR;
            }
            b(i, a.a().b(th));
        }
    }

    public static final boolean d() {
        return h(LogLevel.DEBUG);
    }

    public static final boolean e() {
        return h(LogLevel.ERROR);
    }

    public static final boolean f() {
        return h(LogLevel.WARN);
    }

    public static void g(LogLevel logLevel) {
        if (logLevel != null) {
            a = logLevel;
        }
    }

    private static boolean h(LogLevel logLevel) {
        return logLevel != null && a.log() && a.ordinal() <= logLevel.ordinal();
    }

    private static String i(String str) {
        if (!c.a(str)) {
            return str;
        }
        if (str == null && c.c("tt-rpc")) {
            return "tt-rpc";
        }
        StackTraceElement[] U0 = e.a.a.a.a.U0();
        for (int i = 2; i < 4; i++) {
            StackTraceElement stackTraceElement = U0[i];
            if (!b.class.getName().equals(stackTraceElement.getClassName())) {
                String fileName = stackTraceElement.getFileName();
                int lastIndexOf = fileName == null ? -1 : fileName.lastIndexOf(46);
                return lastIndexOf > 0 ? fileName.substring(0, lastIndexOf) : fileName;
            }
        }
        return str;
    }

    public static void j(CharSequence charSequence) {
        if (h(LogLevel.WARN) && c.c(charSequence)) {
            Log.w(i(null), charSequence.toString());
        }
    }
}
