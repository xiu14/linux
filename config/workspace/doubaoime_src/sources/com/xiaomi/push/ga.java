package com.xiaomi.push;

import com.xiaomi.push.gb;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.ax;

/* loaded from: classes2.dex */
class ga implements ax.b.a {
    private int a;

    /* renamed from: a, reason: collision with other field name */
    private gp f456a;

    /* renamed from: a, reason: collision with other field name */
    private XMPushService f457a;

    /* renamed from: a, reason: collision with other field name */
    private ax.b f458a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f460a = false;

    /* renamed from: a, reason: collision with other field name */
    private ax.c f459a = ax.c.binding;

    /* renamed from: com.xiaomi.push.ga$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            ax.c.values();
            int[] iArr = new int[3];
            a = iArr;
            try {
                ax.c cVar = ax.c.unbind;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = a;
                ax.c cVar2 = ax.c.binding;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = a;
                ax.c cVar3 = ax.c.binded;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    ga(XMPushService xMPushService, ax.b bVar) {
        this.f457a = xMPushService;
        this.f458a = bVar;
    }

    private void b() {
        this.f458a.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        b();
        if (this.f460a && this.a != 11) {
            fy m408a = gd.m406a().m408a();
            int i = AnonymousClass2.a[this.f459a.ordinal()];
            if (i == 1) {
                int i2 = this.a;
                if (i2 == 17) {
                    m408a.f442a = fx.BIND_TCP_READ_TIMEOUT.a();
                } else if (i2 == 21) {
                    m408a.f442a = fx.BIND_TIMEOUT.a();
                } else {
                    try {
                        gb.a c2 = gb.c(gd.a().a());
                        m408a.f442a = c2.a.a();
                        m408a.c(c2.f461a);
                    } catch (NullPointerException unused) {
                        m408a = null;
                    }
                }
            } else if (i == 3) {
                m408a.f442a = fx.BIND_SUCCESS.a();
            }
            if (m408a != null) {
                m408a.b(this.f456a.mo438a());
                m408a.d(this.f458a.f1063b);
                m408a.f445b = 1;
                try {
                    m408a.a((byte) Integer.parseInt(this.f458a.f9322g));
                } catch (NumberFormatException unused2) {
                }
                gd.m406a().a(m408a);
            }
        }
    }

    void a() {
        this.f458a.a(this);
        this.f456a = this.f457a.m690a();
    }

    @Override // com.xiaomi.push.service.ax.b.a
    public void a(ax.c cVar, ax.c cVar2, int i) {
        if (!this.f460a && cVar == ax.c.binding) {
            this.f459a = cVar2;
            this.a = i;
            this.f460a = true;
        }
        this.f457a.a(new XMPushService.j(4) { // from class: com.xiaomi.push.ga.1
            @Override // com.xiaomi.push.service.XMPushService.j
            public String a() {
                return "Handling bind stats";
            }

            @Override // com.xiaomi.push.service.XMPushService.j
            /* renamed from: a, reason: collision with other method in class */
            public void mo403a() {
                ga.this.c();
            }
        });
    }
}
