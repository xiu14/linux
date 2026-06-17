package com.xiaomi.push.service;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.vivo.push.PushClient;
import com.xiaomi.push.ih;
import com.xiaomi.push.il;
import com.xiaomi.push.iq;
import com.xiaomi.push.it;
import java.util.Map;

/* loaded from: classes2.dex */
public class aa {
    private static a a;

    /* renamed from: a, reason: collision with other field name */
    private static b f996a;

    /* renamed from: a, reason: collision with other field name */
    private static c f997a;

    /* renamed from: a, reason: collision with other field name */
    private static d f998a;

    public interface a {
        void a();

        void a(ih ihVar, String str);

        void a(il ilVar);

        void a(iq iqVar, Map<String, String> map);

        void a(it itVar, iq iqVar);

        void a(String str);

        void a(String str, int i);

        void a(String str, Intent intent);

        void a(String str, String str2);

        void a(String str, byte[] bArr);

        /* renamed from: a, reason: collision with other method in class */
        boolean m710a();

        boolean a(ih ihVar);

        boolean a(iq iqVar, byte[] bArr);

        boolean a(it itVar);

        /* renamed from: a, reason: collision with other method in class */
        boolean m711a(String str);

        void b();

        boolean b(iq iqVar, byte[] bArr);
    }

    public interface b {
        String a(iq iqVar);

        Map<String, String> a(Context context, iq iqVar);

        void a(Context context, Intent intent, iq iqVar, Intent intent2, String str, int i, String str2);

        /* renamed from: a, reason: collision with other method in class */
        void m712a(Context context, iq iqVar);

        void a(Context context, iq iqVar, it itVar);

        /* renamed from: a, reason: collision with other method in class */
        void m713a(iq iqVar);

        void a(String str);

        void a(String str, byte[] bArr, long j);

        boolean a();

        boolean a(Context context, iq iqVar, boolean z);

        /* renamed from: a, reason: collision with other method in class */
        boolean m714a(iq iqVar);

        boolean a(iq iqVar, byte[] bArr);

        void b(String str);

        void c(String str);

        void d(String str);

        void e(String str);

        void f(String str);

        void g(String str);
    }

    public interface c {
        void a(iq iqVar, Intent intent, PendingIntent pendingIntent);

        void a(String str);

        void a(String str, int i);

        boolean a(iq iqVar);
    }

    public interface d {
        void a(iq iqVar);

        void a(String str);

        /* renamed from: a, reason: collision with other method in class */
        boolean m715a(iq iqVar);
    }

    public static void a(Context context, iq iqVar, it itVar) {
        b bVar = f996a;
        if (bVar == null) {
            com.xiaomi.channel.commonutils.logger.c.d("The Listener of EventProcessor must be set. Please check extension plugin initialization.");
        } else {
            bVar.a(context, iqVar, itVar);
        }
    }

    public static void b(String str) {
        b bVar;
        if (TextUtils.isEmpty(str) || (bVar = f996a) == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("pkg or listener is null when package update");
        } else {
            bVar.b(str);
        }
    }

    public static void c(String str) {
        b bVar;
        if (TextUtils.isEmpty(str) || (bVar = f996a) == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("pkg or listener is null when package install");
        } else {
            bVar.c(str);
        }
    }

    public static void d(String str) {
        b bVar;
        if (TextUtils.isEmpty(str) || (bVar = f996a) == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("pkg or listener is null when package uninstall");
        } else {
            bVar.d(str);
        }
    }

    public static void e(String str) {
        b bVar;
        if (TextUtils.isEmpty(str) || (bVar = f996a) == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("pkg or listener is null when package data clear");
        } else {
            bVar.e(str);
        }
    }

    public static void f(String str) {
        b bVar;
        if (TextUtils.isEmpty(str) || (bVar = f996a) == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("pkg or listener is null when mipush register");
        } else {
            bVar.f(str);
        }
    }

    public static void g(String str) {
        b bVar;
        if (TextUtils.isEmpty(str) || (bVar = f996a) == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("pkg or listener is null when mipush unregister");
        } else {
            bVar.g(str);
        }
    }

    public static void h(String str) {
        d dVar = f998a;
        if (dVar == null || str == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("pepa clearMessage is null");
        } else {
            dVar.a(str);
        }
    }

    public static void i(String str) {
        a aVar;
        if (TextUtils.isEmpty(str) || (aVar = a) == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("pkg or listener is null when unsubscribe LBS push");
        } else {
            aVar.a(str);
        }
    }

    public static void j(String str) {
        if (f997a == null || TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.c.d("listener or msgId is null when delete box message");
        } else {
            f997a.a(str);
        }
    }

    public static boolean a(Context context, iq iqVar, boolean z) {
        b bVar = f996a;
        if (bVar != null && iqVar != null) {
            return bVar.a(context, iqVar, z);
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("pepa judement listener or container is null");
        return false;
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m709b(iq iqVar) {
        d dVar = f998a;
        if (dVar != null && iqVar != null) {
            return dVar.m715a(iqVar);
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("pepa handleReceiveMessage is null");
        return false;
    }

    public static boolean c(iq iqVar, byte[] bArr) {
        a aVar = a;
        if (aVar != null && iqVar != null && bArr != null) {
            return aVar.b(iqVar, bArr);
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("aiPush listener|container|decryptedContent is null when handle MsaAIPush message");
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m706a(iq iqVar) {
        b bVar = f996a;
        if (bVar != null && iqVar != null) {
            return bVar.m714a(iqVar);
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("event listener or container is null when checking notification with profile id  ");
        return true;
    }

    public static boolean b(iq iqVar, byte[] bArr) {
        b bVar = f996a;
        if (bVar != null && iqVar != null && bArr != null) {
            return bVar.a(iqVar, bArr);
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("event listener|container|decryptedContent is null when handle extension message");
        return false;
    }

    public static boolean c(iq iqVar) {
        c cVar = f997a;
        if (cVar != null && iqVar != null) {
            return cVar.a(iqVar);
        }
        com.xiaomi.channel.commonutils.logger.c.d("listener or container is null when check box message");
        return false;
    }

    public static void a(String str) {
        b bVar;
        if (!TextUtils.isEmpty(str) && (bVar = f996a) != null) {
            bVar.a(str);
        } else {
            com.xiaomi.channel.commonutils.logger.c.m15a("pkg or listener is null when unregister push");
        }
    }

    public static void b(iq iqVar) {
        b bVar = f996a;
        if (bVar != null && iqVar != null) {
            bVar.m713a(iqVar);
        } else {
            com.xiaomi.channel.commonutils.logger.c.m15a("listener or container is null when setup callkit timeout detection");
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m703a(Context context, iq iqVar) {
        b bVar = f996a;
        if (bVar != null && iqVar != null) {
            bVar.m712a(context, iqVar);
        } else {
            com.xiaomi.channel.commonutils.logger.c.m15a("handle msg wrong");
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m708b() {
        a aVar = a;
        if (aVar == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("listener is null when handle checking LBS push support");
            return false;
        }
        return aVar.m710a();
    }

    public static void a(String str, byte[] bArr, long j) {
        b bVar = f996a;
        if (bVar != null && bArr != null) {
            bVar.a(str, bArr, j);
        } else {
            com.xiaomi.channel.commonutils.logger.c.m15a("handle send msg wrong");
        }
    }

    public static void b() {
        a aVar = a;
        if (aVar == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("listener is null when requesting LBS subscription");
        } else {
            aVar.b();
        }
    }

    public static void a(Context context, Intent intent, iq iqVar, Intent intent2, String str, int i, String str2) {
        b bVar = f996a;
        if (bVar != null && intent != null && context != null) {
            bVar.a(context, intent, iqVar, intent2, str, i, str2);
        } else {
            com.xiaomi.channel.commonutils.logger.c.m15a("start business activity wrong");
        }
    }

    public static void a(String str, byte[] bArr) {
        if (a != null && !TextUtils.isEmpty(str) && bArr != null) {
            a.a(str, bArr);
        } else {
            com.xiaomi.channel.commonutils.logger.c.m15a("listener|pkg|payload is null when handling LBS Push event");
        }
    }

    public static Map<String, String> a(Context context, iq iqVar) {
        b bVar = f996a;
        if (bVar != null && iqVar != null) {
            return bVar.a(context, iqVar);
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("pepa listener or container is null");
        return null;
    }

    public static void a(ih ihVar, String str) {
        a aVar = a;
        if (aVar != null && ihVar != null) {
            aVar.a(ihVar, str);
        } else {
            com.xiaomi.channel.commonutils.logger.c.m15a("aipush listener or metaInfo is null");
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static void m704a(iq iqVar) {
        d dVar = f998a;
        if (dVar != null && iqVar != null) {
            dVar.a(iqVar);
        } else {
            com.xiaomi.channel.commonutils.logger.c.m15a("pepa clearMessage is null");
        }
    }

    public static boolean a(iq iqVar, byte[] bArr) {
        a aVar = a;
        if (aVar != null && iqVar != null && bArr != null) {
            return aVar.a(iqVar, bArr);
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("aipush listener|container|decryptedContent is null when handle aipush message");
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m705a() {
        b bVar = f996a;
        if (bVar == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("listener is null when check callkit support");
            return false;
        }
        return bVar.a();
    }

    public static String a(iq iqVar) {
        b bVar = f996a;
        if (bVar != null && iqVar != null) {
            return bVar.a(iqVar);
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("listener or container is null when handle callkit message");
        return PushClient.DEFAULT_REQUEST_ID;
    }

    public static void a(it itVar, iq iqVar) {
        a aVar = a;
        if (aVar != null && iqVar != null) {
            aVar.a(itVar, iqVar);
        } else {
            com.xiaomi.channel.commonutils.logger.c.m15a("aipush listener|container is null when save aipush message quota limit info");
        }
    }

    public static boolean a(it itVar) {
        a aVar = a;
        if (aVar != null && itVar != null) {
            return aVar.a(itVar);
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("listener or container is null when handle aipush message cancel cmd");
        return false;
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m707a(String str) {
        if (a != null && !TextUtils.isEmpty(str)) {
            return a.m711a(str);
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("listener or container is null when check aipush message cache exist");
        return false;
    }

    public static void a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.c.m15a("pkg is null when handle app unregister");
            return;
        }
        a aVar = a;
        if (aVar != null) {
            aVar.a(str, i);
        }
        c cVar = f997a;
        if (cVar != null) {
            cVar.a(str, i);
        }
    }

    public static void a() {
        a aVar = a;
        if (aVar == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("listener is null when init BarPullDown");
        } else {
            aVar.a();
        }
    }

    public static void a(String str, String str2) {
        a aVar;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (aVar = a) != null) {
            aVar.a(str, str2);
        } else {
            com.xiaomi.channel.commonutils.logger.c.m15a("pkg|appId|listener is null when subscribe LBS push");
        }
    }

    public static void a(String str, Intent intent) {
        if (a != null && !TextUtils.isEmpty(str) && intent != null) {
            a.a(str, intent);
        } else {
            com.xiaomi.channel.commonutils.logger.c.m15a("listener|pkg|intent is null when temporarily saving subscription result");
        }
    }

    public static void a(il ilVar) {
        a aVar = a;
        if (aVar != null && ilVar != null) {
            aVar.a(ilVar);
        } else {
            com.xiaomi.channel.commonutils.logger.c.m15a("listener|notification is null when recovering LBS subscription");
        }
    }

    public static boolean a(ih ihVar) {
        a aVar = a;
        if (aVar == null) {
            return false;
        }
        return aVar.a(ihVar);
    }

    public static void a(iq iqVar, Map<String, String> map) {
        a aVar = a;
        if (aVar == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("listener is null when record business message");
        } else {
            aVar.a(iqVar, map);
        }
    }

    public static void a(iq iqVar, Intent intent, PendingIntent pendingIntent) {
        c cVar = f997a;
        if (cVar != null && iqVar != null) {
            cVar.a(iqVar, intent, pendingIntent);
        } else {
            com.xiaomi.channel.commonutils.logger.c.d("listener or container is null when handle box message");
        }
    }
}
