package d.a.e;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a {
    private static final Map<String, String> a = new LinkedHashMap();
    public static final a b = null;

    public static final String a(String str) {
        String str2;
        boolean z;
        l.g(str, "name");
        if (kotlin.text.a.K(str, "algo_", false, 2, null)) {
            return str;
        }
        String str3 = a.get(str);
        if (str3 != null) {
            return str3;
        }
        if (kotlin.text.a.g(str, ".model", false, 2, null)) {
            str2 = str.substring(0, str.length() - 6);
            l.b(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            z = true;
        } else {
            str2 = str;
            z = false;
        }
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char charAt = str2.charAt(i);
            int p = kotlin.text.a.p("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_", charAt, 0, false, 6, null);
            if (p != -1) {
                charAt = "CQTZKHGJYMUWPBDEVRASONFILXp4qvh1a053s98cti27ugkrnm6_yjfbxdewozl".charAt(p);
            }
            sb.append(charAt);
        }
        StringBuilder M = e.a.a.a.a.M("algo_");
        M.append(sb.toString());
        M.append(z ? ".model" : "");
        String sb2 = M.toString();
        a.put(str, sb2);
        return sb2;
    }
}
