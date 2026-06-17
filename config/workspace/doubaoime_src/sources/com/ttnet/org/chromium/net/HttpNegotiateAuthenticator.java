package com.ttnet.org.chromium.net;

import android.accounts.AccountManager;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.ttnet.org.chromium.base.ApplicationStatus;
import com.ttnet.org.chromium.base.annotations.CalledByNative;

/* loaded from: classes2.dex */
public class HttpNegotiateAuthenticator {
    protected HttpNegotiateAuthenticator(String str) {
    }

    @CalledByNative
    @VisibleForTesting
    static HttpNegotiateAuthenticator create(String str) {
        return new HttpNegotiateAuthenticator(str);
    }

    @CalledByNative
    @VisibleForTesting
    void getNextAuthToken(long j, String str, String str2, boolean z) {
        AccountManager.get(com.ttnet.org.chromium.base.c.b());
        Bundle bundle = new Bundle();
        if (str2 != null) {
            bundle.putString("incomingAuthToken", str2);
        }
        bundle.putBoolean("canDelegate", z);
        int i = ApplicationStatus.f8545d;
    }
}
