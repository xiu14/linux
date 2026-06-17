package org.chromium;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ttnet.TTNetInit;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import com.xiaomi.mipush.sdk.Constants;
import java.net.CookieHandler;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class b extends TTAppInfoProvider {
    private static b b;
    private TTAppInfoProvider.AppInfo a;

    private b(Context context) {
        context.getApplicationContext();
    }

    private String b(String str) {
        CookieHandler cookieHandler = CookieHandler.getDefault();
        if (!TextUtils.isEmpty(str) && cookieHandler != null) {
            try {
                Map<String, List<String>> map = cookieHandler.get(com.bytedance.feedbackerlib.a.n("https://" + str), null);
                if (map != null && map.size() > 0) {
                    for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                        if ("Cookie".equalsIgnoreCase(entry.getKey()) && !entry.getValue().isEmpty()) {
                            StringBuilder sb = new StringBuilder();
                            int i = 0;
                            for (String str2 : entry.getValue()) {
                                if (i > 0) {
                                    sb.append("; ");
                                }
                                sb.append(str2);
                                i++;
                            }
                            return sb.toString();
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static b c(Context context) {
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b(context);
                }
            }
        }
        return b;
    }

    private static String d(String str) {
        return TextUtils.isEmpty(str) ? str : str.toLowerCase();
    }

    @Override // com.ttnet.org.chromium.net.TTAppInfoProvider
    public TTAppInfoProvider.AppInfo a() {
        try {
            synchronized (b.class) {
                if (this.a == null) {
                    this.a = new TTAppInfoProvider.AppInfo();
                }
            }
            this.a.c(d.U().d());
            this.a.d(d.U().e());
            this.a.A(d.U().E());
            this.a.B(d.U().F());
            this.a.f(d.U().i());
            this.a.h(d.U().m());
            this.a.u(d.U().u());
            this.a.b(d.U().c());
            this.a.j(d.U().o());
            this.a.k(d.U().p());
            this.a.g(d.U().l());
            this.a.i(d.U().n());
            this.a.w(d.U().w());
            this.a.x(d.U().y());
            this.a.y(d.U().z());
            this.a.I(d.U().P());
            this.a.J(d.U().Q());
            this.a.K(d.U().R());
            this.a.H(d.U().O());
            this.a.v(d.U().v());
            this.a.C(d.U().H());
            this.a.z(d(d.U().D()));
            this.a.D(d(d.U().K()));
            this.a.e(d(d.U().h()));
            this.a.s(d.U().t());
            this.a.E(d.U().L());
            this.a.r(d.U().s());
            this.a.t("0");
            Map<String, String> r = d.U().r();
            if (r != null && !r.isEmpty()) {
                this.a.o(r.get("first"));
                this.a.p(r.get("second"));
                this.a.q(r.get("third"));
                this.a.n(r.get(TTNetInit.DOMAIN_HTTPDNS_KEY));
                this.a.l(r.get(TTNetInit.DOMAIN_BOE_KEY));
                this.a.m(r.get(TTNetInit.DOMAIN_BOE_HTTPS_KEY));
            }
            Map<String, String> M = d.U().M();
            String str = "";
            if (M != null && !M.isEmpty()) {
                for (Map.Entry<String, String> entry : M.entrySet()) {
                    str = entry.getKey() + Constants.COLON_SEPARATOR + entry.getValue() + "\r\n" + str;
                }
            }
            String str2 = "";
            if (r != null && !r.isEmpty()) {
                str2 = b(r.get("first"));
            }
            if (!TextUtils.isEmpty(str2)) {
                str = "Cookie:" + str2 + "\r\n" + str;
            }
            this.a.F(str);
            Map<String, String> N = d.U().N();
            String str3 = "";
            if (N != null && !N.isEmpty()) {
                for (Map.Entry<String, String> entry2 : N.entrySet()) {
                    str3 = entry2.getKey() + Constants.COLON_SEPARATOR + entry2.getValue() + "\r\n" + str3;
                }
            }
            this.a.G(str3);
            List<String> b2 = d.U().b();
            String str4 = "";
            if (b2 != null) {
                if (b2.size() > 5 && e.a().loggerDebug()) {
                    e.a().loggerD("CronetAppInfoProvider", "ab sdk version count must less than 5");
                }
                int i = 0;
                for (String str5 : b2) {
                    i++;
                    if (i > 5) {
                        break;
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        str4 = str4 + str5 + Constants.ACCEPT_TIME_SEPARATOR_SP;
                    }
                }
            }
            this.a.a(str4);
            if (e.a().loggerDebug()) {
                String str6 = "AppInfo{, mUserId='" + this.a.getUserId() + "', mAppId='" + this.a.getAppId() + "', mOSApi='" + this.a.getOSApi() + "', mDeviceId='" + this.a.getDeviceId() + "', mNetAccessType='" + this.a.getNetAccessType() + "', mVersionCode='" + this.a.getVersionCode() + "', mDeviceType='" + this.a.getDeviceType() + "', mAppName='" + this.a.getAppName() + "', mSdkAppID='" + this.a.getSdkAppID() + "', mSdkVersion='" + this.a.getSdkVersion() + "', mChannel='" + this.a.getChannel() + "', mOSVersion='" + this.a.getOSVersion() + "', mAbi='" + this.a.getAbi() + "', mDevicePlatform='" + this.a.getDevicePlatform() + "', mDeviceBrand='" + this.a.getDeviceBrand() + "', mDeviceModel='" + this.a.getDeviceModel() + "', mVersionName='" + this.a.getVersionName() + "', mUpdateVersionCode='" + this.a.getUpdateVersionCode() + "', mManifestVersionCode='" + this.a.getManifestVersionCode() + "'}";
                e.a().loggerD("CronetAppInfoProvider", "get appinfo = " + str6);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return this.a;
    }
}
