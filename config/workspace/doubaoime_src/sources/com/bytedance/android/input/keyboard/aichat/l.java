package com.bytedance.android.input.keyboard.aichat;

import android.widget.LinearLayout;
import com.bytedance.android.input.keyboard.aichat.AiChatMenuViewModel;
import com.obric.oui.text.OTextView;
import java.util.Map;

/* loaded from: classes.dex */
final class l extends kotlin.s.c.m implements kotlin.s.b.l<String, kotlin.o> {
    final /* synthetic */ AiChatMenuView a;
    final /* synthetic */ OTextView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(AiChatMenuView aiChatMenuView, OTextView oTextView) {
        super(1);
        this.a = aiChatMenuView;
        this.b = oTextView;
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(String str) {
        Map map;
        String str2 = str;
        Integer value = AiChatMenuViewModel.a.b().getValue();
        AiChatMenuViewModel.MenuView menuView = AiChatMenuViewModel.MenuView.MENU_BAIKE;
        if (value != null) {
            if (value.intValue() == 1 && com.obric.oui.common.util.b.e(this.a)) {
                map = this.a.b;
                LinearLayout linearLayout = (LinearLayout) map.get(1);
                if (linearLayout != null && com.obric.oui.common.util.b.e(linearLayout)) {
                    e.a.a.a.a.r0("baike success view content update,text=", str2, this.a.a);
                    this.b.setText(str2);
                    AichatDetailViewModel.a.u(false);
                    com.bytedance.android.input.r.j.i(this.a.a, "baike content update, topicContentClickable set false");
                }
            }
        }
        return kotlin.o.a;
    }
}
