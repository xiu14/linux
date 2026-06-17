package com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h;

import java.util.List;

/* loaded from: classes.dex */
public class a {
    public static boolean a(String str) {
        if (str != null) {
            char[] charArray = str.toCharArray();
            if (charArray.length > 0 && charArray.length <= 255) {
                for (char c2 : charArray) {
                    if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '.' || c2 == '-'))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static String b(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append(',');
            }
        }
        return sb.toString();
    }
}
