package com.xiaomi.push.service;

import android.text.TextUtils;
import com.vivo.push.PushClient;
import com.xiaomi.push.cp;
import com.xiaomi.push.ct;
import com.xiaomi.push.dr;
import com.xiaomi.push.ef;
import com.xiaomi.push.fx;
import com.xiaomi.push.ge;
import com.xiaomi.push.gg;
import com.xiaomi.push.gq;
import com.xiaomi.push.ha;
import com.xiaomi.push.hb;
import com.xiaomi.push.hc;
import com.xiaomi.push.hd;
import com.xiaomi.push.ho;
import com.xiaomi.push.service.ax;
import java.util.Date;

/* loaded from: classes2.dex */
public class at {
    private XMPushService a;

    at(XMPushService xMPushService) {
        this.a = xMPushService;
    }

    private void c(gg ggVar) {
        ax.b a;
        String g2 = ggVar.g();
        String num = Integer.toString(ggVar.a());
        if (TextUtils.isEmpty(g2) || TextUtils.isEmpty(num) || (a = ax.a().a(num, g2)) == null) {
            return;
        }
        ho.a(this.a, a.f1060a, ggVar.c(), true, true, System.currentTimeMillis());
    }

    public void a(hd hdVar) {
        if (!"5".equals(hdVar.k())) {
            b(hdVar);
        }
        String k = hdVar.k();
        if (TextUtils.isEmpty(k)) {
            k = PushClient.DEFAULT_REQUEST_ID;
            hdVar.l(PushClient.DEFAULT_REQUEST_ID);
        }
        if (k.equals("0")) {
            StringBuilder M = e.a.a.a.a.M("Received wrong packet with chid = 0 : ");
            M.append(hdVar.mo469a());
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
        }
        if (hdVar instanceof hb) {
            ha a = hdVar.a("kick");
            if (a != null) {
                String l = hdVar.l();
                String a2 = a.a("type");
                String a3 = a.a("reason");
                StringBuilder U = e.a.a.a.a.U("kicked by server, chid=", k, " res=");
                U.append(ax.b.a(l));
                U.append(" type=");
                U.append(a2);
                U.append(" reason=");
                U.append(a3);
                com.xiaomi.channel.commonutils.logger.c.m15a(U.toString());
                if (!"wait".equals(a2)) {
                    this.a.a(k, l, 3, a3, a2);
                    ax.a().m770a(k, l);
                    return;
                }
                ax.b a4 = ax.a().a(k, l);
                if (a4 != null) {
                    this.a.a(a4);
                    a4.a(ax.c.unbind, 3, 0, a3, a2);
                    return;
                }
                return;
            }
        } else if (hdVar instanceof hc) {
            hc hcVar = (hc) hdVar;
            if ("redir".equals(hcVar.b())) {
                ha a5 = hcVar.a("hosts");
                if (a5 != null) {
                    a(a5);
                    return;
                }
                return;
            }
        }
        this.a.m695b().a(this.a, k, hdVar);
    }

    public void b(gg ggVar) {
        String m414a = ggVar.m414a();
        if (ggVar.a() == 0) {
            if ("PING".equals(m414a)) {
                byte[] m418a = ggVar.m418a();
                if (m418a != null && m418a.length > 0) {
                    ef.j a = ef.j.a(m418a);
                    if (a.m341b()) {
                        bi.a().a(a.m339a());
                    }
                }
                if (!"com.xiaomi.xmsf".equals(this.a.getPackageName())) {
                    this.a.m692a();
                }
                if (PushClient.DEFAULT_REQUEST_ID.equals(ggVar.e())) {
                    com.xiaomi.channel.commonutils.logger.c.m15a("received a server ping");
                } else {
                    ge.b();
                }
                this.a.m696b();
                return;
            }
            if (!"SYNC".equals(m414a)) {
                if ("NOTIFY".equals(ggVar.m414a())) {
                    ef.h a2 = ef.h.a(ggVar.m418a());
                    StringBuilder M = e.a.a.a.a.M("notify by server err = ");
                    M.append(a2.c());
                    M.append(" desc = ");
                    M.append(a2.m333a());
                    com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
                    return;
                }
                return;
            }
            if ("CONF".equals(ggVar.m421b())) {
                bi.a().a(ef.b.a(ggVar.m418a()));
                return;
            }
            if (TextUtils.equals("U", ggVar.m421b())) {
                ef.k a3 = ef.k.a(ggVar.m418a());
                dr.a(this.a).a(a3.m343a(), a3.m346b(), new Date(a3.m342a()), new Date(a3.m345b()), a3.c() * 1024, a3.e());
                gg ggVar2 = new gg();
                ggVar2.a(0);
                ggVar2.a(ggVar.m414a(), "UCA");
                ggVar2.a(ggVar.e());
                XMPushService xMPushService = this.a;
                xMPushService.a(new bh(xMPushService, ggVar2));
                return;
            }
            if (TextUtils.equals("P", ggVar.m421b())) {
                ef.i a4 = ef.i.a(ggVar.m418a());
                gg ggVar3 = new gg();
                ggVar3.a(0);
                ggVar3.a(ggVar.m414a(), "PCA");
                ggVar3.a(ggVar.e());
                ef.i iVar = new ef.i();
                if (a4.m337a()) {
                    iVar.a(a4.m336a());
                }
                ggVar3.a(iVar.m380a(), (String) null);
                XMPushService xMPushService2 = this.a;
                xMPushService2.a(new bh(xMPushService2, ggVar3));
                com.xiaomi.channel.commonutils.logger.c.m15a("ACK msgP: id = " + ggVar.e());
                return;
            }
            return;
        }
        String num = Integer.toString(ggVar.a());
        if ("SECMSG".equals(ggVar.m414a())) {
            if (!ggVar.m417a()) {
                this.a.m695b().a(this.a, num, ggVar);
                return;
            }
            StringBuilder M2 = e.a.a.a.a.M("Recv SECMSG errCode = ");
            M2.append(ggVar.b());
            M2.append(" errStr = ");
            M2.append(ggVar.m424c());
            com.xiaomi.channel.commonutils.logger.c.m15a(M2.toString());
            return;
        }
        if (!"BIND".equals(m414a)) {
            if ("KICK".equals(m414a)) {
                ef.g a5 = ef.g.a(ggVar.m418a());
                String g2 = ggVar.g();
                String m328a = a5.m328a();
                String m330b = a5.m330b();
                StringBuilder U = e.a.a.a.a.U("kicked by server, chid=", num, " res= ");
                U.append(ax.b.a(g2));
                U.append(" type=");
                U.append(m328a);
                U.append(" reason=");
                U.append(m330b);
                com.xiaomi.channel.commonutils.logger.c.m15a(U.toString());
                if (!"wait".equals(m328a)) {
                    this.a.a(num, g2, 3, m330b, m328a);
                    ax.a().m770a(num, g2);
                    return;
                }
                ax.b a6 = ax.a().a(num, g2);
                if (a6 != null) {
                    this.a.a(a6);
                    a6.a(ax.c.unbind, 3, 0, m330b, m328a);
                    return;
                }
                return;
            }
            return;
        }
        ef.d a7 = ef.d.a(ggVar.m418a());
        String g3 = ggVar.g();
        ax.b a8 = ax.a().a(num, g3);
        if (a8 == null) {
            return;
        }
        if (a7.m302a()) {
            StringBuilder M3 = e.a.a.a.a.M("SMACK: channel bind succeeded, chid=");
            M3.append(ggVar.a());
            com.xiaomi.channel.commonutils.logger.c.m15a(M3.toString());
            a8.a(ax.c.binded, 1, 0, (String) null, (String) null);
            return;
        }
        String m301a = a7.m301a();
        if ("auth".equals(m301a)) {
            if ("invalid-sig".equals(a7.m303b())) {
                StringBuilder M4 = e.a.a.a.a.M("SMACK: bind error invalid-sig token = ");
                M4.append(a8.f9318c);
                M4.append(" sec = ");
                M4.append(a8.h);
                com.xiaomi.channel.commonutils.logger.c.m15a(M4.toString());
                ge.a(0, fx.BIND_INVALID_SIG.a(), 1, null, 0);
            }
            a8.a(ax.c.unbind, 1, 5, a7.m303b(), m301a);
            ax.a().m770a(num, g3);
        } else if ("cancel".equals(m301a)) {
            a8.a(ax.c.unbind, 1, 7, a7.m303b(), m301a);
            ax.a().m770a(num, g3);
        } else if ("wait".equals(m301a)) {
            this.a.a(a8);
            a8.a(ax.c.unbind, 1, 7, a7.m303b(), m301a);
        }
        StringBuilder U2 = e.a.a.a.a.U("SMACK: channel bind failed, chid=", num, " reason=");
        U2.append(a7.m303b());
        com.xiaomi.channel.commonutils.logger.c.m15a(U2.toString());
    }

    public void a(gg ggVar) {
        if (5 != ggVar.a()) {
            c(ggVar);
        }
        try {
            b(ggVar);
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("handle Blob chid = ");
            M.append(ggVar.a());
            M.append(" cmd = ");
            M.append(ggVar.m414a());
            M.append(" packetid = ");
            M.append(ggVar.e());
            M.append(" failure ");
            com.xiaomi.channel.commonutils.logger.c.a(M.toString(), e2);
        }
    }

    private void a(ha haVar) {
        String c2 = haVar.c();
        if (TextUtils.isEmpty(c2)) {
            return;
        }
        String[] split = c2.split(";");
        cp a = ct.a().a(gq.a(), false);
        if (a == null || split.length <= 0) {
            return;
        }
        a.a(split);
        this.a.a(20, (Exception) null);
        this.a.a(true);
    }

    private void b(hd hdVar) {
        ax.b a;
        String l = hdVar.l();
        String k = hdVar.k();
        if (TextUtils.isEmpty(l) || TextUtils.isEmpty(k) || (a = ax.a().a(k, l)) == null) {
            return;
        }
        ho.a(this.a, a.f1060a, ho.a(hdVar.mo469a()), true, true, System.currentTimeMillis());
    }
}
