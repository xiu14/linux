package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.gx;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.XMPushService.b;
import com.xiaomi.push.service.ax;
import java.util.Collection;
import java.util.Objects;

/* loaded from: classes2.dex */
public class x extends XMPushService.j {
    private XMPushService a;

    /* renamed from: a, reason: collision with other field name */
    private byte[] f1160a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f9355c;

    /* renamed from: d, reason: collision with root package name */
    private String f9356d;

    public x(XMPushService xMPushService, String str, String str2, String str3, byte[] bArr) {
        super(9);
        this.a = xMPushService;
        this.b = str;
        this.f1160a = bArr;
        this.f9355c = str2;
        this.f9356d = str3;
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    public String a() {
        return "register app";
    }

    @Override // com.xiaomi.push.service.XMPushService.j
    /* renamed from: a */
    public void mo403a() {
        ax.b next;
        u m832a = v.m832a((Context) this.a);
        if (m832a == null) {
            try {
                m832a = v.a(this.a, this.b, this.f9355c, this.f9356d);
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.c.d("fail to register push account. " + e2);
            }
        }
        if (m832a == null) {
            com.xiaomi.channel.commonutils.logger.c.d("no account for registration.");
            y.a(this.a, ErrorCode.ERROR_AUTHERICATION_ERROR, "no account.");
            return;
        }
        com.xiaomi.channel.commonutils.logger.c.m15a("do registration now.");
        Collection<ax.b> m766a = ax.a().m766a("5");
        if (m766a.isEmpty()) {
            next = m832a.a(this.a);
            ab.a(this.a, next);
            ax.a().a(next);
        } else {
            next = m766a.iterator().next();
        }
        if (!this.a.m698c()) {
            y.a(this.b, this.f1160a);
            this.a.a(true);
            return;
        }
        try {
            ax.c cVar = next.f1058a;
            if (cVar == ax.c.binded) {
                ab.a(this.a, this.b, this.f1160a);
            } else if (cVar == ax.c.unbind) {
                y.a(this.b, this.f1160a);
                XMPushService xMPushService = this.a;
                Objects.requireNonNull(xMPushService);
                xMPushService.a(xMPushService.new b(next));
            }
        } catch (gx e3) {
            com.xiaomi.channel.commonutils.logger.c.d("meet error, disconnect connection. " + e3);
            this.a.a(10, e3);
        }
    }
}
