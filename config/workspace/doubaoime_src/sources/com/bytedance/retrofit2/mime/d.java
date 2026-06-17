package com.bytedance.retrofit2.mime;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class d {
    private static final Pattern a = Pattern.compile("\\Wcharset=([^\\s;]+)", 2);

    public static String a(String str, String str2) {
        try {
            Matcher matcher = a.matcher(str);
            if (matcher.find()) {
                return matcher.group(1).replaceAll("[\"\\\\]", "");
            }
        } catch (IllegalArgumentException unused) {
        }
        return str2;
    }
}
