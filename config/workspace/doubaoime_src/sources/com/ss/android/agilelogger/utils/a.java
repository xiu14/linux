package com.ss.android.agilelogger.utils;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.PrintWriter;
import java.net.UnknownHostException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class a {
    private static void a(Bundle bundle, StringBuilder sb) {
        boolean z = true;
        for (String str : bundle.keySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(str);
            sb.append('=');
            Object obj = bundle.get(str);
            if (obj instanceof int[]) {
                sb.append(Arrays.toString((int[]) obj));
            } else if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (bArr.length < 102400) {
                    sb.append(Arrays.toString(bArr));
                } else {
                    sb.append("byte[] in Bundle is too long, limit for 100K");
                }
            } else if (obj instanceof boolean[]) {
                sb.append(Arrays.toString((boolean[]) obj));
            } else if (obj instanceof short[]) {
                sb.append(Arrays.toString((short[]) obj));
            } else if (obj instanceof long[]) {
                sb.append(Arrays.toString((long[]) obj));
            } else if (obj instanceof float[]) {
                sb.append(Arrays.toString((float[]) obj));
            } else if (obj instanceof double[]) {
                sb.append(Arrays.toString((double[]) obj));
            } else if (obj instanceof String[]) {
                sb.append(Arrays.toString((String[]) obj));
            } else if (obj instanceof CharSequence[]) {
                sb.append(Arrays.toString((CharSequence[]) obj));
            } else if (obj instanceof Parcelable[]) {
                sb.append(Arrays.toString((Parcelable[]) obj));
            } else if (obj instanceof Bundle) {
                sb.append(b((Bundle) obj));
            } else {
                sb.append(obj);
            }
            z = false;
        }
    }

    public static String b(Bundle bundle) {
        if (bundle == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Bundle[{");
        a(bundle, sb);
        sb.append("}]");
        return sb.toString();
    }

    public static String c(Throwable th) {
        if (th == null) {
            return "";
        }
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof UnknownHostException) {
                return "ALOG:UnknownHostException";
            }
        }
        b bVar = new b();
        PrintWriter printWriter = new PrintWriter(bVar);
        try {
            th.printStackTrace(printWriter);
        } catch (Throwable unused) {
        }
        printWriter.flush();
        return bVar.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void d(android.content.Intent r7, java.lang.StringBuilder r8) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.agilelogger.utils.a.d(android.content.Intent, java.lang.StringBuilder):void");
    }

    public static String e(Intent intent) {
        if (intent == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Intent { ");
        d(intent, sb);
        sb.append(" }");
        return sb.toString();
    }
}
