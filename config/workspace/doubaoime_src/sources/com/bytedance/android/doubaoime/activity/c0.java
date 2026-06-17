package com.bytedance.android.doubaoime.activity;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.input.common.views.GradientProgressBar;

/* loaded from: classes.dex */
public final class c0 extends WebViewClient {
    final /* synthetic */ WebviewActivity a;

    c0(WebviewActivity webviewActivity) {
        this.a = webviewActivity;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        GradientProgressBar gradientProgressBar;
        super.onPageFinished(webView, str);
        WebviewActivity.h(this.a);
        gradientProgressBar = this.a.b;
        if (gradientProgressBar == null) {
            kotlin.s.c.l.l("progressBar");
            throw null;
        }
        com.obric.oui.common.util.b.i(gradientProgressBar, false);
        this.a.o();
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (!(str == null || kotlin.text.a.s(str))) {
            this.a.f1948d = str;
        }
        this.a.o();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            WebviewActivity.n(this.a);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            if ((webResourceResponse != null ? webResourceResponse.getStatusCode() : 200) >= 400) {
                WebviewActivity.n(this.a);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        WebviewActivity.n(this.a);
    }
}
