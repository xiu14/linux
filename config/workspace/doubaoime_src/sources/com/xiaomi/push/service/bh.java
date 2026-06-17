package com.xiaomi.push.service;

import com.xiaomi.push.gg;
import com.xiaomi.push.gx;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes2.dex */
public class bh extends XMPushService.j {
    private gg a;

    /* renamed from: a, reason: collision with other field name */
    private XMPushService f1079a;

    public bh(XMPushService xMPushService, gg ggVar) {
        super(4);
        this.f1079a = null;
        this.f1079a = xMPushService;
        this.a = ggVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "send a message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo403a() {
        try {
            gg ggVar = this.a;
            if (ggVar != null) {
                if (f.a(ggVar)) {
                    this.a.c(System.currentTimeMillis() - this.a.m413a());
                }
                this.f1079a.a(this.a);
            }
        } catch (gx e2) {
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
            this.f1079a.a(10, e2);
        }
    }
}
