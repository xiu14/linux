package com.bytedance.android.input.fragment.settings;

import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.databinding.FragmentKeyFeedbackBinding;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.common.VibrationController;
import com.bytedance.android.input.keyboard.vibrate.entity.VibrateIntensity;
import com.bytedance.android.input.keyboard.vibrate.entity.VibrateKeyType;
import com.bytedance.common_biz.ui.widget.ImeStepSlider;
import java.util.Objects;

/* loaded from: classes.dex */
final class Z0 extends kotlin.s.c.m implements kotlin.s.b.q<Integer, String, Boolean, kotlin.o> {
    final /* synthetic */ KeyFeedbackFragment a;
    final /* synthetic */ FragmentKeyFeedbackBinding b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f2423c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ImeStepSlider f2424d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z0(KeyFeedbackFragment keyFeedbackFragment, FragmentKeyFeedbackBinding fragmentKeyFeedbackBinding, String str, ImeStepSlider imeStepSlider) {
        super(3);
        this.a = keyFeedbackFragment;
        this.b = fragmentKeyFeedbackBinding;
        this.f2423c = str;
        this.f2424d = imeStepSlider;
    }

    @Override // kotlin.s.b.q
    public kotlin.o d(Integer num, String str, Boolean bool) {
        VibrateIntensity vibrateIntensity;
        int intValue = num.intValue();
        String str2 = str;
        boolean booleanValue = bool.booleanValue();
        kotlin.s.c.l.f(str2, "text");
        VibrateIntensity.a aVar = VibrateIntensity.Companion;
        Objects.requireNonNull(aVar);
        VibrateIntensity[] values = VibrateIntensity.values();
        int i = 0;
        while (true) {
            if (i >= 7) {
                vibrateIntensity = null;
                break;
            }
            vibrateIntensity = values[i];
            if (!IAppGlobals.a.F() ? vibrateIntensity.position != intValue : vibrateIntensity.position != intValue + 2) {
                break;
            }
            i++;
        }
        if (vibrateIntensity == null) {
            vibrateIntensity = aVar.b();
        }
        String nameSource = vibrateIntensity.getNameSource();
        com.bytedance.android.input.r.j.i("KeyFeedbackFragment", "initKeyVibrateUI: " + intValue + ' ' + str2 + ' ' + booleanValue + ", vibrateName= " + nameSource);
        IAppGlobals.a aVar2 = IAppGlobals.a;
        if (aVar2.F()) {
            SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
            String string = this.a.getString(C0838R.string.key_vibrate_intensity);
            kotlin.s.c.l.e(string, "getString(R.string.key_vibrate_intensity)");
            settingsConfigNext.m(string, nameSource);
            VibrationController vibrationController = VibrationController.a;
            VibrationController.b(aVar2.getContext(), VibrationController.VibrationType.KEY_TYPING, intValue);
        } else {
            if (intValue == 0) {
                this.b.m.c().setChecked(false);
                SettingsConfigNext.l(this.f2423c, Boolean.FALSE);
                this.f2424d.setLabelStatusColorEnable(false);
            } else {
                this.b.m.c().setChecked(true);
                this.f2424d.setLabelStatusColorEnable(true);
                SettingsConfigNext.l(this.f2423c, Boolean.TRUE);
            }
            if (this.b.m.c().isChecked()) {
                SettingsConfigNext settingsConfigNext2 = SettingsConfigNext.a;
                String string2 = this.a.getString(C0838R.string.key_vibrate_intensity);
                kotlin.s.c.l.e(string2, "getString(R.string.key_vibrate_intensity)");
                settingsConfigNext2.m(string2, nameSource);
                com.bytedance.android.input.keyboard.u.a aVar3 = com.bytedance.android.input.keyboard.u.a.a;
                VibrateKeyType vibrateKeyType = VibrateKeyType.STANDARD;
                Object f2 = SettingsConfigNext.f(this.f2423c);
                kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Boolean");
                aVar3.b(vibrateKeyType, new com.bytedance.android.input.keyboard.vibrate.entity.a(((Boolean) f2).booleanValue(), vibrateIntensity, true), this.b.a());
            } else {
                com.bytedance.android.input.r.j.i("KeyFeedbackFragment", "initKeyVibrateUI: getSwitch isChecked = false");
            }
        }
        return kotlin.o.a;
    }
}
