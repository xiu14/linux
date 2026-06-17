package com.bytedance.android.doubaoime.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.views.GradientProgressBar;
import com.bytedance.android.input.framework.activity.BaseImeActivity;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common_biz.ui.widget.ImeTipsLayout;
import com.bytedance.common_biz.ui.widget.ImeTitleBar;
import java.util.Objects;

/* loaded from: classes.dex */
public final class WebviewActivity extends BaseImeActivity {
    private WebView a;
    private GradientProgressBar b;

    /* renamed from: c, reason: collision with root package name */
    private ImeTipsLayout f1947c;

    /* renamed from: d, reason: collision with root package name */
    private String f1948d;

    public static final void h(WebviewActivity webviewActivity) {
        WebView webView = webviewActivity.a;
        if (webView != null) {
            webView.evaluateJavascript("(function() { var container = document.querySelector('.draft-container'); var newElement = document.createElement('div'); newElement.innerHTML = '<br>'; container.appendChild(newElement); })()", null);
        } else {
            kotlin.s.c.l.l("webView");
            throw null;
        }
    }

    public static final void n(WebviewActivity webviewActivity) {
        Objects.requireNonNull(webviewActivity);
        if (!NetworkUtils.h(webviewActivity)) {
            webviewActivity.r();
            return;
        }
        GradientProgressBar gradientProgressBar = webviewActivity.b;
        if (gradientProgressBar == null) {
            kotlin.s.c.l.l("progressBar");
            throw null;
        }
        com.obric.oui.common.util.b.i(gradientProgressBar, false);
        ImeTipsLayout imeTipsLayout = webviewActivity.f1947c;
        if (imeTipsLayout == null) {
            kotlin.s.c.l.l("tipsLayout");
            throw null;
        }
        imeTipsLayout.a(C0838R.drawable.ic_net_tips);
        String string = webviewActivity.getString(C0838R.string.no_network_tip);
        kotlin.s.c.l.e(string, "getString(R.string.no_network_tip)");
        imeTipsLayout.c(string);
        ImeTipsLayout imeTipsLayout2 = webviewActivity.f1947c;
        if (imeTipsLayout2 != null) {
            imeTipsLayout2.setVisibility(0);
        } else {
            kotlin.s.c.l.l("tipsLayout");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        ImeTipsLayout imeTipsLayout = this.f1947c;
        if (imeTipsLayout == null) {
            kotlin.s.c.l.l("tipsLayout");
            throw null;
        }
        if (imeTipsLayout.getVisibility() != 8) {
            ImeTipsLayout imeTipsLayout2 = this.f1947c;
            if (imeTipsLayout2 != null) {
                imeTipsLayout2.setVisibility(8);
            } else {
                kotlin.s.c.l.l("tipsLayout");
                throw null;
            }
        }
    }

    public static void p(WebviewActivity webviewActivity, View view) {
        kotlin.s.c.l.f(webviewActivity, "this$0");
        if (!NetworkUtils.h(webviewActivity)) {
            webviewActivity.r();
            return;
        }
        webviewActivity.o();
        GradientProgressBar gradientProgressBar = webviewActivity.b;
        if (gradientProgressBar == null) {
            kotlin.s.c.l.l("progressBar");
            throw null;
        }
        boolean z = true;
        com.obric.oui.common.util.b.i(gradientProgressBar, true);
        GradientProgressBar gradientProgressBar2 = webviewActivity.b;
        if (gradientProgressBar2 == null) {
            kotlin.s.c.l.l("progressBar");
            throw null;
        }
        gradientProgressBar2.setProgress(0);
        String str = webviewActivity.f1948d;
        if (str != null && !kotlin.text.a.s(str)) {
            z = false;
        }
        if (z) {
            WebView webView = webviewActivity.a;
            if (webView != null) {
                webView.reload();
                return;
            } else {
                kotlin.s.c.l.l("webView");
                throw null;
            }
        }
        WebView webView2 = webviewActivity.a;
        if (webView2 != null) {
            webView2.loadUrl(str);
        } else {
            kotlin.s.c.l.l("webView");
            throw null;
        }
    }

    public static final void q(Context context, String str, String str2, boolean z) {
        kotlin.s.c.l.f(context, "context");
        kotlin.s.c.l.f(str, "url");
        kotlin.s.c.l.f(str2, "title");
        Intent intent = new Intent(context, (Class<?>) WebviewActivity.class);
        intent.putExtra("extra_url", str);
        intent.putExtra("extra_title", str2);
        intent.putExtra("extra_need_web_link_title", z);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    private final void r() {
        GradientProgressBar gradientProgressBar = this.b;
        if (gradientProgressBar == null) {
            kotlin.s.c.l.l("progressBar");
            throw null;
        }
        com.obric.oui.common.util.b.i(gradientProgressBar, false);
        ImeTipsLayout imeTipsLayout = this.f1947c;
        if (imeTipsLayout == null) {
            kotlin.s.c.l.l("tipsLayout");
            throw null;
        }
        imeTipsLayout.a(C0838R.drawable.ic_net_tips);
        String string = getString(C0838R.string.no_network_tip);
        kotlin.s.c.l.e(string, "getString(R.string.no_network_tip)");
        imeTipsLayout.c(string);
        ImeTipsLayout imeTipsLayout2 = this.f1947c;
        if (imeTipsLayout2 != null) {
            imeTipsLayout2.setVisibility(0);
        } else {
            kotlin.s.c.l.l("tipsLayout");
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        WebView webView = this.a;
        if (webView == null) {
            kotlin.s.c.l.l("webView");
            throw null;
        }
        if (!webView.canGoBack()) {
            super.onBackPressed();
            return;
        }
        WebView webView2 = this.a;
        if (webView2 != null) {
            webView2.goBack();
        } else {
            kotlin.s.c.l.l("webView");
            throw null;
        }
    }

    @Override // com.bytedance.android.input.framework.activity.BaseImeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0838R.layout.fragment_webview);
        ImeTitleBar imeTitleBar = (ImeTitleBar) findViewById(C0838R.id.settings_title_bar);
        String stringExtra = getIntent().getStringExtra("extra_title");
        if (imeTitleBar != null) {
            imeTitleBar.setTitle(stringExtra == null ? "" : stringExtra);
            com.bytedance.common_biz.ui.utils.a.a(imeTitleBar, 0);
            imeTitleBar.setOnBackClickListener(new b0(this));
        }
        View findViewById = findViewById(C0838R.id.web_progress);
        kotlin.s.c.l.e(findViewById, "findViewById(R.id.web_progress)");
        GradientProgressBar gradientProgressBar = (GradientProgressBar) findViewById;
        this.b = gradientProgressBar;
        com.obric.oui.common.util.b.i(gradientProgressBar, false);
        View findViewById2 = findViewById(C0838R.id.webView);
        kotlin.s.c.l.e(findViewById2, "findViewById(R.id.webView)");
        this.a = (WebView) findViewById2;
        View findViewById3 = findViewById(C0838R.id.web_tips_layout);
        kotlin.s.c.l.e(findViewById3, "findViewById(R.id.web_tips_layout)");
        ImeTipsLayout imeTipsLayout = (ImeTipsLayout) findViewById3;
        this.f1947c = imeTipsLayout;
        imeTipsLayout.b(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.activity.H
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebviewActivity.p(WebviewActivity.this, view);
            }
        });
        boolean booleanExtra = getIntent().getBooleanExtra("extra_need_web_link_title", true);
        WebView webView = this.a;
        if (webView == null) {
            kotlin.s.c.l.l("webView");
            throw null;
        }
        webView.getSettings().setJavaScriptEnabled(true);
        WebView webView2 = this.a;
        if (webView2 == null) {
            kotlin.s.c.l.l("webView");
            throw null;
        }
        webView2.setWebViewClient(new c0(this));
        WebView webView3 = this.a;
        if (webView3 == null) {
            kotlin.s.c.l.l("webView");
            throw null;
        }
        webView3.setWebChromeClient(new d0(booleanExtra, imeTitleBar, stringExtra, this));
        String stringExtra2 = getIntent().getStringExtra("extra_url");
        this.f1948d = stringExtra2;
        if (stringExtra2 == null || kotlin.text.a.s(stringExtra2)) {
            return;
        }
        if (!NetworkUtils.h(this)) {
            r();
            return;
        }
        GradientProgressBar gradientProgressBar2 = this.b;
        if (gradientProgressBar2 == null) {
            kotlin.s.c.l.l("progressBar");
            throw null;
        }
        com.obric.oui.common.util.b.i(gradientProgressBar2, true);
        GradientProgressBar gradientProgressBar3 = this.b;
        if (gradientProgressBar3 == null) {
            kotlin.s.c.l.l("progressBar");
            throw null;
        }
        gradientProgressBar3.setProgress(0);
        WebView webView4 = this.a;
        if (webView4 != null) {
            webView4.loadUrl(stringExtra2);
        } else {
            kotlin.s.c.l.l("webView");
            throw null;
        }
    }

    @Override // com.bytedance.android.input.framework.activity.BaseImeActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        try {
            IAppGlobals.a.j("WebViewActivity", "onResume change navigationBarColor");
            Window window = getWindow();
            if (window == null) {
                return;
            }
            window.setNavigationBarColor(ContextCompat.getColor(this, C0838R.color.ime_color_setting_bg));
        } catch (Throwable th) {
            com.prolificinteractive.materialcalendarview.r.J(th);
        }
    }
}
