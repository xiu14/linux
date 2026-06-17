package com.bytedance.android.doubaoime.activity;

import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.fragment.settings.GuideSettingsStep1Fragment;
import com.bytedance.android.input.fragment.settings.GuideSettingsStep2Fragment;
import com.bytedance.android.input.framework.activity.BaseImeActivity;

/* loaded from: classes.dex */
public final class ImeGuideSettingsActivity extends BaseImeActivity implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f1919d = 0;
    private GuideSettingsStep1Fragment a;
    private GuideSettingsStep2Fragment b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f1920c = new Handler(Looper.getMainLooper());

    public final void h() {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("step2_fragment");
        GuideSettingsStep2Fragment guideSettingsStep2Fragment = findFragmentByTag instanceof GuideSettingsStep2Fragment ? (GuideSettingsStep2Fragment) findFragmentByTag : null;
        if (guideSettingsStep2Fragment == null) {
            guideSettingsStep2Fragment = new GuideSettingsStep2Fragment();
        }
        this.b = guideSettingsStep2Fragment;
        if (guideSettingsStep2Fragment == null) {
            return;
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        kotlin.s.c.l.e(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.setCustomAnimations(C0838R.anim.slide_in, C0838R.anim.fade_out, C0838R.anim.fade_in, C0838R.anim.slide_out);
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(C0838R.id.settings_layout_content);
        if (findFragmentById != null) {
            beginTransaction.hide(findFragmentById);
        }
        if (guideSettingsStep2Fragment.isAdded()) {
            beginTransaction.show(guideSettingsStep2Fragment);
        } else {
            beginTransaction.add(C0838R.id.settings_layout_content, guideSettingsStep2Fragment, guideSettingsStep2Fragment instanceof GuideSettingsStep1Fragment ? "step1_fragment" : "step2_fragment");
        }
        beginTransaction.addToBackStack(null);
        beginTransaction.commit();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        kotlin.s.c.l.f(view, "v");
        view.getId();
    }

    @Override // com.bytedance.android.input.framework.activity.BaseImeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.android.input.r.j.m("ImeGuideSettingsActivity", "onCreate");
        getWindow().setStatusBarColor(ContextCompat.getColor(this, C0838R.color.oui_bg_base_1));
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, C0838R.color.oui_bg_base_1));
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.addView(new View(this), new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(C0838R.id.settings_layout_content);
        setContentView(frameLayout);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.android.input.framework.activity.BaseImeActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        Fragment fragment;
        super.onResume();
        com.bytedance.android.input.keyboard.q qVar = com.bytedance.android.input.keyboard.q.a;
        Context applicationContext = getApplicationContext();
        kotlin.s.c.l.e(applicationContext, "applicationContext");
        if (com.bytedance.android.input.keyboard.q.a(applicationContext)) {
            long currentTimeMillis = System.currentTimeMillis() - com.bytedance.android.input.keyboard.q.b.get();
            Log.i("ImeGuideSettingsActivity", "Privacystatement windows show timeInterval: " + currentTimeMillis);
            if (currentTimeMillis < 550) {
                this.f1920c.postDelayed(new Runnable() { // from class: com.bytedance.android.doubaoime.activity.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImeGuideSettingsActivity imeGuideSettingsActivity = ImeGuideSettingsActivity.this;
                        int i = ImeGuideSettingsActivity.f1919d;
                        kotlin.s.c.l.f(imeGuideSettingsActivity, "this$0");
                        Context applicationContext2 = imeGuideSettingsActivity.getApplicationContext();
                        kotlin.s.c.l.e(applicationContext2, "applicationContext");
                        com.bytedance.android.input.keyboard.q.c(applicationContext2, 0, false, 6);
                    }
                }, 500L);
            } else {
                Context applicationContext2 = getApplicationContext();
                kotlin.s.c.l.e(applicationContext2, "applicationContext");
                com.bytedance.android.input.keyboard.q.c(applicationContext2, 0, false, 6);
            }
        }
        int intValue = ((Integer) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.full_base_input_mode, "IAppGlobals.context.getS…ing.full_base_input_mode)", "null cannot be cast to non-null type kotlin.Int")).intValue();
        e.a.a.a.a.k0("isFullInputMode inputMode = ", intValue, "ImeGuideSettingsActivity");
        boolean z = intValue == 0;
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(C0838R.id.settings_layout_content);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        kotlin.s.c.l.e(beginTransaction, "supportFragmentManager.beginTransaction()");
        if (z) {
            Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("step1_fragment");
            GuideSettingsStep1Fragment guideSettingsStep1Fragment = findFragmentByTag instanceof GuideSettingsStep1Fragment ? (GuideSettingsStep1Fragment) findFragmentByTag : null;
            this.a = guideSettingsStep1Fragment;
            if (guideSettingsStep1Fragment == null) {
                GuideSettingsStep1Fragment guideSettingsStep1Fragment2 = new GuideSettingsStep1Fragment();
                this.a = guideSettingsStep1Fragment2;
                kotlin.s.c.l.c(guideSettingsStep1Fragment2);
                beginTransaction.add(C0838R.id.settings_layout_content, guideSettingsStep1Fragment2, "step1_fragment");
            }
            fragment = this.a;
            kotlin.s.c.l.c(fragment);
        } else {
            Fragment findFragmentByTag2 = getSupportFragmentManager().findFragmentByTag("step2_fragment");
            GuideSettingsStep2Fragment guideSettingsStep2Fragment = findFragmentByTag2 instanceof GuideSettingsStep2Fragment ? (GuideSettingsStep2Fragment) findFragmentByTag2 : null;
            this.b = guideSettingsStep2Fragment;
            if (guideSettingsStep2Fragment == null) {
                this.b = new GuideSettingsStep2Fragment();
                Bundle bundle = new Bundle();
                bundle.putBoolean("is_step1_skipped", true);
                GuideSettingsStep2Fragment guideSettingsStep2Fragment2 = this.b;
                kotlin.s.c.l.c(guideSettingsStep2Fragment2);
                guideSettingsStep2Fragment2.setArguments(bundle);
                Fragment fragment2 = this.b;
                kotlin.s.c.l.c(fragment2);
                beginTransaction.add(C0838R.id.settings_layout_content, fragment2, "step2_fragment");
            }
            fragment = this.b;
            kotlin.s.c.l.c(fragment);
        }
        if (!kotlin.s.c.l.a(findFragmentById, fragment)) {
            beginTransaction.show(fragment);
        }
        beginTransaction.commitAllowingStateLoss();
        KeyboardJni.updateSettingsBooleanValue(getString(C0838R.string.guide_setting_activity_has_shown), true);
    }
}
