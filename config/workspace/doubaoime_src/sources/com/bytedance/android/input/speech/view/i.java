package com.bytedance.android.input.speech.view;

import com.bytedance.android.input.common.VibrationController;
import com.bytedance.android.input.keyboard.UserInteractiveManagerNext;

/* loaded from: classes.dex */
final class i extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
    final /* synthetic */ AsrLongPressView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(AsrLongPressView asrLongPressView) {
        super(0);
        this.a = asrLongPressView;
    }

    @Override // kotlin.s.b.a
    public kotlin.o invoke() {
        String str;
        str = this.a.a;
        com.bytedance.android.input.r.j.i(str, "send button move. set pressed and vibrate");
        UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.KEYBOARD, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.CONFIRM, false);
        AsrLongPressView.a(this.a);
        return kotlin.o.a;
    }
}
