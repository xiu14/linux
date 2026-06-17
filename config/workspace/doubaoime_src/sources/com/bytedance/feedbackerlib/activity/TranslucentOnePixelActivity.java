package com.bytedance.feedbackerlib.activity;

import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.util.SparseArray;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bytedance.feedbackerlib.Feedbacker;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class TranslucentOnePixelActivity extends BaseActivity {
    private static final AtomicInteger a = new AtomicInteger(0);
    private static final SparseArray<b> b = new SparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    private static final SparseArray<a> f4786c = new SparseArray<>();

    /* renamed from: d, reason: collision with root package name */
    private static final SparseArray<c> f4787d = new SparseArray<>();

    public interface a {
        void a(boolean z);
    }

    public interface b {
        void a(String[] strArr, int[] iArr);
    }

    public interface c {
        void a(int i, @Nullable Intent intent);
    }

    private static int h() {
        return a.getAndIncrement();
    }

    public static void j(@NonNull Context context, @NonNull a aVar) {
        int h = h();
        SparseArray<a> sparseArray = f4786c;
        synchronized (sparseArray) {
            sparseArray.put(h, aVar);
        }
        Intent intent = new Intent(context, (Class<?>) TranslucentOnePixelActivity.class);
        intent.putExtra("extra_action", 1);
        intent.putExtra("extra_request_code", h);
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    public static void l(@NonNull Context context, @NonNull b bVar, @NonNull String[] strArr) {
        if (strArr.length <= 0) {
            return;
        }
        int h = h();
        SparseArray<b> sparseArray = b;
        synchronized (sparseArray) {
            sparseArray.put(h, bVar);
        }
        Intent intent = new Intent(context, (Class<?>) TranslucentOnePixelActivity.class);
        intent.putExtra("extra_action", 0);
        intent.putExtra("extra_permissions", strArr);
        intent.putExtra("extra_request_code", h);
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    public static void m(@NonNull Context context, @NonNull c cVar) {
        int h = h();
        SparseArray<c> sparseArray = f4787d;
        synchronized (sparseArray) {
            sparseArray.put(h, cVar);
        }
        Intent intent = new Intent(context, (Class<?>) TranslucentOnePixelActivity.class);
        intent.putExtra("extra_action", 2);
        intent.putExtra("extra_request_code", h);
        intent.addFlags(268435456);
        try {
            context.startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @RequiresApi(api = 21)
    protected void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        int intExtra = getIntent().getIntExtra("extra_action", -1);
        if (intExtra < 0) {
            finish();
            return;
        }
        if (intExtra == 1) {
            com.bytedance.feedbackerlib.manager.k.n0(Feedbacker.getApplicationContext()).E0(false);
            SparseArray<a> sparseArray = f4786c;
            synchronized (sparseArray) {
                a aVar = sparseArray.get(i);
                if (aVar == null) {
                    finish();
                    return;
                }
                sparseArray.delete(i);
                try {
                    aVar.a(Settings.canDrawOverlays(this));
                } catch (Throwable th) {
                    com.bytedance.feedbackerlib.a.s("TranslucentOnePixelActi", "handleOverlayPermission failed", th);
                }
                finish();
                return;
            }
        }
        if (intExtra != 2) {
            finish();
            return;
        }
        com.bytedance.feedbackerlib.manager.k.n0(Feedbacker.getApplicationContext()).E0(false);
        SparseArray<c> sparseArray2 = f4787d;
        synchronized (sparseArray2) {
            c cVar = sparseArray2.get(i);
            if (cVar == null) {
                finish();
                return;
            }
            sparseArray2.delete(i);
            try {
                cVar.a(i2, intent);
            } catch (Throwable th2) {
                com.bytedance.feedbackerlib.a.s("TranslucentOnePixelActi", "handleScreenCapturePermission failed", th2);
            }
            finish();
        }
    }

    @Override // com.bytedance.feedbackerlib.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @RequiresApi(api = 21)
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 8388659;
        attributes.width = 1;
        attributes.height = 1;
        attributes.flags = 40;
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
        Feedbacker.init(getApplication(), false);
        int intExtra = getIntent().getIntExtra("extra_action", -1);
        if (intExtra < 0) {
            finish();
            return;
        }
        if (intExtra == 0) {
            Intent intent = getIntent();
            int intExtra2 = intent.getIntExtra("extra_request_code", -1);
            if (intExtra2 < 0) {
                finish();
            } else {
                String[] stringArrayExtra = intent.getStringArrayExtra("extra_permissions");
                if (stringArrayExtra == null || stringArrayExtra.length <= 0) {
                    finish();
                } else {
                    requestPermissions(stringArrayExtra, intExtra2);
                }
            }
            com.bytedance.feedbackerlib.manager.k.n0(Feedbacker.getApplicationContext()).K0();
            return;
        }
        if (intExtra == 1) {
            int intExtra3 = getIntent().getIntExtra("extra_request_code", -1);
            if (intExtra3 >= 0) {
                Intent intent2 = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION");
                StringBuilder M = e.a.a.a.a.M("package:");
                M.append(getPackageName());
                intent2.setData(Uri.parse(M.toString()));
                try {
                    startActivityForResult(intent2, intExtra3);
                } catch (Throwable unused) {
                }
            } else {
                finish();
            }
            com.bytedance.feedbackerlib.manager.k.n0(Feedbacker.getApplicationContext()).K0();
            return;
        }
        if (intExtra != 2) {
            finish();
            return;
        }
        int intExtra4 = getIntent().getIntExtra("extra_request_code", -1);
        if (intExtra4 < 0) {
            finish();
        } else {
            MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) getSystemService("media_projection");
            if (mediaProjectionManager == null) {
                finish();
            } else {
                try {
                    startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), intExtra4);
                } catch (Throwable unused2) {
                }
            }
        }
        com.bytedance.feedbackerlib.manager.k.n0(Feedbacker.getApplicationContext()).K0();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        SparseArray<b> sparseArray = b;
        synchronized (sparseArray) {
            b bVar = sparseArray.get(i);
            if (bVar == null) {
                finish();
                return;
            }
            sparseArray.delete(i);
            bVar.a(strArr, iArr);
            finish();
        }
    }
}
