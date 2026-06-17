package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.HandlerThread;
import android.telephony.TelephonyManager;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.common.wschannel.server.e;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public class g {
    private static volatile com.bytedance.common.wschannel.server.b a;
    private static volatile com.bytedance.common.wschannel.server.b b;

    static class a implements e {
        a() {
        }

        @Override // com.bytedance.common.wschannel.server.e
        public void a() {
        }

        @Override // com.bytedance.common.wschannel.server.e
        public void b(e.a aVar) {
        }

        @Override // com.bytedance.common.wschannel.server.e
        public boolean isEnable() {
            return true;
        }
    }

    static class b implements f {
        b() {
        }

        @Override // com.bytedance.common.wschannel.server.f
        public Map<Integer, IWsApp> a() {
            return Collections.emptyMap();
        }

        @Override // com.bytedance.common.wschannel.server.f
        public void b(Map<Integer, IWsApp> map) {
        }
    }

    private static com.bytedance.common.wschannel.server.b a(Context context) {
        HandlerThread handlerThread = new HandlerThread("wschannel");
        handlerThread.start();
        com.bytedance.common.wschannel.server.a aVar = new com.bytedance.common.wschannel.server.a();
        h hVar = new h(context, aVar);
        com.bytedance.common.wschannel.server.b bVar = new com.bytedance.common.wschannel.server.b(context, handlerThread.getLooper(), new b(), aVar, hVar, new a());
        hVar.j(bVar);
        return bVar;
    }

    private static com.bytedance.common.wschannel.server.b b(Context context) {
        HandlerThread handlerThread = new HandlerThread("wschannel");
        handlerThread.start();
        com.bytedance.common.wschannel.server.a aVar = new com.bytedance.common.wschannel.server.a();
        l lVar = new l(context, aVar);
        com.bytedance.common.wschannel.server.b bVar = new com.bytedance.common.wschannel.server.b(context, handlerThread.getLooper(), new m(context), aVar, lVar, new j(context, new WeakHandler(handlerThread.getLooper(), new i())));
        lVar.m(bVar);
        return bVar;
    }

    public static NetworkUtils$NetworkType c(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (1 == type) {
                    return NetworkUtils$NetworkType.WIFI;
                }
                if (type != 0) {
                    return NetworkUtils$NetworkType.MOBILE;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                    return NetworkUtils$NetworkType.MOBILE;
                }
                if (telephonyManager.getNetworkType() != 3 && telephonyManager.getNetworkType() != 5 && telephonyManager.getNetworkType() != 6 && telephonyManager.getNetworkType() != 8 && telephonyManager.getNetworkType() != 9 && telephonyManager.getNetworkType() != 10 && telephonyManager.getNetworkType() != 12 && telephonyManager.getNetworkType() != 14 && telephonyManager.getNetworkType() != 15) {
                    return telephonyManager.getNetworkType() == 13 ? NetworkUtils$NetworkType.MOBILE_4G : NetworkUtils$NetworkType.MOBILE;
                }
                return NetworkUtils$NetworkType.MOBILE_3G;
            }
            return NetworkUtils$NetworkType.NONE;
        } catch (Throwable unused) {
            return NetworkUtils$NetworkType.MOBILE;
        }
    }

    public static com.bytedance.common.wschannel.server.b d(Context context) {
        if (a == null) {
            synchronized (com.bytedance.common.wschannel.server.b.class) {
                if (a == null) {
                    a = a(context);
                }
            }
        }
        return a;
    }

    public static com.bytedance.common.wschannel.server.b e(Context context) {
        if (b == null) {
            synchronized (com.bytedance.common.wschannel.server.b.class) {
                if (b == null) {
                    b = b(context);
                }
            }
        }
        return b;
    }

    public static boolean f(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isAvailable();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
