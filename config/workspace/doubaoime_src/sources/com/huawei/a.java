package com.huawei;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.c.h;
import com.bytedance.common.push.d;
import com.bytedance.push.C;
import com.bytedance.push.H;
import com.bytedance.push.Q.b;
import com.bytedance.push.Q.c;
import com.bytedance.push.g0.f;
import com.bytedance.push.g0.i;
import com.bytedance.push.settings.PushOnlineSettings;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.push.HmsMessaging;
import com.huawei.hms.utils.Util;
import com.hw.HWPushAdapter;
import com.ss.android.message.e;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class a implements Runnable {
    private final Context a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private String f6941c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f6942d;

    /* renamed from: e, reason: collision with root package name */
    private int f6943e;

    /* renamed from: com.huawei.a$a, reason: collision with other inner class name */
    class RunnableC0341a implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ String b;

        /* renamed from: com.huawei.a$a$a, reason: collision with other inner class name */
        class C0342a implements h.b {
            C0342a() {
            }

            @Override // com.bytedance.common.c.h.b
            public void a(boolean z) {
                if (z) {
                    d.b(new a(a.this.a, RunnableC0341a.this.a + 1));
                } else {
                    RunnableC0341a runnableC0341a = RunnableC0341a.this;
                    a.this.c(runnableC0341a.b, runnableC0341a.a + 1);
                }
            }
        }

        RunnableC0341a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            new h("push-api.cloud.huawei.com", 443, new C0342a()).a();
        }
    }

    public a(Context context, int i) {
        this.f6942d = false;
        this.f6943e = 0;
        this.a = context;
        this.b = HWPushAdapter.getHwPush();
        this.f6943e = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, int i) {
        if (!this.f6942d) {
            this.f6942d = true;
            C.y().a(this.b, 102, str, "get token error");
        }
        if (i >= ((PushOnlineSettings) com.bytedance.push.settings.h.b(this.a, PushOnlineSettings.class)).J()) {
            C.y().a(this.b, 102, str, "max retry reached");
        } else if (((PushOnlineSettings) com.bytedance.push.settings.h.b(this.a, PushOnlineSettings.class)).O().b) {
            e.e().f(new RunnableC0341a(i, str), ((PushOnlineSettings) com.bytedance.push.settings.h.b(this.a, PushOnlineSettings.class)).o());
        }
    }

    private String d() throws ApiException {
        String appId;
        int parseInt;
        int isHuaweiMobileServicesAvailable = HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(this.a);
        if (isHuaweiMobileServicesAvailable != 0) {
            f.m(HWPushAdapter.TAG, "hms not available:" + isHuaweiMobileServicesAvailable);
            C.y().a(this.b, 109, String.valueOf(isHuaweiMobileServicesAvailable), "hms not available");
            return null;
        }
        int i = -1;
        try {
            if (((PushOnlineSettings) com.bytedance.push.settings.h.b(this.a, PushOnlineSettings.class)).B()) {
                Bundle bundle = this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128).metaData;
                int i2 = bundle.getInt("APPKEY");
                Matcher matcher = Pattern.compile("=([0-9]+)").matcher(bundle.getString(Constants.HUAWEI_HMS_CLIENT_APPID));
                if (matcher.find() && (parseInt = Integer.parseInt(matcher.group(1))) == i2) {
                    i = parseInt;
                }
            } else {
                f.m(HWPushAdapter.TAG, "useHwManifestAppId is false, not read hw appid from manifest");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        f.g(HWPushAdapter.TAG, "AppIdFromManifest:" + i);
        if (i > 0) {
            appId = String.valueOf(i);
        } else {
            f.g(HWPushAdapter.TAG, "read app id by huawei utils");
            appId = Util.getAppId(this.a);
        }
        String token = HmsInstanceId.getInstance(this.a).getToken(appId, HmsMessaging.DEFAULT_TOKEN_SCOPE);
        if (!TextUtils.isEmpty(token) || !i.b().e()) {
            return token;
        }
        c("", this.f6943e);
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            String str = this.f6941c;
            if (TextUtils.isEmpty(str)) {
                str = d();
            }
            if (TextUtils.isEmpty(str)) {
                f.e(HWPushAdapter.TAG, "get huawei token error!!");
                return;
            }
            f.g(HWPushAdapter.TAG, "get token success : " + str);
            ((H) C.B()).e(this.a, this.b, str);
        } catch (ApiException e2) {
            int statusCode = e2.getStatusCode();
            b x = C.x();
            String k = e.a.a.a.a.k("getToken error，errCode = ", statusCode, " please visit : https://developer.huawei.com/consumer/cn/doc/development/HMS-References/status");
            Objects.requireNonNull((c) x);
            f.e(HWPushAdapter.TAG, k);
            c(String.valueOf(statusCode), this.f6943e);
        } catch (Exception e3) {
            e3.printStackTrace();
            c("", this.f6943e);
        }
    }

    a(Context context, String str, int i) {
        this(context, i);
        this.f6941c = str;
    }
}
