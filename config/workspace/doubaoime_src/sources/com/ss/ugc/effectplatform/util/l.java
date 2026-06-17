package com.ss.ugc.effectplatform.util;

/* loaded from: classes2.dex */
public final class l {
    public static final boolean a(String str, String str2) {
        if (b(str) && b(str2)) {
            return true;
        }
        return kotlin.s.c.l.a(str, str2);
    }

    public static final boolean b(String str) {
        if (str != null) {
            if (!(str.length() == 0)) {
                return false;
            }
        }
        return true;
    }
}
