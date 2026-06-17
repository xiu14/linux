package com.bytedance.frameworks.baselib.network.http.p;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.xiaomi.mipush.sdk.Constants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class h {
    private static final String a = "h";

    public static Date a(String str) {
        try {
            if (Logger.debug()) {
                Logger.d(a, "parse dateTime " + str + " sdk version >= N");
            }
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.getDefault()).parse(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long b(String str) {
        if (Logger.debug()) {
            e.a.a.a.a.s0("utcTime ", str, a);
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            Date parse = simpleDateFormat.parse(str);
            if (parse != null) {
                return parse.getTime();
            }
            return 0L;
        } catch (ParseException e2) {
            e2.printStackTrace();
            return 0L;
        }
    }

    public static boolean c(String str, List<Date> list) {
        if (TextUtils.isEmpty(str) || !str.contains(Constants.WAVE_SEPARATOR)) {
            return false;
        }
        String[] split = str.split(Constants.WAVE_SEPARATOR);
        if (split.length == 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
            Date a2 = a(split[0]);
            Date a3 = a(split[1]);
            if (a2 != null && a3 != null) {
                if (Logger.debug()) {
                    String str2 = a;
                    StringBuilder M = e.a.a.a.a.M("parse dateTime ");
                    M.append(split[0]);
                    M.append(" to ");
                    M.append(a2);
                    Logger.d(str2, M.toString());
                    Logger.d(str2, "parse dateTime " + split[1] + " to " + a3);
                }
                list.add(a2);
                list.add(a3);
                return true;
            }
        }
        return false;
    }

    public static boolean d(String str, String str2, String str3, List<Pair<String, String>> list) {
        String[] split;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            String[] split2 = str.split(str2);
            if (split2 == null) {
                return false;
            }
            for (int i = 0; i < split2.length; i++) {
                if (!TextUtils.isEmpty(split2[i]) && (split = split2[i].trim().split(str3)) != null && split.length == 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                    list.add(new Pair<>(split[0].trim(), split[1].trim()));
                }
            }
            if (list.size() != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(String str, List<Long> list) {
        if (TextUtils.isEmpty(str) || !str.contains(Constants.WAVE_SEPARATOR)) {
            return false;
        }
        String[] split = str.split(Constants.WAVE_SEPARATOR);
        if (split.length == 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
            long b = b(split[0]);
            long b2 = b(split[1]);
            if (b > 0 && b2 > 0 && b < b2) {
                list.add(Long.valueOf(b));
                list.add(Long.valueOf(b2));
                return true;
            }
        }
        return false;
    }
}
