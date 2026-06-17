package com.xiaomi.channel.commonutils.logger;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.xiaomi.push.k;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class c {
    private static int a = 2;

    /* renamed from: a, reason: collision with other field name */
    private static Context f0a = null;

    /* renamed from: a, reason: collision with other field name */
    private static AdvancedLoggerInterface f1a = null;

    /* renamed from: a, reason: collision with other field name */
    private static final Integer f2a;

    /* renamed from: a, reason: collision with other field name */
    private static String f3a = null;

    /* renamed from: a, reason: collision with other field name */
    private static final HashMap<Integer, Long> f4a;

    /* renamed from: a, reason: collision with other field name */
    private static AtomicInteger f5a = null;

    /* renamed from: a, reason: collision with other field name */
    private static boolean f6a = false;
    private static final HashMap<Integer, String> b;

    /* renamed from: b, reason: collision with other field name */
    private static boolean f7b = false;

    static class a implements AdvancedLoggerInterface {
        private String a = c.f3a;

        a() {
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void log(String str) {
            Log.v(this.a, str);
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void setTag(String str) {
            this.a = str;
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void log(String str, Throwable th) {
            Log.v(this.a, str, th);
        }

        @Override // com.xiaomi.channel.commonutils.logger.AdvancedLoggerInterface
        public void log(int i, String str) {
            Log.v(this.a, str);
        }

        @Override // com.xiaomi.channel.commonutils.logger.AdvancedLoggerInterface
        public void log(int i, String str, Throwable th) {
            Log.v(this.a, str, th);
        }
    }

    static {
        StringBuilder M = e.a.a.a.a.M("XMPush-");
        M.append(Process.myPid());
        f3a = M.toString();
        f1a = new a();
        f4a = new HashMap<>();
        b = new HashMap<>();
        f2a = -1;
        f5a = new AtomicInteger(1);
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m20a() {
        return false;
    }

    public static void b(String str) {
        if (m21a(0)) {
            a(0, m14a(str));
        }
    }

    public static void c(String str) {
        if (m21a(0)) {
            a(1, m14a(str));
        }
    }

    public static void d(String str) {
        if (m21a(4)) {
            a(4, m14a(str));
        }
    }

    public static void e(String str) {
        if (f6a) {
            m15a(str);
            return;
        }
        Log.w(f3a, m14a(str));
        if (f7b) {
            return;
        }
        m15a(str);
    }

    public static void a(LoggerInterface loggerInterface) {
        if (loggerInterface == null) {
            return;
        }
        if (loggerInterface instanceof AdvancedLoggerInterface) {
            f1a = (AdvancedLoggerInterface) loggerInterface;
        } else {
            f1a = new b(loggerInterface);
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public static void m22b(String str, String str2) {
        if (m21a(1)) {
            a(1, b(str, str2));
        }
    }

    public static void c(String str, String str2) {
        if (m21a(4)) {
            a(4, b(str, str2));
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m21a(int i) {
        return i >= a || m20a();
    }

    public static void b(String str, Object... objArr) {
        if (m21a(1)) {
            a(1, a(str, objArr));
        }
    }

    public static void c(String str, Object... objArr) {
        if (f6a) {
            m17a(str, objArr);
            return;
        }
        Log.w(f3a, a(str, objArr));
        if (f7b) {
            return;
        }
        m17a(str, objArr);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m15a(String str) {
        if (m21a(2)) {
            a(2, m14a(str));
        }
    }

    public static void b(Object... objArr) {
        if (m21a(4)) {
            a(4, a(objArr));
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m16a(String str, String str2) {
        if (m21a(2)) {
            a(2, b(str, str2));
        }
    }

    private static String b(String str, String str2) {
        return b() + a(str, str2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m17a(String str, Object... objArr) {
        if (m21a(2)) {
            a(2, a(str, objArr));
        }
    }

    private static String b() {
        StringBuilder M = e.a.a.a.a.M("[Tid:");
        M.append(Thread.currentThread().getId());
        M.append("] ");
        return M.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m19a(Object... objArr) {
        if (m21a(0)) {
            a(0, a(objArr));
        }
    }

    public static void a(String str, Throwable th) {
        if (m21a(4)) {
            a(4, m14a(str), th);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m18a(Throwable th) {
        if (m21a(4)) {
            a(4, th);
        }
    }

    public static Integer a(String str) {
        if (a <= 1) {
            Integer valueOf = Integer.valueOf(f5a.incrementAndGet());
            f4a.put(valueOf, Long.valueOf(System.currentTimeMillis()));
            b.put(valueOf, str);
            f1a.log(str + " starts");
            return valueOf;
        }
        return f2a;
    }

    public static void a(Integer num) {
        if (a <= 1) {
            HashMap<Integer, Long> hashMap = f4a;
            if (hashMap.containsKey(num)) {
                long longValue = hashMap.remove(num).longValue();
                String remove = b.remove(num);
                long currentTimeMillis = System.currentTimeMillis() - longValue;
                f1a.log(remove + " ends in " + currentTimeMillis + " ms");
            }
        }
    }

    public static void a(int i, String str) {
        if (i >= a) {
            f1a.log(i, str);
            return;
        }
        if (m20a()) {
            Log.d("MyLog", "-->log(" + i + "): " + str);
        }
    }

    public static void a(int i, Throwable th) {
        if (i >= a) {
            f1a.log(i, "", th);
            return;
        }
        if (m20a()) {
            Log.w("MyLog", "-->log(" + i + "): ", th);
        }
    }

    public static void a(int i, String str, Throwable th) {
        if (i >= a) {
            f1a.log(i, str, th);
            return;
        }
        if (m20a()) {
            Log.w("MyLog", "-->log(" + i + "): " + str, th);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static String m14a(String str) {
        return e.a.a.a.a.J(new StringBuilder(), b(), str);
    }

    private static String a(Object... objArr) {
        StringBuilder M = e.a.a.a.a.M("[Tid:");
        M.append(Thread.currentThread().getId());
        M.append("] ");
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                M.append(obj);
            }
        }
        return M.toString();
    }

    private static String a(String str, Object... objArr) {
        StringBuilder M = e.a.a.a.a.M("[Tid:");
        M.append(Thread.currentThread().getId());
        M.append("] ");
        M.append("[");
        M.append(str);
        M.append("] ");
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                M.append(obj);
            }
        }
        return M.toString();
    }

    public static String a(String str, String str2) {
        return e.a.a.a.a.u("[", str, "] ", str2);
    }

    public static void a(int i) {
        if (i < 0 || i > 5) {
            a(2, "set log level as " + i);
        }
        a = i;
    }

    public static int a() {
        return a;
    }

    public static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        if (th != null) {
            th.printStackTrace(new PrintWriter(stringWriter));
        }
        return stringWriter.toString();
    }

    public static void a(Context context) {
        f0a = context;
        if (k.m655a(context)) {
            f6a = true;
        }
        if (k.m654a()) {
            f7b = true;
        }
    }
}
