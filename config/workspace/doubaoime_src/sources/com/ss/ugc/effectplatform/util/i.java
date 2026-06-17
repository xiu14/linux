package com.ss.ugc.effectplatform.util;

import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.x.d;

/* loaded from: classes2.dex */
public final class i {
    private static boolean a;
    private static final Map<String, String> b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final i f8543c = null;

    public static final String a(ModelInfo modelInfo) {
        kotlin.s.c.l.g(modelInfo, DBDefinition.SEGMENT_INFO);
        return modelInfo.getName() + "_v" + modelInfo.getVersion() + "_size" + modelInfo.getType() + "_md5" + r.Q(modelInfo) + ".model";
    }

    public static final String b(String str) {
        kotlin.s.c.l.g(str, "sourceStr");
        if (!kotlin.text.a.d(str, "md5", false, 2, null)) {
            return null;
        }
        int q = kotlin.text.a.q(str, "md5", 0, false, 6, null);
        int w = kotlin.text.a.w(str, "_model", 0, false, 6, null);
        if (w == -1) {
            w = kotlin.text.a.w(str, ".model", 0, false, 6, null);
        }
        try {
            String substring = str.substring(q + 3, w);
            kotlin.s.c.l.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        } catch (Exception unused) {
            return null;
        }
    }

    private static final String c(String str, String str2) {
        int w = kotlin.text.a.w(str, "/", 0, false, 6, null);
        int a2 = d.a.e.d.a(str, str2);
        int i = w + 1;
        kotlin.s.c.l.g(str, "str");
        if (!(str.length() == 0) && i >= 0 && a2 >= 0 && i < a2 && i < str.length() && a2 <= str.length()) {
            String substring = str.substring(i, a2);
            kotlin.s.c.l.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        int a3 = d.a.e.d.a(str, "\\.model|_model|\\.dat");
        if (a3 <= 0 || a3 <= w) {
            String substring2 = str.substring(i, str.length());
            kotlin.s.c.l.b(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring2;
        }
        String substring3 = str.substring(i, a3);
        kotlin.s.c.l.b(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring3;
    }

    public static final String d(String str) {
        kotlin.s.c.l.g(str, "sourceStr");
        if (!a) {
            return c(str, "_v[0-9]");
        }
        Map<String, String> map = b;
        String str2 = map.get(str);
        if (!(str2 == null || str2.length() == 0)) {
            return str2;
        }
        String c2 = c(str, "_v[0-9]+[\\._][0-9]+[\\._](size[0-9]+_md5[a-z0-9]+_)?(model|dat|bin|bytenn|zip)");
        map.put(str, c2);
        return c2;
    }

    public static final int e(String str) {
        int a2;
        kotlin.s.c.l.g(str, "sourceStr");
        if (!kotlin.text.a.d(str, MonitorConstants.SIZE, false, 2, null)) {
            return 0;
        }
        int w = kotlin.text.a.w(str, MonitorConstants.SIZE, 0, false, 6, null);
        if (kotlin.text.a.d(str, "md5", false, 2, null)) {
            kotlin.x.e c2 = kotlin.text.i.c(new kotlin.text.i("_md5"), str, 0, 2);
            if (((d.a) c2.iterator()).hasNext()) {
                kotlin.s.c.l.f(c2, "<this>");
                d.a aVar = (d.a) c2.iterator();
                if (!aVar.hasNext()) {
                    throw new NoSuchElementException("Sequence is empty.");
                }
                Object next = aVar.next();
                while (aVar.hasNext()) {
                    next = aVar.next();
                }
                a2 = ((kotlin.text.e) next).b().a();
            }
            a2 = -1;
        } else {
            kotlin.x.e c3 = kotlin.text.i.c(new kotlin.text.i("\\.model|_model|\\.dat"), str, 0, 2);
            if (((d.a) c3.iterator()).hasNext()) {
                kotlin.s.c.l.f(c3, "<this>");
                d.a aVar2 = (d.a) c3.iterator();
                if (!aVar2.hasNext()) {
                    throw new NoSuchElementException("Sequence is empty.");
                }
                Object next2 = aVar2.next();
                while (aVar2.hasNext()) {
                    next2 = aVar2.next();
                }
                a2 = ((kotlin.text.e) next2).b().a();
            }
            a2 = -1;
        }
        if (w >= a2) {
            return -1;
        }
        String substring = str.substring(w + 4, a2);
        kotlin.s.c.l.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        try {
            return Integer.parseInt(substring);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final String f(String str) {
        kotlin.s.c.l.g(str, "sourceStr");
        kotlin.text.a.w(str, "/", 0, false, 6, null);
        int w = kotlin.text.a.w(str, "_v", 0, false, 6, null);
        int i = -1;
        kotlin.x.e c2 = kotlin.text.i.c(new kotlin.text.i("\\.model|_model|\\.dat"), str, 0, 2);
        if (((d.a) c2.iterator()).hasNext()) {
            kotlin.s.c.l.f(c2, "<this>");
            d.a aVar = (d.a) c2.iterator();
            if (!aVar.hasNext()) {
                throw new NoSuchElementException("Sequence is empty.");
            }
            Object next = aVar.next();
            while (aVar.hasNext()) {
                next = aVar.next();
            }
            i = ((kotlin.text.e) next).b().a();
        }
        if (w <= 0) {
            return "1.0";
        }
        String substring = str.substring(w + 2, i);
        kotlin.s.c.l.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void g(boolean z) {
        a = a || z;
    }
}
