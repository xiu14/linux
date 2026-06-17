package com.bytedance.android.doubaoime.activity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
public class GuideAnimationActivity extends AppCompatActivity {
    private final Handler a = new Handler(Looper.getMainLooper());
    private final Runnable b = new Runnable() { // from class: com.bytedance.android.doubaoime.activity.a
        @Override // java.lang.Runnable
        public final void run() {
            GuideAnimationActivity.this.finish();
        }
    };

    @Override // android.app.Activity
    public void finish() {
        this.a.removeCallbacks(this.b);
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        getWindow().setStatusBarColor(0);
        getWindow().setNavigationBarColor(0);
        WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView()).setAppearanceLightStatusBars(true);
        WindowCompat.getInsetsController(getWindow(), getWindow().getDecorView()).setAppearanceLightNavigationBars(true);
        setContentView(C0838R.layout.activity_enable_ime_guide);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(C0838R.id.ime_guide);
        boolean z = (getResources().getConfiguration().uiMode & 48) == 32;
        lottieAnimationView.setAnimation(com.bytedance.android.input.basic.d.g.b() ? z ? "lottie/xiaomi_ime_guide_dark.json" : "lottie/xiaomi_ime_guide.json" : z ? "lottie/ime_guide_dark.json" : "lottie/ime_guide.json");
        this.a.postDelayed(this.b, com.heytap.mcssdk.constant.a.r);
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        finish();
        return true;
    }
}
