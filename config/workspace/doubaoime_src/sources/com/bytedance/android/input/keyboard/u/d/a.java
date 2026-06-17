package com.bytedance.android.input.keyboard.u.d;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.vibrate.entity.VibrateIntensity;
import com.bytedance.android.input.keyboard.vibrate.entity.VibrateKeyType;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.h;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a extends com.bytedance.android.input.keyboard.u.b.a {
    @Override // com.bytedance.android.input.keyboard.u.c.a
    public boolean a() {
        return true;
    }

    @Override // com.bytedance.android.input.keyboard.u.c.a
    public boolean b(VibrateKeyType vibrateKeyType, com.bytedance.android.input.keyboard.vibrate.entity.a aVar, View view) {
        boolean z;
        int i;
        l.f(vibrateKeyType, "vibrateKeyType");
        l.f(aVar, "vibrateParams");
        try {
            if (!c(vibrateKeyType, aVar)) {
                f("no pass");
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            Context d2 = d();
            l.f(d2, "appContext");
            try {
                long currentTimeMillis2 = System.currentTimeMillis();
                IAppGlobals.a aVar2 = IAppGlobals.a;
                aVar2.x("[Vibrate]-Utils", "Fetch System Settings start");
                z = Settings.System.getInt(d2.getContentResolver(), "haptic_feedback_enabled", 1) == 1;
                aVar2.x("[Vibrate]-Utils", "Fetch System Settings end, open = " + z + " cost time = " + (System.currentTimeMillis() - currentTimeMillis2));
            } catch (Throwable th) {
                Throwable b = h.b(r.J(th));
                if (b != null) {
                    IAppGlobals.a.e("[Vibrate]-Utils", "System.VIBRATE_ON exception = " + b);
                }
                z = true;
            }
            h("start, systemSettingPageOpenVibrate = " + z);
            View view2 = view == null ? ImeService.x : view;
            if (view2 != null) {
                view2.setHapticFeedbackEnabled(true);
            }
            int ordinal = aVar.c().ordinal();
            if (ordinal != 5) {
                int i2 = 3;
                if (ordinal != 6) {
                    int a = VibrateIntensity.Companion.a(aVar.c());
                    if (a == 0) {
                        if (view == null) {
                            i2 = 0;
                        }
                        i2 = 1;
                    } else if (a != 1) {
                        if (a != 2) {
                            if (a != 3) {
                            }
                        } else if (Build.VERSION.SDK_INT >= 30) {
                            i = 16;
                            i2 = i;
                        }
                        i2 = 1;
                    } else {
                        if (Build.VERSION.SDK_INT >= 30) {
                            i = 12;
                            i2 = i;
                        }
                        i2 = 1;
                    }
                    h("trigger success cost time = " + (System.currentTimeMillis() - currentTimeMillis) + ", vibrateParams.vibrateIntensity = " + aVar.c());
                    return view2 != null && view2.performHapticFeedback(i2, 2);
                }
                h("trigger success cost time = " + (System.currentTimeMillis() - currentTimeMillis) + ", vibrateParams.vibrateIntensity = " + aVar.c());
                if (aVar.a()) {
                    return view2 != null && view2.performHapticFeedback(3, 2);
                }
                if (z) {
                    return view2 != null && view2.performHapticFeedback(3, 2);
                }
                h("FOLLOW_SYSTEM system setting close vibrate, cost time = " + (System.currentTimeMillis() - currentTimeMillis));
            }
            return true;
        } catch (Throwable th2) {
            Throwable b2 = h.b(r.J(th2));
            if (b2 != null) {
                g(e.a.a.a.a.w("vibrate onFailure: ", b2));
            }
            return false;
        }
    }

    @Override // com.bytedance.android.input.keyboard.u.b.a
    protected String i() {
        return "Android-View";
    }
}
