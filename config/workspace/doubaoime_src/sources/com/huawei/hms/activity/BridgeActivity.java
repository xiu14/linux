package com.huawei.hms.activity;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.SafeIntent;
import com.huawei.hms.utils.ResolutionFlagUtil;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.UIUtil;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class BridgeActivity extends Activity {
    public static final String EXTRA_DELEGATE_CLASS_NAME = "intent.extra.DELEGATE_CLASS_OBJECT";
    public static final String EXTRA_DELEGATE_UPDATE_INFO = "intent.extra.update.info";
    public static final String EXTRA_INTENT = "intent.extra.intent";
    public static final String EXTRA_IS_FULLSCREEN = "intent.extra.isfullscreen";
    public static final String EXTRA_RESULT = "intent.extra.RESULT";
    private static final int b = a("ro.build.hw_emui_api_level", 0);
    private IBridgeActivityDelegate a;

    class a implements View.OnApplyWindowInsetsListener {
        final /* synthetic */ ViewGroup a;

        a(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            try {
                Object invoke = Class.forName("com.huawei.android.view.WindowManagerEx$LayoutParamsEx").getMethod("getDisplaySideRegion", WindowInsets.class).invoke(null, windowInsets);
                if (invoke == null) {
                    HMSLog.i("BridgeActivity", "sideRegion is null");
                } else {
                    Rect rect = (Rect) Class.forName("com.huawei.android.view.DisplaySideRegionEx").getMethod("getSafeInsets", new Class[0]).invoke(invoke, new Object[0]);
                    ViewGroup viewGroup = this.a;
                    if (viewGroup != null) {
                        viewGroup.setPadding(rect.left, 0, rect.right, 0);
                    }
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                StringBuilder M = e.a.a.a.a.M("An exception occurred while reading: onApplyWindowInsets");
                M.append(e2.getMessage());
                HMSLog.e("BridgeActivity", M.toString());
            }
            return view.onApplyWindowInsets(windowInsets);
        }
    }

    private static void a(Window window, boolean z) {
        try {
            window.getClass().getMethod("setHwFloating", Boolean.TYPE).invoke(window, Boolean.valueOf(z));
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e2) {
            e.a.a.a.a.g0(e2, e.a.a.a.a.M("In setHwFloating, Failed to call Window.setHwFloating()."), "BridgeActivity");
        }
    }

    private void b() {
        View findViewById = getWindow().findViewById(R.id.content);
        if (findViewById == null || !(findViewById instanceof ViewGroup)) {
            HMSLog.e("BridgeActivity", "rootView is null or not ViewGroup");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) findViewById;
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        try {
            Class<?> cls = Class.forName("com.huawei.android.view.WindowManagerEx$LayoutParamsEx");
            cls.getMethod("setDisplaySideMode", Integer.TYPE).invoke(cls.getDeclaredConstructor(WindowManager.LayoutParams.class).newInstance(attributes), 1);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            e.a.a.a.a.g0(e2, e.a.a.a.a.M("An exception occurred while reading: setDisplaySideMode"), "BridgeActivity");
        }
        getWindow().getDecorView().setOnApplyWindowInsetsListener(new a(viewGroup));
    }

    private boolean c() {
        Intent intent = getIntent();
        if (intent == null) {
            HMSLog.e("BridgeActivity", "In initialize, Must not pass in a null intent.");
            return false;
        }
        if (intent.getBooleanExtra(EXTRA_IS_FULLSCREEN, false)) {
            getWindow().setFlags(1024, 1024);
        }
        try {
            String stringExtra = intent.getStringExtra(EXTRA_DELEGATE_CLASS_NAME);
            if (stringExtra == null) {
                HMSLog.e("BridgeActivity", "In initialize, Must not pass in a null or non class object.");
                return false;
            }
            IBridgeActivityDelegate iBridgeActivityDelegate = (IBridgeActivityDelegate) Class.forName(stringExtra).asSubclass(IBridgeActivityDelegate.class).newInstance();
            this.a = iBridgeActivityDelegate;
            try {
                iBridgeActivityDelegate.onBridgeActivityCreate(this);
                return true;
            } catch (Throwable th) {
                StringBuilder M = e.a.a.a.a.M("onBridgeActivityCreate Exception.");
                M.append(th.getMessage());
                HMSLog.e("BridgeActivity", M.toString());
                return false;
            }
        } catch (ClassCastException e2) {
            e = e2;
            e.a.a.a.a.g0(e, e.a.a.a.a.M("In initialize, Failed to create 'IUpdateWizard' instance."), "BridgeActivity");
            return false;
        } catch (ClassNotFoundException e3) {
            e = e3;
            e.a.a.a.a.g0(e, e.a.a.a.a.M("In initialize, Failed to create 'IUpdateWizard' instance."), "BridgeActivity");
            return false;
        } catch (IllegalAccessException e4) {
            e = e4;
            e.a.a.a.a.g0(e, e.a.a.a.a.M("In initialize, Failed to create 'IUpdateWizard' instance."), "BridgeActivity");
            return false;
        } catch (IllegalStateException e5) {
            e = e5;
            e.a.a.a.a.g0(e, e.a.a.a.a.M("In initialize, Failed to create 'IUpdateWizard' instance."), "BridgeActivity");
            return false;
        } catch (InstantiationException e6) {
            e = e6;
            e.a.a.a.a.g0(e, e.a.a.a.a.M("In initialize, Failed to create 'IUpdateWizard' instance."), "BridgeActivity");
            return false;
        } catch (Throwable unused) {
            HMSLog.e("BridgeActivity", "In initialize, Failed to create 'IUpdateWizard' instance, throwable occur.");
            return false;
        }
    }

    private void d() {
        e();
        Window window = getWindow();
        if (b >= 9) {
            window.addFlags(67108864);
            a(window, true);
        }
        window.getDecorView().setSystemUiVisibility(0);
    }

    private void e() {
        try {
            if (getWindow() == null) {
                HMSLog.w("BridgeActivity", "requestHideTitle, window is null.");
            } else {
                requestWindowFeature(1);
            }
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("requestWindowFeature ");
            M.append(th.getMessage());
            HMSLog.w("BridgeActivity", M.toString());
        }
    }

    public static Intent getIntentStartBridgeActivity(Activity activity, String str) {
        Intent intent = new Intent(activity, (Class<?>) BridgeActivity.class);
        intent.putExtra(EXTRA_DELEGATE_CLASS_NAME, str);
        intent.putExtra(EXTRA_IS_FULLSCREEN, UIUtil.isActivityFullscreen(activity));
        return intent;
    }

    public static void setFullScreenWindowLayoutInDisplayCutout(Window window) {
        if (window == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            window.setAttributes(attributes);
            window.getDecorView().setSystemUiVisibility(1280);
            return;
        }
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        try {
            Class<?> cls = Class.forName("com.huawei.android.view.LayoutParamsEx");
            cls.getMethod("addHwFlags", Integer.TYPE).invoke(cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes2), 65536);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            HMSLog.e("BridgeActivity", "com.huawei.android.view.LayoutParamsEx fail");
        }
    }

    @Override // android.app.Activity
    public void finish() {
        HMSLog.i("BridgeActivity", "Enter finish.");
        super.finish();
    }

    @Override // android.app.Activity
    public Intent getIntent() {
        Intent modifyIntentBehaviorsSafe = UIUtil.modifyIntentBehaviorsSafe(super.getIntent());
        if (modifyIntentBehaviorsSafe != null) {
            return new SafeIntent(modifyIntentBehaviorsSafe);
        }
        return null;
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        SafeIntent safeIntent = new SafeIntent(intent);
        super.onActivityResult(i, i2, safeIntent);
        IBridgeActivityDelegate iBridgeActivityDelegate = this.a;
        if (iBridgeActivityDelegate != null) {
            boolean z = false;
            try {
                z = iBridgeActivityDelegate.onBridgeActivityResult(i, i2, safeIntent);
            } catch (Throwable unused) {
                HMSLog.w("BridgeActivity", "onBridgeActivityResult failed, throwable occur.");
            }
            if (z || isFinishing()) {
                return;
            }
            setResult(i2, UIUtil.modifyIntentBehaviorsSafe(safeIntent));
            finish();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        IBridgeActivityDelegate iBridgeActivityDelegate = this.a;
        if (iBridgeActivityDelegate != null) {
            iBridgeActivityDelegate.onBridgeConfigurationChanged();
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        e();
        super.onCreate(bundle);
        HMSLog.i("BridgeActivity", "BridgeActivity onCreate");
        if (getIntent() == null) {
            setResult(1, null);
            finish();
            return;
        }
        getWindow().addFlags(Integer.MIN_VALUE);
        getWindow().setStatusBarColor(0);
        d();
        b();
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(getApplicationContext());
        }
        setFullScreenWindowLayoutInDisplayCutout(getWindow());
        if (c()) {
            return;
        }
        setResult(1, null);
        finish();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        try {
            ResolutionFlagUtil.getInstance().removeResolutionFlag(new SafeIntent(getIntent()).getStringExtra(CommonCode.MapKey.TRANSACTION_ID));
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("get transaction_id from intent fail: ");
            M.append(th.getClass().getSimpleName());
            HMSLog.w("BridgeActivity", M.toString());
        }
        IBridgeActivityDelegate iBridgeActivityDelegate = this.a;
        if (iBridgeActivityDelegate != null) {
            iBridgeActivityDelegate.onBridgeActivityDestroy();
        }
        HMSLog.i("BridgeActivity", "BridgeActivity onDestroy");
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate = this.a;
        if (iBridgeActivityDelegate != null) {
            iBridgeActivityDelegate.onKeyUp(i, keyEvent);
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onResume() {
        try {
            super.onResume();
        } catch (Throwable th) {
            HMSLog.e("BridgeActivity", "super.onResume has an exception", th);
            a();
        }
    }

    private void a() {
        try {
            if (isFinishing() || isDestroyed()) {
                return;
            }
            setResult(1, null);
            finish();
        } catch (Throwable th) {
            HMSLog.e("BridgeActivity", "finishBridgeActivity has an exception", th);
            throw new IllegalArgumentException("finishBridgeActivity has an exception ", th);
        }
    }

    public static Intent getIntentStartBridgeActivity(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) BridgeActivity.class);
        intent.putExtra(EXTRA_DELEGATE_CLASS_NAME, str);
        intent.putExtra(EXTRA_IS_FULLSCREEN, false);
        return intent;
    }

    private static int a(String str, int i) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((Integer) cls.getDeclaredMethod("getInt", String.class, Integer.TYPE).invoke(cls, str, Integer.valueOf(i))).intValue();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            HMSLog.e("BridgeActivity", "An exception occurred while reading: EMUI_SDK_INT");
            return i;
        }
    }
}
