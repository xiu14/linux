package com.bytedance.crash.util;

import androidx.annotation.NonNull;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class g {
    public static final /* synthetic */ int a = 0;

    static {
        new StackTraceElement("", "", "", 0);
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @NonNull
    public static String a(@NonNull Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            c(th, printWriter);
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            return stringWriter2;
        } catch (Throwable unused) {
            printWriter.close();
            return "";
        }
    }

    private static void b(Throwable th, PrintWriter printWriter, String str, String str2, Set set, int i) {
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
            b(th2, printWriter, "Suppressed: ", e.a.a.a.a.s(str2, "\t"), set, i4 > 10 ? i4 : 10);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            int i5 = i / 2;
            b(cause, printWriter, "Caused by: ", str2, set, i5 > 10 ? i5 : 10);
        }
    }

    private static void c(Throwable th, PrintWriter printWriter) {
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
                b(th2, printWriter, "Suppressed: ", "\t", newSetFromMap, 128);
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                b(cause, printWriter, "Caused by: ", "", newSetFromMap, 128);
            }
        }
    }
}
