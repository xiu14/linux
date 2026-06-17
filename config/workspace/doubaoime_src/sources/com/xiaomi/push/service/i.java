package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Message;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.common.wschannel.WsConstants;
import com.xiaomi.push.gg;
import com.xiaomi.push.hb;
import com.xiaomi.push.hc;
import com.xiaomi.push.hd;
import com.xiaomi.push.hf;
import com.xiaomi.push.service.ax;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class i {
    private z a = new z();

    /* renamed from: a, reason: collision with other field name */
    private final String[] f1111a = {"com.android.mms", "com.miui.voicetrigger", "com.xiaomi.mi_connect_service"};

    @SuppressLint({"WrongConstant"})
    public void a(Context context) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.c.m15a("context is null when notify service started.");
            return;
        }
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            com.xiaomi.channel.commonutils.logger.c.m15a("[Bcst] send ***.push.service_started broadcast to inform push service has started.");
            for (String str : this.f1111a) {
                if (!TextUtils.isEmpty(str) && !a(str, context)) {
                    Intent intent = new Intent();
                    intent.setAction("com.xiaomi.push.service_started");
                    if (com.xiaomi.push.k.m660c()) {
                        intent.addFlags(16777216);
                    }
                    intent.setPackage(str);
                    context.sendBroadcast(intent);
                }
            }
        }
    }

    @SuppressLint({"DefaultLocale"})
    public void a(Context context, ax.b bVar, boolean z, int i, String str) {
        if ("5".equalsIgnoreCase(bVar.f9322g)) {
            this.a.a(context, bVar, z, i, str);
            return;
        }
        if (a(bVar, context)) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_opened");
        intent.setPackage(bVar.f1060a);
        intent.putExtra("ext_succeeded", z);
        if (!z) {
            intent.putExtra("ext_reason", i);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("ext_reason_msg", str);
        }
        intent.putExtra("ext_chid", bVar.f9322g);
        intent.putExtra(ay.v, bVar.f1063b);
        intent.putExtra(ay.M, bVar.i);
        com.xiaomi.channel.commonutils.logger.c.m15a(String.format("[Bcst] notify channel open result. %s,%s,%b,%d", bVar.f9322g, bVar.f1060a, Boolean.valueOf(z), Integer.valueOf(i)));
        a(context, intent, bVar);
    }

    @SuppressLint({"DefaultLocale"})
    public void a(Context context, ax.b bVar, int i) {
        if ("5".equalsIgnoreCase(bVar.f9322g) || a(bVar, context)) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.channel_closed");
        intent.setPackage(bVar.f1060a);
        intent.putExtra(ay.y, bVar.f9322g);
        intent.putExtra("ext_reason", i);
        intent.putExtra(ay.v, bVar.f1063b);
        intent.putExtra(ay.M, bVar.i);
        if (bVar.f1054a != null && "9".equals(bVar.f9322g)) {
            try {
                bVar.f1054a.send(Message.obtain(null, 17, intent));
                return;
            } catch (RemoteException unused) {
                bVar.f1054a = null;
                StringBuilder M = e.a.a.a.a.M("peer may died: ");
                String str = bVar.f1063b;
                M.append(str.substring(str.lastIndexOf(64)));
                com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
                return;
            }
        }
        com.xiaomi.channel.commonutils.logger.c.m15a(String.format("[Bcst] notify channel closed. %s,%s,%d", bVar.f9322g, bVar.f1060a, Integer.valueOf(i)));
        a(context, intent, bVar);
    }

    public void a(XMPushService xMPushService, String str, hd hdVar) {
        String str2;
        ax.b a = a(hdVar);
        if (a == null) {
            com.xiaomi.channel.commonutils.logger.c.d("error while notify channel closed! channel " + str + " not registered");
            HashMap hashMap = new HashMap();
            hashMap.put(WsConstants.KEY_CONNECTION_ERROR, "channel_not_registered");
            hashMap.put("chid", str);
            hashMap.put("data_type", "packet");
            z.a(xMPushService, hashMap);
            return;
        }
        if ("5".equalsIgnoreCase(str)) {
            this.a.a(xMPushService, hdVar, a);
            return;
        }
        String str3 = a.f1060a;
        if (a(str3, xMPushService)) {
            return;
        }
        if (hdVar instanceof hc) {
            str2 = "com.xiaomi.push.new_msg";
        } else if (hdVar instanceof hb) {
            str2 = "com.xiaomi.push.new_iq";
        } else {
            if (!(hdVar instanceof hf)) {
                com.xiaomi.channel.commonutils.logger.c.d("unknown packet type, drop it");
                return;
            }
            str2 = "com.xiaomi.push.new_pres";
        }
        Intent intent = new Intent();
        intent.setAction(str2);
        intent.setPackage(str3);
        intent.putExtra("ext_chid", str);
        intent.putExtra("ext_packet", hdVar.a());
        intent.putExtra(ay.M, a.i);
        intent.putExtra(ay.E, a.h);
        com.xiaomi.channel.commonutils.logger.c.m15a(String.format("[Bcst] notify packet arrival. %s,%s,%s", a.f9322g, a.f1060a, hdVar.j()));
        if (ExifInterface.GPS_MEASUREMENT_3D.equalsIgnoreCase(str)) {
            intent.putExtra(ay.z, hdVar.f545a);
            intent.putExtra(ay.A, System.currentTimeMillis());
        }
        a(xMPushService, intent, a);
    }

    public void a(XMPushService xMPushService, String str, gg ggVar) {
        ax.b a = a(ggVar);
        if (a == null) {
            com.xiaomi.channel.commonutils.logger.c.d("error while notify channel closed! channel " + str + " not registered");
            HashMap hashMap = new HashMap();
            hashMap.put(WsConstants.KEY_CONNECTION_ERROR, "channel_not_registered");
            hashMap.put("chid", str);
            hashMap.put("data_type", "blob");
            z.a(xMPushService, hashMap);
            return;
        }
        if ("5".equalsIgnoreCase(str)) {
            this.a.a(xMPushService, ggVar, a);
            return;
        }
        String str2 = a.f1060a;
        if (a(str2, xMPushService)) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.new_msg");
        intent.setPackage(str2);
        if (("10".equalsIgnoreCase(str) || "11".equalsIgnoreCase(str)) && Build.VERSION.SDK_INT >= 34) {
            intent.addFlags(268435456);
        }
        intent.putExtra("ext_rcv_timestamp", SystemClock.elapsedRealtime());
        intent.putExtra("ext_chid", str);
        intent.putExtra("ext_raw_packet", ggVar.m419a(a.h));
        intent.putExtra(ay.M, a.i);
        intent.putExtra(ay.E, a.h);
        if (f.a(ggVar)) {
            intent.putExtra("ext_downward_pkt_id", ggVar.e());
        }
        if (a.f1054a != null) {
            try {
                a.f1054a.send(Message.obtain(null, 17, intent));
                com.xiaomi.channel.commonutils.logger.c.m15a("message was sent by messenger for chid=" + str);
                return;
            } catch (RemoteException unused) {
                a.f1054a = null;
                StringBuilder M = e.a.a.a.a.M("peer may died: ");
                String str3 = a.f1063b;
                M.append(str3.substring(str3.lastIndexOf(64)));
                com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
            }
        }
        if ("com.xiaomi.xmsf".equals(str2)) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.m15a(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", a.f9322g, a.f1060a, ggVar.e()));
        if (f.a(ggVar)) {
            be.a().a(ggVar.e(), SystemClock.elapsedRealtime());
        }
        a(xMPushService, intent, a);
    }

    ax.b a(hd hdVar) {
        Collection<ax.b> m766a = ax.a().m766a(hdVar.k());
        if (m766a.isEmpty()) {
            return null;
        }
        Iterator<ax.b> it2 = m766a.iterator();
        if (m766a.size() == 1) {
            return it2.next();
        }
        String m = hdVar.m();
        String l = hdVar.l();
        while (it2.hasNext()) {
            ax.b next = it2.next();
            if (TextUtils.equals(m, next.f1063b) || TextUtils.equals(l, next.f1063b)) {
                return next;
            }
        }
        return null;
    }

    ax.b a(gg ggVar) {
        Collection<ax.b> m766a = ax.a().m766a(Integer.toString(ggVar.a()));
        if (m766a.isEmpty()) {
            return null;
        }
        Iterator<ax.b> it2 = m766a.iterator();
        if (m766a.size() == 1) {
            return it2.next();
        }
        String g2 = ggVar.g();
        while (it2.hasNext()) {
            ax.b next = it2.next();
            if (TextUtils.equals(g2, next.f1063b)) {
                return next;
            }
        }
        return null;
    }

    public void a(Context context, ax.b bVar, String str, String str2) {
        if (bVar == null) {
            com.xiaomi.channel.commonutils.logger.c.d("error while notify kick by server!");
            return;
        }
        if ("5".equalsIgnoreCase(bVar.f9322g)) {
            com.xiaomi.channel.commonutils.logger.c.d("mipush kicked by server");
            return;
        }
        if (a(bVar, context)) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.xiaomi.push.kicked");
        intent.setPackage(bVar.f1060a);
        intent.putExtra("ext_kick_type", str);
        intent.putExtra("ext_kick_reason", str2);
        intent.putExtra("ext_chid", bVar.f9322g);
        intent.putExtra(ay.v, bVar.f1063b);
        intent.putExtra(ay.M, bVar.i);
        com.xiaomi.channel.commonutils.logger.c.m15a(String.format("[Bcst] notify packet(blob) arrival. %s,%s,%s", bVar.f9322g, bVar.f1060a, str2));
        a(context, intent, bVar);
    }

    private static void a(Context context, Intent intent, ax.b bVar) {
        if ("com.xiaomi.xmsf".equals(context.getPackageName())) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, a(bVar));
        }
    }

    public static String a(ax.b bVar) {
        if (!"9".equals(bVar.f9322g)) {
            return e.a.a.a.a.J(new StringBuilder(), bVar.f1060a, ".permission.MIPUSH_RECEIVE");
        }
        return e.a.a.a.a.J(new StringBuilder(), bVar.f1060a, ".permission.MIMC_RECEIVE");
    }

    private static boolean a(String str, Context context) {
        if (context == null || TextUtils.isEmpty(str)) {
            return true;
        }
        return TextUtils.equals(str, "com.xiaomi.mi_connect_service") && !com.xiaomi.push.h.m458a(context, "com.xiaomi.mi_connect_service");
    }

    private static boolean a(ax.b bVar, Context context) {
        if (bVar == null || context == null) {
            return true;
        }
        return a(bVar.f1060a, context);
    }
}
