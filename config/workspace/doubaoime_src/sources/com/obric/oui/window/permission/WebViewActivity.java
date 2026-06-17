package com.obric.oui.window.permission;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.button.OButton;
import com.obric.oui.titlebar.optimize.OCTitleBar;

/* loaded from: classes2.dex */
public class WebViewActivity extends AppCompatActivity {
    private WebView a;
    private ProgressBar b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f8183c;

    class a extends WebViewClient {
        a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            WebViewActivity.this.b.setVisibility(8);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            WebViewActivity.this.b.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            StringBuilder M = e.a.a.a.a.M("onReceivedError: ");
            M.append((Object) (webResourceError != null ? webResourceError.getDescription() : "unknown error"));
            Log.e("WebViewActivity", M.toString());
            WebViewActivity.j(WebViewActivity.this);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return true;
        }
    }

    class b extends WebChromeClient {
        b() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            WebViewActivity.this.b.setProgress(i);
            if (i == 100) {
                WebViewActivity.this.b.setVisibility(8);
            }
        }
    }

    class c implements OnApplyWindowInsetsListener {
        c(WebViewActivity webViewActivity) {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            view.setPadding(view.getPaddingLeft(), windowInsetsCompat.getSystemWindowInsetTop(), view.getPaddingRight(), 0);
            return windowInsetsCompat;
        }
    }

    static void j(final WebViewActivity webViewActivity) {
        webViewActivity.a.setVisibility(8);
        webViewActivity.f8183c.setVisibility(0);
        if (e.i.b.f.b.a(webViewActivity)) {
            webViewActivity.f8183c.setText(C0838R.string.tip_load_fail);
        } else {
            webViewActivity.f8183c.setText(C0838R.string.tip_load_fail_no_network);
        }
        webViewActivity.f8183c.setOnClickListener(new View.OnClickListener() { // from class: com.obric.oui.window.permission.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebViewActivity.this.l(view);
            }
        });
    }

    public static void m(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
        intent.putExtra("extra_url", str);
        intent.putExtra("extra_title", str2);
        context.startActivity(intent);
    }

    public /* synthetic */ void l(View view) {
        if (e.i.b.f.b.a(this)) {
            this.f8183c.setVisibility(8);
            this.a.setVisibility(0);
            this.a.reload();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.a.canGoBack()) {
            this.a.goBack();
        } else {
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        super.onContentChanged();
        View childAt = ((ViewGroup) findViewById(R.id.content)).getChildAt(0);
        if (Boolean.valueOf(!getWindow().getDecorView().getFitsSystemWindows()).booleanValue()) {
            ViewCompat.setOnApplyWindowInsetsListener(childAt, new c(this));
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled"})
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0838R.layout.activity_webview);
        Window window = getWindow();
        window.setStatusBarColor(getColor(C0838R.color.oui_bg_base_1));
        window.setNavigationBarColor(getColor(C0838R.color.oui_bg_base_1));
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            e.i.b.f.a.a(this);
        }
        this.a = (WebView) findViewById(C0838R.id.webView);
        this.b = (ProgressBar) findViewById(C0838R.id.progressBar);
        this.f8183c = (TextView) findViewById(C0838R.id.errorView);
        String stringExtra = getIntent().getStringExtra("extra_title");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = getString(C0838R.string.title_privacy_policy_and_user_agreement);
        }
        OCTitleBar oCTitleBar = (OCTitleBar) findViewById(C0838R.id.web_activity_title_bar);
        if (oCTitleBar != null) {
            oCTitleBar.setTitleText(stringExtra);
            OButton e2 = oCTitleBar.e();
            if (e2 != null) {
                e2.setOnClickListener(new View.OnClickListener() { // from class: com.obric.oui.window.permission.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        WebViewActivity.this.finish();
                    }
                });
            }
        }
        this.a.setBackgroundColor(ContextCompat.getColor(this, C0838R.color.oui_bg_base_1));
        this.a.setLayerType(2, null);
        WebSettings settings = this.a.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        if (i >= 33) {
            settings.setAlgorithmicDarkeningAllowed(true);
        }
        this.a.setWebViewClient(new a());
        this.a.setWebChromeClient(new b());
        String stringExtra2 = getIntent().getStringExtra("extra_url");
        if (stringExtra2 != null) {
            this.a.loadUrl(stringExtra2);
        }
    }
}
