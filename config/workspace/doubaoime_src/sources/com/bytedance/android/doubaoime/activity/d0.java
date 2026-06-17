package com.bytedance.android.doubaoime.activity;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.bytedance.android.input.common.views.GradientProgressBar;
import com.bytedance.common_biz.ui.widget.ImeTitleBar;

/* loaded from: classes.dex */
public final class d0 extends WebChromeClient {
    final /* synthetic */ boolean a;
    final /* synthetic */ ImeTitleBar b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f1950c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ WebviewActivity f1951d;

    d0(boolean z, ImeTitleBar imeTitleBar, String str, WebviewActivity webviewActivity) {
        this.a = z;
        this.b = imeTitleBar;
        this.f1950c = str;
        this.f1951d = webviewActivity;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView webView, int i) {
        GradientProgressBar gradientProgressBar;
        GradientProgressBar gradientProgressBar2;
        GradientProgressBar gradientProgressBar3;
        GradientProgressBar gradientProgressBar4;
        super.onProgressChanged(webView, i);
        if (i >= 0 && i < 100) {
            gradientProgressBar3 = this.f1951d.b;
            if (gradientProgressBar3 == null) {
                kotlin.s.c.l.l("progressBar");
                throw null;
            }
            com.obric.oui.common.util.b.i(gradientProgressBar3, true);
            gradientProgressBar4 = this.f1951d.b;
            if (gradientProgressBar4 != null) {
                gradientProgressBar4.setProgress(i);
                return;
            } else {
                kotlin.s.c.l.l("progressBar");
                throw null;
            }
        }
        gradientProgressBar = this.f1951d.b;
        if (gradientProgressBar == null) {
            kotlin.s.c.l.l("progressBar");
            throw null;
        }
        gradientProgressBar.setProgress(100);
        gradientProgressBar2 = this.f1951d.b;
        if (gradientProgressBar2 != null) {
            com.obric.oui.common.util.b.i(gradientProgressBar2, false);
        } else {
            kotlin.s.c.l.l("progressBar");
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView webView, String str) {
        ImeTitleBar imeTitleBar;
        ImeTitleBar imeTitleBar2;
        super.onReceivedTitle(webView, str);
        if (this.a) {
            if ((str == null || str.length() == 0) || (imeTitleBar2 = this.b) == null) {
                return;
            }
            imeTitleBar2.setTitle(str);
            return;
        }
        String str2 = this.f1950c;
        if (str2 == null || str2.length() == 0) {
            if ((str == null || str.length() == 0) || (imeTitleBar = this.b) == null) {
                return;
            }
            String str3 = this.f1950c;
            if (str3 == null) {
                str3 = "";
            }
            imeTitleBar.setTitle(str3);
        }
    }
}
