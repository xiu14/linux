package com.bytedance.android.input.q;

import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.keyboard.aichat.AiChatMenuViewModel;
import com.bytedance.android.input.keyboard.aichat.AichatDetailViewModel;
import java.util.Map;

/* loaded from: classes.dex */
final class r extends kotlin.s.c.m implements kotlin.s.b.l<Map<String, ? extends Object>, kotlin.o> {
    public static final r a = new r();

    r() {
        super(1);
    }

    @Override // kotlin.s.b.l
    public kotlin.o invoke(Map<String, ? extends Object> map) {
        Map<String, ? extends Object> map2 = map;
        kotlin.s.c.l.f(map2, "it");
        if (map2.isEmpty()) {
            com.bytedance.android.input.r.j.j("ChatIntentWithRequest", "request response list is empty");
            AichatDetailViewModel aichatDetailViewModel = AichatDetailViewModel.a;
            AichatDetailViewModel.ViewStatus viewStatus = AichatDetailViewModel.ViewStatus.VIEW_FAILED;
            aichatDetailViewModel.o(2);
        } else {
            com.bytedance.android.input.r.j.m("ChatIntentWithRequest", "response = " + map2);
            Object obj = map2.get("title");
            kotlin.s.c.l.d(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = map2.get("request");
            kotlin.s.c.l.d(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            AichatDetailViewModel aichatDetailViewModel2 = AichatDetailViewModel.a;
            aichatDetailViewModel2.n(C0838R.id.ai_chat_assistant_view_baike);
            AiChatMenuViewModel aiChatMenuViewModel = AiChatMenuViewModel.a;
            AiChatMenuViewModel.MenuView menuView = AiChatMenuViewModel.MenuView.MENU_BAIKE;
            aiChatMenuViewModel.f(1);
            if (((String) obj).length() > 0) {
                if (str.length() > 0) {
                    com.bytedance.android.input.r.j.i("ChatIntentWithRequest", "topic query: " + str + ", begin showAiChatBaikeView");
                    z.y(13, true, str, "", "", false, 32);
                    s.f2996e = false;
                }
            }
            com.bytedance.android.input.r.j.i("ChatIntentWithRequest", "topic title empty, show baike failed page");
            AichatDetailViewModel.ViewStatus viewStatus2 = AichatDetailViewModel.ViewStatus.VIEW_FAILED;
            aichatDetailViewModel2.o(2);
            s.f2996e = false;
        }
        return kotlin.o.a;
    }
}
