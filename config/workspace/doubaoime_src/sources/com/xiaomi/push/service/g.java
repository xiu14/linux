package com.xiaomi.push.service;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.hms.framework.common.ContainerUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.service.ao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class g {
    private static final SparseArray<ao.a<String, String, String>> a;

    /* renamed from: a, reason: collision with other field name */
    private static final int[] f1109a = {1, 2, 4, 8, 16};
    private static final SparseArray<Integer> b;

    static {
        int i = 5;
        a = new SparseArray<ao.a<String, String, String>>(i) { // from class: com.xiaomi.push.service.g.1
            {
                put(1, ao.b);
                put(2, ao.f9311c);
                put(4, ao.f9312d);
                put(8, ao.f9314f);
                put(16, ao.f9313e);
            }
        };
        b = new SparseArray<Integer>(i) { // from class: com.xiaomi.push.service.g.2
            {
                put(1, 32);
                put(2, 16);
                put(4, 8);
                put(8, 4);
                put(16, 2);
            }
        };
    }

    static int a(String str, String str2) {
        int i = m793a(str, str2, 8) ? 8 : 0;
        if (m793a(str, str2, 16)) {
            i |= 16;
        }
        if (m793a(str, str2, 1)) {
            i |= 1;
        }
        if (m793a(str, str2, 2)) {
            i |= 2;
        }
        return m793a(str, str2, 4) ? i | 4 : i;
    }

    private static boolean a(int i, int i2) {
        return i >= 4 || (i2 & 2) > 0 || (i2 & 1) > 0 || (i2 & 8) > 0 || (i2 & 16) > 0;
    }

    static void a(Context context, String str, String str2, int i, String str3, boolean z, int i2) {
        if (com.xiaomi.push.k.m655a(context) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            int a2 = com.xiaomi.push.u.a(str3, 0);
            boolean a3 = a(i, a2);
            if (z) {
                a(str, str2, a2, i2);
                if (a3) {
                    synchronized (g.class) {
                        a(a(context), a2, str2);
                    }
                    return;
                }
                return;
            }
            synchronized (g.class) {
                SharedPreferences a4 = a(context);
                if (a3 || a4.contains(str2)) {
                    a(a4, a2, str, str2, i2);
                    if (a3) {
                        a(a4, a2, str2);
                    } else {
                        a(a4, str2);
                    }
                }
            }
            return;
        }
        if (com.xiaomi.push.k.m655a(context)) {
            StringBuilder M = e.a.a.a.a.M("ChannelPC: can`t setup permission with permissionCode:");
            M.append(String.valueOf(str3));
            M.append(" channelId:");
            M.append(String.valueOf(str2));
            M.append(" targetPkg:");
            M.append(str);
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
        }
    }

    static void a(Context context, String str) {
        List<NotificationChannel> m751a;
        if (!com.xiaomi.push.k.m655a(context) || TextUtils.isEmpty(str) || (m751a = an.a(context, str).m751a()) == null) {
            return;
        }
        synchronized (g.class) {
            SharedPreferences a2 = a(context);
            ArrayList arrayList = new ArrayList();
            Iterator<NotificationChannel> it2 = m751a.iterator();
            while (it2.hasNext()) {
                String str2 = (String) com.xiaomi.push.bh.a(it2.next(), "mId");
                if (!TextUtils.isEmpty(str2) && a2.contains(str2)) {
                    arrayList.add(str2);
                }
            }
            if (arrayList.size() > 0) {
                a(a2, arrayList);
            }
        }
    }

    static void a(String str, String str2, int i, int i2) {
        for (int i3 : f1109a) {
            if ((b.get(i3).intValue() & i2) == 0) {
                a(str, str2, i3, (i & i3) > 0);
            } else {
                StringBuilder W = e.a.a.a.a.W("ChannelPermissions.grantPermission:", str, Constants.COLON_SEPARATOR, str2, ": <");
                W.append(i3);
                W.append("> :stoped by userLock");
                com.xiaomi.channel.commonutils.logger.c.m15a(W.toString());
            }
        }
    }

    private static void a(String str, String str2, int i, boolean z) {
        boolean a2 = ao.a(com.xiaomi.push.t.m841a(), str, str2, a.get(i), z);
        StringBuilder W = e.a.a.a.a.W("ChannelPermissions.grantPermission:", str, Constants.COLON_SEPARATOR, str2, ": <");
        W.append(i);
        W.append(ContainerUtils.KEY_VALUE_DELIMITER);
        W.append(z);
        W.append("> :");
        W.append(a2);
        com.xiaomi.channel.commonutils.logger.c.m15a(W.toString());
    }

    public static int a(String str, String str2, int i) {
        return ao.a(com.xiaomi.push.t.m841a(), str, str2, a.get(i));
    }

    /* renamed from: a, reason: collision with other method in class */
    public static Bundle m792a(String str, String str2) {
        return ao.a(com.xiaomi.push.t.m841a(), str, str2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m793a(String str, String str2, int i) {
        int a2 = ao.a(com.xiaomi.push.t.m841a(), str, str2, a.get(i));
        boolean z = a2 == 1;
        StringBuilder W = e.a.a.a.a.W("ChannelPermissions.checkPermission:", str, Constants.COLON_SEPARATOR, str2, ": <");
        W.append(i);
        W.append(ContainerUtils.KEY_VALUE_DELIMITER);
        W.append(z);
        W.append("/");
        W.append(a2);
        W.append(">");
        com.xiaomi.channel.commonutils.logger.c.m15a(W.toString());
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ab, code lost:
    
        if (r8 == 0) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba A[Catch: all -> 0x00fd, TryCatch #0 {all -> 0x00fd, blocks: (B:7:0x0003, B:10:0x000b, B:13:0x0016, B:15:0x0023, B:18:0x002e, B:20:0x003a, B:22:0x0044, B:25:0x004c, B:27:0x004f, B:29:0x005b, B:32:0x0068, B:34:0x006b, B:36:0x0077, B:37:0x0081, B:39:0x008d, B:42:0x00da, B:44:0x00e0, B:46:0x00e3, B:49:0x00ea, B:51:0x00f0, B:54:0x00f3, B:58:0x0098, B:60:0x00a2, B:62:0x00a8, B:64:0x00b0, B:66:0x00ba, B:68:0x00c3, B:70:0x00c0, B:71:0x00ad, B:3:0x00f7), top: B:6:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.content.Context r8, java.lang.String r9, android.app.NotificationChannel r10) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.g.a(android.content.Context, java.lang.String, android.app.NotificationChannel):int");
    }

    public static int a(Context context, String str, String str2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            an a2 = an.a(context, str);
            if (a2 != null) {
                return a(context, str, a2.m747a(a2.m750a(str2)));
            }
            com.xiaomi.channel.commonutils.logger.c.m15a("create NMHelper error");
            return 0;
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("Must greater than or equal android O and context|packageName not be null");
        return 0;
    }

    private static void a(SharedPreferences sharedPreferences, int i, String str, String str2, int i2) {
        if (sharedPreferences.getInt(str2, 0) != i) {
            a(str, str2, i, i2);
        }
    }

    private static void a(SharedPreferences sharedPreferences, int i, String str) {
        sharedPreferences.edit().putInt(str, i).commit();
    }

    private static void a(SharedPreferences sharedPreferences, String str) {
        a(sharedPreferences, new ArrayList<String>(str) { // from class: com.xiaomi.push.service.g.3
            final /* synthetic */ String a;

            {
                this.a = str;
                add(str);
            }
        });
    }

    private static void a(SharedPreferences sharedPreferences, List<String> list) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            edit.remove(it2.next());
        }
        edit.commit();
    }

    private static SharedPreferences a(Context context) {
        return context.getSharedPreferences("ch_permission_cache_file", 0);
    }
}
