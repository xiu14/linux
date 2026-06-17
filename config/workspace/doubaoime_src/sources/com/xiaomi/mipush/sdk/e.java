package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.hz;
import com.xiaomi.push.service.aq;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class e implements AbstractPushManager {
    private static volatile e a;

    /* renamed from: a, reason: collision with other field name */
    private Context f56a;

    /* renamed from: a, reason: collision with other field name */
    private PushConfiguration f57a;

    /* renamed from: a, reason: collision with other field name */
    private boolean f59a = false;

    /* renamed from: a, reason: collision with other field name */
    private Map<d, AbstractPushManager> f58a = new HashMap();

    /* renamed from: com.xiaomi.mipush.sdk.e$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            d.values();
            int[] iArr = new int[4];
            a = iArr;
            try {
                d dVar = d.ASSEMBLE_PUSH_HUAWEI;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = a;
                d dVar2 = d.ASSEMBLE_PUSH_FCM;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = a;
                d dVar3 = d.ASSEMBLE_PUSH_COS;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = a;
                d dVar4 = d.ASSEMBLE_PUSH_FTOS;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private e(Context context) {
        this.f56a = context.getApplicationContext();
    }

    public boolean b(d dVar) {
        int i = AnonymousClass2.a[dVar.ordinal()];
        boolean z = false;
        if (i == 1) {
            PushConfiguration pushConfiguration = this.f57a;
            if (pushConfiguration != null) {
                return pushConfiguration.getOpenHmsPush();
            }
            return false;
        }
        if (i == 2) {
            PushConfiguration pushConfiguration2 = this.f57a;
            if (pushConfiguration2 != null) {
                return pushConfiguration2.getOpenFCMPush();
            }
            return false;
        }
        if (i == 3) {
            PushConfiguration pushConfiguration3 = this.f57a;
            if (pushConfiguration3 != null) {
                z = pushConfiguration3.getOpenCOSPush();
            }
        } else if (i != 4) {
            return false;
        }
        PushConfiguration pushConfiguration4 = this.f57a;
        return pushConfiguration4 != null ? pushConfiguration4.getOpenFTOSPush() : z;
    }

    @Override // com.xiaomi.mipush.sdk.AbstractPushManager
    public void register() {
        com.xiaomi.channel.commonutils.logger.c.m15a("ASSEMBLE_PUSH : assemble push register");
        if (this.f58a.size() <= 0) {
            a();
        }
        if (this.f58a.size() > 0) {
            for (AbstractPushManager abstractPushManager : this.f58a.values()) {
                if (abstractPushManager != null) {
                    abstractPushManager.register();
                }
            }
            f.m61a(this.f56a);
        }
    }

    @Override // com.xiaomi.mipush.sdk.AbstractPushManager
    public void unregister() {
        com.xiaomi.channel.commonutils.logger.c.m15a("ASSEMBLE_PUSH : assemble push unregister");
        for (AbstractPushManager abstractPushManager : this.f58a.values()) {
            if (abstractPushManager != null) {
                abstractPushManager.unregister();
            }
        }
        this.f58a.clear();
    }

    public static e a(Context context) {
        if (a == null) {
            synchronized (e.class) {
                if (a == null) {
                    a = new e(context);
                }
            }
        }
        return a;
    }

    public void a(PushConfiguration pushConfiguration) {
        this.f57a = pushConfiguration;
        this.f59a = aq.a(this.f56a).a(hz.AggregatePushSwitch.a(), true);
        if (this.f57a.getOpenHmsPush() || this.f57a.getOpenFCMPush() || this.f57a.getOpenCOSPush() || this.f57a.getOpenFTOSPush()) {
            aq.a(this.f56a).a(new aq.a(101, "assemblePush") { // from class: com.xiaomi.mipush.sdk.e.1
                @Override // com.xiaomi.push.service.aq.a
                protected void onCallback() {
                    boolean a2 = aq.a(e.this.f56a).a(hz.AggregatePushSwitch.a(), true);
                    if (e.this.f59a != a2) {
                        e.this.f59a = a2;
                        f.b(e.this.f56a);
                    }
                }
            });
        }
    }

    public void a(d dVar, AbstractPushManager abstractPushManager) {
        if (abstractPushManager != null) {
            if (this.f58a.containsKey(dVar)) {
                this.f58a.remove(dVar);
            }
            this.f58a.put(dVar, abstractPushManager);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m58a(d dVar) {
        this.f58a.remove(dVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m59a(d dVar) {
        return this.f58a.containsKey(dVar);
    }

    public AbstractPushManager a(d dVar) {
        return this.f58a.get(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a() {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.e.a():void");
    }
}
