package com.ss.android.larksso;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.wschannel.WsConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes2.dex */
public class c {
    public String a;
    public com.ss.android.larksso.b b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f8326c;

    /* renamed from: d, reason: collision with root package name */
    public b f8327d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<e> f8328e = new ArrayList<>();

    public static class b {
        public String a;
        public String b;

        /* renamed from: c, reason: collision with root package name */
        public Activity f8329c;

        /* renamed from: d, reason: collision with root package name */
        public String f8330d = "";

        /* renamed from: e, reason: collision with root package name */
        public boolean f8331e = false;

        /* renamed from: f, reason: collision with root package name */
        public ArrayList<String> f8332f = new ArrayList<>();
    }

    /* renamed from: com.ss.android.larksso.c$c, reason: collision with other inner class name */
    public static class C0376c {
        public static final c a = new c(null);
    }

    public c(a aVar) {
    }

    private String a() {
        this.a = f();
        return o(String.format("https://%s/%s?%s=%s&%s=%s&%s=%s&%s=%s&sdk_platform=Android&source=sso_web&sso_sdk=1&safety_mode=%s", e(), "suite/passport/sdk/oauth", "app_id", this.f8327d.a, "response_type", "code", WsConstants.KEY_CONNECTION_STATE, this.a, "lang", i(), 1L), this.a, "", "");
    }

    private boolean b(Uri uri, int i) {
        return (this.f8328e.isEmpty() || this.f8328e.get(i) == null || TextUtils.isEmpty(this.f8328e.get(i).b) || !this.f8328e.get(i).b.equals(h(uri))) ? false : true;
    }

    private void c() {
        b bVar = this.f8327d;
        String str = bVar.f8330d;
        boolean equals = bVar.b.equals("Feishu");
        com.ss.android.larksso.uploadLog.a.f8341g = "1161";
        com.ss.android.larksso.uploadLog.a.h = str;
        com.ss.android.larksso.uploadLog.a.i = equals;
        try {
            com.ss.android.larksso.uploadLog.a.j = new URL(com.ss.android.larksso.uploadLog.a.i ? "https://internal-api.feishu.cn/collect/log/v1/" : "https://internal-api.larksuite.com/collect/log/v1/");
        } catch (MalformedURLException e2) {
            e2.printStackTrace();
        }
        StringBuilder M = e.a.a.a.a.M("appId:");
        M.append(this.f8327d.a);
        M.append(",deviceId:");
        M.append(this.f8327d.f8330d);
        M.append(",testUnit:");
        Objects.requireNonNull(this.f8327d);
        M.append("");
        M.append(",server:");
        M.append(this.f8327d.b);
        M.append(",useWeb:");
        M.append(this.f8327d.f8331e);
        M.append(",sdkVersion:");
        M.append("3.0.3");
        com.ss.android.larksso.uploadLog.a.a("LarkSSO", M.toString());
        b bVar2 = this.f8327d;
        if (!bVar2.f8331e) {
            try {
                j(a());
                return;
            } catch (Throwable unused) {
                bVar2 = this.f8327d;
            }
        }
        Objects.requireNonNull(bVar2);
        k(a());
    }

    private String e() {
        Objects.requireNonNull(this.f8327d);
        return "Feishu".equals(this.f8327d.b) ? "passport.feishu.cn" : "passport.larksuite.com";
    }

    public static String f() {
        return UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
    }

    private String g(Uri uri) {
        if (TextUtils.isEmpty(h(uri)) || this.f8328e.isEmpty()) {
            return "";
        }
        for (int i = 0; i < this.f8328e.size(); i++) {
            if (b(uri, i)) {
                return this.f8328e.get(i).a;
            }
        }
        return "";
    }

    private CharSequence h(Uri uri) {
        return uri == null ? "" : uri.getQueryParameter(WsConstants.KEY_CONNECTION_STATE);
    }

    private String i() {
        Objects.requireNonNull(this.f8327d);
        if (TextUtils.isEmpty(null)) {
            return !TextUtils.isEmpty(Locale.getDefault().getLanguage()) ? Locale.getDefault().getLanguage() : "zh";
        }
        Objects.requireNonNull(this.f8327d);
        return null;
    }

    private void j(String str) {
        com.ss.android.larksso.uploadLog.a.a("LarkSSO", "Feishu/Lark installed, jump verification");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("lark://ssoclient/web?url=".concat(str)));
        intent.putExtra("internal", true);
        if (this.f8326c.getPackageManager().queryIntentActivities(intent, 131072).size() > 0) {
            this.f8326c.startActivityForResult(intent, 0);
        } else {
            k(str);
        }
    }

    private void k(String str) {
        com.ss.android.larksso.uploadLog.a.a("LarkSSO", "Feishu/Lark is not installed, downgrade operation");
        Intent intent = new Intent(this.f8326c, (Class<?>) LarkSSOActivity.class);
        intent.putExtra("build_url", str);
        this.f8326c.startActivityForResult(intent, 0);
    }

    private boolean l() {
        b bVar = this.f8327d;
        if (bVar != null && !TextUtils.isEmpty(bVar.a) && !TextUtils.isEmpty(this.f8327d.b) && (("Feishu".equals(this.f8327d.b) || "Lark".equals(this.f8327d.b)) && !TextUtils.isEmpty(this.f8327d.f8330d))) {
            return true;
        }
        d(SSOErrorType.PARAMETER_ERROR.a, "");
        return false;
    }

    private String o(String str, String str2, String str3, String str4) {
        try {
            this.f8328e.add(new e(str2, str3));
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            com.ss.android.larksso.uploadLog.a.a("LarkSSO", "URL encoding failed");
            d(SSOErrorType.PARAMETER_ERROR.a, "");
            return str;
        }
    }

    public void d(String str, String str2) {
        com.ss.android.larksso.b bVar = this.b;
        if (bVar != null) {
            bVar.b(new com.ss.android.larksso.a(str, str2));
            this.b = null;
        }
    }

    public void m(Activity activity, Intent intent) {
        String str;
        SSOErrorType sSOErrorType;
        if (intent == null) {
            return;
        }
        Uri data = intent.getData();
        if (data != null && data.toString().contains(WsConstants.KEY_CONNECTION_STATE) && data.toString().contains("code")) {
            StringBuilder M = e.a.a.a.a.M("The returned scheme is:");
            M.append(data.toString());
            com.ss.android.larksso.uploadLog.a.a("LarkSSO", M.toString());
            if (TextUtils.isEmpty(data.getQueryParameter("code"))) {
                com.ss.android.larksso.uploadLog.a.a("LarkSSO", "No valid code");
                d(SSOErrorType.NO_VALID_CODE.a, "");
            } else {
                boolean z = false;
                if (TextUtils.isEmpty(h(data)) || this.f8328e.isEmpty()) {
                    str = "data is null Or requestDataArrayList is null";
                } else {
                    for (int i = 0; i < this.f8328e.size(); i++) {
                        if (b(data, i)) {
                            z = true;
                            break;
                        }
                    }
                    str = "checkRequestDataList Failed";
                }
                com.ss.android.larksso.uploadLog.a.a("LarkSSO", str);
                if (z) {
                    String queryParameter = data.getQueryParameter("code");
                    if ("/cancel".equalsIgnoreCase(data.getPath())) {
                        com.ss.android.larksso.uploadLog.a.a("LarkSSO", "User cancels the authorization, the code returned is:" + queryParameter);
                        sSOErrorType = SSOErrorType.CANCELLED;
                    } else if ("/failure".equalsIgnoreCase(data.getPath())) {
                        com.ss.android.larksso.uploadLog.a.a("LarkSSO", "User authorization failed, the code is:" + queryParameter + ", The error code is" + data.getQueryParameter("err_code"));
                        sSOErrorType = SSOErrorType.AUTH_FAILED;
                    } else {
                        com.ss.android.larksso.uploadLog.a.a("LarkSSO", "User authorization is successful, the code is:" + queryParameter);
                        String g2 = g(data);
                        com.ss.android.larksso.b bVar = this.b;
                        if (bVar != null) {
                            bVar.a(new com.ss.android.larksso.a(queryParameter, g2));
                            this.b = null;
                        }
                    }
                    d(sSOErrorType.a, g(data));
                } else {
                    StringBuilder M2 = e.a.a.a.a.M("Authorization failed, state is inconsistent, now state is:");
                    M2.append(this.a);
                    com.ss.android.larksso.uploadLog.a.a("LarkSSO", M2.toString());
                    d(SSOErrorType.BAD_STATE.a, "");
                }
                com.ss.android.larksso.uploadLog.a.a("LarkSSO", "Clear requestDataArrayList");
                this.f8328e.clear();
            }
        }
        if (activity.getIntent().getData() != null) {
            activity.getIntent().setData(null);
        }
    }

    public synchronized void n(b bVar, com.ss.android.larksso.b bVar2) {
        this.f8327d = bVar;
        this.f8326c = bVar.f8329c;
        this.b = bVar2;
        if (l()) {
            c();
        } else {
            Log.e("LarkSSO", "The parameter is not correct");
        }
    }
}
