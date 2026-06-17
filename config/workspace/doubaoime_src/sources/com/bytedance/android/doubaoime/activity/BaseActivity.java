package com.bytedance.android.doubaoime.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class BaseActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.clearFlags(201326592);
        window.getDecorView().setSystemUiVisibility(1282);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
    }
}
