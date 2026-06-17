package com.bytedance.ttnet.throttle;

import com.bytedance.android.input.ttnet.d;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.k;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.c;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public class TTNetThrottle {
    public static final int DIRECTION_TYPE_DOWN = 2;
    public static final int DIRECTION_TYPE_PC_DOWN = 8;
    public static final int DIRECTION_TYPE_PC_UP = 4;
    public static final int DIRECTION_TYPE_UP = 1;
    private static final String TAG = "TTNetThrottle";

    private static k getCronetHttpClient() throws Throwable {
        if (c.c()) {
            return k.r(((d) TTNetInit.getTTNetDepend()).c());
        }
        throw new UnsupportedOperationException("Cronet is not enabled");
    }

    public static void start(String[] strArr, int i, long j) {
        if (strArr != null && ((i == 1 || i == 2 || i == 4 || i == 8) && j >= 0)) {
            try {
                getCronetHttpClient().P(strArr, i, j);
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (Logger.debug()) {
            StringBuilder M = a.M("start throttle params error hosts:");
            M.append(strArr);
            M.append(" directionType:");
            M.append(i);
            M.append(" bytesPerSec:");
            M.append(j);
            Logger.e(TAG, M.toString());
        }
    }

    public static void stop(String[] strArr, int i) {
        if (strArr != null && (i == 1 || i == 2 || i == 4 || i == 8)) {
            try {
                getCronetHttpClient().Q(strArr, i);
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (Logger.debug()) {
            StringBuilder M = a.M("stop throttle params error hosts:");
            M.append(strArr);
            M.append(" directionType:");
            M.append(i);
            Logger.e(TAG, M.toString());
        }
    }
}
