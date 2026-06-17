package com.bytedance.article.common.monitor.stack;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes.dex */
public class b {
    private static void a(Map<String, String> map, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (map != null) {
                for (String str : map.keySet()) {
                    jSONObject2.put(str, map.get(str));
                }
                jSONObject.put(MonitorConstants.CUSTOM, jSONObject2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(String str) {
        StackTraceElement stackTraceElement;
        if (com.bytedance.services.apm.api.a.f() != null) {
            com.bytedance.services.apm.api.a.b(str);
            return;
        }
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace != null) {
            try {
                if (stackTrace.length > 4 && (stackTraceElement = stackTrace[3]) != null) {
                    String className = stackTraceElement.getClassName();
                    String methodName = stackTraceElement.getMethodName();
                    int lineNumber = stackTraceElement.getLineNumber();
                    String R = com.bytedance.android.input.k.b.a.R(stackTrace);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("event_type", "exception");
                    jSONObject.put("timestamp", System.currentTimeMillis());
                    jSONObject.put("class_ref", className);
                    jSONObject.put("method", methodName);
                    jSONObject.put("line_num", lineNumber);
                    jSONObject.put("stack", R);
                    jSONObject.put("exception_type", 1);
                    jSONObject.put("is_core", 1);
                    if (!TextUtils.isEmpty(str)) {
                        if (str.length() > 1024) {
                            jSONObject.put("message", str.substring(0, 1024));
                        } else {
                            jSONObject.put("message", str);
                        }
                    }
                    a(null, jSONObject);
                    d.j().i("core_exception_monitor", jSONObject.toString(), str, true);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0070, code lost:
    
        if ((r11 instanceof javax.net.ssl.SSLHandshakeException) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(java.lang.Throwable r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.article.common.monitor.stack.b.c(java.lang.Throwable, java.lang.String):void");
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @NonNull
    public static String d(@NonNull Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            f(th, printWriter);
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            return stringWriter2;
        } catch (Throwable unused) {
            printWriter.close();
            return "";
        }
    }

    private static void e(Throwable th, PrintWriter printWriter, String str, String str2, Set set, int i) {
        if (set.contains(th)) {
            printWriter.println("\t[CIRCULAR REFERENCE:" + th + "]");
            return;
        }
        set.add(th);
        StackTraceElement[] stackTrace = th.getStackTrace();
        boolean z = stackTrace.length > i;
        printWriter.println(str2 + str + th);
        int length = stackTrace.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            if (z && i3 > i) {
                StringBuilder M = e.a.a.a.a.M("\t... skip ");
                M.append((stackTrace.length - i3) - (i / 2));
                M.append(" lines");
                printWriter.println(M.toString());
                break;
            }
            printWriter.println("\tat " + stackTraceElement);
            i3++;
            i2++;
        }
        if (z) {
            for (int length2 = stackTrace.length - (i / 2); length2 < stackTrace.length; length2++) {
                StringBuilder M2 = e.a.a.a.a.M("\tat ");
                M2.append(stackTrace[length2]);
                printWriter.println(M2.toString());
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            int i4 = i / 2;
            e(th2, printWriter, "Suppressed: ", e.a.a.a.a.s(str2, "\t"), set, i4 > 10 ? i4 : 10);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            int i5 = i / 2;
            e(cause, printWriter, "Caused by: ", str2, set, i5 > 10 ? i5 : 10);
        }
    }

    private static void f(Throwable th, PrintWriter printWriter) {
        if (th != null) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            newSetFromMap.add(th);
            printWriter.println(th);
            StackTraceElement[] stackTrace = th.getStackTrace();
            boolean z = stackTrace.length > 384;
            int length = stackTrace.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (z && i2 > 256) {
                    StringBuilder M = e.a.a.a.a.M("\t... skip ");
                    M.append((stackTrace.length - i2) - 128);
                    M.append(" lines");
                    printWriter.println(M.toString());
                    break;
                }
                printWriter.println("\tat " + stackTraceElement);
                i2++;
                i++;
            }
            if (z) {
                for (int length2 = stackTrace.length - 128; length2 < stackTrace.length; length2++) {
                    StringBuilder M2 = e.a.a.a.a.M("\tat ");
                    M2.append(stackTrace[length2]);
                    printWriter.println(M2.toString());
                }
            }
            for (Throwable th2 : th.getSuppressed()) {
                e(th2, printWriter, "Suppressed: ", "\t", newSetFromMap, 128);
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                e(cause, printWriter, "Caused by: ", "", newSetFromMap, 128);
            }
        }
    }
}
