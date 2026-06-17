package com.google.gson.internal;

import com.google.gson.ReflectionAccessFilter;
import com.google.gson.internal.bind.TypeAdapters;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.AccessibleObject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class x {
    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return z.a.a(accessibleObject, obj);
    }

    public static ReflectionAccessFilter.FilterResult b(List<ReflectionAccessFilter> list, Class<?> cls) {
        Iterator<ReflectionAccessFilter> it2 = list.iterator();
        while (it2.hasNext()) {
            ReflectionAccessFilter.FilterResult a = it2.next().a(cls);
            if (a != ReflectionAccessFilter.FilterResult.INDECISIVE) {
                return a;
            }
        }
        return ReflectionAccessFilter.FilterResult.ALLOW;
    }

    public static DateFormat c(int i, int i2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i == 1) {
            str = "MMMM d, yyyy";
        } else if (i == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(e.a.a.a.a.j("Unknown DateFormat style: ", i));
            }
            str = "M/d/yy";
        }
        sb.append(str);
        sb.append(" ");
        if (i2 == 0 || i2 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i2 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException(e.a.a.a.a.j("Unknown DateFormat style: ", i2));
            }
            str2 = "h:mm a";
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    public static com.google.gson.i d(com.google.gson.stream.a aVar) throws com.google.gson.m {
        boolean z;
        try {
            try {
                aVar.c0();
                z = false;
            } catch (EOFException e2) {
                e = e2;
                z = true;
            }
            try {
                return TypeAdapters.V.b(aVar);
            } catch (EOFException e3) {
                e = e3;
                if (z) {
                    return com.google.gson.k.a;
                }
                throw new com.google.gson.r(e);
            }
        } catch (com.google.gson.stream.c e4) {
            throw new com.google.gson.r(e4);
        } catch (IOException e5) {
            throw new com.google.gson.j(e5);
        } catch (NumberFormatException e6) {
            throw new com.google.gson.r(e6);
        }
    }

    public static Writer e(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new B(appendable);
    }
}
