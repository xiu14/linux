package com.bytedance.android.input.speech.view;

import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.speech.AsrManager;

/* loaded from: classes.dex */
final class j extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
    final /* synthetic */ AsrLongPressView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(AsrLongPressView asrLongPressView) {
        super(0);
        this.a = asrLongPressView;
    }

    @Override // kotlin.s.b.a
    public kotlin.o invoke() {
        String str;
        String str2;
        int i;
        int i2;
        long currentTimeMillis = System.currentTimeMillis();
        str = this.a.a;
        com.bytedance.android.input.r.j.m(str, "send btn action up");
        InputView inputView = ImeService.x;
        if (inputView != null) {
            inputView.Q(false);
        }
        str2 = this.a.a;
        StringBuilder M = e.a.a.a.a.M("onClick, enterActionType: ");
        i = this.a.f3152c;
        M.append(i);
        com.bytedance.android.input.r.j.i(str2, M.toString());
        AsrManager asrManager = AsrManager.a;
        i2 = this.a.f3152c;
        asrManager.t(i2, currentTimeMillis);
        return kotlin.o.a;
    }
}
