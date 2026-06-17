package com.xiaomi.push;

import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.ef;
import com.xiaomi.push.gp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* loaded from: classes2.dex */
public class go implements gy {
    public static boolean a = false;

    /* renamed from: a, reason: collision with other field name */
    private gp f500a;

    /* renamed from: a, reason: collision with other field name */
    private SimpleDateFormat f503a = new SimpleDateFormat("hh:mm:ss aaa");

    /* renamed from: a, reason: collision with other field name */
    private a f499a = null;
    private a b = null;

    /* renamed from: a, reason: collision with other field name */
    private gs f501a = null;

    /* renamed from: a, reason: collision with other field name */
    private final String f502a = "[Slim] ";

    public go(gp gpVar) {
        this.f500a = null;
        this.f500a = gpVar;
        a();
    }

    private void a() {
        this.f499a = new a(true);
        this.b = new a(false);
        gp gpVar = this.f500a;
        a aVar = this.f499a;
        gpVar.a(aVar, aVar);
        gp gpVar2 = this.f500a;
        a aVar2 = this.b;
        gpVar2.b(aVar2, aVar2);
        this.f501a = new gs() { // from class: com.xiaomi.push.go.1
            @Override // com.xiaomi.push.gs
            public void a(gp gpVar3, int i, Exception exc) {
                StringBuilder M = e.a.a.a.a.M("[Slim] ");
                M.append(go.this.f503a.format(new Date()));
                M.append(" Connection closed (");
                M.append(go.this.f500a.hashCode());
                M.append(")");
                com.xiaomi.channel.commonutils.logger.c.c(M.toString());
            }

            @Override // com.xiaomi.push.gs
            public void b(gp gpVar3) {
                StringBuilder M = e.a.a.a.a.M("[Slim] ");
                M.append(go.this.f503a.format(new Date()));
                M.append(" Connection reconnected (");
                M.append(go.this.f500a.hashCode());
                M.append(")");
                com.xiaomi.channel.commonutils.logger.c.c(M.toString());
            }

            @Override // com.xiaomi.push.gs
            public void a(gp gpVar3, Exception exc) {
                StringBuilder M = e.a.a.a.a.M("[Slim] ");
                M.append(go.this.f503a.format(new Date()));
                M.append(" Reconnection failed due to an exception (");
                M.append(go.this.f500a.hashCode());
                M.append(")");
                com.xiaomi.channel.commonutils.logger.c.c(M.toString());
                exc.printStackTrace();
            }

            @Override // com.xiaomi.push.gs
            public void a(gp gpVar3) {
                StringBuilder M = e.a.a.a.a.M("[Slim] ");
                M.append(go.this.f503a.format(new Date()));
                M.append(" Connection started (");
                M.append(go.this.f500a.hashCode());
                M.append(")");
                com.xiaomi.channel.commonutils.logger.c.c(M.toString());
            }
        };
    }

    class a implements gu, gz {

        /* renamed from: a, reason: collision with other field name */
        String f504a;

        /* renamed from: a, reason: collision with other field name */
        private boolean f505a;

        a(boolean z) {
            this.f505a = true;
            this.f505a = z;
            this.f504a = z ? " RCV " : " Sent ";
        }

        @Override // com.xiaomi.push.gu
        public void a(hd hdVar) {
            if (go.a) {
                StringBuilder M = e.a.a.a.a.M("[Slim] ");
                M.append(go.this.f503a.format(new Date()));
                M.append(this.f504a);
                M.append(" PKT ");
                M.append(hdVar.mo469a());
                com.xiaomi.channel.commonutils.logger.c.c(M.toString());
                return;
            }
            StringBuilder M2 = e.a.a.a.a.M("[Slim] ");
            M2.append(go.this.f503a.format(new Date()));
            M2.append(this.f504a);
            M2.append(" PKT [");
            M2.append(hdVar.k());
            M2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            M2.append(hdVar.j());
            M2.append("]");
            com.xiaomi.channel.commonutils.logger.c.c(M2.toString());
        }

        @Override // com.xiaomi.push.gz
        /* renamed from: a */
        public boolean mo226a(hd hdVar) {
            return true;
        }

        @Override // com.xiaomi.push.gu
        public void a(gg ggVar) {
            if (go.a) {
                StringBuilder M = e.a.a.a.a.M("[Slim] ");
                M.append(go.this.f503a.format(new Date()));
                M.append(this.f504a);
                M.append(ggVar.toString());
                com.xiaomi.channel.commonutils.logger.c.c(M.toString());
            } else {
                StringBuilder M2 = e.a.a.a.a.M("[Slim] ");
                M2.append(go.this.f503a.format(new Date()));
                M2.append(this.f504a);
                M2.append(" Blob [");
                M2.append(ggVar.m414a());
                M2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                M2.append(ggVar.a());
                M2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                M2.append(com.xiaomi.push.service.as.a(ggVar.e()));
                M2.append("]");
                com.xiaomi.channel.commonutils.logger.c.c(M2.toString());
            }
            if (ggVar == null || ggVar.a() != 99999) {
                return;
            }
            String m414a = ggVar.m414a();
            gg ggVar2 = null;
            if (!this.f505a) {
                if ("BIND".equals(m414a)) {
                    com.xiaomi.channel.commonutils.logger.c.m15a("build binded result for loopback.");
                    ef.d dVar = new ef.d();
                    dVar.a(true);
                    dVar.c("login success.");
                    dVar.b("success");
                    dVar.a("success");
                    gg ggVar3 = new gg();
                    ggVar3.a(dVar.m380a(), (String) null);
                    ggVar3.a((short) 2);
                    ggVar3.a(99999);
                    ggVar3.a("BIND", (String) null);
                    ggVar3.a(ggVar.e());
                    ggVar3.b((String) null);
                    ggVar3.c(ggVar.g());
                    ggVar2 = ggVar3;
                } else if (!"UBND".equals(m414a) && "SECMSG".equals(m414a)) {
                    gg ggVar4 = new gg();
                    ggVar4.a(99999);
                    ggVar4.a("SECMSG", (String) null);
                    ggVar4.c(ggVar.g());
                    ggVar4.a(ggVar.e());
                    ggVar4.a(ggVar.m416a());
                    ggVar4.b(ggVar.f());
                    ggVar4.a(ggVar.m419a(com.xiaomi.push.service.ax.a().a(String.valueOf(99999), ggVar.g()).h), (String) null);
                    ggVar2 = ggVar4;
                }
            }
            if (ggVar2 != null) {
                for (Map.Entry<gu, gp.a> entry : go.this.f500a.m439a().entrySet()) {
                    if (go.this.f499a != entry.getKey()) {
                        entry.getValue().a(ggVar2);
                    }
                }
            }
        }
    }
}
