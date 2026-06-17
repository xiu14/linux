package com.bytedance.android.input.keyboard.u.d;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.view.View;
import com.bytedance.android.input.keyboard.vibrate.entity.VibrateKeyType;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.h;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class b extends com.bytedance.android.input.keyboard.u.b.a {
    private Vibrator a;

    private final Vibrator j() {
        Vibrator vibrator;
        if (this.a == null) {
            if (Build.VERSION.SDK_INT >= 31) {
                Object systemService = d().getSystemService("vibrator_manager");
                l.d(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
                vibrator = ((VibratorManager) systemService).getDefaultVibrator();
            } else {
                Object systemService2 = d().getSystemService("vibrator");
                l.d(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
                vibrator = (Vibrator) systemService2;
            }
            this.a = vibrator;
        }
        return this.a;
    }

    @Override // com.bytedance.android.input.keyboard.u.c.a
    public boolean a() {
        Vibrator j = j();
        return j != null && j.hasVibrator();
    }

    @Override // com.bytedance.android.input.keyboard.u.c.a
    @SuppressLint({"ObsoleteSdkInt"})
    public boolean b(VibrateKeyType vibrateKeyType, com.bytedance.android.input.keyboard.vibrate.entity.a aVar, View view) {
        l.f(vibrateKeyType, "vibrateKeyType");
        l.f(aVar, "vibrateParams");
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!c(vibrateKeyType, aVar)) {
                return false;
            }
            h("start");
            Vibrator j = j();
            if (j != null) {
                j.cancel();
                if (Build.VERSION.SDK_INT >= 29) {
                    j.vibrate(VibrationEffect.createPredefined(0));
                } else {
                    j.vibrate(VibrationEffect.createWaveform(new long[]{0, 50}, -1));
                }
            }
            h("end cost time = " + (System.currentTimeMillis() - currentTimeMillis));
            return true;
        } catch (Throwable th) {
            Throwable b = h.b(r.J(th));
            if (b != null) {
                g(e.a.a.a.a.w("vibrate onFailure: ", b));
            }
            return false;
        }
    }

    @Override // com.bytedance.android.input.keyboard.u.b.a
    protected String i() {
        return "Fallback-Vibrate";
    }
}
