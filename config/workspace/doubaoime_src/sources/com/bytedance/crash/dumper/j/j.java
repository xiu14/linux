package com.bytedance.crash.dumper.j;

import androidx.core.view.InputDeviceCompat;
import java.io.File;

/* loaded from: classes.dex */
public class j {
    private static final char[] a = {'C', 'a', 'u', 's', 'e', 'd', ' ', 'b', 'y', ':', ' '};
    private static final char[] b = {'S', 'u', 'p', 'p', 'r', 'e', 's', 's', 'e', 'd', ':', ' '};

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f4610c = {'\t', 'a', 't', ' '};

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f4611d = {'\t', '.', '.', '.', ' '};

    /* renamed from: e, reason: collision with root package name */
    private static final char[] f4612e = {' ', 'm', 'o', 'r', 'e', '\n'};

    /* renamed from: f, reason: collision with root package name */
    private static final char[] f4613f = {' ', 's', 'k', 'i', 'p', '\n'};

    private static void a(h hVar, StackTraceElement[] stackTraceElementArr, int i) {
        int i2 = 0;
        if (i <= 256) {
            while (i2 < i) {
                hVar.f(f4610c);
                hVar.c(stackTraceElementArr[i2]);
                hVar.a('\n');
                i2++;
            }
            return;
        }
        while (i2 < 128) {
            hVar.f(f4610c);
            hVar.c(stackTraceElementArr[i2]);
            hVar.a('\n');
            i2++;
        }
        hVar.f(f4611d);
        hVar.b(i + InputDeviceCompat.SOURCE_ANY);
        hVar.f(f4613f);
        for (int i3 = i - 128; i3 < i; i3++) {
            hVar.f(f4610c);
            hVar.c(stackTraceElementArr[i3]);
            hVar.a('\n');
        }
    }

    public static void b(File file, Throwable th) {
        try {
            i iVar = new i(file.getAbsolutePath() + "/throwable.txt");
            h hVar = new h(iVar);
            hVar.e(th);
            hVar.a('\n');
            StackTraceElement[] stackTrace = th.getStackTrace();
            a(hVar, stackTrace, stackTrace.length);
            for (Throwable th2 : th.getSuppressed()) {
                c(hVar, b, 1, th2, th);
            }
            Throwable cause = th.getCause();
            if (cause != null) {
                c(hVar, a, 0, cause, th);
            }
            iVar.h();
        } catch (Throwable th3) {
            com.bytedance.crash.Q.b.c("NPTH_DUMP", th3);
        }
    }

    private static void c(h hVar, char[] cArr, int i, Throwable th, Throwable th2) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        StackTraceElement[] stackTrace2 = th.getStackTrace();
        int length = stackTrace2.length - 1;
        int length2 = stackTrace.length;
        while (true) {
            length2--;
            if (length < 0 || length2 < 0 || !stackTrace2[length].equals(stackTrace[length2])) {
                break;
            } else {
                length--;
            }
        }
        int length3 = (stackTrace2.length - 1) - length;
        hVar.g(i);
        hVar.f(cArr);
        hVar.e(th);
        hVar.a('\n');
        a(hVar, stackTrace2, stackTrace2.length - length3);
        if (length3 != 0) {
            hVar.g(i);
            hVar.f(f4611d);
            hVar.b(length3);
            hVar.f(f4612e);
        }
        for (Throwable th3 : th.getSuppressed()) {
            c(hVar, b, i + 1, th3, th);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            c(hVar, a, i, cause, th);
        }
    }
}
