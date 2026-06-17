package com.bytedance.android.input.fragment.settings;

import android.animation.LayoutTransition;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.activity.SettingsActivityNext;
import com.bytedance.android.doubaoime.databinding.FragmentKeyFeedbackBinding;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.keyboard.UserInteractiveManagerNext;
import com.bytedance.android.input.keyboard.vibrate.entity.VibrateIntensity;
import com.bytedance.common_biz.ui.widget.ImeCheckBox;
import com.bytedance.common_biz.ui.widget.ImeStepSlider;
import com.bytedance.common_biz.ui.widget.ImeTitleProgressView;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class KeyFeedbackFragment extends BaseSettingsFragment {
    public static final /* synthetic */ int i = 0;
    private FragmentKeyFeedbackBinding b;

    /* renamed from: e, reason: collision with root package name */
    private int f2390e;

    /* renamed from: f, reason: collision with root package name */
    private ImeCheckBox[] f2391f;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f2388c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    private final long f2389d = 50;

    /* renamed from: g, reason: collision with root package name */
    private final kotlin.s.b.a<kotlin.o> f2392g = new a();
    private final KeyFeedbackFragment$mBroadcastReceiver$1 h = new BroadcastReceiver() { // from class: com.bytedance.android.input.fragment.settings.KeyFeedbackFragment$mBroadcastReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            FragmentKeyFeedbackBinding fragmentKeyFeedbackBinding;
            if (intent == null || isInitialStickyBroadcast()) {
                return;
            }
            if (kotlin.text.a.j(intent.getAction(), "android.media.RINGER_MODE_CHANGED", false, 2, null) || kotlin.text.a.j(intent.getAction(), "android.media.VOLUME_CHANGED_ACTION", false, 2, null)) {
                String string = KeyFeedbackFragment.this.getString(C0838R.string.enable_key_sound);
                kotlin.s.c.l.e(string, "getString(R.string.enable_key_sound)");
                Object f2 = SettingsConfigNext.f(string);
                kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Boolean");
                if (!((Boolean) f2).booleanValue()) {
                    com.bytedance.android.input.r.j.i("KeyFeedbackFragment", "can not trigger key sound switch when config is false");
                    return;
                }
                boolean c2 = UserInteractiveManagerNext.a.c();
                e.a.a.a.a.y0("isSilentMode: ", c2, "KeyFeedbackFragment");
                fragmentKeyFeedbackBinding = KeyFeedbackFragment.this.b;
                if (fragmentKeyFeedbackBinding != null) {
                    KeyFeedbackFragment.C(KeyFeedbackFragment.this, fragmentKeyFeedbackBinding, !c2, false, 2);
                }
            }
        }
    };

    static final class a extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
        a() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public kotlin.o invoke() {
            UserInteractiveManagerNext.a.h(UserInteractiveManagerNext.KeySound.KEYBOARD, KeyFeedbackFragment.this.f2390e / 100.0f);
            return kotlin.o.a;
        }
    }

    private final void A(FragmentKeyFeedbackBinding fragmentKeyFeedbackBinding) {
        LinearLayout linearLayout = fragmentKeyFeedbackBinding.h;
        kotlin.s.c.l.e(linearLayout, "keyFeedbackResponseReposeContainer");
        e.b.d.a.a.e.e(linearLayout);
        TextView textView = fragmentKeyFeedbackBinding.j;
        kotlin.s.c.l.e(textView, "keyFeedbackResponseSoundTitle");
        e.b.d.a.a.e.e(textView);
        TextView textView2 = fragmentKeyFeedbackBinding.i;
        kotlin.s.c.l.e(textView2, "keyFeedbackResponseReposeTitle");
        e.b.d.a.a.e.e(textView2);
        ImeTitleProgressView imeTitleProgressView = fragmentKeyFeedbackBinding.k;
        kotlin.s.c.l.e(imeTitleProgressView, "keyFeedbackResponseSpeed");
        e.b.d.a.a.e.h(imeTitleProgressView);
    }

    private final void B(FragmentKeyFeedbackBinding fragmentKeyFeedbackBinding, boolean z, boolean z2) {
        com.bytedance.android.input.r.j.i("KeyFeedbackFragment", "toggleKeySoundVisibility visible=" + z + " showToast=" + z2);
        boolean c2 = UserInteractiveManagerNext.a.c();
        if (z && c2) {
            if (z2) {
                Toast.makeText(getContext(), C0838R.string.sound_switch_disable_toast_title, 0).show();
            }
            z = false;
        }
        fragmentKeyFeedbackBinding.l.c().setChecked(z);
        com.obric.oui.common.util.b.i(fragmentKeyFeedbackBinding.l.a(), z);
        if (c2) {
            return;
        }
        String string = getString(C0838R.string.enable_key_sound);
        kotlin.s.c.l.e(string, "getString(R.string.enable_key_sound)");
        SettingsConfigNext.l(string, Boolean.valueOf(z));
    }

    static /* synthetic */ void C(KeyFeedbackFragment keyFeedbackFragment, FragmentKeyFeedbackBinding fragmentKeyFeedbackBinding, boolean z, boolean z2, int i2) {
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        keyFeedbackFragment.B(fragmentKeyFeedbackBinding, z, z2);
    }

    public static void y(KeyFeedbackFragment keyFeedbackFragment, View view) {
        kotlin.s.c.l.f(keyFeedbackFragment, "this$0");
        ImeCheckBox[] imeCheckBoxArr = keyFeedbackFragment.f2391f;
        if (imeCheckBoxArr != null) {
            for (ImeCheckBox imeCheckBox : imeCheckBoxArr) {
                imeCheckBox.setChecked(false);
            }
            int length = imeCheckBoxArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                } else if (imeCheckBoxArr[i2].getId() == view.getId()) {
                    break;
                } else {
                    i2++;
                }
            }
            imeCheckBoxArr[i2].setChecked(true);
            String string = keyFeedbackFragment.getString(C0838R.string.key_feedback_repose_mode);
            kotlin.s.c.l.e(string, "getString(R.string.key_feedback_repose_mode)");
            Object f2 = SettingsConfigNext.f(string);
            kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) f2).intValue();
            String string2 = keyFeedbackFragment.getString(C0838R.string.key_feedback_repose_mode);
            kotlin.s.c.l.e(string2, "getString(R.string.key_feedback_repose_mode)");
            SettingsConfigNext.l(string2, Integer.valueOf(i2));
            if (intValue != i2) {
                if (i2 == 0 || i2 == 1) {
                    try {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("select", i2 == 0 ? "fast_mode" : "fristcand_mode");
                        kotlin.s.c.l.f("responsemode_click", "eventName");
                        com.bytedance.android.input.r.j.i("ImeEventAppLog", "reportEvent responsemode_click ");
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                        IAppLog.a.t("responsemode_click", jSONObject);
                    } catch (Exception unused) {
                        com.bytedance.android.input.r.j.j("ImeSettingsAppLog", "reportResponseModeClickEvent error");
                    }
                }
                String string3 = keyFeedbackFragment.getString(C0838R.string.key_feedback_repose_mode_is_change);
                kotlin.s.c.l.e(string3, "getString(R.string.key_f…ck_repose_mode_is_change)");
                SettingsConfigNext.l(string3, 1);
            }
        }
    }

    public static void z(KeyFeedbackFragment keyFeedbackFragment, FragmentKeyFeedbackBinding fragmentKeyFeedbackBinding, View view) {
        kotlin.s.c.l.f(keyFeedbackFragment, "this$0");
        kotlin.s.c.l.f(fragmentKeyFeedbackBinding, "$this_initKeySoundUI");
        kotlin.s.c.l.d(view, "null cannot be cast to non-null type androidx.appcompat.widget.SwitchCompat");
        keyFeedbackFragment.B(fragmentKeyFeedbackBinding, ((SwitchCompat) view).isChecked(), true);
    }

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        FragmentKeyFeedbackBinding b = FragmentKeyFeedbackBinding.b(layoutInflater, viewGroup, false);
        this.b = b;
        if (b != null) {
            return b.a();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Context context = getContext();
        if (context != null) {
            context.unregisterReceiver(this.h);
        }
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        r();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.s.c.l.f(view, "view");
        super.onViewCreated(view, bundle);
        requireActivity().getOnBackPressedDispatcher().addCallback(getViewLifecycleOwner(), new OnBackPressedCallback() { // from class: com.bytedance.android.input.fragment.settings.KeyFeedbackFragment$onViewCreated$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                FragmentActivity activity = KeyFeedbackFragment.this.getActivity();
                kotlin.s.c.l.d(activity, "null cannot be cast to non-null type com.bytedance.android.doubaoime.activity.SettingsActivityNext");
                if (((SettingsActivityNext) activity).getIntentFromSettingsApp()) {
                    com.bytedance.android.input.r.j.i("KeyFeedbackFragment", "handleOnBackPressed. back to settings app");
                    KeyFeedbackFragment.this.requireActivity().finishAffinity();
                } else {
                    com.bytedance.android.input.r.j.i("KeyFeedbackFragment", "handleOnBackPressed. system handle by default");
                    setEnabled(false);
                    KeyFeedbackFragment.this.requireActivity().onBackPressed();
                }
            }
        });
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void p() {
        l();
        final FragmentKeyFeedbackBinding fragmentKeyFeedbackBinding = this.b;
        if (fragmentKeyFeedbackBinding != null) {
            LayoutTransition layoutTransition = fragmentKeyFeedbackBinding.f1977c.getLayoutTransition();
            if (layoutTransition != null) {
                layoutTransition.enableTransitionType(4);
            }
            LinearLayout linearLayout = fragmentKeyFeedbackBinding.h;
            kotlin.s.c.l.e(linearLayout, "keyFeedbackResponseReposeContainer");
            e.b.d.a.a.e.h(linearLayout);
            TextView textView = fragmentKeyFeedbackBinding.j;
            kotlin.s.c.l.e(textView, "keyFeedbackResponseSoundTitle");
            e.b.d.a.a.e.h(textView);
            TextView textView2 = fragmentKeyFeedbackBinding.i;
            kotlin.s.c.l.e(textView2, "keyFeedbackResponseReposeTitle");
            e.b.d.a.a.e.h(textView2);
            ImeTitleProgressView imeTitleProgressView = fragmentKeyFeedbackBinding.k;
            kotlin.s.c.l.e(imeTitleProgressView, "keyFeedbackResponseSpeed");
            e.b.d.a.a.e.e(imeTitleProgressView);
            ImeCheckBox imeCheckBox = fragmentKeyFeedbackBinding.f1978d;
            kotlin.s.c.l.e(imeCheckBox, "keyFeedbackReposeInputCheckbox");
            ImeCheckBox imeCheckBox2 = fragmentKeyFeedbackBinding.f1980f;
            kotlin.s.c.l.e(imeCheckBox2, "keyFeedbackReposeQualityCheckbox");
            ImeCheckBox[] imeCheckBoxArr = {imeCheckBox, imeCheckBox2};
            this.f2391f = imeCheckBoxArr;
            final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.M
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KeyFeedbackFragment.y(KeyFeedbackFragment.this, view);
                }
            };
            for (int i2 = 0; i2 < 2; i2++) {
                imeCheckBoxArr[i2].setHookOnClickListener(onClickListener);
            }
            fragmentKeyFeedbackBinding.f1979e.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.S
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    View.OnClickListener onClickListener2 = onClickListener;
                    FragmentKeyFeedbackBinding fragmentKeyFeedbackBinding2 = fragmentKeyFeedbackBinding;
                    int i3 = KeyFeedbackFragment.i;
                    kotlin.s.c.l.f(onClickListener2, "$listener");
                    kotlin.s.c.l.f(fragmentKeyFeedbackBinding2, "$this_initKeyResponseMode");
                    onClickListener2.onClick(fragmentKeyFeedbackBinding2.f1978d);
                }
            });
            fragmentKeyFeedbackBinding.f1981g.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.T
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    View.OnClickListener onClickListener2 = onClickListener;
                    FragmentKeyFeedbackBinding fragmentKeyFeedbackBinding2 = fragmentKeyFeedbackBinding;
                    int i3 = KeyFeedbackFragment.i;
                    kotlin.s.c.l.f(onClickListener2, "$listener");
                    kotlin.s.c.l.f(fragmentKeyFeedbackBinding2, "$this_initKeyResponseMode");
                    onClickListener2.onClick(fragmentKeyFeedbackBinding2.f1980f);
                }
            });
            String string = getString(C0838R.string.key_feedback_repose_mode);
            kotlin.s.c.l.e(string, "getString(R.string.key_feedback_repose_mode)");
            Object f2 = SettingsConfigNext.f(string);
            kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) f2).intValue();
            ImeCheckBox[] imeCheckBoxArr2 = this.f2391f;
            if (imeCheckBoxArr2 != null) {
                imeCheckBoxArr2[intValue].setChecked(true);
            }
            e.a.a.a.a.j0("initKeyResponseMode index=", intValue, "KeyFeedbackFragment");
            LinearLayout linearLayout2 = fragmentKeyFeedbackBinding.h;
            kotlin.s.c.l.e(linearLayout2, "keyFeedbackResponseReposeContainer");
            e.b.d.a.a.e.e(linearLayout2);
            TextView textView3 = fragmentKeyFeedbackBinding.j;
            kotlin.s.c.l.e(textView3, "keyFeedbackResponseSoundTitle");
            e.b.d.a.a.e.e(textView3);
            TextView textView4 = fragmentKeyFeedbackBinding.i;
            kotlin.s.c.l.e(textView4, "keyFeedbackResponseReposeTitle");
            e.b.d.a.a.e.e(textView4);
            ImeTitleProgressView imeTitleProgressView2 = fragmentKeyFeedbackBinding.k;
            kotlin.s.c.l.e(imeTitleProgressView2, "keyFeedbackResponseSpeed");
            e.b.d.a.a.e.h(imeTitleProgressView2);
            fragmentKeyFeedbackBinding.k.setStepsList(kotlin.collections.g.G(getString(C0838R.string.key_response_speed_normal), getString(C0838R.string.key_response_speed_fast), getString(C0838R.string.key_response_speed_faster)));
            fragmentKeyFeedbackBinding.k.setOnStepChangedListener(new X0(this));
            A(fragmentKeyFeedbackBinding);
            SwitchCompat c2 = fragmentKeyFeedbackBinding.l.c();
            c2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.P
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    KeyFeedbackFragment.z(KeyFeedbackFragment.this, fragmentKeyFeedbackBinding, view);
                }
            });
            c2.setHapticFeedbackEnabled(false);
            fragmentKeyFeedbackBinding.l.a().setOnStepChangedListener(new Y0(this));
            String string2 = getString(C0838R.string.key_sound_volume);
            kotlin.s.c.l.e(string2, "getString(R.string.key_sound_volume)");
            Object f3 = SettingsConfigNext.f(string2);
            kotlin.s.c.l.d(f3, "null cannot be cast to non-null type kotlin.Int");
            int intValue2 = ((Integer) f3).intValue();
            e.a.a.a.a.j0("updateProgressValue progress=", intValue2, "KeyFeedbackFragment");
            ImeStepSlider.setProgress$default(fragmentKeyFeedbackBinding.l.a(), intValue2, false, 2, null);
            final String string3 = getString(C0838R.string.enable_key_vibrate);
            kotlin.s.c.l.e(string3, "getString(R.string.enable_key_vibrate)");
            SwitchCompat c3 = fragmentKeyFeedbackBinding.m.c();
            c3.setHapticFeedbackEnabled(false);
            ImeStepSlider b = fragmentKeyFeedbackBinding.m.b();
            if (IAppGlobals.a.F()) {
                b.setSteps(kotlin.collections.g.G(getString(C0838R.string.key_vibrate_min_volume_title), getString(C0838R.string.key_vibrate_weak_volume_title), getString(C0838R.string.key_vibrate_moderate_volume_title), getString(C0838R.string.key_vibrate_strong_volume_title), getString(C0838R.string.key_vibrate_max_volume_title)));
            } else {
                b.setSteps(kotlin.collections.g.G(getString(C0838R.string.key_vibrate_none), getString(C0838R.string.key_vibrate_follow_system), getString(C0838R.string.key_vibrate_min_volume_title), getString(C0838R.string.key_vibrate_weak_volume_title), getString(C0838R.string.key_vibrate_moderate_volume_title), getString(C0838R.string.key_vibrate_strong_volume_title), getString(C0838R.string.key_vibrate_max_volume_title)));
                b.setFirstThumbGray(true);
                b.setLabelAlignCenter(true);
                b.setLabelStatusColorEnable(true);
                b.setLabelStatusColor(c3.getContext().getColor(C0838R.color.ime_keyboard_progress_text_color), c3.getContext().getColor(C0838R.color.ime_color_4f84ff));
                float f4 = 12;
                b.setLabelFontSize(new float[]{e.a.a.a.a.m("Resources.getSystem()", 2, f4), e.a.a.a.a.m("Resources.getSystem()", 2, f4), e.a.a.a.a.m("Resources.getSystem()", 2, f4), e.a.a.a.a.m("Resources.getSystem()", 2, f4), e.a.a.a.a.m("Resources.getSystem()", 2, f4), e.a.a.a.a.m("Resources.getSystem()", 2, f4), e.a.a.a.a.m("Resources.getSystem()", 2, f4)});
            }
            b.setOnStepChangedListener(new Z0(this, fragmentKeyFeedbackBinding, string3, b));
            c3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.Q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FragmentKeyFeedbackBinding fragmentKeyFeedbackBinding2 = FragmentKeyFeedbackBinding.this;
                    String str = string3;
                    KeyFeedbackFragment keyFeedbackFragment = this;
                    int i3 = KeyFeedbackFragment.i;
                    kotlin.s.c.l.f(fragmentKeyFeedbackBinding2, "$this_initKeyVibrateUI");
                    kotlin.s.c.l.f(str, "$enableKeyVibrateKey");
                    kotlin.s.c.l.f(keyFeedbackFragment, "this$0");
                    kotlin.s.c.l.d(view, "null cannot be cast to non-null type androidx.appcompat.widget.SwitchCompat");
                    boolean isChecked = ((SwitchCompat) view).isChecked();
                    e.a.a.a.a.y0("initKeyVibrateUI switch click isChecked=", isChecked, "KeyFeedbackFragment");
                    IAppGlobals.a aVar = IAppGlobals.a;
                    if (aVar.F()) {
                        com.obric.oui.common.util.b.i(fragmentKeyFeedbackBinding2.m.b(), isChecked);
                    }
                    SettingsConfigNext.l(str, Boolean.valueOf(isChecked));
                    ImeTitleProgressView imeTitleProgressView3 = fragmentKeyFeedbackBinding2.m;
                    kotlin.s.c.l.e(imeTitleProgressView3, "keyFeedbackVibration");
                    if (aVar.F()) {
                        return;
                    }
                    if (!imeTitleProgressView3.c().isChecked()) {
                        ImeStepSlider.e(imeTitleProgressView3.b(), 0, true, false, 4);
                        imeTitleProgressView3.b().setLabelStatusColorEnable(false);
                        return;
                    }
                    String string4 = keyFeedbackFragment.getString(C0838R.string.key_vibrate_intensity);
                    kotlin.s.c.l.e(string4, "getString(R.string.key_vibrate_intensity)");
                    Object f5 = SettingsConfigNext.f(string4);
                    kotlin.s.c.l.d(f5, "null cannot be cast to non-null type kotlin.String");
                    VibrateIntensity.a aVar2 = VibrateIntensity.Companion;
                    ImeStepSlider.e(imeTitleProgressView3.b(), aVar2.a(aVar2.c((String) f5)), true, false, 4);
                    imeTitleProgressView3.b().setLabelStatusColorEnable(imeTitleProgressView3.b().c() != 0);
                }
            });
            e.b.d.a.a.e.h(c3);
            final String string4 = getString(C0838R.string.enable_key_bubbles);
            kotlin.s.c.l.e(string4, "getString(R.string.enable_key_bubbles)");
            Object f5 = SettingsConfigNext.f(string4);
            kotlin.s.c.l.d(f5, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) f5).booleanValue();
            com.bytedance.android.input.r.j.i("KeyFeedbackFragment", "initKeyEnable26keyBubbleUI:key:" + string4 + " , value:" + booleanValue);
            SwitchCompat a2 = fragmentKeyFeedbackBinding.b.a();
            a2.setChecked(booleanValue);
            a2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.N
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str = string4;
                    int i3 = KeyFeedbackFragment.i;
                    kotlin.s.c.l.f(str, "$enableKeyBubblesKey");
                    kotlin.s.c.l.d(view, "null cannot be cast to non-null type androidx.appcompat.widget.SwitchCompat");
                    SettingsConfigNext.l(str, Boolean.valueOf(((SwitchCompat) view).isChecked()));
                }
            });
        }
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void q() {
        FragmentActivity activity = getActivity();
        kotlin.s.c.l.d(activity, "null cannot be cast to non-null type com.bytedance.android.doubaoime.activity.SettingsActivityNext");
        SettingsActivityNext settingsActivityNext = (SettingsActivityNext) activity;
        if (settingsActivityNext.getIntentFromSettingsApp()) {
            com.bytedance.android.input.r.j.i("KeyFeedbackFragment", "back to settings app");
            settingsActivityNext.finishAffinity();
        } else {
            com.bytedance.android.input.r.j.i("KeyFeedbackFragment", "inner back to previousFragment");
            FragmentActivity activity2 = getActivity();
            kotlin.s.c.l.d(activity2, "null cannot be cast to non-null type com.bytedance.android.doubaoime.activity.SettingsActivityNext");
            ((SettingsActivityNext) activity2).backToPreviousFragment();
        }
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void r() {
        l();
        Context context = getContext();
        if (context != null) {
            KeyFeedbackFragment$mBroadcastReceiver$1 keyFeedbackFragment$mBroadcastReceiver$1 = this.h;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.RINGER_MODE_CHANGED");
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            context.registerReceiver(keyFeedbackFragment$mBroadcastReceiver$1, intentFilter);
        }
        FragmentKeyFeedbackBinding fragmentKeyFeedbackBinding = this.b;
        if (fragmentKeyFeedbackBinding != null) {
            String string = getString(C0838R.string.candidate_delay_refresh);
            kotlin.s.c.l.e(string, "getString(R.string.candidate_delay_refresh)");
            Object f2 = SettingsConfigNext.f(string);
            kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) f2).intValue();
            int i2 = intValue != 50 ? intValue != 100 ? 2 : 0 : 1;
            e.a.a.a.a.m0("updateResponseSpeedSliderInfo refreshTime=", intValue, " position=", i2, "KeyFeedbackFragment");
            ImeTitleProgressView imeTitleProgressView = fragmentKeyFeedbackBinding.k;
            kotlin.s.c.l.e(imeTitleProgressView, "keyFeedbackResponseSpeed");
            ImeTitleProgressView.setCurrentStep$default(imeTitleProgressView, i2, false, 2, null);
            A(fragmentKeyFeedbackBinding);
            String string2 = getString(C0838R.string.enable_key_sound);
            kotlin.s.c.l.e(string2, "getString(R.string.enable_key_sound)");
            Object f3 = SettingsConfigNext.f(string2);
            kotlin.s.c.l.d(f3, "null cannot be cast to non-null type kotlin.Boolean");
            B(fragmentKeyFeedbackBinding, ((Boolean) f3).booleanValue(), false);
            com.bytedance.android.input.r.j.i("KeyFeedbackFragment", "updateKeyFeedbackSound");
            String string3 = getString(C0838R.string.enable_key_vibrate);
            kotlin.s.c.l.e(string3, "getString(R.string.enable_key_vibrate)");
            String string4 = getString(C0838R.string.key_vibrate_intensity);
            kotlin.s.c.l.e(string4, "getString(R.string.key_vibrate_intensity)");
            Object f4 = SettingsConfigNext.f(string3);
            kotlin.s.c.l.d(f4, "null cannot be cast to non-null type kotlin.Boolean");
            boolean booleanValue = ((Boolean) f4).booleanValue();
            Object f5 = SettingsConfigNext.f(string4);
            kotlin.s.c.l.d(f5, "null cannot be cast to non-null type kotlin.String");
            VibrateIntensity.a aVar = VibrateIntensity.Companion;
            int a2 = aVar.a(aVar.c((String) f5));
            fragmentKeyFeedbackBinding.m.c().setChecked(booleanValue);
            ImeStepSlider b = fragmentKeyFeedbackBinding.m.b();
            if (IAppGlobals.a.F()) {
                com.obric.oui.common.util.b.i(b, booleanValue);
                ImeStepSlider.e(b, a2, false, false, 6);
            } else if (booleanValue) {
                b.setLabelStatusColorEnable(true);
                ImeStepSlider.e(b, a2, false, false, 6);
            } else {
                b.setLabelStatusColorEnable(false);
                ImeStepSlider.e(b, 0, false, false, 6);
            }
            com.bytedance.android.input.r.j.i("KeyFeedbackFragment", "updateKeyFeedbackVibration isKeyVibrateEnable=" + booleanValue + " position=" + a2);
            String string5 = getString(C0838R.string.key_feedback_repose_mode);
            kotlin.s.c.l.e(string5, "getString(R.string.key_feedback_repose_mode)");
            Object f6 = SettingsConfigNext.f(string5);
            kotlin.s.c.l.d(f6, "null cannot be cast to non-null type kotlin.Int");
            int intValue2 = ((Integer) f6).intValue();
            ImeCheckBox[] imeCheckBoxArr = this.f2391f;
            if (imeCheckBoxArr != null) {
                for (ImeCheckBox imeCheckBox : imeCheckBoxArr) {
                    imeCheckBox.setChecked(kotlin.s.c.l.a(imeCheckBoxArr[intValue2], imeCheckBox));
                }
            }
        }
    }
}
