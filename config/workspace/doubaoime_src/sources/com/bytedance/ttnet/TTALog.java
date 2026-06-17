package com.bytedance.ttnet;

import android.util.Log;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.k;

/* loaded from: classes2.dex */
public class TTALog {
    private static final String TAG = "TTNET_ALog";
    private static volatile long sALogFuncAddr;

    static /* synthetic */ void a(long j) {
        if (sALogFuncAddr != 0) {
            Log.i(TAG, "ALog function address has initialized.");
            return;
        }
        if (j == 0) {
            Log.w(TAG, "Cannot get ALog function address in init callback.");
            return;
        }
        sALogFuncAddr = j;
        StringBuilder M = e.a.a.a.a.M("ALog function address is ");
        M.append(sALogFuncAddr);
        M.append(" from callback.");
        Log.i(TAG, M.toString());
        try {
            k cronetHttpClient = getCronetHttpClient();
            if (cronetHttpClient != null) {
                cronetHttpClient.C(sALogFuncAddr);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static void ensureALogInitialized() {
        com.ss.android.c.d dVar = com.ss.android.c.a.b;
        sALogFuncAddr = com.bytedance.android.alog.c.b();
        StringBuilder M = e.a.a.a.a.M("ALog function address is ");
        M.append(sALogFuncAddr);
        Log.i(TAG, M.toString());
        if (sALogFuncAddr == 0) {
            com.ss.android.c.a.b(new com.ss.android.c.e() { // from class: com.bytedance.ttnet.a
                @Override // com.ss.android.c.e
                public final void a(long j) {
                    TTALog.a(j);
                }
            });
        }
    }

    public static long getALogFuncAddr() {
        return sALogFuncAddr;
    }

    private static k getCronetHttpClient() throws Exception {
        if (c.c()) {
            return k.r(((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c());
        }
        return null;
    }

    public static void init() {
        ensureALogInitialized();
    }
}
