package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import com.xiaomi.push.gx;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.ay;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class y {

    /* renamed from: a, reason: collision with other field name */
    private static final Map<String, byte[]> f1161a = new HashMap();
    private static ArrayList<Pair<String, byte[]>> a = new ArrayList<>();
    private static final ArrayList<Pair<String, byte[]>> b = new ArrayList<>();

    /* renamed from: com.xiaomi.push.service.y$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            ay.a.values();
            int[] iArr = new int[2];
            a = iArr;
            try {
                ay.a aVar = ay.a.NOTIFICATION_EXPOSURE_CACHE;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = a;
                ay.a aVar2 = ay.a.DEFAULT_CACHE;
                iArr2[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static void a(String str, byte[] bArr) {
        Map<String, byte[]> map = f1161a;
        synchronized (map) {
            com.xiaomi.channel.commonutils.logger.c.m15a("pending registration request. " + str);
            map.put(str, bArr);
        }
    }

    private static void b(final XMPushService xMPushService) {
        ArrayList arrayList;
        ArrayList<Pair<String, byte[]>> arrayList2 = b;
        synchronized (arrayList2) {
            arrayList = new ArrayList(arrayList2);
            arrayList2.clear();
        }
        long j = 0;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            final Pair pair = (Pair) it2.next();
            xMPushService.a(new XMPushService.j(4) { // from class: com.xiaomi.push.service.y.1
                @Override // com.xiaomi.push.service.XMPushService.j
                public String a() {
                    return "upload notification exposure event after network reconnected";
                }

                @Override // com.xiaomi.push.service.XMPushService.j
                /* renamed from: a */
                public void mo403a() {
                    try {
                        XMPushService xMPushService2 = xMPushService;
                        Pair pair2 = pair;
                        ab.a(xMPushService2, (String) pair2.first, (byte[]) pair2.second);
                    } catch (gx e2) {
                        com.xiaomi.channel.commonutils.logger.c.d("send a exposure packet failed :" + e2);
                        xMPushService.a(10, e2);
                    }
                }
            }, j);
            j += 100;
        }
    }

    public static void a(XMPushService xMPushService, boolean z) {
        try {
            Map<String, byte[]> map = f1161a;
            synchronized (map) {
                for (String str : map.keySet()) {
                    com.xiaomi.channel.commonutils.logger.c.m15a("processing pending registration request. " + str);
                    ab.a(xMPushService, str, f1161a.get(str));
                    if (z && !com.xiaomi.push.u.a()) {
                        try {
                            Thread.sleep(200L);
                        } catch (Exception unused) {
                        }
                    }
                }
                f1161a.clear();
            }
        } catch (gx e2) {
            com.xiaomi.channel.commonutils.logger.c.d("fail to deal with pending register request. " + e2);
            xMPushService.a(10, e2);
        }
    }

    public static void b(String str, byte[] bArr) {
        a(str, bArr, ay.a.DEFAULT_CACHE);
    }

    public static void a(Context context, int i, String str) {
        Map<String, byte[]> map = f1161a;
        synchronized (map) {
            for (String str2 : map.keySet()) {
                com.xiaomi.channel.commonutils.logger.c.m15a("notify registration error. " + str2);
                a(context, str2, f1161a.get(str2), i, str);
            }
            f1161a.clear();
        }
    }

    public static void a(XMPushService xMPushService) {
        ArrayList<Pair<String, byte[]>> arrayList;
        try {
            synchronized (a) {
                arrayList = a;
                a = new ArrayList<>();
            }
            boolean a2 = com.xiaomi.push.u.a();
            Iterator<Pair<String, byte[]>> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Pair<String, byte[]> next = it2.next();
                ab.a(xMPushService, (String) next.first, (byte[]) next.second);
                if (!a2) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } catch (gx e2) {
            com.xiaomi.channel.commonutils.logger.c.d("meet error when process pending message. " + e2);
            xMPushService.a(10, e2);
        }
        b(xMPushService);
    }

    public static void a(String str, byte[] bArr, ay.a aVar) {
        if (AnonymousClass2.a[aVar.ordinal()] != 1) {
            synchronized (a) {
                a.add(new Pair<>(str, bArr));
                if (a.size() > 50) {
                    a.remove(0);
                }
            }
            return;
        }
        ArrayList<Pair<String, byte[]>> arrayList = b;
        synchronized (arrayList) {
            arrayList.add(new Pair<>(str, bArr));
            if (arrayList.size() > 50) {
                arrayList.remove(0);
            }
        }
    }

    public static void a(Context context, String str, byte[] bArr, int i, String str2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            if (!com.xiaomi.push.h.m458a(context, str)) {
                com.xiaomi.channel.commonutils.logger.c.m15a(str + ":cannot notify error now.");
                return;
            }
            Intent intent = new Intent("com.xiaomi.mipush.ERROR");
            intent.setPackage(str);
            intent.putExtra("mipush_payload", bArr);
            intent.putExtra("mipush_error_code", i);
            intent.putExtra("mipush_error_msg", str2);
            context.sendBroadcast(intent, ab.a(str));
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("notify error failed, context or packageName is null.");
    }
}
