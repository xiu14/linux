package com.bytedance.android.input.keyboard.aichat;

import com.bytedance.android.input.keyboard.aichat.AiChatMenuViewModel;

/* loaded from: classes.dex */
final class j extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
    final /* synthetic */ AiChatMenuView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(AiChatMenuView aiChatMenuView) {
        super(1);
        this.a = aiChatMenuView;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Boolean bool) {
        Boolean bool2 = bool;
        Integer value = AiChatMenuViewModel.a.b().getValue();
        AiChatMenuViewModel.MenuView menuView = AiChatMenuViewModel.MenuView.MENU_BAIKE;
        if (value != null && value.intValue() == 1) {
            com.bytedance.android.input.r.j.i(this.a.a, "initBaikeItem lineEnd = " + bool2);
            kotlin.s.c.l.e(bool2, "isLineEnd");
            if (bool2.booleanValue()) {
                com.bytedance.android.input.r.j.i(this.a.a, "initBaikeItem AiChatDetailViewModel baike is lineEnd");
            }
        }
        return kotlin.o.a;
    }
}
