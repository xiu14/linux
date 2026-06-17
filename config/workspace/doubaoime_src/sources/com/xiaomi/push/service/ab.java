package com.xiaomi.push.service;

import android.content.Context;
import android.os.Messenger;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.di;
import com.xiaomi.push.gg;
import com.xiaomi.push.gp;
import com.xiaomi.push.gx;
import com.xiaomi.push.hd;
import com.xiaomi.push.hu;
import com.xiaomi.push.ie;
import com.xiaomi.push.ih;
import com.xiaomi.push.ij;
import com.xiaomi.push.iq;
import com.xiaomi.push.it;
import com.xiaomi.push.je;
import com.xiaomi.push.jf;
import com.xiaomi.push.jj;
import com.xiaomi.push.service.ax;
import com.xiaomi.push.service.bj;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class ab {
    static void a(XMPushService xMPushService) {
        u m832a = v.m832a(xMPushService.getApplicationContext());
        if (m832a != null) {
            ax.b a = v.m832a(xMPushService.getApplicationContext()).a(xMPushService);
            StringBuilder M = e.a.a.a.a.M("prepare account. ");
            M.append(a.f1060a);
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
            a(xMPushService, a);
            ax.a().a(a);
            a(xMPushService, m832a, 172800);
        }
    }

    static <T extends jf<T, ?>> iq b(String str, String str2, T t, hu huVar) {
        return a(str, str2, t, huVar, false);
    }

    static iq b(String str, String str2) {
        it itVar = new it();
        itVar.b(str2);
        itVar.c(ie.AppDataCleared.f611a);
        itVar.a(as.a());
        itVar.a(false);
        return a(str, str2, itVar, hu.Notification);
    }

    private static void a(final XMPushService xMPushService, final u uVar, int i) {
        bj.a(xMPushService).a(new bj.a("MSAID", i) { // from class: com.xiaomi.push.service.ab.1
            @Override // com.xiaomi.push.service.bj.a
            void a(bj bjVar) {
                com.xiaomi.push.aq a = com.xiaomi.push.aq.a(xMPushService);
                String a2 = bjVar.a("MSAID", "msaid");
                String mo101a = a.mo101a();
                if (TextUtils.isEmpty(mo101a) || TextUtils.equals(a2, mo101a)) {
                    return;
                }
                bjVar.a("MSAID", "msaid", mo101a);
                it itVar = new it();
                itVar.b(uVar.f9350d);
                itVar.c(ie.ClientInfoUpdate.f611a);
                itVar.a(as.a());
                itVar.a(new HashMap());
                a.a(itVar.m574a());
                byte[] a3 = je.a(ab.a(xMPushService.getPackageName(), uVar.f9350d, itVar, hu.Notification));
                XMPushService xMPushService2 = xMPushService;
                xMPushService2.a(xMPushService2.getPackageName(), a3, true);
            }
        });
    }

    private static String a(iq iqVar) {
        Map<String, String> map;
        ih ihVar = iqVar.f732a;
        if (ihVar != null && (map = ihVar.f650b) != null) {
            String str = map.get("ext_traffic_source_pkg");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return iqVar.f738b;
    }

    static gg a(u uVar, Context context, iq iqVar) {
        try {
            gg ggVar = new gg();
            ggVar.a(5);
            ggVar.c(uVar.f1155a);
            ggVar.b(a(iqVar));
            ggVar.a("SECMSG", "message");
            String str = uVar.f1155a;
            iqVar.f733a.f660a = str.substring(0, str.indexOf("@"));
            iqVar.f733a.f664c = str.substring(str.indexOf("/") + 1);
            ggVar.a(je.a(iqVar), uVar.f9349c);
            ggVar.a((short) 1);
            com.xiaomi.channel.commonutils.logger.c.m15a("try send mi push message. packagename:" + iqVar.f738b + " action:" + iqVar.f731a);
            return ggVar;
        } catch (NullPointerException e2) {
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
            return null;
        }
    }

    static gg a(XMPushService xMPushService, byte[] bArr) {
        iq iqVar = new iq();
        try {
            je.a(iqVar, bArr);
            return a(v.m832a((Context) xMPushService), xMPushService, iqVar);
        } catch (jj e2) {
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
            return null;
        }
    }

    static <T extends jf<T, ?>> iq a(String str, String str2, T t, hu huVar) {
        return a(str, str2, t, huVar, true);
    }

    private static <T extends jf<T, ?>> iq a(String str, String str2, T t, hu huVar, boolean z) {
        byte[] a = je.a(t);
        iq iqVar = new iq();
        ij ijVar = new ij();
        ijVar.f659a = 5L;
        ijVar.f660a = "fakeid";
        iqVar.a(ijVar);
        iqVar.a(ByteBuffer.wrap(a));
        iqVar.a(huVar);
        iqVar.b(z);
        iqVar.b(str);
        iqVar.a(false);
        iqVar.a(str2);
        return iqVar;
    }

    static iq a(String str, String str2) {
        it itVar = new it();
        itVar.b(str2);
        itVar.c("package uninstalled");
        itVar.a(hd.i());
        itVar.a(false);
        return a(str, str2, itVar, hu.Notification);
    }

    static void a(final XMPushService xMPushService, final ax.b bVar) {
        bVar.a((Messenger) null);
        bVar.a(new ax.b.a() { // from class: com.xiaomi.push.service.ab.2
            @Override // com.xiaomi.push.service.ax.b.a
            public void a(ax.c cVar, ax.c cVar2, int i) {
                if (cVar2 != ax.c.binded) {
                    if (cVar2 == ax.c.unbind) {
                        com.xiaomi.channel.commonutils.logger.c.m15a("onChange unbind");
                        y.a(XMPushService.this, ErrorCode.ERROR_SERVICE_UNAVAILABLE, " the push is not connected.");
                        return;
                    }
                    return;
                }
                y.a(XMPushService.this, true);
                y.a(XMPushService.this);
                if (bVar.m774a()) {
                    a.a().a(XMPushService.this);
                }
            }
        });
    }

    static void a(XMPushService xMPushService, String str, byte[] bArr) {
        di.a(str, xMPushService.getApplicationContext(), bArr);
        gp m690a = xMPushService.m690a();
        if (m690a != null) {
            if (m690a.mo431a()) {
                gg a = a(xMPushService, bArr);
                if (a != null) {
                    m690a.b(a);
                    return;
                } else {
                    y.a(xMPushService, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, "not a valid message");
                    return;
                }
            }
            throw new gx("Don't support XMPP connection.");
        }
        throw new gx("try send msg while connection is null.");
    }

    static void a(XMPushService xMPushService, iq iqVar) {
        di.a(iqVar.b(), xMPushService.getApplicationContext(), iqVar, -1);
        gp m690a = xMPushService.m690a();
        if (m690a != null) {
            if (m690a.mo431a()) {
                gg a = a(v.m832a((Context) xMPushService), xMPushService, iqVar);
                if (a != null) {
                    m690a.b(a);
                    return;
                }
                return;
            }
            throw new gx("Don't support XMPP connection.");
        }
        throw new gx("try send msg while connection is null.");
    }

    static String a(String str) {
        return e.a.a.a.a.s(str, ".permission.MIPUSH_RECEIVE");
    }
}
