package org.apache.http.conn.util;

import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class a {
    private static final Pattern a = Pattern.compile("^(([1-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){1}(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){2}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    private static final Pattern b;

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f10753c;

    static {
        Pattern.compile("^::[fF]{4}:(([1-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){1}(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){2}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
        b = Pattern.compile("^[0-9a-fA-F]{1,4}(:[0-9a-fA-F]{1,4}){7}$");
        f10753c = Pattern.compile("^(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)::(([0-9A-Fa-f]{1,4}(:[0-9A-Fa-f]{1,4}){0,5})?)$");
    }

    public static boolean a(String str) {
        return a.matcher(str).matches();
    }

    public static boolean b(String str) {
        if (!b.matcher(str).matches()) {
            int i = 0;
            for (int i2 = 0; i2 < str.length(); i2++) {
                if (str.charAt(i2) == ':') {
                    i++;
                }
            }
            if (!(i <= 7 && f10753c.matcher(str).matches())) {
                return false;
            }
        }
        return true;
    }
}
