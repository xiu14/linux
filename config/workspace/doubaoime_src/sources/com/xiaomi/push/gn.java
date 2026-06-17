package com.xiaomi.push;

import android.os.SystemClock;
import android.text.TextUtils;
import com.vivo.push.PushClient;
import com.xiaomi.push.ef;
import com.xiaomi.push.gp;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.ax;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class gn extends gw {
    private gi a;

    /* renamed from: a, reason: collision with other field name */
    private gj f496a;

    /* renamed from: a, reason: collision with other field name */
    private Thread f497a;

    /* renamed from: a, reason: collision with other field name */
    private byte[] f498a;

    public gn(XMPushService xMPushService, gq gqVar) {
        super(xMPushService, gqVar);
    }

    private void h() {
        try {
            this.a = new gi(((gw) this).f527a.getInputStream(), this);
            this.f496a = new gj(((gw) this).f527a.getOutputStream(), this);
            Thread thread = new Thread("Blob Reader (" + ((gp) this).b + ")") { // from class: com.xiaomi.push.gn.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        gn.this.a.m426a();
                    } catch (Exception e2) {
                        gn.this.c(9, e2);
                    }
                }
            };
            this.f497a = thread;
            thread.start();
        } catch (Exception e2) {
            throw new gx("Error to init reader and writer", e2);
        }
    }

    @Override // com.xiaomi.push.gp
    /* renamed from: a, reason: collision with other method in class */
    public boolean mo431a() {
        return true;
    }

    void b(hd hdVar) {
        if (hdVar == null) {
            return;
        }
        Iterator<gp.a> it2 = ((gp) this).f515a.values().iterator();
        while (it2.hasNext()) {
            it2.next().a(hdVar);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    synchronized byte[] m432a() {
        if (this.f498a == null && !TextUtils.isEmpty(((gp) this).f512a)) {
            String m780a = com.xiaomi.push.service.bi.m780a();
            StringBuilder sb = new StringBuilder();
            String str = ((gp) this).f512a;
            sb.append(str.substring(str.length() / 2));
            sb.append(m780a.substring(m780a.length() / 2));
            this.f498a = com.xiaomi.push.service.bc.a(((gp) this).f512a.getBytes(), sb.toString().getBytes());
        }
        return this.f498a;
    }

    @Override // com.xiaomi.push.gp
    public void b(gg ggVar) {
        gj gjVar = this.f496a;
        if (gjVar != null) {
            try {
                int a = gjVar.a(ggVar);
                ((gp) this).f9111d = SystemClock.elapsedRealtime();
                String f2 = ggVar.f();
                if (!TextUtils.isEmpty(f2)) {
                    ho.a(((gp) this).f511a, f2, a, false, true, System.currentTimeMillis());
                }
                Iterator<gp.a> it2 = ((gp) this).f519b.values().iterator();
                while (it2.hasNext()) {
                    it2.next().a(ggVar);
                }
                return;
            } catch (Exception e2) {
                throw new gx(e2);
            }
        }
        throw new gx("the writer is null.");
    }

    private gg a(boolean z) {
        gm gmVar = new gm();
        if (z) {
            gmVar.a(PushClient.DEFAULT_REQUEST_ID);
        }
        byte[] m412a = ge.m412a();
        if (m412a != null) {
            ef.j jVar = new ef.j();
            jVar.a(b.a(m412a));
            gmVar.a(jVar.m380a(), (String) null);
        }
        return gmVar;
    }

    @Override // com.xiaomi.push.gw
    /* renamed from: a, reason: collision with other method in class */
    protected void mo430a(boolean z) {
        if (this.f496a != null) {
            gg a = a(z);
            StringBuilder M = e.a.a.a.a.M("[Slim] SND ping id=");
            M.append(a.e());
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
            b(a);
            f();
            return;
        }
        throw new gx("The BlobWriter is null.");
    }

    @Override // com.xiaomi.push.gp
    public synchronized void a(ax.b bVar) {
        gf.a(bVar, c(), this);
    }

    @Override // com.xiaomi.push.gp
    public synchronized void a(String str, String str2) {
        gf.a(str, str2, this);
    }

    @Override // com.xiaomi.push.gw
    protected synchronized void a(int i, Exception exc) {
        gi giVar = this.a;
        if (giVar != null) {
            giVar.b();
            this.a = null;
        }
        gj gjVar = this.f496a;
        if (gjVar != null) {
            try {
                gjVar.b();
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.c.d("SlimConnection shutdown cause exception: " + e2);
            }
            this.f496a = null;
        }
        this.f498a = null;
        super.a(i, exc);
    }

    @Override // com.xiaomi.push.gw, com.xiaomi.push.gp
    public void a(gg[] ggVarArr) {
        for (gg ggVar : ggVarArr) {
            b(ggVar);
        }
    }

    @Override // com.xiaomi.push.gp
    @Deprecated
    public void a(hd hdVar) {
        b(gg.a(hdVar, (String) null));
    }

    @Override // com.xiaomi.push.gw
    /* renamed from: a */
    protected synchronized void mo451a() {
        h();
        this.f496a.a();
    }

    void a(gg ggVar) {
        if (ggVar == null) {
            return;
        }
        if (com.xiaomi.push.service.f.a(ggVar)) {
            gg ggVar2 = new gg();
            ggVar2.a(ggVar.a());
            ggVar2.a("SYNC", "ACK_RTT");
            ggVar2.a(ggVar.e());
            ggVar2.b(ggVar.m420b());
            ggVar2.a(ggVar.m423c());
            XMPushService xMPushService = ((gp) this).f511a;
            xMPushService.a(new com.xiaomi.push.service.bh(xMPushService, ggVar2));
        }
        if (ggVar.m417a()) {
            StringBuilder M = e.a.a.a.a.M("[Slim] RCV blob chid=");
            M.append(ggVar.a());
            M.append("; id=");
            M.append(ggVar.e());
            M.append("; errCode=");
            M.append(ggVar.b());
            M.append("; err=");
            M.append(ggVar.m424c());
            com.xiaomi.channel.commonutils.logger.c.m15a(M.toString());
        }
        if (ggVar.a() == 0) {
            if ("PING".equals(ggVar.m414a())) {
                StringBuilder M2 = e.a.a.a.a.M("[Slim] RCV ping id=");
                M2.append(ggVar.e());
                com.xiaomi.channel.commonutils.logger.c.m15a(M2.toString());
                g();
            } else if ("CLOSE".equals(ggVar.m414a())) {
                c(13, null);
            }
        }
        Iterator<gp.a> it2 = ((gp) this).f515a.values().iterator();
        while (it2.hasNext()) {
            it2.next().a(ggVar);
        }
    }
}
