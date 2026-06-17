package com.ss.android.larksso;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.common.wschannel.WsConstants;
import java.util.Objects;

/* loaded from: classes2.dex */
public class LarkSSOActivity extends AppCompatActivity {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f8320c = 0;
    public WebView a;
    public String b;

    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri parse;
            LarkSSOActivity larkSSOActivity = LarkSSOActivity.this;
            int i = LarkSSOActivity.f8320c;
            Objects.requireNonNull(larkSSOActivity);
            if (!((TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || !"oauth".equals(parse.getHost()) || TextUtils.isEmpty(parse.getQueryParameter(WsConstants.KEY_CONNECTION_STATE)) || TextUtils.isEmpty(parse.getQueryParameter("code"))) ? false : true)) {
                if (TextUtils.isEmpty(str) || !str.contains("https://www.feishu.cn/download")) {
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://www.feishu.cn/download"));
                LarkSSOActivity.this.startActivity(intent);
                return true;
            }
            CookieSyncManager createInstance = CookieSyncManager.createInstance(LarkSSOActivity.this.a.getContext());
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.removeSessionCookie();
            cookieManager.removeAllCookie();
            createInstance.sync();
            LarkSSOActivity larkSSOActivity2 = LarkSSOActivity.this;
            Objects.requireNonNull(larkSSOActivity2);
            try {
                Intent intent2 = larkSSOActivity2.getIntent();
                intent2.setData(Uri.parse(str));
                larkSSOActivity2.setResult(-1, intent2);
                com.ss.android.larksso.uploadLog.a.a("LarkSSOActivity", "successCallBack, Jump back from WebView successfully");
                larkSSOActivity2.finish();
            } catch (Exception unused) {
                com.ss.android.larksso.uploadLog.a.a("LarkSSOActivity", "successCallBack, Jump back to SSOSDK failed");
            }
            return true;
        }
    }

    public final void h() {
        try {
            Uri parse = Uri.parse(this.b);
            String format = String.format("%s://oauth/cancel?state=%s&code=%s", parse.getQueryParameter("app_id"), parse.getQueryParameter(WsConstants.KEY_CONNECTION_STATE), SSOErrorType.CANCELLED.a);
            Intent intent = getIntent();
            intent.setData(Uri.parse(format));
            setResult(0, intent);
            finish();
        } catch (Exception unused) {
            com.ss.android.larksso.uploadLog.a.a("LarkSSOActivity", "cancelCallBack, Jump back to SSOSDK failed");
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        CookieSyncManager createInstance = CookieSyncManager.createInstance(this.a.getContext());
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.removeSessionCookie();
        cookieManager.removeAllCookie();
        createInstance.sync();
        h();
        super.onBackPressed();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(3:80|81|82)|(2:84|(11:86|87|88|89|90|91|(1:5)|6|(1:8)|9|(2:11|12)(6:14|(4:16|(2:18|(1:49)(4:22|(3:34|(3:37|(2:39|40)(1:46)|35)|47)|48|(2:42|43)(1:44)))(1:50)|45|43)|51|52|53|(1:73)(3:(4:58|59|60|(3:62|63|64)(1:68))|72|(0)(0)))))(2:99|(1:105)(1:103))|98|87|88|89|90|91|(0)|6|(0)|9|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:80|81|82|(2:84|(11:86|87|88|89|90|91|(1:5)|6|(1:8)|9|(2:11|12)(6:14|(4:16|(2:18|(1:49)(4:22|(3:34|(3:37|(2:39|40)(1:46)|35)|47)|48|(2:42|43)(1:44)))(1:50)|45|43)|51|52|53|(1:73)(3:(4:58|59|60|(3:62|63|64)(1:68))|72|(0)(0)))))(2:99|(1:105)(1:103))|98|87|88|89|90|91|(0)|6|(0)|9|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0042, code lost:
    
        if ((android.os.Build.DISPLAY.indexOf("Flyme") >= 0 || android.os.Build.USER.equals("flyme")) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x005c, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x005d, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x005f, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0087  */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.larksso.LarkSSOActivity.onCreate(android.os.Bundle):void");
    }
}
