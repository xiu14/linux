package com.bytedance.ttnet.utils;

import com.bytedance.frameworks.baselib.network.http.p.g;
import com.bytedance.retrofit2.H;
import com.xiaomi.mipush.sdk.Constants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class d {
    public static boolean a(String str, List<String> list) {
        boolean z;
        if (!com.bytedance.android.input.k.b.a.Y(str) && !com.bytedance.android.input.k.b.a.g0(list)) {
            for (String str2 : list) {
                if (!com.bytedance.android.input.k.b.a.Y(str2)) {
                    if (!com.bytedance.frameworks.baselib.network.c.b.d()) {
                        if (com.bytedance.android.input.k.b.a.Y(str) || com.bytedance.android.input.k.b.a.Y(str2)) {
                            z = false;
                        } else if (str.equalsIgnoreCase(str2)) {
                            z = true;
                        } else {
                            String lowerCase = str.toLowerCase();
                            if (str2.startsWith(".")) {
                                z = lowerCase.endsWith(str2.toLowerCase());
                            } else {
                                StringBuilder M = e.a.a.a.a.M(".");
                                M.append(str2.toLowerCase());
                                z = lowerCase.endsWith(M.toString());
                            }
                        }
                        if (z) {
                            return true;
                        }
                    } else if (str.endsWith(str2)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String b(Throwable th) {
        PrintWriter printWriter;
        String str = null;
        try {
            StringWriter stringWriter = new StringWriter();
            printWriter = new PrintWriter(stringWriter);
            try {
                th.printStackTrace(printWriter);
                Throwable cause = th.getCause();
                if (cause != null) {
                    cause.printStackTrace(printWriter);
                    Throwable cause2 = cause.getCause();
                    if (cause2 != null) {
                        cause2.printStackTrace(printWriter);
                    }
                }
                str = stringWriter.toString();
            } catch (Throwable th2) {
                th = th2;
                try {
                    th.printStackTrace();
                } finally {
                    if (printWriter != null) {
                        printWriter.close();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            printWriter = null;
        }
        return str;
    }

    public static void c(String str, List<String> list) {
        if (com.bytedance.android.input.k.b.a.Y(str) || list == null) {
            return;
        }
        for (String str2 : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            if (!com.bytedance.android.input.k.b.a.Y(str2) && !a(str2, list)) {
                list.add(str2.trim());
            }
        }
    }

    public static void d(g<String, H> gVar, com.bytedance.retrofit2.S.a aVar) {
        if (gVar == null || gVar.f() <= 0) {
            return;
        }
        Map<String, H> c2 = gVar.c();
        Collection<H> values = c2.values();
        synchronized (c2) {
            Iterator<H> it2 = values.iterator();
            while (it2.hasNext()) {
                List<com.bytedance.retrofit2.S.a> h = it2.next().h();
                if (h != null && !h.contains(aVar)) {
                    h.add(aVar);
                }
            }
        }
    }

    public static void e(g<String, H> gVar, com.bytedance.retrofit2.S.a aVar) {
        if (gVar == null || gVar.f() <= 0) {
            return;
        }
        Map<String, H> c2 = gVar.c();
        Collection<H> values = c2.values();
        synchronized (c2) {
            Iterator<H> it2 = values.iterator();
            while (it2.hasNext()) {
                List<com.bytedance.retrofit2.S.a> h = it2.next().h();
                if (h != null) {
                    h.remove(aVar);
                }
            }
        }
    }
}
