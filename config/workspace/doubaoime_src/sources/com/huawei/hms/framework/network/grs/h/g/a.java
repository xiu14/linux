package com.huawei.hms.framework.network.grs.h.g;

import android.content.Context;
import com.huawei.e.a.a.a.d.b;
import com.huawei.e.a.a.b.c;
import com.huawei.e.a.a.b.e;
import com.huawei.hms.framework.network.grs.GrsApp;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes2.dex */
public class a {
    private static final HostnameVerifier a = new com.huawei.e.a.a.b.f.a();

    public static HostnameVerifier a() {
        return a;
    }

    public static SSLSocketFactory a(Context context) {
        try {
            return new c(new e(context.getAssets().open(GrsApp.getInstance().getBrand("/") + "grs_sp.bks"), ""), b.b());
        } catch (IOException | KeyManagementException | NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }
}
