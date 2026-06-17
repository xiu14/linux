package com.bytedance.android.doubaoime.activity;

import android.R;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.keyboard.aiwrite.AiPanelView;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class PrivacyStatementActivity extends BaseActivity {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f1936c = 0;
    private final String a = "PrivacyStatementActivity";
    private boolean b;

    public static void a(PrivacyStatementActivity privacyStatementActivity, View view) {
        kotlin.s.c.l.f(privacyStatementActivity, "this$0");
        com.bytedance.android.input.r.j.i(privacyStatementActivity.a, "onDisagree");
        privacyStatementActivity.b = true;
        Log.i(privacyStatementActivity.a, "PrivacyStatementActivity disagreed");
        IAppGlobals.a aVar = IAppGlobals.a;
        String string = aVar.getContext().getString(C0838R.string.privacy_statement_pop_has_shown);
        if (string != null) {
            KeyboardJni.updateSettingsBooleanValue(string, true);
        }
        String string2 = aVar.getContext().getString(C0838R.string.full_base_input_mode);
        if (string2 != null) {
            com.bytedance.android.input.r.j.i(privacyStatementActivity.a, "onDisagree, setValue: " + string2 + ", value: 1");
            KeyboardJni.updateSettingsValueForce(string2, 1);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "no");
            com.bytedance.android.input.s.f.a.a("privacy_click", jSONObject);
        } catch (JSONException e2) {
            com.bytedance.android.input.r.j.k(privacyStatementActivity.a, "Failed to create event params for ime_guide_show", e2);
        }
        privacyStatementActivity.finish();
    }

    public static void b(PrivacyStatementActivity privacyStatementActivity, View view) {
        kotlin.s.c.l.f(privacyStatementActivity, "this$0");
        int intExtra = privacyStatementActivity.getIntent().getIntExtra("action", -1);
        privacyStatementActivity.b = true;
        Log.i(privacyStatementActivity.a, "PrivacyStatementActivity agreed, action: " + intExtra);
        e.a.a.a.a.j0("onAgree, action: ", intExtra, privacyStatementActivity.a);
        IAppGlobals.a aVar = IAppGlobals.a;
        String string = aVar.getContext().getString(C0838R.string.privacy_statement_pop_has_shown);
        if (string != null) {
            KeyboardJni.updateSettingsBooleanValue(string, true);
        }
        String string2 = aVar.getContext().getString(C0838R.string.full_base_input_mode);
        if (string2 != null) {
            com.bytedance.android.input.r.j.i(privacyStatementActivity.a, "onAgree, setValue: " + string2 + ", value: 0");
            KeyboardJni.updateSettingsValueForce(string2, 0);
        }
        if (intExtra != -1) {
            if (intExtra < 100) {
                KeyboardJni.getKeyboardJni().doFullInputModeAction(intExtra);
            } else if (intExtra == C0838R.id.ai_btn_check) {
                InputView inputView = ImeService.x;
                Objects.requireNonNull(inputView);
                AiPanelView m = inputView.m();
                if (m != null) {
                    m.e(intExtra);
                }
            } else {
                InputView inputView2 = ImeService.x;
                Objects.requireNonNull(inputView2);
                AiPanelView m2 = inputView2.m();
                if (m2 != null) {
                    m2.d(intExtra);
                }
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "yes");
            com.bytedance.android.input.s.f.a.a("privacy_click", jSONObject);
        } catch (JSONException e2) {
            com.bytedance.android.input.r.j.k(privacyStatementActivity.a, "Failed to create event params for ime_guide_show", e2);
        }
        com.bytedance.android.input.k.a.a.c();
        privacyStatementActivity.finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        super.onContentChanged();
        View childAt = ((ViewGroup) findViewById(R.id.content)).getChildAt(0);
        kotlin.s.c.l.e(getWindow().getDecorView(), "window.decorView");
        if (!r1.getFitsSystemWindows()) {
            ViewCompat.setOnApplyWindowInsetsListener(childAt, new OnApplyWindowInsetsListener() { // from class: com.bytedance.android.doubaoime.activity.z
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    int i = PrivacyStatementActivity.f1936c;
                    kotlin.s.c.l.f(view, "v");
                    kotlin.s.c.l.f(windowInsetsCompat, "insets");
                    view.setPadding(view.getPaddingLeft(), windowInsetsCompat.getSystemWindowInsetTop(), view.getPaddingRight(), windowInsetsCompat.getSystemWindowInsetBottom());
                    return windowInsetsCompat;
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r10v16, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v18, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v20, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v22, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v4, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v6, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v8, types: [T, java.lang.Object, java.lang.String] */
    @Override // com.bytedance.android.doubaoime.activity.BaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        setContentView(C0838R.layout.activity_doubaoime_privacy_statement);
        Log.i(this.a, "PrivacyStatementActivity created");
        View findViewById = findViewById(C0838R.id.agree_button);
        kotlin.s.c.l.e(findViewById, "findViewById(R.id.agree_button)");
        Button button = (Button) findViewById;
        View findViewById2 = findViewById(C0838R.id.disagree_button);
        kotlin.s.c.l.e(findViewById2, "findViewById(R.id.disagree_button)");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = findViewById(C0838R.id.privacy_description);
        kotlin.s.c.l.e(findViewById3, "findViewById(R.id.privacy_description)");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = findViewById(C0838R.id.full_mode_description);
        kotlin.s.c.l.e(findViewById4, "findViewById(R.id.full_mode_description)");
        TextView textView3 = (TextView) findViewById4;
        IAppGlobals.a aVar = IAppGlobals.a;
        if (aVar.F()) {
            textView3.setText(getString(C0838R.string.privacy_statement_full_mode_description_pacific));
            textView2.setText(getString(C0838R.string.privacy_statement_description_pacific));
        } else {
            textView3.setText(getString(C0838R.string.privacy_statement_full_mode_description));
            textView2.setText(getString(C0838R.string.privacy_statement_description));
        }
        com.bytedance.android.input.s.f.a.a("privacy_show", null);
        button.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.activity.B
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivacyStatementActivity.b(PrivacyStatementActivity.this, view);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.activity.A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivacyStatementActivity.a(PrivacyStatementActivity.this, view);
            }
        });
        String obj = textView2.getText().toString();
        SpannableString spannableString = new SpannableString(obj);
        kotlin.s.c.z zVar = new kotlin.s.c.z();
        zVar.a = "";
        kotlin.s.c.z zVar2 = new kotlin.s.c.z();
        zVar2.a = "";
        kotlin.s.c.z zVar3 = new kotlin.s.c.z();
        zVar3.a = "";
        kotlin.s.c.z zVar4 = new kotlin.s.c.z();
        zVar4.a = "";
        if (aVar.F()) {
            ?? string = getString(C0838R.string.user_terms_url_pacific);
            kotlin.s.c.l.e(string, "getString(R.string.user_terms_url_pacific)");
            zVar.a = string;
            ?? string2 = getString(C0838R.string.privacy_policy_url_pacific);
            kotlin.s.c.l.e(string2, "getString(R.string.privacy_policy_url_pacific)");
            zVar2.a = string2;
            ?? string3 = getString(C0838R.string.title_user_agreement);
            kotlin.s.c.l.e(string3, "getString(R.string.title_user_agreement)");
            zVar3.a = string3;
            ?? string4 = getString(C0838R.string.title_privacy_policy);
            kotlin.s.c.l.e(string4, "getString(R.string.title_privacy_policy)");
            zVar4.a = string4;
            str = "《用户服务协议》";
            str2 = "《个人信息保护政策》";
        } else {
            ?? string5 = getString(C0838R.string.user_terms_url);
            kotlin.s.c.l.e(string5, "getString(R.string.user_terms_url)");
            zVar.a = string5;
            ?? string6 = getString(C0838R.string.privacy_policy_url);
            kotlin.s.c.l.e(string6, "getString(R.string.privacy_policy_url)");
            zVar2.a = string6;
            ?? string7 = getString(C0838R.string.doubaoime_title_user_agreement);
            kotlin.s.c.l.e(string7, "getString(R.string.doubaoime_title_user_agreement)");
            zVar3.a = string7;
            ?? string8 = getString(C0838R.string.doubaoime_title_privacy_policy);
            kotlin.s.c.l.e(string8, "getString(R.string.doubaoime_title_privacy_policy)");
            zVar4.a = string8;
            str = "《豆包输入法用户协议》";
            str2 = "《豆包输入法隐私政策》";
        }
        String str3 = str;
        String str4 = str2;
        T t = new T(this, zVar, zVar3);
        S s = new S(this, zVar2, zVar4);
        int q = kotlin.text.a.q(obj, str3, 0, false, 6, null);
        if (q != -1) {
            spannableString.setSpan(t, q, str3.length() + q, 33);
        }
        int q2 = kotlin.text.a.q(obj, str4, 0, false, 6, null);
        if (q2 != -1) {
            spannableString.setSpan(s, q2, str4.length() + q2, 33);
        }
        textView2.setText(spannableString);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setHighlightColor(0);
        String str5 = aVar.F() ? "" : "【设置-输入模式与信息保护】";
        if (str5.length() > 0) {
            String obj2 = textView3.getText().toString();
            SpannableString spannableString2 = new SpannableString(obj2);
            U u = new U(this);
            int q3 = kotlin.text.a.q(obj2, str5, 0, false, 6, null);
            if (q3 != -1) {
                spannableString2.setSpan(u, q3, str5.length() + q3, 33);
            }
            textView3.setText(spannableString2);
            textView3.setMovementMethod(LinkMovementMethod.getInstance());
            textView3.setHighlightColor(0);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.bytedance.android.input.keyboard.q.b.set(System.currentTimeMillis());
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("PrivacyStatementActivity destroyed, timestamp updated: ");
        M.append(com.bytedance.android.input.keyboard.q.b);
        Log.i(str, M.toString());
    }

    @Override // android.app.Activity
    protected void onPause() {
        if (!this.b) {
            com.bytedance.android.input.keyboard.q.b.set(System.currentTimeMillis());
        }
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("PrivacyStatementActivity paused, timestamp updated: ");
        M.append(com.bytedance.android.input.keyboard.q.b);
        Log.i(str, M.toString());
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        com.bytedance.android.input.basic.d.d.e(this);
        Log.i(this.a, "PrivacyStatementActivity resumed");
    }
}
