package com.bytedance.android.doubaoime.activity;

import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.keyboard.aiwrite.AiPanelView;
import java.util.Objects;

/* loaded from: classes.dex */
public final class PrivacyStatementActivityExt extends com.obric.oui.window.permission.PrivacyStatementActivity {

    /* renamed from: f, reason: collision with root package name */
    private final String f1937f = "PrivacyStatementActivityExt";

    @Override // com.obric.oui.window.permission.PrivacyStatementActivity
    public boolean p() {
        return false;
    }

    @Override // com.obric.oui.window.permission.PrivacyStatementActivity
    public void q() {
        int intExtra = getIntent().getIntExtra("action", -1);
        e.a.a.a.a.j0("onAgree, action: ", intExtra, this.f1937f);
        IAppGlobals.a aVar = IAppGlobals.a;
        String string = aVar.getContext().getString(C0838R.string.privacy_statement_pop_has_shown);
        if (string != null) {
            KeyboardJni.updateSettingsBooleanValue(string, true);
        }
        String string2 = aVar.getContext().getString(C0838R.string.full_base_input_mode);
        if (string2 != null) {
            com.bytedance.android.input.r.j.i(this.f1937f, "onDisagree, setValue: " + string2 + ", value: 0");
            KeyboardJni.updateSettingsValueForce(string2, 0);
        }
        if (intExtra == -1) {
            return;
        }
        if (intExtra < 100) {
            KeyboardJni.getKeyboardJni().doFullInputModeAction(intExtra);
            return;
        }
        if (intExtra == C0838R.id.ai_btn_check) {
            InputView inputView = ImeService.x;
            Objects.requireNonNull(inputView);
            AiPanelView m = inputView.m();
            if (m != null) {
                m.e(intExtra);
                return;
            }
            return;
        }
        InputView inputView2 = ImeService.x;
        Objects.requireNonNull(inputView2);
        AiPanelView m2 = inputView2.m();
        if (m2 != null) {
            m2.d(intExtra);
        }
    }

    @Override // com.obric.oui.window.permission.PrivacyStatementActivity
    public void r() {
        com.bytedance.android.input.r.j.i(this.f1937f, "onDisagree");
        IAppGlobals.a aVar = IAppGlobals.a;
        String string = aVar.getContext().getString(C0838R.string.privacy_statement_pop_has_shown);
        if (string != null) {
            KeyboardJni.updateSettingsBooleanValue(string, true);
        }
        String string2 = aVar.getContext().getString(C0838R.string.full_base_input_mode);
        if (string2 != null) {
            com.bytedance.android.input.r.j.i(this.f1937f, "onDisagree, setValue: " + string2 + ", value: 1");
            KeyboardJni.updateSettingsValueForce(string2, 1);
        }
    }
}
