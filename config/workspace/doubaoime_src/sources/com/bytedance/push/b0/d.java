package com.bytedance.push.b0;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.bdinstall.m0.k;
import com.bytedance.push.A;
import com.bytedance.push.C;
import com.bytedance.push.C0678b;
import com.bytedance.push.third.g;
import com.ss.android.common.applog.AppLog;
import com.ss.android.deviceregister.base.Oaid;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class d {
    public static boolean a = false;
    public static boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f5615c = false;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f5616d = false;

    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.b();
        }
    }

    static class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.app.Application r12) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.b0.d.a(android.app.Application):void");
    }

    public static void b() {
        StringBuilder M = e.a.a.a.a.M("startPush, mEnableAutoStart is ");
        M.append(b);
        Log.d("PushStarter", M.toString());
        if (b) {
            HashMap hashMap = new HashMap();
            if (f5615c) {
                AppLog.getSSIDs(hashMap);
            }
            if (f5616d && hashMap.isEmpty()) {
                com.bytedance.applog.a.h(hashMap);
            }
            if (!f5615c && !f5616d) {
                throw new RuntimeException("no device_register or bdtracker find for push auto start, please set PushStarter.mEnableAutoStart=false and call BDPush.getPushService().start()");
            }
            try {
                Application application = ((C) C.a()).d().a;
                if (g.o(application).h(23)) {
                    String str = "";
                    if (f5615c) {
                        str = Oaid.instance(application).getOaidId();
                    } else if (f5616d) {
                        str = k.n(application).l();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        hashMap.put("oaid", str);
                    }
                }
            } catch (Throwable unused) {
            }
            ((A) C0678b.a()).f(hashMap, false);
        }
    }
}
