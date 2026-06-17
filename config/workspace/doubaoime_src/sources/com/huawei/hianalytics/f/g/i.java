package com.huawei.hianalytics.f.g;

import android.text.TextUtils;
import android.util.Pair;
import com.xiaomi.mipush.sdk.Constants;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/* loaded from: classes2.dex */
public abstract class i {
    public static long a(String str, long j) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
            return simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(j))).getTime();
        } catch (ParseException unused) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event/stringUtil", "getMillisOfDate(): Time conversion Exception !");
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

    public static String a() {
        return "f6040d0e807aaec325ecf44823765544e92905158169f694b282bf17388632cf95a83bae7d2d235c1f039";
    }

    public static String a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "allType" : "diffprivacy" : "preins" : "maint" : "oper";
    }

    public static String a(String str, int i) {
        if (!TextUtils.isEmpty(str) && str.length() > i) {
            int length = str.length();
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = length - 1;
                str = str.substring(i3) + str.substring(0, i3);
            }
        }
        return str;
    }

    public static String a(String str, String str2, String str3) {
        if (!"_default_config_tag".equals(str)) {
            return e.a.a.a.a.v(str, Constants.ACCEPT_TIME_SEPARATOR_SERVER, str2, "#", str3);
        }
        return "_default_config_tag#" + str3;
    }

    public static String a(String str, String str2, String str3, String str4, String str5) {
        String str6;
        byte[] a = e.a(str);
        byte[] a2 = e.a(str2);
        byte[] a3 = e.a(str3);
        byte[] a4 = e.a(str4);
        int length = a.length;
        if (length > a2.length) {
            length = a2.length;
        }
        if (length > a3.length) {
            length = a3.length;
        }
        if (length > a4.length) {
            length = a4.length;
        }
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) (((a[i] ^ a2[i]) ^ a3[i]) ^ a4[i]);
        }
        try {
            return e.a(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(cArr, e.a(str5), 10000, 128)).getEncoded());
        } catch (NoSuchAlgorithmException unused) {
            str6 = "getAuthToken() encryptPBKDF2 No such algorithm!";
            com.huawei.hianalytics.g.b.d("HiAnalytics/event/stringUtil", str6);
            return null;
        } catch (InvalidKeySpecException unused2) {
            str6 = "getAuthToken() encryptPBKDF2 Invalid key specification !";
            com.huawei.hianalytics.g.b.d("HiAnalytics/event/stringUtil", str6);
            return null;
        }
    }

    public static Set<String> a(Set<String> set) {
        if (set == null || set.size() == 0) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet(set.size());
        for (String str : set) {
            if ("_default_config_tag".equals(str)) {
                hashSet.add("_default_config_tag");
            } else {
                String s = e.a.a.a.a.s(str, "-oper");
                String s2 = e.a.a.a.a.s(str, "-maint");
                hashSet.add(s);
                hashSet.add(s2);
                hashSet.add(str + "-diffprivacy");
            }
        }
        return hashSet;
    }

    public static String[] a(List<String> list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(str.replace("{url}", it2.next()));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
