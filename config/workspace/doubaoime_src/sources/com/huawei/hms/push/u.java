package com.huawei.hms.push;

import android.content.Context;
import com.huawei.hms.support.log.HMSLog;

/* loaded from: classes2.dex */
public class u {

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f7437c = {"url", "app", "cosa", "rp"};
    private Context a;
    private o b;

    public u(Context context, o oVar) {
        this.a = context;
        this.b = oVar;
    }

    public static boolean a(String str) {
        for (String str2 : f7437c) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (r3 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00cb, code lost:
    
        if (com.huawei.hms.push.e.a(r6.a, r6.b.c(), r2).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d0 A[Catch: Exception -> 0x00f2, TryCatch #1 {Exception -> 0x00f2, blocks: (B:3:0x0007, B:12:0x00d0, B:15:0x00d6, B:17:0x00e1, B:18:0x00ec, B:20:0x00e7, B:6:0x00a8, B:8:0x00b0, B:29:0x008f, B:22:0x0044, B:24:0x0058, B:25:0x0063), top: B:2:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6 A[Catch: Exception -> 0x00f2, TryCatch #1 {Exception -> 0x00f2, blocks: (B:3:0x0007, B:12:0x00d0, B:15:0x00d6, B:17:0x00e1, B:18:0x00ec, B:20:0x00e7, B:6:0x00a8, B:8:0x00b0, B:29:0x008f, B:22:0x0044, B:24:0x0058, B:25:0x0063), top: B:2:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b() {
        /*
            r6 = this;
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r1 = "run into launchCosaApp"
            com.huawei.hms.support.log.HMSLog.i(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lf2
            r1.<init>()     // Catch: java.lang.Exception -> Lf2
            java.lang.String r2 = "enter launchExistApp cosa, appPackageName ="
            r1.append(r2)     // Catch: java.lang.Exception -> Lf2
            com.huawei.hms.push.o r2 = r6.b     // Catch: java.lang.Exception -> Lf2
            java.lang.String r2 = r2.c()     // Catch: java.lang.Exception -> Lf2
            r1.append(r2)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r2 = ",and msg.intentUri is "
            r1.append(r2)     // Catch: java.lang.Exception -> Lf2
            com.huawei.hms.push.o r2 = r6.b     // Catch: java.lang.Exception -> Lf2
            java.lang.String r2 = r2.m()     // Catch: java.lang.Exception -> Lf2
            r1.append(r2)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Lf2
            com.huawei.hms.support.log.HMSLog.i(r0, r1)     // Catch: java.lang.Exception -> Lf2
            android.content.Context r1 = r6.a     // Catch: java.lang.Exception -> Lf2
            com.huawei.hms.push.o r2 = r6.b     // Catch: java.lang.Exception -> Lf2
            java.lang.String r2 = r2.c()     // Catch: java.lang.Exception -> Lf2
            android.content.Intent r1 = com.huawei.hms.push.e.b(r1, r2)     // Catch: java.lang.Exception -> Lf2
            com.huawei.hms.push.o r2 = r6.b     // Catch: java.lang.Exception -> Lf2
            java.lang.String r2 = r2.m()     // Catch: java.lang.Exception -> Lf2
            r3 = 0
            if (r2 == 0) goto La8
            com.huawei.hms.push.o r2 = r6.b     // Catch: java.lang.Exception -> L8e
            java.lang.String r2 = r2.m()     // Catch: java.lang.Exception -> L8e
            android.content.Intent r2 = android.content.Intent.parseUri(r2, r3)     // Catch: java.lang.Exception -> L8e
            r4 = 0
            r2.setSelector(r4)     // Catch: java.lang.Exception -> L8e
            android.content.ClipData r4 = r2.getClipData()     // Catch: java.lang.Exception -> L8e
            if (r4 != 0) goto L63
            java.lang.String r4 = "avoid intent add read permission flags"
            java.lang.String r5 = "avoid"
            android.content.ClipData r4 = android.content.ClipData.newPlainText(r4, r5)     // Catch: java.lang.Exception -> L8e
            r2.setClipData(r4)     // Catch: java.lang.Exception -> L8e
        L63:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L8e
            r4.<init>()     // Catch: java.lang.Exception -> L8e
            java.lang.String r5 = "Intent.parseUri(msg.intentUri, 0), action:"
            r4.append(r5)     // Catch: java.lang.Exception -> L8e
            java.lang.String r5 = r2.getAction()     // Catch: java.lang.Exception -> L8e
            r4.append(r5)     // Catch: java.lang.Exception -> L8e
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L8e
            com.huawei.hms.support.log.HMSLog.i(r0, r4)     // Catch: java.lang.Exception -> L8e
            android.content.Context r4 = r6.a     // Catch: java.lang.Exception -> L8e
            com.huawei.hms.push.o r5 = r6.b     // Catch: java.lang.Exception -> L8e
            java.lang.String r5 = r5.c()     // Catch: java.lang.Exception -> L8e
            java.lang.Boolean r4 = com.huawei.hms.push.e.a(r4, r5, r2)     // Catch: java.lang.Exception -> L8e
            boolean r3 = r4.booleanValue()     // Catch: java.lang.Exception -> L8e
            if (r3 == 0) goto Lce
            goto Lcd
        L8e:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lf2
            r4.<init>()     // Catch: java.lang.Exception -> Lf2
            java.lang.String r5 = "intentUri error."
            r4.append(r5)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lf2
            r4.append(r2)     // Catch: java.lang.Exception -> Lf2
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> Lf2
            com.huawei.hms.support.log.HMSLog.w(r0, r2)     // Catch: java.lang.Exception -> Lf2
            goto Lce
        La8:
            com.huawei.hms.push.o r2 = r6.b     // Catch: java.lang.Exception -> Lf2
            java.lang.String r2 = r2.a()     // Catch: java.lang.Exception -> Lf2
            if (r2 == 0) goto Lce
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Exception -> Lf2
            com.huawei.hms.push.o r4 = r6.b     // Catch: java.lang.Exception -> Lf2
            java.lang.String r4 = r4.a()     // Catch: java.lang.Exception -> Lf2
            r2.<init>(r4)     // Catch: java.lang.Exception -> Lf2
            android.content.Context r4 = r6.a     // Catch: java.lang.Exception -> Lf2
            com.huawei.hms.push.o r5 = r6.b     // Catch: java.lang.Exception -> Lf2
            java.lang.String r5 = r5.c()     // Catch: java.lang.Exception -> Lf2
            java.lang.Boolean r4 = com.huawei.hms.push.e.a(r4, r5, r2)     // Catch: java.lang.Exception -> Lf2
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Exception -> Lf2
            if (r4 == 0) goto Lce
        Lcd:
            r1 = r2
        Lce:
            if (r1 != 0) goto Ld6
            java.lang.String r1 = "launchCosaApp,intent == null"
            com.huawei.hms.support.log.HMSLog.i(r0, r1)     // Catch: java.lang.Exception -> Lf2
            return
        Ld6:
            com.huawei.hms.push.o r2 = r6.b     // Catch: java.lang.Exception -> Lf2
            java.lang.String r2 = r2.c()     // Catch: java.lang.Exception -> Lf2
            r1.setPackage(r2)     // Catch: java.lang.Exception -> Lf2
            if (r3 == 0) goto Le7
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r2)     // Catch: java.lang.Exception -> Lf2
            goto Lec
        Le7:
            r2 = 805437440(0x30020000, float:4.7293724E-10)
            r1.setFlags(r2)     // Catch: java.lang.Exception -> Lf2
        Lec:
            android.content.Context r2 = r6.a     // Catch: java.lang.Exception -> Lf2
            r2.startActivity(r1)     // Catch: java.lang.Exception -> Lf2
            goto L107
        Lf2:
            r1 = move-exception
            java.lang.String r2 = "launch Cosa App exception."
            java.lang.StringBuilder r2 = e.a.a.a.a.M(r2)
            java.lang.String r1 = r1.toString()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.huawei.hms.support.log.HMSLog.e(r0, r1)
        L107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.push.u.b():void");
    }

    public void c() {
        o oVar;
        HMSLog.d("PushSelfShowLog", "enter launchNotify()");
        if (this.a == null || (oVar = this.b) == null) {
            HMSLog.d("PushSelfShowLog", "launchNotify  context or msg is null");
            return;
        }
        if ("app".equals(oVar.h())) {
            a();
            return;
        }
        if ("cosa".equals(this.b.h())) {
            b();
            return;
        }
        if ("rp".equals(this.b.h())) {
            HMSLog.w("PushSelfShowLog", this.b.h() + " not support rich message.");
            return;
        }
        if ("url".equals(this.b.h())) {
            HMSLog.w("PushSelfShowLog", this.b.h() + " not support URL.");
            return;
        }
        HMSLog.d("PushSelfShowLog", this.b.h() + " is not exist in hShowType");
    }

    private void a() {
        try {
            HMSLog.i("PushSelfShowLog", "enter launchApp, appPackageName =" + this.b.c());
            if (e.c(this.a, this.b.c())) {
                b();
            }
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("launchApp error:");
            M.append(e2.toString());
            HMSLog.e("PushSelfShowLog", M.toString());
        }
    }
}
