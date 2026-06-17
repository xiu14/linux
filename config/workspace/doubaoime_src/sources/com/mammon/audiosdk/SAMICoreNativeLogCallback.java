package com.mammon.audiosdk;

/* loaded from: classes2.dex */
public class SAMICoreNativeLogCallback {
    private static SAMICoreLogCallback userCallback;

    public static void onLogReceived(int i, String str) {
        SAMICoreLogCallback sAMICoreLogCallback = userCallback;
        if (sAMICoreLogCallback != null) {
            sAMICoreLogCallback.onHandle(i, str);
        }
    }

    public static void setLogCallback(SAMICoreLogCallback sAMICoreLogCallback) {
        userCallback = sAMICoreLogCallback;
    }
}
