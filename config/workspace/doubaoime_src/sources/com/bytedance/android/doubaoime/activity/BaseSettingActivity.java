package com.bytedance.android.doubaoime.activity;

import android.os.Bundle;
import android.view.Window;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.framework.activity.BaseImeActivity;
import com.bytedance.common_biz.ui.widget.ImeTitleBar;

/* loaded from: classes.dex */
public abstract class BaseSettingActivity extends BaseImeActivity {
    public void h() {
    }

    public void initView() {
        Window window = getWindow();
        if (window != null) {
            window.setNavigationBarColor(getColor(C0838R.color.ime_color_setting_bg));
        }
        ImeTitleBar imeTitleBar = (ImeTitleBar) findViewById(C0838R.id.settings_title_bar);
        if (imeTitleBar != null) {
            com.bytedance.common_biz.ui.utils.a.a(imeTitleBar, 0);
            imeTitleBar.setOnBackClickListener(new I(this));
        }
    }

    public void j() {
        onBackPressed();
    }

    @Override // com.bytedance.android.input.framework.activity.BaseImeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h();
        initView();
    }

    @Override // com.bytedance.android.input.framework.activity.BaseImeActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        updateUI();
    }

    public void updateUI() {
    }
}
