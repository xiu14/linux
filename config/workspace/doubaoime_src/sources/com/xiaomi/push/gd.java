package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.bi;
import com.xiaomi.push.ef;
import com.xiaomi.push.jv;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.bi;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class gd {
    private int a;

    /* renamed from: a, reason: collision with other field name */
    private long f467a;

    /* renamed from: a, reason: collision with other field name */
    private gc f469a;

    /* renamed from: a, reason: collision with other field name */
    private String f470a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f471a = false;

    /* renamed from: a, reason: collision with other field name */
    private bi f468a = bi.a();

    static class a {
        static final gd a = new gd();
    }

    /* renamed from: a, reason: collision with other method in class */
    public static gd m406a() {
        return a.a;
    }

    boolean b() {
        m407a();
        return this.f471a && this.f468a.m129a() > 0;
    }

    public static gc a() {
        gc gcVar;
        gd gdVar = a.a;
        synchronized (gdVar) {
            gcVar = gdVar.f469a;
        }
        return gcVar;
    }

    public synchronized void a(XMPushService xMPushService) {
        this.f469a = new gc(xMPushService);
        this.f470a = "";
        com.xiaomi.push.service.bi.a().a(new bi.a() { // from class: com.xiaomi.push.gd.1
            @Override // com.xiaomi.push.service.bi.a
            public void a(ef.b bVar) {
                if (bVar.m292e()) {
                    gd.m406a().m410a(bVar.e());
                }
            }
        });
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m411a() {
        return this.f471a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m410a(int i) {
        if (i > 0) {
            int i2 = i * 1000;
            if (i2 > 604800000) {
                i2 = 604800000;
            }
            if (this.a == i2 && this.f471a) {
                return;
            }
            this.f471a = true;
            this.f467a = System.currentTimeMillis();
            this.a = i2;
            StringBuilder N = e.a.a.a.a.N("enable dot duration = ", i2, " start = ");
            N.append(this.f467a);
            com.xiaomi.channel.commonutils.logger.c.c(N.toString());
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    private void m407a() {
        if (!this.f471a || System.currentTimeMillis() - this.f467a <= this.a) {
            return;
        }
        this.f471a = false;
        this.f467a = 0L;
    }

    /* renamed from: a, reason: collision with other method in class */
    synchronized fz m409a() {
        fz fzVar;
        fzVar = null;
        if (b()) {
            fzVar = a(ax.d(this.f469a.f464a) ? 750 : 375);
        }
        return fzVar;
    }

    private fz a(int i) {
        ArrayList arrayList = new ArrayList();
        fz fzVar = new fz(this.f470a, arrayList);
        if (!ax.d(this.f469a.f464a)) {
            fzVar.a(j.f(this.f469a.f464a));
        }
        jx jxVar = new jx(i);
        jp a2 = new jv.a().a(jxVar);
        try {
            fzVar.b(a2);
        } catch (jj unused) {
        }
        LinkedList<bi.a> m130a = this.f468a.m130a();
        while (m130a.size() > 0) {
            try {
                fy a3 = a(m130a.getLast());
                if (a3 != null) {
                    a3.b(a2);
                }
                if (jxVar.a() > i) {
                    break;
                }
                if (a3 != null) {
                    arrayList.add(a3);
                }
                m130a.removeLast();
            } catch (jj | NoSuchElementException unused2) {
            }
        }
        return fzVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    synchronized fy m408a() {
        fy fyVar;
        fyVar = new fy();
        fyVar.a(ax.m112a((Context) this.f469a.f464a));
        fyVar.f441a = (byte) 0;
        fyVar.f445b = 1;
        fyVar.d((int) (System.currentTimeMillis() / 1000));
        return fyVar;
    }

    private fy a(bi.a aVar) {
        if (aVar.f144a == 0) {
            Object obj = aVar.f145a;
            if (obj instanceof fy) {
                return (fy) obj;
            }
            return null;
        }
        fy m408a = m408a();
        m408a.a(fx.CHANNEL_STATS_COUNTER.a());
        m408a.c(aVar.f144a);
        m408a.c(aVar.f146a);
        return m408a;
    }

    synchronized void a(fy fyVar) {
        this.f468a.a(fyVar);
    }
}
