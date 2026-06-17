package com.xiaomi.push.service;

import com.xiaomi.push.gg;
import com.xiaomi.push.gx;
import com.xiaomi.push.service.XMPushService;

/* loaded from: classes2.dex */
class d extends XMPushService.j {
    private XMPushService a;

    /* renamed from: a, reason: collision with other field name */
    private gg[] f1105a;

    public d(XMPushService xMPushService, gg[] ggVarArr) {
        super(4);
        this.a = null;
        this.a = xMPushService;
        this.f1105a = ggVarArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "batch send message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo403a() {
        try {
            gg[] ggVarArr = this.f1105a;
            if (ggVarArr != null) {
                this.a.a(ggVarArr);
            }
        } catch (gx e2) {
            com.xiaomi.channel.commonutils.logger.c.m18a((Throwable) e2);
            this.a.a(10, e2);
        }
    }
}
