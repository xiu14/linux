package com.bytedance.android.input.keyboard.aichat;

import com.bytedance.android.input.keyboard.aichat.AiChatMenuViewModel;

/* loaded from: classes.dex */
final class n extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
    final /* synthetic */ AiChatMenuView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(AiChatMenuView aiChatMenuView) {
        super(1);
        this.a = aiChatMenuView;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Boolean bool) {
        Boolean bool2 = bool;
        Integer value = AiChatMenuViewModel.a.b().getValue();
        AiChatMenuViewModel.MenuView menuView = AiChatMenuViewModel.MenuView.MENU_CHAT;
        if (value != null && value.intValue() == 0) {
            com.bytedance.android.input.r.j.i(this.a.a, "lineEnd = " + bool2);
            kotlin.s.c.l.e(bool2, "isLineEnd");
            if (bool2.booleanValue()) {
                this.a.f2536g = true;
            }
        }
        return kotlin.o.a;
    }
}
