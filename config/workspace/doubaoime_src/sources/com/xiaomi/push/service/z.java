package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.bytedance.common.wschannel.WsConstants;
import com.vivo.push.PushClient;
import com.xiaomi.push.eo;
import com.xiaomi.push.gg;
import com.xiaomi.push.gx;
import com.xiaomi.push.ha;
import com.xiaomi.push.hc;
import com.xiaomi.push.hd;
import com.xiaomi.push.ho;
import com.xiaomi.push.hu;
import com.xiaomi.push.ie;
import com.xiaomi.push.ih;
import com.xiaomi.push.ik;
import com.xiaomi.push.iq;
import com.xiaomi.push.it;
import com.xiaomi.push.je;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.ac;
import com.xiaomi.push.service.ax;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class z {
    /* JADX INFO: Access modifiers changed from: private */
    public static int b(boolean z, boolean z2) {
        if (z2) {
            return !z ? 1 : 0;
        }
        return -1;
    }

    private static boolean b(iq iqVar) {
        Map<String, String> m525a = iqVar.m558a().m525a();
        return m525a != null && m525a.containsKey("notify_effect");
    }

    private static boolean c(iq iqVar) {
        if (iqVar.m558a() == null || iqVar.m558a().m525a() == null) {
            return false;
        }
        return PushClient.DEFAULT_REQUEST_ID.equals(iqVar.m558a().m525a().get("obslete_ads_message"));
    }

    private static void d(final XMPushService xMPushService, final iq iqVar) {
        if (iqVar == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("send miui old ads ack message error, container is null.");
        } else {
            if (xMPushService == null) {
                com.xiaomi.channel.commonutils.logger.c.m15a("send miui old ads ack message error, pushService is null.");
                return;
            }
            XMPushService.j jVar = new XMPushService.j(4) { // from class: com.xiaomi.push.service.z.5
                @Override // com.xiaomi.push.service.XMPushService.j
                public String a() {
                    return "send ack message for obsleted message.";
                }

                @Override // com.xiaomi.push.service.XMPushService.j
                /* renamed from: a */
                public void mo403a() {
                    try {
                        iq a = z.a((Context) xMPushService, iqVar);
                        a.m558a().a("message_obsleted", PushClient.DEFAULT_REQUEST_ID);
                        a.m558a().a(WsConstants.KEY_CONNECTION_ERROR, "message_obsleted");
                        a.m558a().a("reason", "message is obsleted");
                        ab.a(xMPushService, a);
                    } catch (gx e2) {
                        com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
                        xMPushService.a(10, e2);
                    }
                }
            };
            jVar.a(iqVar.f734a);
            xMPushService.a(jVar);
        }
    }

    private static void e(final XMPushService xMPushService, final iq iqVar) {
        if (iqVar == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("send miui new ads ack message error, container is null.");
        } else {
            if (xMPushService == null) {
                com.xiaomi.channel.commonutils.logger.c.m15a("send miui new ads ack message error, pushService is null.");
                return;
            }
            XMPushService.j jVar = new XMPushService.j(4) { // from class: com.xiaomi.push.service.z.6
                @Override // com.xiaomi.push.service.XMPushService.j
                public String a() {
                    return "send ack message for unrecognized new miui message.";
                }

                @Override // com.xiaomi.push.service.XMPushService.j
                /* renamed from: a */
                public void mo403a() {
                    try {
                        iq a = z.a((Context) xMPushService, iqVar);
                        a.m558a().a("miui_message_unrecognized", PushClient.DEFAULT_REQUEST_ID);
                        a.m558a().a(WsConstants.KEY_CONNECTION_ERROR, "miui_message_unrecognized");
                        a.m558a().a("reason", "miui message unrecognized");
                        ab.a(xMPushService, a);
                    } catch (gx e2) {
                        com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
                        xMPushService.a(10, e2);
                    }
                }
            };
            jVar.a(iqVar.f734a);
            xMPushService.a(jVar);
        }
    }

    public void a(Context context, ax.b bVar, boolean z, int i, String str) {
        u m832a;
        if (z || (m832a = v.m832a(context)) == null || !"token-expired".equals(str)) {
            return;
        }
        v.a(context, m832a.f9352f, m832a.f9350d, m832a.f9351e);
    }

    private static void b(final XMPushService xMPushService, final iq iqVar) {
        if (iqVar == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("send ack message error, container is null.");
        } else {
            if (xMPushService == null) {
                com.xiaomi.channel.commonutils.logger.c.m15a("send ack message error, pushService is null.");
                return;
            }
            XMPushService.j jVar = new XMPushService.j(4) { // from class: com.xiaomi.push.service.z.3
                @Override // com.xiaomi.push.service.XMPushService.j
                public String a() {
                    return "send ack message for message.";
                }

                @Override // com.xiaomi.push.service.XMPushService.j
                /* renamed from: a */
                public void mo403a() {
                    Map<String, String> map = null;
                    try {
                        if (com.xiaomi.push.k.m655a((Context) xMPushService)) {
                            try {
                                map = aa.a((Context) xMPushService, iqVar);
                            } catch (Throwable th) {
                                com.xiaomi.channel.commonutils.logger.c.d("error creating params for ack message :" + th);
                            }
                        }
                        ab.a(xMPushService, z.a(xMPushService, iqVar, map));
                    } catch (gx e2) {
                        com.xiaomi.channel.commonutils.logger.c.d("error sending ack message :" + e2);
                        xMPushService.a(10, e2);
                    }
                }
            };
            jVar.a(iqVar.f734a);
            xMPushService.a(jVar);
        }
    }

    private static void c(final XMPushService xMPushService, final iq iqVar) {
        xMPushService.a(new XMPushService.j(4) { // from class: com.xiaomi.push.service.z.4
            @Override // com.xiaomi.push.service.XMPushService.j
            public String a() {
                return "send ack message for checking profileId error ack message.";
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            /* renamed from: a */
            public void mo403a() {
                try {
                    iq a = z.a((Context) xMPushService, iqVar);
                    a.m558a().a("Profile ID is missing", PushClient.DEFAULT_REQUEST_ID);
                    a.m558a().a(WsConstants.KEY_CONNECTION_ERROR, "profileId_missing");
                    a.m558a().a("reason", "Profile ID is missing");
                    ab.a(xMPushService, a);
                } catch (gx e2) {
                    com.xiaomi.channel.commonutils.logger.c.d("error occurred when sending profileId check error ack . exception:" + e2);
                    xMPushService.a(10, e2);
                }
            }
        });
    }

    public void a(XMPushService xMPushService, hd hdVar, ax.b bVar) {
        if (hdVar instanceof hc) {
            hc hcVar = (hc) hdVar;
            ha a = hcVar.a("s");
            if (a != null) {
                try {
                    a(xMPushService, bc.a(bc.a(bVar.h, hcVar.j()), a.c()), ho.a(hdVar.mo469a()));
                    return;
                } catch (IllegalArgumentException e2) {
                    HashMap hashMap = new HashMap();
                    hashMap.put(WsConstants.KEY_CONNECTION_ERROR, "decrypted_payload_exception");
                    hashMap.put("data_type", "packet");
                    a(xMPushService, hashMap);
                    com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
                    return;
                }
            }
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("not a mipush message");
    }

    public void a(XMPushService xMPushService, gg ggVar, ax.b bVar) {
        try {
            byte[] m419a = ggVar.m419a(bVar.h);
            HashMap hashMap = null;
            if (f.b(ggVar)) {
                hashMap = new HashMap();
                hashMap.put("t_im", String.valueOf(ggVar.m420b()));
                hashMap.put("t_rt", String.valueOf(ggVar.m413a()));
            }
            a(xMPushService, m419a, ggVar.c(), hashMap);
        } catch (IllegalArgumentException e2) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(WsConstants.KEY_CONNECTION_ERROR, "decrypted_payload_exception");
            hashMap2.put("data_type", "blob");
            a(xMPushService, hashMap2);
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
        }
    }

    private static void a(XMPushService xMPushService, byte[] bArr, long j) {
        a(xMPushService, bArr, j, (Map<String, String>) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(com.xiaomi.push.service.XMPushService r21, byte[] r22, long r23, java.util.Map<java.lang.String, java.lang.String> r25) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.z.a(com.xiaomi.push.service.XMPushService, byte[], long, java.util.Map):void");
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m840a(Context context, iq iqVar) {
        ih m558a;
        Map<String, String> m525a;
        String str;
        if (context == null || iqVar == null) {
            return false;
        }
        try {
            if (!"com.xiaomi.gamecenter.sdk.service".equals(iqVar.f738b) || (m558a = iqVar.m558a()) == null || (m525a = m558a.m525a()) == null || (str = m525a.get("game.packageNameTarget")) == null || str.isEmpty() || m525a.containsKey("notify_effect")) {
                return false;
            }
            return com.xiaomi.push.h.e(context, str);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
            return false;
        }
    }

    public static Intent a(byte[] bArr, long j) {
        iq a = a(bArr);
        if (a == null) {
            return null;
        }
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mrt", Long.toString(j));
        intent.setPackage(a.f738b);
        return intent;
    }

    public static iq a(byte[] bArr) {
        iq iqVar = new iq();
        try {
            je.a(iqVar, bArr);
            return iqVar;
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.c.m18a(th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x052a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0393  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(final com.xiaomi.push.service.XMPushService r22, java.lang.String r23, byte[] r24, android.content.Intent r25) {
        /*
            Method dump skipped, instructions count: 1665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.z.a(com.xiaomi.push.service.XMPushService, java.lang.String, byte[], android.content.Intent):void");
    }

    private static void a(XMPushService xMPushService, Intent intent, iq iqVar) {
        try {
            iq a = a(xMPushService, iqVar, intent);
            aa.a(a.f732a, iqVar.f734a);
            ab.a(xMPushService, a);
        } catch (gx e2) {
            com.xiaomi.channel.commonutils.logger.c.d("error sending Msa ack message :" + e2);
            xMPushService.a(10, e2);
        }
    }

    public static ac.d a(Context context, iq iqVar, byte[] bArr) {
        return a(context, iqVar, bArr, (Map<String, String>) null);
    }

    public static ac.d a(Context context, iq iqVar, byte[] bArr, Map<String, String> map) {
        try {
            ac.d a = ac.a(context, iqVar, bArr, map);
            if (a.f1010a > 0 && !TextUtils.isEmpty(a.f1011a)) {
                ho.a(context, a.f1011a, a.f1010a, true, false, System.currentTimeMillis());
            }
            aa.a(iqVar, map);
            if (com.xiaomi.push.k.m655a(context) && aa.a(context, iqVar, a.f1012a)) {
                aa.m703a(context, iqVar);
                com.xiaomi.channel.commonutils.logger.c.m15a("consume this broadcast by tts");
            } else {
                m839a(context, iqVar, bArr);
            }
            return a;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m15a("notify push msg error " + e2);
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private static void m839a(Context context, iq iqVar, byte[] bArr) {
        if (ac.m725a(iqVar)) {
            return;
        }
        String m719a = ac.m719a(iqVar);
        if (TextUtils.isEmpty(m719a) || a(context, m719a, bArr)) {
            return;
        }
        eo.a(context).b(m719a, ac.b(iqVar), iqVar.m558a().m524a(), PushClient.DEFAULT_REQUEST_ID);
    }

    public static boolean a(Context context, String str, byte[] bArr) {
        HashSet hashSet = new HashSet();
        hashSet.add(str + ":pushExtensionService");
        if (!com.xiaomi.push.h.a(context, str, hashSet)) {
            return false;
        }
        Intent intent = new Intent("com.xiaomi.mipush.MESSAGE_ARRIVED");
        intent.putExtra("mipush_payload", bArr);
        intent.setPackage(str);
        try {
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty()) {
                return false;
            }
            com.xiaomi.channel.commonutils.logger.c.m15a("broadcast message arrived.");
            context.sendBroadcast(intent, ab.a(str));
            return true;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m15a("meet error when broadcast message arrived. " + e2);
            return false;
        }
    }

    private static boolean a(XMPushService xMPushService, String str, iq iqVar, ih ihVar) {
        boolean z = true;
        if (ihVar != null && ihVar.m525a() != null && ihVar.m525a().containsKey("__check_alive") && ihVar.m525a().containsKey("__awake")) {
            it itVar = new it();
            itVar.b(iqVar.m559a());
            itVar.d(str);
            itVar.c(ie.AwakeSystemApp.f611a);
            itVar.a(ihVar.m524a());
            itVar.f750a = new HashMap();
            boolean m458a = com.xiaomi.push.h.m458a(xMPushService.getApplicationContext(), str);
            itVar.f750a.put("app_running", Boolean.toString(m458a));
            if (!m458a) {
                boolean parseBoolean = Boolean.parseBoolean(ihVar.m525a().get("__awake"));
                itVar.f750a.put("awaked", Boolean.toString(parseBoolean));
                if (!parseBoolean) {
                    z = false;
                }
            }
            try {
                ab.a(xMPushService, ab.a(iqVar.b(), iqVar.m559a(), itVar, hu.Notification));
            } catch (gx e2) {
                com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
            }
        }
        return z;
    }

    private static boolean a(Context context) {
        return (com.xiaomi.push.ag.b(context) || com.xiaomi.push.ag.c(context)) ? false : true;
    }

    private static boolean a(Context context, ih ihVar) {
        if (ihVar == null || ihVar.m525a() == null || context == null) {
            return false;
        }
        return ihVar.m525a().containsKey("__check_alive") && Boolean.parseBoolean(ihVar.m525a().get("__awake"));
    }

    private static void a(final XMPushService xMPushService, final iq iqVar) {
        xMPushService.a(new XMPushService.j(4) { // from class: com.xiaomi.push.service.z.2
            @Override // com.xiaomi.push.service.XMPushService.j
            public String a() {
                return "send app absent message.";
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            /* renamed from: a */
            public void mo403a() {
                try {
                    ab.a(xMPushService, ab.a(iqVar.b(), iqVar.m559a()));
                } catch (gx e2) {
                    com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
                    xMPushService.a(10, e2);
                }
            }
        });
    }

    private static boolean a(iq iqVar) {
        return "com.xiaomi.xmsf".equals(iqVar.f738b) && iqVar.m558a() != null && iqVar.m558a().m525a() != null && iqVar.m558a().m525a().containsKey("miui_package_name");
    }

    private static boolean a(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.mipush.miui.CLICK_MESSAGE");
        intent.setPackage(str);
        Intent intent2 = new Intent("com.xiaomi.mipush.miui.RECEIVE_MESSAGE");
        intent2.setPackage(str);
        PackageManager packageManager = context.getPackageManager();
        try {
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 32);
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 32);
            if (queryBroadcastReceivers.isEmpty()) {
                if (queryIntentServices.isEmpty()) {
                    return false;
                }
            }
            return true;
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
            return false;
        }
    }

    private static void a(final XMPushService xMPushService, final iq iqVar, final String str) {
        if (iqVar == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("send app absent ack message error, container is null.");
        } else {
            if (xMPushService == null) {
                com.xiaomi.channel.commonutils.logger.c.m15a("send app absent ack message error, pushService is null.");
                return;
            }
            XMPushService.j jVar = new XMPushService.j(4) { // from class: com.xiaomi.push.service.z.7
                @Override // com.xiaomi.push.service.XMPushService.j
                public String a() {
                    return "send app absent ack message for message.";
                }

                @Override // com.xiaomi.push.service.XMPushService.j
                /* renamed from: a */
                public void mo403a() {
                    try {
                        iq a = z.a((Context) xMPushService, iqVar);
                        a.m558a().a("absent_target_package", str);
                        a.m558a().a(WsConstants.KEY_CONNECTION_ERROR, "absent_target_package");
                        a.m558a().a("reason", "target app is absent");
                        ab.a(xMPushService, a);
                    } catch (gx e2) {
                        com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
                        xMPushService.a(10, e2);
                    }
                }
            };
            jVar.a(iqVar.f734a);
            xMPushService.a(jVar);
        }
    }

    private static void a(final XMPushService xMPushService, final iq iqVar, final String str, final String str2) {
        if (iqVar == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("send error ack message error, container is null.");
        } else {
            if (xMPushService == null) {
                com.xiaomi.channel.commonutils.logger.c.m15a("send error ack message error, pushService is null.");
                return;
            }
            XMPushService.j jVar = new XMPushService.j(4) { // from class: com.xiaomi.push.service.z.8
                @Override // com.xiaomi.push.service.XMPushService.j
                public String a() {
                    return "send wrong message ack for message.";
                }

                @Override // com.xiaomi.push.service.XMPushService.j
                /* renamed from: a */
                public void mo403a() {
                    try {
                        iq a = z.a((Context) xMPushService, iqVar);
                        a.f732a.a(WsConstants.KEY_CONNECTION_ERROR, str);
                        a.f732a.a("reason", str2);
                        ab.a(xMPushService, a);
                    } catch (gx e2) {
                        com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
                        xMPushService.a(10, e2);
                    }
                }
            };
            jVar.a(iqVar.f734a);
            xMPushService.a(jVar);
        }
    }

    static void a(final XMPushService xMPushService, final Map<String, String> map) {
        xMPushService.a(new XMPushService.j(4) { // from class: com.xiaomi.push.service.z.9
            @Override // com.xiaomi.push.service.XMPushService.j
            public String a() {
                return "report arrive failed notification .";
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            /* renamed from: a */
            public void mo403a() {
                try {
                    it itVar = new it();
                    itVar.c(ie.NOTIFICATION_ARRIVED_FAIL.f611a);
                    itVar.a(as.a());
                    String str = v.f1157a;
                    itVar.b(str);
                    itVar.d("com.xiaomi.xmsf");
                    itVar.a(map);
                    ab.a(xMPushService, ab.a("com.xiaomi.xmsf", str, itVar, hu.Notification));
                } catch (gx e2) {
                    com.xiaomi.channel.commonutils.logger.c.d("report arrive failed notification failed:" + e2);
                    xMPushService.a(10, e2);
                }
            }
        });
    }

    public static iq a(Context context, iq iqVar) {
        return a(context, iqVar, (Map<String, String>) null);
    }

    public static iq a(Context context, iq iqVar, Map<String, String> map) {
        ik ikVar = new ik();
        ikVar.b(iqVar.m559a());
        ih m558a = iqVar.m558a();
        if (m558a != null) {
            ikVar.a(m558a.m524a());
            ikVar.a(m558a.m522a());
            if (!TextUtils.isEmpty(m558a.m529b())) {
                ikVar.c(m558a.m529b());
            }
        }
        ikVar.a(je.a(context, iqVar));
        iq a = ab.a(iqVar.b(), iqVar.m559a(), ikVar, hu.AckMessage);
        ih m558a2 = iqVar.m558a();
        if (m558a2 != null) {
            m558a2 = bf.a(m558a2.m523a());
            String str = null;
            Map<String, String> m525a = m558a2.m525a();
            if (m525a != null) {
                str = m525a.get(WsConstants.KEY_CHANNEL_ID);
                if (PushClient.DEFAULT_REQUEST_ID.equals(m525a.get("enable_upload_as"))) {
                    m558a2.a("as", String.valueOf(b.a(context, iqVar.f738b)));
                }
            }
            m558a2.a("mat", Long.toString(System.currentTimeMillis()));
            m558a2.a("cs", String.valueOf(g.a(context, iqVar.f738b, str)));
            aa.a(m558a2, iqVar.f734a);
        } else {
            com.xiaomi.channel.commonutils.logger.c.m15a("Failed to append the ack parameter because actionMetaInfo is null");
        }
        if (map != null) {
            try {
                if (map.size() > 0) {
                    for (String str2 : map.keySet()) {
                        m558a2.a(str2, map.get(str2));
                    }
                }
            } catch (Throwable th) {
                com.xiaomi.channel.commonutils.logger.c.d("error adding params to ack message :" + th);
            }
        }
        a.a(m558a2);
        return a;
    }

    private static iq a(Context context, iq iqVar, Intent intent) {
        ih a = bf.a(iqVar.m558a().m523a());
        String stringExtra = intent.getStringExtra("mrt");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = String.valueOf(System.currentTimeMillis());
        }
        a.a("mrt", stringExtra);
        a.a("mat", Long.toString(System.currentTimeMillis()));
        ik ikVar = new ik();
        ikVar.b(iqVar.m559a());
        ikVar.a(a.m524a());
        ikVar.a(a.m522a());
        if (!TextUtils.isEmpty(a.m529b())) {
            ikVar.c(a.m529b());
        }
        ikVar.a(je.a(context, iqVar));
        iq a2 = ab.a(iqVar.b(), iqVar.m559a(), ikVar, hu.AckMessage);
        a2.a(a);
        return a2;
    }

    private static boolean a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            if (queryBroadcastReceivers != null) {
                if (!queryBroadcastReceivers.isEmpty()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }
}
