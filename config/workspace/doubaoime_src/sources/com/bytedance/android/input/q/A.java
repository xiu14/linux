package com.bytedance.android.input.q;

import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.recognition.api.IRecognizer;
import com.bytedance.android.input.keyboard.WizardSelectChineseBoard;

/* loaded from: classes.dex */
final class A extends kotlin.s.c.m implements kotlin.s.b.p<String, IRecognizer.e, kotlin.o> {
    public static final A a = new A();

    A() {
        super(2);
    }

    @Override // kotlin.s.b.p
    public kotlin.o invoke(String str, IRecognizer.e eVar) {
        int l;
        String str2 = str;
        IRecognizer.e eVar2 = eVar;
        kotlin.s.c.l.f(str2, "id");
        kotlin.s.c.l.f(eVar2, "result");
        IRecognizer.a.b(str2);
        z zVar = z.a;
        StringBuilder M = e.a.a.a.a.M("onAccessibilityEnabled currentScene=");
        M.append(z.k);
        com.bytedance.android.input.r.j.i("RecommendsManager", M.toString());
        KeyboardJni keyboardJni = KeyboardJni.getKeyboardJni();
        l = z.a.l(eVar2.a());
        keyboardJni.setEnableRecommend(l);
        KeyboardJni.getKeyboardJni().setRecommendScene(eVar2.a().ordinal());
        if (!WizardSelectChineseBoard.a.a() && z.k == IRecognizer.Scene.CHAT && ((Integer) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.full_base_input_mode, "context.getString(R.string.full_base_input_mode)", "null cannot be cast to non-null type kotlin.Int")).intValue() != 1) {
            v vVar = v.a;
            com.bytedance.android.input.r.j.i("QuickReply", "try show quick reply guide");
            vVar.q();
            com.bytedance.android.input.r.j.i("RecommendsManager", "onAccessibilityEnabled ChatIntentReply.start");
            q qVar = q.a;
            com.bytedance.android.input.r.j.i("ChatIntentGenerate", "try show chat assistant guide");
            vVar.q();
        }
        return kotlin.o.a;
    }
}
