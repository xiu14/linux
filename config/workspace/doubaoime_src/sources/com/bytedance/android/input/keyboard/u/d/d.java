package com.bytedance.android.input.keyboard.u.d;

import android.os.Build;
import android.os.VibrationAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.view.View;
import com.bytedance.android.input.basic.d.g;
import com.bytedance.android.input.basic.settings.api.IInputSettings;
import com.bytedance.android.input.keyboard.vibrate.entity.VibrateIntensity;
import com.bytedance.android.input.keyboard.vibrate.entity.VibrateKeyType;
import com.prolificinteractive.materialcalendarview.r;
import java.util.List;
import java.util.Objects;
import kotlin.f;
import kotlin.h;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class d extends com.bytedance.android.input.keyboard.u.b.a {
    private Vibrator a;
    private VibrationAttributes b;

    /* renamed from: c, reason: collision with root package name */
    private long f2801c;

    private final int j(VibrateIntensity vibrateIntensity) {
        switch (vibrateIntensity) {
            case WEAK:
            case NONE:
                return 51;
            case WEAKER:
                return 71;
            case MODE_RATE:
            case FOLLOW_SYSTEM:
                return 81;
            case STRONGER:
                return 91;
            case STRONG:
                return 255;
            default:
                throw new f();
        }
    }

    private final Vibrator k() {
        if (this.a == null && Build.VERSION.SDK_INT >= 31) {
            Object systemService = d().getSystemService("vibrator_manager");
            l.d(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
            this.a = ((VibratorManager) systemService).getDefaultVibrator();
        }
        return this.a;
    }

    private final void l(Vibrator vibrator, long j, int i) {
        if (this.b == null && Build.VERSION.SDK_INT >= 30) {
            this.b = new VibrationAttributes.Builder().setUsage(17).build();
        }
        VibrationAttributes vibrationAttributes = this.b;
        if (vibrationAttributes != null && Build.VERSION.SDK_INT >= 33) {
            vibrator.vibrate(VibrationEffect.createOneShot(j, i), vibrationAttributes);
        } else {
            f("vibrationAttributes is null or android version < 33");
            vibrator.vibrate(VibrationEffect.createOneShot(j, i));
        }
    }

    private final void m(Vibrator vibrator, VibrateIntensity vibrateIntensity) {
        long currentTimeMillis = System.currentTimeMillis() - this.f2801c;
        int j = j(vibrateIntensity);
        f("time = 15---amplitude = " + j + "---diffTime = " + currentTimeMillis);
        l(vibrator, 15L, j);
        this.f2801c = System.currentTimeMillis();
    }

    @Override // com.bytedance.android.input.keyboard.u.c.a
    public boolean a() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 31) {
            long currentTimeMillis = System.currentTimeMillis();
            IInputSettings.a aVar = IInputSettings.a;
            Objects.requireNonNull(aVar);
            List<String> t = aVar.a().t();
            if (t != null && t.contains("OPPO") && g.c()) {
                StringBuilder M = e.a.a.a.a.M("supportRom oppo cost Time = ");
                M.append(System.currentTimeMillis() - currentTimeMillis);
                f(M.toString());
                z = true;
            } else {
                StringBuilder M2 = e.a.a.a.a.M("no support current rom cost Time = ");
                M2.append(System.currentTimeMillis() - currentTimeMillis);
                f(M2.toString());
                z = false;
            }
            if (z) {
                Vibrator k = k();
                if (k != null && k.hasVibrator()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.bytedance.android.input.keyboard.u.c.a
    public boolean b(VibrateKeyType vibrateKeyType, com.bytedance.android.input.keyboard.vibrate.entity.a aVar, View view) {
        l.f(vibrateKeyType, "vibrateKeyType");
        l.f(aVar, "vibrateParams");
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!c(vibrateKeyType, aVar)) {
                h("no pass");
                return false;
            }
            Vibrator k = k();
            if (k == null) {
                return false;
            }
            h("start");
            switch (aVar.c()) {
                case WEAK:
                    m(k, aVar.c());
                    break;
                case WEAKER:
                    m(k, aVar.c());
                    break;
                case MODE_RATE:
                    m(k, aVar.c());
                    break;
                case STRONGER:
                    if (Build.VERSION.SDK_INT < 29) {
                        k.vibrate(VibrationEffect.createWaveform(new long[]{15}, new int[]{80}, -1));
                        break;
                    } else {
                        k.vibrate(VibrationEffect.createPredefined(0));
                        break;
                    }
                case STRONG:
                    m(k, aVar.c());
                    break;
                case NONE:
                    h("NONE");
                    return true;
                case FOLLOW_SYSTEM:
                    if (!aVar.a()) {
                        return false;
                    }
                    int j = j(aVar.c());
                    f("FOLLOW_SYSTEM forceTriggerVibrate---time = 15---amplitude = " + j);
                    l(k, 15L, j);
                    return true;
            }
            h("trigger success cost time = " + (System.currentTimeMillis() - currentTimeMillis) + ", vibrateParams.vibrateIntensity = " + aVar.c());
            return true;
        } catch (Throwable th) {
            Throwable b = h.b(r.J(th));
            if (b != null) {
                g(e.a.a.a.a.w("vibrate exception = ", b));
            }
            return false;
        }
    }

    @Override // com.bytedance.android.input.keyboard.u.b.a
    protected String i() {
        return "Oppo-Strategy";
    }
}
