package com.huawei.secure.android.common.webview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.huawei.secure.android.common.webview.WebViewLoadCallBack;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public class SafeWebView extends WebView {
    private String a;
    private String[] b;

    /* renamed from: c, reason: collision with root package name */
    private String[] f7503c;

    /* renamed from: d, reason: collision with root package name */
    private String[] f7504d;

    /* renamed from: e, reason: collision with root package name */
    private WebViewLoadCallBack f7505e;

    public SafeWebView(Context context) {
        super(context);
        a();
    }

    private void a() {
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        removeJavascriptInterface("searchBoxJavaBridge_");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        settings.setGeolocationEnabled(false);
        settings.setMixedContentMode(1);
        settings.setAllowContentAccess(false);
        setWebViewClient(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x011b A[LOOP:0: B:42:0x0073->B:67:0x011b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0119 A[SYNTHETIC] */
    @android.annotation.TargetApi(9)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.secure.android.common.webview.SafeWebView.b(java.lang.String):boolean");
    }

    public final void c(WebView webView, String str) {
        com.huawei.secure.android.common.util.a.d("SafeWebView", "onCheckError url is not in white list ", str);
        webView.stopLoading();
        String str2 = this.a;
        if (!TextUtils.isEmpty(str2)) {
            webView.loadUrl(str2);
        } else if (this.f7505e != null) {
            Log.e("SafeWebView", "onPageStarted WebViewLoadCallBack");
            this.f7505e.a(str, WebViewLoadCallBack.ErrorCode.URL_NOT_IN_WHITE_LIST);
        }
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!URLUtil.isHttpUrl(str)) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
            return;
        }
        Log.e("SafeWebView", "loadDataWithBaseURL: http url , not safe");
        if (!TextUtils.isEmpty(this.a)) {
            super.loadDataWithBaseURL(this.a, str2, str3, str4, str5);
        } else if (this.f7505e != null) {
            Log.e("SafeWebView", "WebViewLoadCallBack");
            this.f7505e.a(str, WebViewLoadCallBack.ErrorCode.HTTP_URL);
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        if (b(str) && !URLUtil.isHttpUrl(str)) {
            super.loadUrl(str);
            return;
        }
        Log.e("SafeWebView", "loadUrl: url is not in white list or http url not safe");
        if (!TextUtils.isEmpty(this.a)) {
            super.loadUrl(this.a);
        } else if (this.f7505e != null) {
            Log.e("SafeWebView", "WebViewLoadCallBack");
            this.f7505e.a(str, WebViewLoadCallBack.ErrorCode.HTTP_URL);
        }
    }

    @Override // android.webkit.WebView
    public void postUrl(String str, byte[] bArr) {
        if (b(str) && !URLUtil.isHttpUrl(str)) {
            super.postUrl(str, bArr);
            return;
        }
        Log.e("SafeWebView", "postUrl: url is not in white list or http url not safe");
        if (!TextUtils.isEmpty(this.a)) {
            super.postUrl(this.a, bArr);
        } else if (this.f7505e != null) {
            Log.e("SafeWebView", "WebViewLoadCallBack");
            this.f7505e.a(str, WebViewLoadCallBack.ErrorCode.HTTP_URL);
        }
    }

    public void setDefaultErrorPage(String str) {
        this.a = str;
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(new b(webViewClient, true, null));
    }

    public void setWebViewLoadCallBack(WebViewLoadCallBack webViewLoadCallBack) {
        this.f7505e = webViewLoadCallBack;
    }

    @TargetApi(9)
    @Deprecated
    public void setWhitelist(String[] strArr) {
        this.b = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public void setWhitelistNotMatchSubDomain(String[] strArr) {
        this.f7503c = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @Deprecated
    public void setWhitelistNotMathcSubDomain(String[] strArr) {
        this.f7503c = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    @TargetApi(9)
    public void setWhitelistWithPath(String[] strArr) {
        this.f7504d = strArr == null ? null : (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public void setWebViewClient(WebViewClient webViewClient, boolean z) {
        super.setWebViewClient(new b(webViewClient, z, null));
    }

    private final class b extends WebViewClient {
        private WebViewClient a;
        private boolean b;

        b(WebViewClient webViewClient, boolean z, a aVar) {
            this.a = webViewClient;
            this.b = z;
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.doUpdateVisitedHistory(webView, str, z);
            } else {
                super.doUpdateVisitedHistory(webView, str, z);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onFormResubmission(webView, message, message2);
            } else {
                super.onFormResubmission(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onLoadResource(webView, str);
            } else {
                super.onLoadResource(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public void onPageCommitVisible(WebView webView, String str) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onPageCommitVisible(webView, str);
            } else {
                super.onPageCommitVisible(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onPageFinished(webView, str);
            } else {
                super.onPageFinished(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null && !this.b) {
                webViewClient.onPageStarted(webView, str, bitmap);
            } else if (SafeWebView.this.b(str)) {
                super.onPageStarted(webView, str, bitmap);
            } else {
                SafeWebView.this.c(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onReceivedClientCertRequest(webView, clientCertRequest);
            } else {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, i, str, str2);
            } else {
                super.onReceivedError(webView, i, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            } else {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            } else {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(12)
        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onReceivedLoginRequest(webView, str, str2, str3);
            } else {
                super.onReceivedLoginRequest(webView, str, str2, str3);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(8)
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onReceivedSslError(webView, sslErrorHandler, sslError);
            } else {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"NewApi"})
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            WebViewClient webViewClient = this.a;
            return webViewClient != null ? webViewClient.onRenderProcessGone(webView, renderProcessGoneDetail) : super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }

        @Override // android.webkit.WebViewClient
        @SuppressLint({"NewApi"})
        public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
            } else {
                super.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView, float f2, float f3) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onScaleChanged(webView, f2, f3);
            } else {
                super.onScaleChanged(webView, f2, f3);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onTooManyRedirects(WebView webView, Message message, Message message2) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onTooManyRedirects(webView, message, message2);
            } else {
                super.onTooManyRedirects(webView, message, message2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onUnhandledKeyEvent(webView, keyEvent);
            } else {
                super.onUnhandledKeyEvent(webView, keyEvent);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.a;
            return webViewClient != null ? webViewClient.shouldInterceptRequest(webView, webResourceRequest) : super.shouldInterceptRequest(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            WebViewClient webViewClient = this.a;
            return webViewClient != null ? webViewClient.shouldOverrideKeyEvent(webView, keyEvent) : super.shouldOverrideKeyEvent(webView, keyEvent);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null && !this.b) {
                return webViewClient.shouldOverrideUrlLoading(webView, str);
            }
            if (SafeWebView.this.b(str)) {
                WebViewClient webViewClient2 = this.a;
                return webViewClient2 != null ? webViewClient2.shouldOverrideUrlLoading(webView, str) : super.shouldOverrideUrlLoading(webView, str);
            }
            SafeWebView.this.c(webView, str);
            return false;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(23)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            } else {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(11)
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                return webViewClient.shouldInterceptRequest(webView, str);
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.a;
            if (webViewClient != null) {
                return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    public SafeWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public SafeWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        if (b(str) && !URLUtil.isHttpUrl(str)) {
            super.loadUrl(str, map);
            return;
        }
        Log.e("SafeWebView", "loadUrl: url is not in white list or http url not safe");
        if (!TextUtils.isEmpty(this.a)) {
            super.loadUrl(this.a, map);
        } else if (this.f7505e != null) {
            Log.e("SafeWebView", "WebViewLoadCallBack");
            this.f7505e.a(str, WebViewLoadCallBack.ErrorCode.HTTP_URL);
        }
    }
}
