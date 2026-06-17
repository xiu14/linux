package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.hx;
import com.xiaomi.push.hy;
import com.xiaomi.push.ie;
import com.xiaomi.push.it;
import com.xiaomi.push.je;
import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class bl {
    private static String a;

    /* renamed from: a, reason: collision with other field name */
    private static SimpleDateFormat f1091a;

    /* renamed from: a, reason: collision with other field name */
    private static AtomicLong f1092a = new AtomicLong(0);

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f1091a = simpleDateFormat;
        a = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static synchronized String a() {
        String str;
        synchronized (bl.class) {
            String format = f1091a.format(Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.equals(a, format)) {
                f1092a.set(0L);
                a = format;
            }
            str = format + Constants.ACCEPT_TIME_SEPARATOR_SERVER + f1092a.incrementAndGet();
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList<com.xiaomi.push.it> a(java.util.List<com.xiaomi.push.hy> r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r0 = 0
            if (r11 != 0) goto L9
            java.lang.String r11 = "requests can not be null in TinyDataHelper.transToThriftObj()."
            com.xiaomi.channel.commonutils.logger.c.d(r11)
            return r0
        L9:
            int r1 = r11.size()
            if (r1 != 0) goto L15
            java.lang.String r11 = "requests.length is 0 in TinyDataHelper.transToThriftObj()."
            com.xiaomi.channel.commonutils.logger.c.d(r11)
            return r0
        L15:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.xiaomi.push.hx r2 = new com.xiaomi.push.hx
            r2.<init>()
            r3 = 0
            r4 = r3
            r5 = r4
        L22:
            int r6 = r11.size()
            if (r4 >= r6) goto La9
            java.lang.Object r6 = r11.get(r4)
            com.xiaomi.push.hy r6 = (com.xiaomi.push.hy) r6
            if (r6 != 0) goto L32
            goto La5
        L32:
            java.util.Map r7 = r6.m493a()
            if (r7 == 0) goto L71
            java.util.Map r7 = r6.m493a()
            java.lang.String r8 = "item_size"
            boolean r7 = r7.containsKey(r8)
            if (r7 == 0) goto L71
            java.util.Map r7 = r6.m493a()
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L59
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Exception -> L59
            goto L5a
        L59:
            r7 = r3
        L5a:
            java.util.Map r9 = r6.m493a()
            int r9 = r9.size()
            r10 = 1
            if (r9 != r10) goto L69
            r6.a(r0)
            goto L72
        L69:
            java.util.Map r9 = r6.m493a()
            r9.remove(r8)
            goto L72
        L71:
            r7 = r3
        L72:
            if (r7 > 0) goto L79
            byte[] r7 = com.xiaomi.push.je.a(r6)
            int r7 = r7.length
        L79:
            if (r7 <= r14) goto L90
            java.lang.String r7 = "TinyData is too big, ignore upload request item:"
            java.lang.StringBuilder r7 = e.a.a.a.a.M(r7)
            java.lang.String r6 = r6.d()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.xiaomi.channel.commonutils.logger.c.d(r6)
            goto La5
        L90:
            int r8 = r5 + r7
            if (r8 <= r14) goto La1
            com.xiaomi.push.it r2 = a(r12, r13, r2)
            r1.add(r2)
            com.xiaomi.push.hx r2 = new com.xiaomi.push.hx
            r2.<init>()
            r5 = r3
        La1:
            r2.a(r6)
            int r5 = r5 + r7
        La5:
            int r4 = r4 + 1
            goto L22
        La9:
            int r11 = r2.a()
            if (r11 == 0) goto Lb6
            com.xiaomi.push.it r11 = a(r12, r13, r2)
            r1.add(r11)
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.bl.a(java.util.List, java.lang.String, java.lang.String, int):java.util.ArrayList");
    }

    private static it a(String str, String str2, hx hxVar) {
        return new it("-1", false).d(str).b(str2).a(com.xiaomi.push.y.a(je.a(hxVar))).c(ie.UploadTinyData.f611a);
    }

    public static boolean a(hy hyVar, boolean z) {
        if (hyVar == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("item is null, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (!z && TextUtils.isEmpty(hyVar.f583a)) {
            com.xiaomi.channel.commonutils.logger.c.m15a("item.channel is null or empty, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (TextUtils.isEmpty(hyVar.f590d)) {
            com.xiaomi.channel.commonutils.logger.c.m15a("item.category is null or empty, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (TextUtils.isEmpty(hyVar.f589c)) {
            com.xiaomi.channel.commonutils.logger.c.m15a("item.name is null or empty, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (!com.xiaomi.push.bm.m133a(hyVar.f590d)) {
            com.xiaomi.channel.commonutils.logger.c.m15a("item.category can only contain ascii char, verfiy ClientUploadDataItem failed.");
            return true;
        }
        if (!com.xiaomi.push.bm.m133a(hyVar.f589c)) {
            com.xiaomi.channel.commonutils.logger.c.m15a("item.name can only contain ascii char, verfiy ClientUploadDataItem failed.");
            return true;
        }
        String str = hyVar.f588b;
        if (str == null || str.length() <= 30720) {
            return false;
        }
        StringBuilder M = e.a.a.a.a.M("item.data is too large(");
        M.append(hyVar.f588b.length());
        M.append("), max size for data is ");
        M.append(30720);
        M.append(" , verfiy ClientUploadDataItem failed.");
        com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
        return true;
    }

    public static void a(Context context, String str, String str2, long j, String str3) {
        hy hyVar = new hy();
        hyVar.d(str);
        hyVar.c(str2);
        hyVar.a(j);
        hyVar.b(str3);
        hyVar.a("push_sdk_channel");
        hyVar.g(context.getPackageName());
        hyVar.e(context.getPackageName());
        hyVar.a(true);
        hyVar.b(System.currentTimeMillis());
        hyVar.f(a());
        bm.a(context, hyVar);
    }

    public static boolean a(String str) {
        return !com.xiaomi.push.t.m846b() || Constants.HYBRID_PACKAGE_NAME.equals(str);
    }
}
