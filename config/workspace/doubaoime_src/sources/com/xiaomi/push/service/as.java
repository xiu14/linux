package com.xiaomi.push.service;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public class as {
    private static long a = 0;

    /* renamed from: a, reason: collision with other field name */
    private static String f1045a = "";

    public static String a() {
        if (TextUtils.isEmpty(f1045a)) {
            f1045a = com.xiaomi.push.bm.a(4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f1045a);
        long j = a;
        a = 1 + j;
        sb.append(j);
        return sb.toString();
    }

    public static String b() {
        return com.xiaomi.push.bm.a(32);
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 32) {
            return str;
        }
        try {
            return "BlockId_" + str.substring(8);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.d("Exception occurred when filtering registration packet id for log. " + e2);
            return "UnexpectedId";
        }
    }
}
