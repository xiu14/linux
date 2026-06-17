package com.obric.oui.window.permission;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.actionbar.OBottomActionBar;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.g;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class PrivacyStatementActivity extends AppCompatActivity {

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, b> f8180c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, a> f8181d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final Map<String, com.obric.oui.window.permission.c> f8182e = new LinkedHashMap();
    private boolean a;
    private boolean b = true;

    public interface a {
        void a(String str, Context context);
    }

    public interface b {
        void a();

        boolean b(Activity activity);

        boolean c(Activity activity);

        void onCancel();
    }

    static final class c implements OnApplyWindowInsetsListener {
        public static final c a = new c();

        c() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            l.e(windowInsetsCompat, "insets");
            int systemWindowInsetTop = windowInsetsCompat.getSystemWindowInsetTop();
            int systemWindowInsetBottom = windowInsetsCompat.getSystemWindowInsetBottom();
            l.e(view, "v");
            view.setPadding(view.getPaddingLeft(), systemWindowInsetTop, view.getPaddingRight(), systemWindowInsetBottom);
            return windowInsetsCompat;
        }
    }

    static final class d implements View.OnApplyWindowInsetsListener {
        final /* synthetic */ int a;
        final /* synthetic */ ImageView b;

        d(int i, ImageView imageView) {
            this.a = i;
            this.b = imageView;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            l.f(view, "view");
            l.f(windowInsets, "insets");
            ImageView imageView = this.b;
            l.e(imageView, "iconImageView");
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = (int) ((this.a * 0.235d) - windowInsets.getSystemWindowInsetTop());
            ImageView imageView2 = this.b;
            l.e(imageView2, "iconImageView");
            imageView2.setLayoutParams(marginLayoutParams);
            return view.onApplyWindowInsets(windowInsets);
        }
    }

    static final class e implements OBottomActionBar.b {
        e() {
        }

        @Override // com.obric.oui.actionbar.OBottomActionBar.b
        public final void a(View view, int i) {
            l.f(view, "<anonymous parameter 0>");
            b bVar = (b) PrivacyStatementActivity.f8180c.get(PrivacyStatementActivity.this.getIntent().getStringExtra("PrivacyStatementActivityInstanceId"));
            if (i == 1) {
                if (bVar == null || !bVar.b(PrivacyStatementActivity.this)) {
                    if (bVar != null) {
                        bVar.a();
                    }
                    PrivacyStatementActivity.this.q();
                    PrivacyStatementActivity.h(PrivacyStatementActivity.this);
                    return;
                }
                return;
            }
            if (bVar == null || !bVar.c(PrivacyStatementActivity.this)) {
                if (bVar != null) {
                    bVar.onCancel();
                }
                PrivacyStatementActivity.this.r();
                PrivacyStatementActivity.this.finish();
            }
        }
    }

    public static final void h(PrivacyStatementActivity privacyStatementActivity) {
        super.finish();
        privacyStatementActivity.overridePendingTransition(C0838R.anim.oui_transition_settings_out_a, C0838R.anim.oui_transition_settings_out_b);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        b bVar = f8180c.get(getIntent().getStringExtra("PrivacyStatementActivityInstanceId"));
        if (bVar == null || !bVar.c(this)) {
            if (bVar != null) {
                bVar.onCancel();
            }
            r();
            finish();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        super.onContentChanged();
        View childAt = ((ViewGroup) findViewById(R.id.content)).getChildAt(0);
        Window window = getWindow();
        l.e(window, "window");
        l.e(window.getDecorView(), "window.decorView");
        if (!r1.getFitsSystemWindows()) {
            ViewCompat.setOnApplyWindowInsetsListener(childAt, c.a);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        SpannableString spannableString;
        e.i.b.f.e.b.a("PrivacyStatementActivity", "onCreate");
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("PrivacyStatementActivityInstanceId");
        if (stringExtra != null && f8182e.get(stringExtra) != null) {
            l.f(this, "activity");
        }
        if (p() && bundle != null) {
            e.i.b.f.e.b.f("PrivacyStatementActivity", "onCreate, savedInstanceState is not null");
            if (f8180c.get(getIntent().getStringExtra("PrivacyStatementActivityInstanceId")) == null) {
                e.i.b.f.e.b.f("PrivacyStatementActivity", "privacyConsentCallbacks is null, finish");
                finish();
                overridePendingTransition(0, 0);
                return;
            }
            e.i.b.f.e.b.d("PrivacyStatementActivity", "privacyConsentCallbacks is not null");
        }
        setContentView(C0838R.layout.activity_privacy_statement);
        Window window = getWindow();
        l.e(window, "window");
        window.setStatusBarColor(getColor(C0838R.color.oui_bg_base_1));
        window.setNavigationBarColor(getColor(C0838R.color.oui_bg_base_1));
        if (Build.VERSION.SDK_INT >= 30) {
            e.i.b.f.a.a(this);
        }
        this.b = getIntent().getBooleanExtra("showNetworkConfirm", true);
        String stringExtra2 = getIntent().getStringExtra("title");
        if (stringExtra2 == null) {
            stringExtra2 = getString(C0838R.string.default_title);
        }
        l.e(stringExtra2, "intent.getStringExtra(\"t…g(R.string.default_title)");
        l.e(getString(C0838R.string.default_description), "getString(R.string.default_description)");
        String stringExtra3 = getIntent().getStringExtra("customizedCancelText");
        if (stringExtra3 == null) {
            stringExtra3 = getString(C0838R.string.oui_cancel_and_quit);
        }
        l.e(stringExtra3, "intent.getStringExtra(\"c…ring.oui_cancel_and_quit)");
        String string = getString(C0838R.string.oui_agree);
        l.e(string, "getString(R.string.oui_agree)");
        String stringExtra4 = getIntent().getStringExtra("privacyText");
        if (stringExtra4 == null) {
            stringExtra4 = getString(C0838R.string.privacy_policy_text);
        }
        String str = stringExtra4;
        l.e(str, "intent.getStringExtra(\"p…ring.privacy_policy_text)");
        int intExtra = getIntent().getIntExtra("iconResId", C0838R.drawable.white_circle);
        String[] stringArrayExtra = getIntent().getStringArrayExtra(MonitorConstants.URLS);
        if (stringArrayExtra == null) {
            stringArrayExtra = new String[0];
        }
        String[] strArr = stringArrayExtra;
        TextView textView = (TextView) findViewById(C0838R.id.title);
        TextView textView2 = (TextView) findViewById(C0838R.id.privacy_policy_text);
        ImageView imageView = (ImageView) findViewById(C0838R.id.icon);
        Resources resources = getResources();
        l.e(resources, "resources");
        int i = resources.getDisplayMetrics().heightPixels;
        View decorView = window.getDecorView();
        l.e(decorView, "window.decorView");
        decorView.getRootView().setOnApplyWindowInsetsListener(new d(i, imageView));
        OBottomActionBar oBottomActionBar = (OBottomActionBar) findViewById(C0838R.id.bottom_action_bar);
        oBottomActionBar.c(false, "l1", true, new String[]{stringExtra3, string}, null);
        oBottomActionBar.setBottomButtonClickListener(new e());
        l.e(textView, "titleTextView");
        textView.setText(stringExtra2);
        try {
            Drawable drawable = ContextCompat.getDrawable(this, intExtra);
            l.c(drawable);
            l.e(drawable, "ContextCompat.getDrawable(this, iconResId)!!");
            imageView.setImageDrawable(e.i.b.e.a.a.a(this, drawable, -1.0f, -1.0f, 1.33f, ContextCompat.getColor(this, C0838R.color.oui_basic_line_1)));
        } catch (Exception e2) {
            e.i.b.f.e.b.c("PrivacyStatementActivity", "createCircularDrawableWithBorder error", e2);
        }
        l.e(textView2, "privacyPolicyTextView");
        int q = kotlin.text.a.q(str, "{", 0, false, 6, null);
        int q2 = kotlin.text.a.q(str, "}", 0, false, 6, null);
        int w = kotlin.text.a.w(str, "{", 0, false, 6, null);
        int w2 = kotlin.text.a.w(str, "}", 0, false, 6, null);
        com.obric.oui.window.permission.d dVar = new com.obric.oui.window.permission.d(this, (String) g.A(strArr, 0), C0838R.string.title_privacy_policy, this);
        com.obric.oui.window.permission.d dVar2 = new com.obric.oui.window.permission.d(this, (String) g.A(strArr, 1), C0838R.string.title_user_agreement, this);
        if (q == -1 || q2 == -1 || w == -1 || w2 == -1) {
            spannableString = new SpannableString(str);
        } else {
            String E = kotlin.text.a.E(kotlin.text.a.E(str, "{", "", false, 4, null), "}", "", false, 4, null);
            if (q == w && q2 == w2) {
                spannableString = new SpannableString(E);
                spannableString.setSpan(dVar, q, q2 - 1, 33);
            } else {
                SpannableString spannableString2 = new SpannableString(E);
                spannableString2.setSpan(dVar, q, q2 - 1, 33);
                spannableString2.setSpan(dVar2, w - 2, w2 - 3, 33);
                spannableString = spannableString2;
            }
        }
        textView2.setText(spannableString);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        e.i.b.f.e.b.a("PrivacyStatementActivity", "onDestroy");
        super.onDestroy();
        String stringExtra = getIntent().getStringExtra("PrivacyStatementActivityInstanceId");
        if (stringExtra != null) {
            f8180c.remove(stringExtra);
            f8181d.remove(stringExtra);
            Map<String, com.obric.oui.window.permission.c> map = f8182e;
            if (map.get(stringExtra) != null) {
                l.f(this, "activity");
            }
            map.remove(stringExtra);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        String stringExtra = getIntent().getStringExtra("PrivacyStatementActivityInstanceId");
        if (stringExtra == null || f8182e.get(stringExtra) == null) {
            return;
        }
        l.f(this, "activity");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        String stringExtra = getIntent().getStringExtra("PrivacyStatementActivityInstanceId");
        if (stringExtra == null || f8182e.get(stringExtra) == null) {
            return;
        }
        l.f(this, "activity");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        String stringExtra = getIntent().getStringExtra("PrivacyStatementActivityInstanceId");
        if (stringExtra == null || f8182e.get(stringExtra) == null) {
            return;
        }
        l.f(this, "activity");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        String stringExtra = getIntent().getStringExtra("PrivacyStatementActivityInstanceId");
        if (stringExtra == null || f8182e.get(stringExtra) == null) {
            return;
        }
        l.f(this, "activity");
    }

    public boolean p() {
        return true;
    }

    public void q() {
    }

    public void r() {
    }
}
