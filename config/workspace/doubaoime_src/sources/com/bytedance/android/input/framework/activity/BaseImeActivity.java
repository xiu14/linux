package com.bytedance.android.input.framework.activity;

import android.os.Bundle;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.android.input.basic.d.d;

/* loaded from: classes.dex */
public class BaseImeActivity extends AppCompatActivity {
    public boolean isSetTranslucent() {
        return false;
    }

    public boolean needFullScreenStyle() {
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        if (isSetTranslucent()) {
            translucent();
        }
        if (needFullScreenStyle()) {
            d.b(this);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        try {
            if (isSetTranslucent()) {
                return;
            }
            d.f(this);
            d.e(this);
            d.d(this, (getResources().getConfiguration().uiMode & 48) == 32);
        } catch (Exception unused) {
        }
    }

    public final void translucent() {
        Window window = getWindow();
        window.clearFlags(201326592);
        window.getDecorView().setSystemUiVisibility(1282);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }
}
