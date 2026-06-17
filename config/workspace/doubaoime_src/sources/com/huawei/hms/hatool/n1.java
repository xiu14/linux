package com.huawei.hms.hatool;

import android.util.Pair;
import com.xiaomi.mipush.sdk.Constants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class n1 {
    public static long a(String str, long j) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
            return simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(j))).getTime();
        } catch (ParseException unused) {
            v.f("hmsSdk/stringUtil", "getMillisOfDate(): Time conversion Exception !");
            return 0L;
        }
    }

    public static Pair<String, String> a(String str) {
        String str2;
        String str3;
        if ("_default_config_tag".equals(str)) {
            return new Pair<>(str, "");
        }
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (split.length > 2) {
            str3 = split[split.length - 1];
            str2 = str.substring(0, (str.length() - str3.length()) - 1);
        } else {
            str2 = split[0];
            str3 = split[1];
        }
        return new Pair<>(str2, str3);
    }

    public static String a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "alltype" : "diffprivacy" : "preins" : "maint" : "oper";
    }

    public static String a(String str, String str2) {
        return "_default_config_tag".equals(str) ? str : e.a.a.a.a.t(str, Constants.ACCEPT_TIME_SEPARATOR_SERVER, str2);
    }

    public static String a(String str, String str2, String str3) {
        return "_default_config_tag".equals(str) ? e.a.a.a.a.s("_default_config_tag#", str3) : e.a.a.a.a.v(str, Constants.ACCEPT_TIME_SEPARATOR_SERVER, str2, "#", str3);
    }

    public static Set<String> a(Set<String> set) {
        if (set == null || set.size() == 0) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if ("_default_config_tag".equals(str)) {
                hashSet.add("_default_config_tag");
            } else {
                String t = e.a.a.a.a.t(str, Constants.ACCEPT_TIME_SEPARATOR_SERVER, "oper");
                String t2 = e.a.a.a.a.t(str, Constants.ACCEPT_TIME_SEPARATOR_SERVER, "maint");
                String str2 = str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + "diffprivacy";
                hashSet.add(t);
                hashSet.add(t2);
                hashSet.add(str2);
            }
        }
        return hashSet;
    }
}
